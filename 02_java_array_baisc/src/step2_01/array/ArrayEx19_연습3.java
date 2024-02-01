package step2_01.array;

import java.util.Arrays;

import java.util.Scanner;
// 24.01.28 time 20:54-20:57
/*
 * today 소감문
 * 이렇게 빨리 까먹을 줄 몰랐다. 즉 나는 이해를 했기보단 이해 반 암기 반 한 것 같아
 * 이런 상황이 나온 것 같다. 그러니 꾸준히 복습을 해야겠다고 느꼈던 것 같다.
 * */
/*
 * # 배열 컨트롤러[1단계] : 추가 (append)
 * 
 * 프로그래밍에서 데이터의 추가는 가장 끝 (마지막)에 하는 것이 일반적인 정책이다.
 * 정답을 보고 소스를 동작을 해본뒤에 소스를 이해하고 코드를 작성해보자.
 * 
 */


public class ArrayEx19_연습3 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int[] arr = {10 , 20 , 0 , 0 , 0 , 0 , 0 , 0 , 0 , 0};
		int elementCnt = 2;
		int selectMenu = 0;
		
		while (true) {
			
			System.out.println(Arrays.toString(arr));
			System.out.println();
			
			System.out.println("[1]추가");
			System.out.println("[0]종료");
			System.out.print("메뉴 선택 : ");
			selectMenu = scan.nextInt();
			
			if (selectMenu == 1) {
				System.out.print("추가할 값 입력: ");
				int data = scan.nextInt();
				
				if (elementCnt == arr.length) {
					System.out.println("더이상 추가할 수 없습니다.");
					continue;
				}
				
				arr[elementCnt] = data;
				elementCnt++;
				
				
			}
			else if (selectMenu == 0) {
				scan.close();	
				break; 	
			}
			
		}
		
	}
	
}
