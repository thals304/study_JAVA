package step2_01.array;

import java.util.Scanner;
// 24.01.24 time 21:35-21:48
/*
 * today 소감문
 * 7이 연속으로 3번 나올 때 당첨인 걸 어떻게 구현하는 지가 관건이었고 생각해내기 쉽지 않았다.
 * 항상 반복문 안에서 count를 세고 for문 밖에서 count 수를 출력했었는데
 * 이 문제는 연속 3일 때 당첨이라고 출력이 되야 하니 for문의 초깃값 -> 조건식 -> 명령문 -> 증감식 -> 조건식 ..
 * 의 순환을? 이용해서 for문 안에서 7이 연속적으로 3개 나올 수 있게 만들어 준 것 같다.
 * 당첨이 아닌 꽝 일 때는 표현하지 못했는데 정답 예시는 연습 6번도 그렇고 예외 처리를 할 때 boolean을
 * 사용하는 것 같다. 그래서 6번을 다시 이해해 보고 10번 문제도 다시 적용해 꽝도 구현해보겠다.
 * */
/*
 * # 즉석복권
 * 
 * 1. 숫자 7이 연속으로 3번 등장하면, 당첨복권이다.
 * 2. 메뉴를 선택해서 1번 2번 3번이 당첨인지 확인한다.
 * 3. 0번은 반복문을 종료한다.
 * 
 */


public class ArrayEx10_연습1 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int[] lotto1 = {0, 0, 7, 7, 7, 0, 0, 0};
		int[] lotto2 = {7, 0, 7, 7, 0, 0, 0, 0};
		int[] lotto3 = {7, 0, 7, 7, 7, 0, 7, 0};
		int sel      = 0;
		int cnt7 = 0;
		boolean isRunning = true;
		while (isRunning) {
					
			System.out.println("\n[1]번복권 결과확인");
			System.out.println("[2]번복권 결과확인");
			System.out.println("[3]번복권 결과확인");
			System.out.println("[0]종료");
			System.out.print("메뉴 선택 : ");
			sel = scan.nextInt();
			
			if (sel == 1) {
				for(int i = 0; i < lotto1.length; i++) {
					if(lotto1[i] == 7) {
						cnt7 ++;
						if(cnt7 == 3) System.out.println("당첨"); // 반복문의 성질을 이용한 느낌
					}
					else {
						cnt7 = 0;
						}
					
				}
			}
			else if (sel == 2) {
				cnt7 = 0;
				for(int i = 0; i < lotto2.length; i++) {
					if(lotto2[i] == 7) {
						cnt7 ++;
						if(cnt7 == 3) System.out.println("당첨"); // 반복문의 성질을 이용한 느낌
					}
					else {
						cnt7 = 0;
						}
					
				}
			}
			else if (sel == 3) {
				cnt7 = 0;
				for(int i = 0; i < lotto3.length; i++) {
					if(lotto3[i] == 7) {
						cnt7 ++;
						if(cnt7 == 3) System.out.println("당첨"); // 반복문의 성질을 이용한 느낌
					}
					else {
						cnt7 = 0;
						}
					
				}
			}
			else if (sel == 0) {
				isRunning = false;
			}
			
		}
		
	}
}
