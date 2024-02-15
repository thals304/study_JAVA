package step2_01.array;

import java.util.Arrays;
import java.util.Scanner;
// 24.02.15 time 13:37-13:44
/*
 * today 소감문
 * 오랜만에 복습차원 겸 해봤는데 전에 내가 어려워 했던 부분에서 똑같이 막히는 것 같다.
 * 뒤에 문법들 예쩨에서 자료구조 문제들이 또 나오는데 그 때마다 복습해야 될 것 같다.
 * */
/*
 * # 배열 컨트롤러[1단계] : 추가 (append)
 * 
 * 프로그래밍에서 데이터의 추가는 가장 끝 (마지막)에 하는 것이 일반적인 정책이다.
 * 정답을 보고 소스를 동작을 해본뒤에 소스를 이해하고 코드를 작성해보자.
 * 
 */


public class ArrayEx19_연습4 {

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
				// arr.length - 1인지 arr.length인지 헷갈림
				// arr 인덱스는 9까지 이므로 elementCnt == arr.length : 10일 때 해줘야 함
				if (elementCnt == arr.length) { 
					System.out.println("더이상 추가할 수 없습니다.");
					continue;	// continue 반드시 써줘야함
				}
				
				System.out.print("추가할 값 입력 : ");
				int appendValue = scan.nextInt();
				
				arr[elementCnt] = appendValue;
				elementCnt ++;
			}
			else if (selectMenu == 0) {
				scan.close();	
				break; 	
			}
			
		}
		
	}
	
}
