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

/*
 * 분석 방법
 * 1. 오류 x 코드라면 -> 코드 돌려보면서 어디 부분까지 나왔는지 비교
 * 2. 주석 달기 
 * 3. 디버그 사용하기
 * 4. 질문하기 (chat gpt)
 * 
 * */

public class ArrayEx35_arraylist {

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
				if (elementCnt == 0) {	// null이면 인덱스 하나 추가
					arr = new int[elementCnt + 1];
				}
				else if (elementCnt > 0){
					int[] temp = arr;	// temp에게 권리 부여해서 백업
					arr = new int[elementCnt + 1];	// 인데스 하나 추가해주기
					
					for (int i = 0; i < elementCnt; i++) {
						arr[i] = temp[i];	// 다시 temp에게서 요소 받아오기
					}
					
					temp = null;	// temp 나중에 다시 쓸 수 있게 null로 처리
				}
				
				System.out.print("[추가]데이터 입력 : ");
				int data = scan.nextInt();
				
				arr[elementCnt] = data;	// elementCnt 인덱스에 data 값 저장
				elementCnt++;	// arr.length가 0 -> 1, 1 -> 2
			}
			else if (sel == 2) {
				System.out.print("[삭제]인덱스 입력 : ");
				int delIdx = scan.nextInt();
				
				if (elementCnt - 1 < delIdx || delIdx < 0) { // elementCnt - 1 ? elementCnt에는 요소 존재 x
					System.out.println("[메세지]해당 위치는 삭제할 수 없습니다.");
					continue;
				}
				
				if (elementCnt == 1) {	// 인덱스 개수가 하나일 때
					arr = null;			// 배열은 null 상태
				}
				else if (elementCnt > 1) {	// 2개 이상
					int[] temp = arr;		// temp에 백업
					arr = new int[elementCnt - 1];	// 인덱스 한 개 삭제
					
					for (int i = 0; i < delIdx; i++) {	// delIdx 앞부분은 그대로 저장
						arr[i] = temp[i];
					}
					for (int i = delIdx; i < elementCnt - 1; i++) {	// delIdx 뒷부분은 한칸씩 앞으로 땡겨와 저장
						arr[i] = temp[i + 1];	
					}
					temp = null;
				}
				
				elementCnt--;
			}
			else if (sel == 3) {
				System.out.print("[삭제]데이터 입력 : ");
				int delData = scan.nextInt();
				
				int delIdx = -1;
				for (int i = 0; i < elementCnt; i++) {
					if (arr[i] == delData) {
						delIdx = i;
					}
				}
				
				if (delIdx == -1) {
					System.out.println("[메세지]입력하신 데이터는 존재하지 않습니다.");
					continue;
				}
				
				if (elementCnt == 1) {	// 요소가 1개밖에 없는데 지우는 경우
					arr = null;			// null 처리
				}
				else if (elementCnt > 1) {
					int[] temp = arr;
					arr = new int[elementCnt - 1];
					
					int j = 0;
					for (int i = 0; i < elementCnt; i++) {	//특정 인덱스(delIdx)를 제외한 배열(temp)의 요소를 다른 배열(arr)에 복사
						if (i != delIdx) {		// 삭제할 인덱스 값이 아닌 경우
							arr[j++] = temp[i]; // temp[i]의 값을 arr[j]에 할당하고 j++시키는 것 // 헷갈리면 arr[j] = temp[i]; j++해도됨
						}
					}
					
					temp = null;
				}
				
				elementCnt--;				
			}
			else if (sel == 4) {
				System.out.print("[삽입]인덱스 입력 : ");
				int insertIdx = scan.nextInt();
				
				if (elementCnt < insertIdx || insertIdx < 0) {
					System.out.println("[메세지]해당 위치는 삽입할 수 없습니다.");
					continue;
				}
				
				System.out.print("[삽입]데이터 입력 : ");
				int insertData = scan.nextInt();
				
				if (elementCnt == 0) {	// 삽입인데 배열이 null 상태인 경우
					arr = new int[elementCnt + 1];
				}
				else if (elementCnt > 0) {
					int[] temp = arr;
					arr = new int[elementCnt + 1];
					
					int j = 0;
					
					for (int i = 0; i < elementCnt + 1; i++) {	// elementCnt + 1 대신 arr.length 하면
						if (i != insertIdx) {
							arr[i] = temp[j++];	// 삽입이므로 i가 inserIdx가 아닌 곳에 temp에 백업해둔 값 저장 (알아서 삽입자리 빼고 저장됨) 
						}
					}
					temp = null;
				}
				
				arr[insertIdx] = insertData;
				elementCnt++;
			}
			else if (sel == 0) {
				break;
			}
		}

		scan.close();

	}

}