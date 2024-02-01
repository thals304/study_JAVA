package step1_05.condition;
// 24.01.18 time 13:05 - 13:11
/*
 * today 소감문
 * 나는 정답 예시 1번과 같은 방법을 사용해서 풀었다.
 * 정답 예시 2번은 1번에 비해 거스름돈(charge)에 신경을 쓰고 
 * 메뉴 선택에 따른 charge를 계산해 현금 부족 메시지를 띄우는 방법을 사용해서
 * 더 간단하다고 생각했고 이 방법이 내 머리 속에 딱 떠오르지는 않지만 다음에 도전하고 싶다.
 * 
 * */
/*
 * # 영수증 출력[1단계]
 * 
 * 1. 메뉴판을 출력한다.
 * 2. 사용자는 주문하고자 하는 메뉴의 번호를 입력한다.
 * 3. 현금을 입력받는다.
 * 4. 입력받은 현금과 메뉴가격을 확인해, 영수증을 출력한다.
 * 5. 단, 현금이 부족한 경우 "현금이 부족합니다."라는 메세지를 출력한다.
 */

import java.util.Scanner;

public class IfEx11_연습1 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int price1 = 8700;
		int price2 = 6200;
		int price3 = 1500;
		
		System.out.println("=== 롯데리아 ===");
		System.out.println("1.불고기 버거 : " + price1 + "원");
		System.out.println("2.새우    버거 : " + price2 + "원");
		System.out.println("3.콜         라 : " + price3 + "원");
		
		System.out.print("메뉴 번호를 선택하세요(1~3): ");
		int menuNum = scan.nextInt();
		System.out.print("현금을 입력하세요 : ");
		int cash = scan.nextInt();
		
		if(menuNum == 1) {
			if(cash >= price1) {
				System.out.println("불고기 버거 " + price1 + "원 입니다.");
				System.out.println("거스름 돈: " + (cash - price1)+ "원");
			}
			if(cash < price1) {
				System.out.println("현금이 부족합니다.");
			}
		}
		if(menuNum == 2) {
			if(cash >= price2) {
				System.out.println("새우 버거 " + price2 + "원 입니다.");
				System.out.println("거스름 돈: " + (cash - price2)+ "원");
			}
			if(cash < price1) {
				System.out.println("현금이 부족합니다.");
			}
		}
		if(menuNum == 3) {
			if(cash >= price3) {
				System.out.println("콜라 " + price3 + "원 입니다.");
				System.out.println("거스름 돈: " + (cash - price3)+ "원");
			}
			if(cash < price1) {
				System.out.println("현금이 부족합니다.");
			}
		}
		scan.close();


	}

}
