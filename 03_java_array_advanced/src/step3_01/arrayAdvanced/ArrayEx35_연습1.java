package step3_01.arrayAdvanced;

import java.util.Scanner;

/*
 * 
 * # 배열 컨트롤러[2단계] : 어레이리스트(ArrayList)
 * 
 * 1. 추가
 * . 데이터를 입력받아 순차적으로 추가
 * 2. 삭제(인덱스)
 * . 인덱스를 입력받아 해당 위치의 데이터 삭제
 * 3. 삭제(데이터)
 * . 데이터를 입력받아 삭제
 * . 없는 데이터 입력 시 예외처리
 * 4. 삽입
 * . 인덱스와 데이터을 입력받아 삽입
 * 
 */

public class ArrayEx35_연습1 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int[] arr = null; // null 상태
		int elementCnt = 0;

		while (true) {

			for (int i = 0; i < elementCnt; i++) {
				System.out.print(arr[i] + " ");
			}
			System.out.println();

			System.out.println("[어레이리스트 컨트롤러]");
			System.out.println("[1]추가");
			System.out.println("[2]삭제(인덱스)");
			System.out.println("[3]삭제(데이터)");
			System.out.println("[4]삽입");
			System.out.println("[0]종료");

			System.out.print("메뉴 선택 : ");
			int sel = scan.nextInt();

			if (sel == 1) { // 추가 - 배열 크기가 유동적

				if (elementCnt == 0) {
					arr = new int[elementCnt + 1];
				} else if (elementCnt > 0) {
					int[] temp = arr;
					arr = new int[elementCnt + 1];

					for (int i = 0; i < elementCnt; i++) { // 조건식이 헷갈림
						arr[i] = temp[i];
					}
					temp = null;
				}
				System.out.print("추가할 데이터 입력 : ");
				int data = scan.nextInt();

				arr[elementCnt] = data;
				elementCnt++;

			} else if (sel == 2) { // 삭제 - 인덱스
				System.out.print("삭제할 인덱스 입력 : ");
				int delIdx = scan.nextInt();

				if (delIdx < 0 || delIdx > elementCnt - 1) {
					System.out.println("해당 위치는 삭제할 수 없습니다.");
					continue;
				}
				if (elementCnt == 1) {
					arr = null;
				} else if (elementCnt > 1) {
					int[] temp = arr;
					arr = new int[elementCnt - 1];

					for (int i = 0; i < delIdx; i++) {
						arr[i] = temp[i];
					}
					for (int i = delIdx; i < elementCnt - 1; i++) { // 조건식, arr[i] = temp[i+1] 틀림주의
						arr[i] = temp[i + 1];
					}
					temp = null;
				}
				elementCnt--;
			} else if (sel == 3) { // 삭제 - 데이터
				System.out.print("삭제할 데이터 입력 : ");
				int data = scan.nextInt();

				int delIdx = -1;
				for (int i = 0; i < elementCnt; i++) {
					if (arr[i] == data) {
						delIdx = i;
					}
				}
				if (delIdx == -1) {
					System.out.println("존재하지 않는 값입니다.");
					continue;
				}
				if (elementCnt == 1) {
					arr = null;
				} else if (elementCnt > 1) {
					int[] temp = arr;
					arr = new int[elementCnt - 1];

					int j = 0;
					for (int i = 0; i < elementCnt; i++) {
						if (i != delIdx) {
							arr[j] = temp[i];
							j++;
						}
					}
					temp = null;
				}
				elementCnt--;

			} else if (sel == 4) { // 삽입
				System.out.print("삽입할 인덱스 입력 : ");
				int insertIdx = scan.nextInt();

				if (insertIdx < 0 || insertIdx > elementCnt) {
					System.out.println("삽입할 수 없는 위치입니다.");
					continue;
				}
				System.out.print("삽입할 데이터 입력 : ");
				int data = scan.nextInt();

				if (elementCnt == 0) {
					arr = new int[elementCnt + 1];
				} else if (elementCnt > 0) {
					int[] temp = arr;
					arr = new int[elementCnt + 1];

					int j = 0;
					for (int i = 0; i < elementCnt + 1; i++) { // 조건식 틀림 주의
						if (i != insertIdx) {
							arr[i] = temp[j];
							j++;
						}
					}
					temp = null;
				}
				arr[insertIdx] = data;
				elementCnt++;
				
			} else if (sel == 0) {
				break;
			}
		}

		scan.close();

	}

}