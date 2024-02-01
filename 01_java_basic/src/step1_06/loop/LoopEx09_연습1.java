package step1_06.loop;

import java.util.Scanner;
// 24.01.22 time 12:42 - 12: 56
/*
 * today 소감문
 * 이 문제도 1,2,3,0에 맞춰 selectMenu가 분류가 잘 된 문제였어서 
 * 문제 한 줄 마다 코드를 짜면 되는 거라 쉬웠던 것 같다.
 * 추가로 myAcc를 사용하고 싶어 selectMenu 1에서 큰 if문으로 계좌 확인 후 
 * 그 안에 입금 조건 코드를 짠 것 같다.
 * 
 * */
/*
 * # ATM[2단계]
 * 
 * 1. 입금
 * . 입금할 금액을 입력받아, myMoney에 입금
 * 2. 출금
 * . 출금할 금액을 입력받아, myMoney에서 출금
 * . 단, 출금할 금액이 myMoney 잔액을 초과할 경우 출금불가
 * 3. 이체
 * . yourAcc 계좌번호를 입력받아, 이체
 * . 이체할 금액이 myMoney 잔액을 초과할 경우 이체 불가
 * . 이체 후 yourMoney 잔액 증가
 * 4. 조회
 * . myMoney와 yourMoney 잔액 모두 출력
 * 
 */

public class LoopEx09_연습1 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int myAcc = 1111;
		int myMoney = 50000;
		
		int yourAcc = 2222;
		int yourMoney = 70000;	
		
		int acc = 0;
		int inputMoney = 0;
		int outputMoney = 0;
		
		boolean isRun = true;
		while(isRun) {
			
			System.out.println("1.입금");
			System.out.println("2.출금");
			System.out.println("3.이체");
			System.out.println("4.조회");
			System.out.println("0.종료");
			
			System.out.print("메뉴 선택 : ");
			int selectMenu = scan.nextInt();
			
			if (selectMenu == 1) {
				System.out.print("계좌번호 입력 : ");
				acc = scan.nextInt();
				if ( acc == myAcc ) {
					System.out.print("입금할 금액 : ");
					inputMoney = scan.nextInt();
					myMoney += inputMoney;
					System.out.println("입금을 완료하였습니다.");
				}
				else
					System.out.println("계좌 번호를 확인해 주세요.");
			}
			else if (selectMenu == 2) {
				System.out.print("출금할 금액 : ");
				outputMoney = scan.nextInt();
				if( myMoney >= outputMoney) {
					myMoney -= outputMoney;
					System.out.println("출금을 완료하였습니다.");
				}
				else
					System.out.println("출금 불가 - 계좌 잔액 부족");
			}
			else if (selectMenu == 3) {
				System.out.print("이체할 계좌 번호 입력 : ");
				acc = scan.nextInt();
				if( acc == yourAcc ) {
					
					System.out.print("출금할 금액 : ");
					outputMoney = scan.nextInt();
					if ( myMoney >= outputMoney ) {
						myMoney -= outputMoney;
						System.out.println("입금을 완료하였습니다.");
						yourMoney += outputMoney;
					}
					else
						System.out.println("출금 불가 - 계좌 잔액 부족");
				}
				else
					System.out.println("계좌 번호를 확인해 주세요.");
				}
			else if (selectMenu == 4) {
				System.out.println( myAcc + " 잔액 : " + myMoney);
				System.out.println( yourAcc + " 잔액 : " + yourMoney);
			}
			else if (selectMenu == 0) {
				isRun = false;
				System.out.println("프로그램 종료");
			}
		}

		scan.close();
		
	}

}
