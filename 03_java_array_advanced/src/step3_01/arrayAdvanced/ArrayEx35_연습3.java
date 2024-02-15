package step3_01.arrayAdvanced;

import java.util.Scanner;
// 24.02.15 time 21:36-22:10
/*
 * today 소감문
 * arraylist는 다시 해도 어렵고 중간 중간 조건들부터 신경쓸 부분이 너무 많은 것 같다.
 * 얼른 arraylist가 나에게 익숙해지고 완전히 내거로 만들고 싶은 욕구가 크다.
 * */ 

/* # 배열 컨트롤러[2단계] : 어레이리스트(ArrayList)
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

/*
 * 분석 방법
 * 1. 오류 x 코드라면 -> 코드 돌려보면서 어디 부분까지 나왔는지 비교
 * 2. 주석 달기 
 * 3. 디버그 사용하기
 * 4. 질문하기 (chat gpt)
 * 
 * */

public class ArrayEx35_연습3 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int[] arr = null;	// null 상태
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
			
			if (sel == 1) {
				
				if (elementCnt == 0) {
					arr = new int[elementCnt + 1];
				}
				else if (elementCnt > 0){
					int[] temp = arr;
					arr = new int[elementCnt + 1];
					
					for (int i = 0; i < elementCnt; i++) { // for문을 이용해 백업하기
						arr[i]= temp[i];
					}
					temp = null;
				}
				System.out.print("추가할 값 입력 : ");
				int appendIdx = scan.nextInt();
				
				arr[elementCnt] = appendIdx; // 위에서 배열 크기는 elementCnt + 1로 늘어났지만, 배열의 요소는 0 ~ elementCnt 라는 점
				elementCnt ++;
				 
			}
			else if (sel == 2) {
				System.out.print("삭제할 인덱스 입력 : ");
				int deleteIdx = scan.nextInt();
				
				if (deleteIdx < 0 || deleteIdx > elementCnt - 1) { // elementCnt - 1 < deleteIdx 인게 이해가 안된다
					System.out.println("삭제할 수 없는 위치입니다");
					continue;
				}
				
				if (elementCnt == 1) {
					arr = null;
				}
				else if (elementCnt > 1) {
					int[] temp = arr;
					arr = new int[elementCnt - 1];
					
					for (int i = 0; i < deleteIdx; i++) {
						arr[i] = temp[i];
					}
					for (int i = deleteIdx; i < elementCnt - 1; i++) {
						arr[i] = temp[i+1];
					}
					temp = null;
				}
				elementCnt--;
			}
			else if (sel == 3) {
				System.out.print("삭제할 값 입력 : ");
				int deleteData = scan.nextInt();
				
				int delIdx = -1;
				for (int i = 0; i < elementCnt; i++) {
					if (deleteData == arr[i]) {
						delIdx = i;
					}
				}
				
				if (delIdx == -1) {
					System.out.println("존재하지 않는 값입니다.");
					continue;
				}
				else {
					if(elementCnt == 1) {
						arr = null;
					}
					else if (elementCnt > 1) {
						int[] temp = arr;
						arr = new int[elementCnt - 1];
						
						/* version - 1 : 나눠서 백업
						for (int i = 0; i < delIdx; i++) {
							arr[i] = temp[i];
						}
						for (int i = delIdx; i < elementCnt - 1; i++) {
							arr[i] = temp[i+1];
						}
						*/
						// version - 2 : 한 번에 백업
						int j = 0;
						for (int i = 0; i < elementCnt; i++) {
							if (delIdx != i) {
								arr[j] = temp[i];
								j++;
							}
						}
						temp = null;
					}
					elementCnt--;
				}
			}
			else if (sel == 4) {
				System.out.print("삽입할 인덱스 입력 : ");
				int insertIdx = scan.nextInt();
				
				if (insertIdx < 0 || insertIdx > elementCnt) { // 삭제 일 때와 조건이 다른 이유? 삽입은 맨 뒤에 추가인 것 같은 삽입도 가능
					System.out.println("삽입할 수 없는 위치입니다.");
					continue;
				}
				
				System.out.print("삽입할 값 입력 : ");
				int insertData = scan.nextInt();
				
				if (elementCnt == 0) {
					arr = new int[elementCnt + 1];
				}
				else if (elementCnt > 0) {
					int[] temp = arr;
					arr = new int[elementCnt + 1];
					
					int j = 0;
					for(int i = 0; i < elementCnt; i++) {
						if(insertIdx != i) {
							arr[i] = temp[j];
							j++;
						}
					}
				temp = null;
				}
				arr[elementCnt] = insertData;
				
				elementCnt++;
			}
			else if (sel == 0) {
				break;
			}
		}

		scan.close();

	}

}