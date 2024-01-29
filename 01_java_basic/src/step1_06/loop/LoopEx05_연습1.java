package step1_06.loop;

import java.util.Scanner;

// 24.01.19 time 14:32 - 14:42
/*
 * today 소감문
 * 항상 반복문이 어렵다고 생각해 조금 두려웠던 것 같은데
 * 이번 문제에서는 수월하게 풀었다고 할 수 있을 정도로 만족스럽게 푼 것 같다.
 * 하지만 변수명이 다른 사람이 봤을 때 애매하게 느껴진다고 생각해 정답 예시를 참고해
 * 조금 수정했다.
 * 
 * */
/*
 * # 영수증 출력[2단계]
 * 1. 5번 주문을 받는다.
 * 2. 주문이 끝난 후, 돈을 입력받는다.
 * 3. 각 메뉴별 주문수량과 총금액을 출력한다.
 * 
 * 예)
 * 메뉴 선택 : 1
 * 메뉴 선택 : 1
 * 메뉴 선택 : 2
 * 메뉴 선택 : 2
 * 메뉴 선택 : 3
 * 총 금액 = 31300원
 * 현금 입력 : 32000
 * === 롯데리아 영수증 ===
 * 1. 불고기 버거 : 2개
 * 2. 새우    버거 : 2개
 * 3. 콜         라 : 1개
 * 4. 총   금   액 : 31300원
 * 5. 잔         돈 : 700원
 */

public class LoopEx05_연습1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int bulgogiBurgerPrice = 8700;
		int shrimpBurgerPrice = 6200;
		int colaPrice = 1500;

		System.out.println("=== 롯데리아 ===");
		System.out.println("1.불고기 버거 : " + bulgogiBurgerPrice + "원");
		System.out.println("2.새우    버거 : " + shrimpBurgerPrice + "원");
		System.out.println("3.콜         라 : " + colaPrice + "원");

		int i = 1;
		int bulgogoiBurgerCnt = 0;
		int shrimpBurgerCnt = 0;
		int colaCnt = 0;

		while (i <= 5) {
			System.out.print("메뉴 선택 : ");
			int choice = scan.nextInt();
			if (choice == 1) {
				bulgogoiBurgerCnt++;
			} else if (choice == 2) {
				shrimpBurgerCnt++;
			} else {
				colaCnt++;
			}
			i++;
		}
		int totalPrice = bulgogoiBurgerCnt * bulgogiBurgerPrice + shrimpBurgerCnt * shrimpBurgerPrice + colaCnt * colaPrice;
		System.out.println("총 금액 = " + totalPrice + "원");
		System.out.print("현금 입력 : ");
		int money = scan.nextInt();

		int charge = money - totalPrice;
		
		if(charge >= 0) {
		System.out.println("=== 롯데리아 영수증 ===");
		System.out.println("1. 불고기 버거 : " + bulgogoiBurgerCnt);
		System.out.println("2. 새우    버거 :" + shrimpBurgerCnt);
		System.out.println("3. 콜         라 : " + colaCnt);
		System.out.println("4. 총   금   액 " + totalPrice);
		System.out.println("잔           돈 : " + charge);
		}
		else
			System.out.println("현금이 부족합니다.");
		scan.close();
	}

}
