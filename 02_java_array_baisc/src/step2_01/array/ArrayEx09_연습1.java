package step2_01.array;

import java.util.Scanner;
// 24.01.24 time 14:30-14:42
/*
 * today 소감문
 * 오히려 앞에 배열을 점검하는 문제보다는 이런 통합적으로 조건이 있는 문제가 더 재밌고
 * 풀기 쉬운 것 같다고 느껴진다.
 * 
 * */
/*
 * 
 * # 영화관 좌석예매
 * 
 * 1. 사용자로부터 좌석번호(index)를 입력받아 예매하는 시스템이다.
 * 2. 예매가 완료되면 해당 좌석 값을 'O'로 변경한다.
 * 3. 이미 예매가 완료된 좌석은 재구매할 수 없다.
 * 4. 한 좌석당 예매 가격은 12000원이다.
 * 5. 프로그램 종료 후, 해당 영화관의 총 매출액을 출력한다.
 * 예)
 * [X] [X] [X] [X] [X] [X] [X]
 * 
 * 1. 좌석 예매
 * 2. 종료
 * 
 * (1번 입력)
 * 
 * 좌석선택(1~7) : 1
 * [O] [X] [X] [X] [X] [X] [X]
 * 
 * 1. 좌석 예매
 * 2. 종료
 * 
 * (1번 입력)
 * 
 * 좌석선택(1~7) : 3
 * 
 * [O] [X] [O] [X] [X] [X] [X]
 * 
 * 1. 좌석 예매
 * 2. 종료
 *
 * (1번 입력)
 * 
 * 좌석선택(1~7) : 3
 * 이미 예매가 완료 되었습니다.
 * 
 * [O] [X] [O] [X] [X] [X] [X]
 * 
 * 1. 좌석 예매
 * 2. 종료
 * 
 * (2번 입력)
 * ----------------------
 * 매출액 : 24000원
 * 
 */


public class ArrayEx09_연습1 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		char seat[] = {'X', 'X', 'X', 'X', 'X', 'X', 'X'};
		
		boolean isRunning = true;
		int cntSeat = 0;
		while(true) {
			System.out.println("1.좌석 예매");
			System.out.println("2.종료");
			
			System.out.print("메뉴 선택 : ");
			int sel = scan.nextInt();
			
			if (sel == 1) {
				System.out.print("좌석 선택 : ");
				int seatIdx = scan.nextInt();
				
				for(int i = 0; i < seat.length; i++) {
					if(seatIdx == i) {
						if(seat[i] == 'X'){
						seat[i] = 'O';
						cntSeat ++;
						}
						else System.out.println("이미 예매가 완료되었습니다.");
					}
				}
			}
			// 2일 때 취소하는 것도 만들고 싶음 -> 2였던 종료를 3으로 바꾸기
			else if (sel == 2) {
				int totalMoney = cntSeat * 12000;
				System.out.println("매출액 : "+ totalMoney);
			}
			
		}
	}
	
}
