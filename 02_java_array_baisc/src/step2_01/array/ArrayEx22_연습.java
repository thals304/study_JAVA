package step2_01.array;

import java.util.Scanner;

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


public class ArrayEx22_연습 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int[] arr = {10 , 20 , 0 , 0 , 0 , 0 , 0 , 0 , 0 , 0};
		int elementCnt = 2;
		int selectMenu = 0;
		
		while (true) {
			
			System.out.println("\n1추가");
			System.out.println("2삽입");
			System.out.println("3삭제");
			System.out.println("4종료\n");
			System.out.print("입력 : ");
			selectMenu = scan.nextInt();
			
			if(selectMenu == 1) {
				System.out.print("추가할 값 입력 : ");
				int data = scan.nextInt();
				
				if(elementCnt == arr.length) {
					System.out.println("더 이상 추가 X");
					continue;
				}
				arr[elementCnt] = data;
				elementCnt ++;
				
			}
			else if (selectMenu == 2) {
				if(elementCnt == arr.length) {
					System.out.println("더 이상 추가 X");
					continue;
				}
				
				System.out.print("삽입할 위치(인덱스) 입력 : ");
				int idx = scan.nextInt();
				
				if(idx < 0 || idx > elementCnt) {
					System.out.println("이 위치에 삽입할 수 없음");
					continue;
				}
				
				System.out.print("삽입할 값 입력 : ");
				int data = scan.nextInt();
				/*for(int i = idx; i < elementCnt; i++) {
					arr[i+1] = arr[i]; //  이렇게 하면 out of index라 안되나?
				}*/
				for(int i = elementCnt; idx < i; i--) {
					arr[i] = arr[i-1]; // 삽입은 끌어와야함
				}
				arr[idx] = data;
				elementCnt ++;
			}
			else if (selectMenu == 3) {
				System.out.print("삭제 할 값 입력 : ");
				int data = scan.nextInt();
				
				int delIdx = -1;
				for(int i = 0; i < arr.length; i++ ) {
					if(data == arr[i]) {
						delIdx = i;
					}
				}
				if(delIdx == -1) {
					System.out.println("입력하신 값 존재 X");
					continue;
				}
				else {
					for(int i = delIdx; i < arr.length - 1; i++ ) {
						arr[i] = arr[i+1];
					}
					elementCnt --;
					arr[elementCnt] = 0;
				}
			}
			else {
				scan.close();
				break;
			}
		}
		
	}
	
}
