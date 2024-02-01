package step2_01.array;

import java.util.Scanner;
// 24.01.29 time 11:45-11:54
/*
 * today 소감문
 * 전보다는 능숙하게 암기한 코드를 썼지만 그럼에도 불구하고 놓치는 부분이 존재했다.
 * 일단 삽입, 추가에 공통적으로 있는 if(elementCnt == arr.length){}의 위치 
 * (솔직히 위치는 데이터 입력/인덱스 입력) 위나 아래에 넣어도 상관없을 것 같은데,,)
 * 그리고 삭제에서 delIdx와 맨 마지막에 arr[elementCnt] = 0을 자꾸만 까먹는 것 같다.
 * */
/*
 * # 배열 컨트롤러[1단계] : 최종
 * 
 *  19번 20번 21번의 문제를 한 코드로 병합하여 보세요.
 * 
 * 1) 추가
 * 2) 삽입
 * 3) 삭제
 * 
 *  정답 없음
 */

public class ArrayEx22_연습2 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int[] arr = { 10, 20, 0, 0, 0, 0, 0, 0, 0, 0 };
		int elementCnt = 2;
		int selectMenu = 0;

		while (true) {

			System.out.println("\n1추가");
			System.out.println("2삽입");
			System.out.println("3삭제");
			System.out.println("4종료\n");
			System.out.print("입력 : ");
			selectMenu = scan.nextInt();

			if (selectMenu == 1) {
				System.out.print("추가할 데이터 입력 : "); // 위치 맨 위
				int data = scan.nextInt();

				if (elementCnt == arr.length) {
					System.out.println("더이상 추가할 수 없습니다.");
					continue;
				}

				arr[elementCnt] = data;
				elementCnt++;

			} else if (selectMenu == 2) {
				
				if (elementCnt == arr.length) {
					System.out.println("더이상 삽입할 수 없습니다");
					continue;
				}
				
				System.out.print("삽입할 인덱스 입력 : ");
				int idx = scan.nextInt();
				
				if (idx < 0 || idx > elementCnt) {
					System.out.println("삽입할 수 없는 위치입니다.");
					continue;
				}

				System.out.print("삽입할 데이터 입력 :");
				int data = scan.nextInt();

				for (int i = elementCnt; i > idx; i++) {
					arr[i] = arr[i - 1];
				}
				arr[idx] = data;
				elementCnt++;

			} else if (selectMenu == 3) {
				System.out.print("삭제할 데이터 입력 : ");
				int data = scan.nextInt();

				int delIdx = -1;
				for (int i = 0; i < elementCnt; i++) {
					if (data == arr[i]) {
						delIdx = i;
					}
				}

				if (delIdx == -1) {
					System.out.println("입력한 데이터는 존재하지 않습니다.");
					continue;
				} else {
					for (int i = delIdx; i < elementCnt - 1; i++) {
						arr[i] = arr[i + 1];
					}
					elementCnt--;
					arr[elementCnt] = 0; // 이 부분 또 놓침
				}
			} else if (selectMenu == 4) {
				scan.close();
				break;
			}
		}

	}

}
