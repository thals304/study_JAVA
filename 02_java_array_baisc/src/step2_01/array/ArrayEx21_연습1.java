package step2_01.array;

import java.util.Arrays;
import java.util.Scanner;

/*
 * # 배열 컨트롤러[1단계] : 삭제 (delete)
 * 
 * 정답을 보고 소스를 동작을 해본뒤에 소스를 이해하고 코드를 작성해보자.
 * 
 */



public class ArrayEx21_연습1 {

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
				for(int i = 0; i < arr.length; i++) {
					if(arr[i] == data) {
						delIdx = i; 
					}
				}
				if(delIdx == -1) {
					System.out.println("입력하신 값은 존재하지 않습니다.");
				}
				else {
					for(int i = delIdx; i < arr.length - 1; i++) {
						arr[i] = arr[i+1]; // 뒤에 있는 요소가 앞으로 옮겨지는 과정
					}
					elementCnt --;
					arr[elementCnt] = 0; // 인덱스는 0부터 시작하므로? 
				}
				
				
			}
			else if (selectMenu == 0) {
				scan.close();
				break;
			}

		}
		
	}

}
