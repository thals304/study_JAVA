package step2_01.array;

import java.util.Arrays;
import java.util.Scanner;

import javax.lang.model.element.Element;
// 24.01.29 time 16:40-17:00
/*
 * today 소감문
 * 전에 공부한 자료구조 추가, 삭제를 사용한 예제라 그런지 복습하는 느낌으로 풀었다.
 * 근데 가입에서 계좌번호 중복 검사를 할 때 중복이면 for문이 아닌 while문 조건식으로 
 * 가는 방법에 대해 고민을 많이 했던것 같다. 해결책은 자료구조 삭제에서 사용한 delIdx처럼 
 * 변수를 추가해 조건을 걸어주는 방법이었다.
 * 삭제는 추가보다는 변형된 부분이 거의 없어 쉽다고 생각했지만 요소들을 뒤에서 앞으로 한 칸 옮기는 
 * 과정의 for문에서 조건식이 계속 헷갈렸던 것 같다. 그리고 고정된 크기의 배열이기 때문에
 * accsCnt -- ; 후에 accs[accsCnt] = 0; pws[accsCnt] = 0;으로 초기화 시켜주는 
 * 부분이 중요한데 자꾸 까먹어서 좀 더 디테일한 사고를 가져야 될 것 같다.
 * 그리고 자료구조의 삭제, 추가, 삽입 복습이 더 필요하다고 느꼈다.
 * */
/*
 * # ATM[3단계]
 * 
 * 1. 가입
 *  - 계좌번호와 비밀번호를 입력받아 가입
 *  - 계좌번호 중복검사
 * 2. 탈퇴
 *  -  계좌번호를 입력받아 탈퇴
 */


public class ArrayEx23_연습1 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int[] accs = {1001, 1002, 0, 0, 0};
		int[] pws  = {1111, 2222, 0, 0, 0};
		
		int accsCnt = 2;
		int selectMenu = 0;
		boolean isRun = true;
		
		while (isRun) {
			System.out.println(Arrays.toString(accs));
			System.out.println(Arrays.toString(pws));
			
			System.out.println("1.가입");
			System.out.println("2.탈퇴");
			System.out.println("3.종료");
			System.out.print("메뉴 선택 : ");
			selectMenu = scan.nextInt();
			
			if (selectMenu == 1) {
				
				if (accsCnt == accs.length) {
					System.out.println("더이상 가입할 수 없습니다.");
					continue;
				}
				
				System.out.print("[가입]계좌번호 입력 : ");
				int myAcc = scan.nextInt();
				
				int check = -1;
				for (int i = 0; i < accsCnt; i++) {
					if (myAcc == accs[i]) {
						// while 조건식으로 어떻게 가지? 변수를 넣어 조건식으로 구분해보자
						check = 1;
					}
				}
				if (check == -1) {
					System.out.print("[가입]비밀번호 입력 : ");
					int myPw = scan.nextInt();
					
					// 계좌, 비번 배열에 입력한 값 추가 (insert) - 자료구조
					accs[accsCnt] = myAcc;
					pws[accsCnt] = myPw;
					accsCnt ++;
				}
				else if (check == 1) {
					System.out.println("사용할 수 없는 중복 계좌번호입니다.");
					continue;
				}
				
				
			}
			else if (selectMenu == 2) {
				System.out.print("[탈퇴]계좌번호 입력 : ");
				int myAcc = scan.nextInt();
				
				// 배열 데이터 삭제(delete) - 자료구조
				int check = -1;
				for (int i = 0; i < accsCnt; i++ ) {
					if (myAcc == accs[i]) {
						check = i;
					}
				}
				
				if (check == -1) {
					System.out.println("입력한 계좌번호는 존재하지 않습니다.");
					continue;
				}
				else {
					for (int i = check; i < accsCnt - 1; i++) {	// 조건식이 헷갈리네
						accs[i] = accs[i+1];
						pws[i] = pws[i+1];
					}
					
				}
				accsCnt --;
				accs[accsCnt] = 0;
				pws[accsCnt] = 0;
			}
			else if (selectMenu == 3) {
				scan.close();
				isRun = false;
			}
			
		}

	}
}
