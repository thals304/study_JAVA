package step1_05.condition;

import java.util.Scanner;
/*
 * 24.03.28 time 22:06-22:08
 * today 소감문
 * 이 문제를 처음 풀었을 때는 되게 실수가 많고 문제 이해하는 것부터가 쉽지 않았는데
 * 지금 푸니까 뭔가 아니 내가 왜 이 문제를 어려워했지? 라는 생각이 든다.
 *  
 * */
/*
 * # 성적 유효성 검사
 * 
 * 1. 성적을 입력받는다.
 * 2. 성적이 60점 이상이면 합격, 60점 미만이면 불합격이다.
 * 3. 단, 입력받은 성적이
 *    음수이거나 100점을 초과하면, 예외 메세지를 출력한다.
 *    예) 성적을 잘못 입력했습니다.
 */

public class IfEx07_연습2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("성적 입력 : ");
		int score = scan.nextInt();
		
		if (score > 100 || score < 0) {
			System.out.println("성적을 잘못 입력했습니다.");
		}
		else {
			if (score >= 60) {
				System.out.println("합격");
			}
			else {
				System.out.println("불합격");
			}
		}
		scan.close();
	}

}
