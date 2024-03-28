package step1_05.condition;

import java.util.Scanner;
/*
 * 	24.03.28 time 21:54-22:02
 * 	today 소감문
 *  일단 요즘 html, rdb를 배우고 있어 자바를 신경 못쓰는 것 같아서
 *  이러면 배운게 의미가 없다고 생각해 내가 잘 못 풀어서 다시 풀어볼 문제와 아직 풀지 못한
 *  문제들을 시간 날때마다 조금씩이라도 감을 잡고자 풀기로 다짐했다.
 *  자바는 내가 계속 가져가야할 메인 언어로 선택된 친구이므로 확실하게 잡고가야 한다고 생각한다.
 *  
 *  오랜만에 자바를 해서 그런가 오류 난게 없다고 생각하는데 코드를 실행할 때 오류가 났다고 떠서
 *  느낌상 이 문제에서 오류가 아닌 다른 코드에서 문제가 생긴 것 같은데 잘 모르겠다.
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


public class IfEx05_연습2 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int dbId = 0;
		int dbPw = 0;
		
		System.out.println("[회원가입]");
		System.out.print("id 입력 : ");
		dbId = scan.nextInt();
		System.out.print("pw 입력 : ");
		dbPw = scan.nextInt();
		
		System.out.println("[로그인]");
		System.out.print("myId 입력 : ");
		int myId = scan.nextInt();
		System.out.print("myPw 입력 : ");
		int myPw = scan.nextInt();
		
		boolean isChecked = false;
		
		if (dbId == myId && dbPw == myPw) {
				isChecked = true;
		}
		
		if (isChecked) System.out.println("로그인 성공");
		else System.out.println("로그인 실패");
		
		scan.close();
	}

}
