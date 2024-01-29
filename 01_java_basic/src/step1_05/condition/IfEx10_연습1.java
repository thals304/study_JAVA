package step1_05.condition;
// 24.01.18 time 12:55 - 12: 59

/*
 * today 소감문
 * 이번 문제는 dbId가 일치할 경우에 pw를 입력하는거라
 * 먼저 if문에서 dbId 일치 여부 확인하고 일치하면 그 안에 
 * pw를 입력하는 문을 쓰고 중첩 if문으로 pw까지 일치하는지 확인하는 걸 
 * 쓰면 되는 문제라 간단했던 것 같다.
 * 좀 더 나아가서 id,pw 가 틀리면 다시 돌아가 id,pw를 입력 받을 수 있으면
 * 더 좋은 로그인 코드가 되지 않을까 싶다.
 * */
/*
 * # 로그인[3단계]
 * 
 * 1. id를 입력받아 dbId와 일치할 경우에만 pw를 입력할 수 있다.
 * 2. id가 틀린 경우, "id를 확인해주세요"라는 메세지를 출력한다.
 * 3. pw가 틀린 경우, "pw를 확인해주세요"라는 메세지를 출력한다.
 * 4. id와 pw와 모두 일치하는 경우, "로그인 성공"라는 메세지를 출력한다.
 */

import java.util.Scanner;

public class IfEx10_연습1 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int dbId = 1234;
		int dbPw = 1111;
		
		System.out.print("ID 입력 : ");
		int id = scan.nextInt();
		
		if(dbId == id) {
			System.out.print("PW 입력 : ");
			int pw = scan.nextInt();
			if(dbPw == pw)
				System.out.println("로그인 성공");
			if (dbPw != pw)
				System.out.println("PW를 확인해주세요");
		}
		
		if (dbId != id) {
			System.out.println("id를 확인해주세요");
		}
		
		scan.close();
		
		

	}

}
