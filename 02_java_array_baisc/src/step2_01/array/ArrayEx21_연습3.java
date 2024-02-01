package step2_01.array;


import java.util.Arrays;
import java.util.Scanner;
// 24.01.28 time 21:07-21:11
/*
 * today 소감문
 * 삭제 부분도 delIdx를 사용하는게 그냥 암기로 떠올린 것 같은 느낌이 들어
 * 아쉬운 부분이 있다. 다음에는 왜 delIdx가 필요해서 이런 역할로 사용하기 위해
 * 만든 변수라는 것이 먼저 머릿속에 떠오르면 좋겠다. 
 * */
/*
 * # 배열 컨트롤러[1단계] : 삭제 (delete)
 * 
 * 정답을 보고 소스를 동작을 해본뒤에 소스를 이해하고 코드를 작성해보자.
 * 
 */



public class ArrayEx21_연습3 {

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
				
				System.out.print("삭제할 값 입력 : ");
				int data = scan.nextInt();
				
				int delIdx = -1;
				for(int i = 0; i < elementCnt; i++) { // i < arr.length라고 해고 상관 없음
					if(arr[i] == data) {
						delIdx = i;
					}
				}
				
				if(delIdx == -1) {
					System.out.println("존재하지 않는 값입니다.");
					continue;
				}
				else {
					for(int i = delIdx; i < elementCnt - 1; i++) {
						arr[i] = arr[i+1];
					}
					elementCnt --;
					arr[elementCnt] = 0;	// 배열 크기를 줄이지 못하므로 마지막 부분을 0으로 저장해줘야함
				}
			}
			else if (selectMenu == 0) {
				scan.close();
				break;
			}

		}
		
	}

}
