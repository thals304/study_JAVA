package step1_05.condition;

import java.util.Scanner;

// 24.01.18 time 9:13 - 9: 20
/*
 * today 소감문
 * 이번에는 id와 pw를 입력받아 회원가입을 하는 부분에서
 * 초깃값이 0으로 저장된 dbId, dbPw를 scan으로 다시 입력하는 부분이
 * 헷갈려 정답 예시를 참고한 것 같다. (문제를 잘못 이해함)
 * 이 문제는 다음에 다시 한 번 풀어봐야 될 것 같다.
 * 나머지 밑에 부분은 앞에 4번 문제와 같아서 4번에서 실수했던 로그인 실패 부분을 
 * 이번에는 잘 쓴 것 같다.
 * 
 * */
/*
 * # 로그인[2단계]
 * 
 * 1. id와 pw를 입력받아 회원가입을 진행한다.
 * 2. 이후 로그인을 위해 다시 id와 pw를 입력받는다.
 * 3. 가입 후 저장된 데이터와 로그인 시 입력받은 데이터를 비교한다.
 * 예) 로그인 성공 or 로그인 실패
 */


public class IfEx05_연습1 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int dbId = 0;
		int dbPw = 0;
		
		System.out.println("회원가입");
		System.out.print("가입할 ID : ");
		dbId = scan.nextInt();
		System.out.print("가입할 PW : ");
		dbPw = scan.nextInt();
		System.out.println("가입을 축하합니다.");
		
		System.out.print("로그인");
		System.out.print("ID : ");
		int id = scan.nextInt();
		System.out.print("PW : ");
		int pw = scan.nextInt();
		
		if(dbId == id && dbPw == pw)
			System.out.println("로그인 성공");
		if(dbId != id || dbPw != pw)
			System.out.println("로그인 실패");
		
		scan.close();
		
		System.out.println("로그인");
		
	}

}
