package step2_01.array;

import java.util.Arrays;
import java.util.Scanner;
// 24.02.15 time 21:21-21:30
/*
 * today 소감문
 * 이전 삭제할 data를 입력해서 삭제하는 것과 다르게 
 * 인덱스를 입력해 삭제하도록 바꿔서 풀어봤다. 그러다보니 elementCnt가 0 이하일 때
 * 더이상 삭제할 값이 없다고 출력해주는 것이 필요하게 되어 집어넣어준 것 같다.
 * 그외에 나머지 조건식이나 삭제하는 for문은 이전과 똑같다. 
 * */
/*
 * # 배열 컨트롤러[1단계] : 삭제 (delete)
 * 
 * 정답을 보고 소스를 동작을 해본뒤에 소스를 이해하고 코드를 작성해보자.
 * 
 */



public class ArrayEx21_연습4 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int[] arr = {10, 20, 30, 40, 50};
		int elementCnt = 5;
		int selectMenu = 0;
		
		while (true) {
			
			System.out.println(Arrays.toString(arr));
			System.out.println();

			System.out.println("[1]삭제");
			System.out.println("[0]종료");
			
			System.out.print("메뉴 선택 : ");
			selectMenu = scan.nextInt();

			if (selectMenu == 1) {
				// 삭제 - 인덱스
				if (elementCnt <= 0) {
					System.out.println("더이상 삭제할 값이 없습니다");
					continue;
				}
				
				System.out.print("삭제할 위치(인덱스) 입력 : ");
				int deleteIdx = scan.nextInt();
				
				if (deleteIdx < 0 || deleteIdx > elementCnt) {	// 조건식이 너무 헷갈림 특히 elementCnt
					System.out.println("삭제할 수 없는 위치입니다.");
					continue;
				}
				
				for (int i = deleteIdx; i < elementCnt - 1; i++) {
					arr[i] = arr[i+1];
				}
				
				elementCnt--;
				arr[elementCnt] = 0;
				
			}
			else if (selectMenu == 0) {
				scan.close();
				break;
			}

		}
		
	}

}
