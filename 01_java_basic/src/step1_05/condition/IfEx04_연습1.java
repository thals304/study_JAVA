package step1_05.condition;
import java.util.Scanner;
// 24.01.17 time 14:38 - 14:42
/*
 * today 소감문
 * else를 아직 배우지 않아서 로그인 성공과 실패할 때의
 * 조건을 각각 써줘야 해서 불편했던 것 같다. 
 * 
 * */
/*
 * # 로그인[1단계]
 * 
 * 1. id와 pw를 입력받는다.
 * 2. 입력받은 데이터와 db데이터를 비교해 로그인 처리를 진행한다.
 *    (db > database > 저장되어있는 데이터) 
 * 예) 로그인 성공 or 로그인 실패
 * 
 */

public class IfEx04_연습1 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int dbId = 1234;
		int dbPw = 1111;
		
		System.out.print("ID :");
		int id = scan.nextInt();
		System.out.print("PassWord : ");
		int pw = scan.nextInt();
		
		if(id == dbId && pw == dbPw)
			System.out.println("로그인 성공");
		if(id != dbId || pw != dbPw)
			System.out.println("로그인 실패");
		
		scan.close();
		
		


	}

}
