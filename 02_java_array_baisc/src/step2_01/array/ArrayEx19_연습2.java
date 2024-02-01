package step2_01.array;

import java.util.Arrays;
import java.util.Scanner;
//24.01.26 time 21:27-21:29
/*
* today 소감문

* 처음 분석부터 시작해서 따라 써보기도 하고 병합도 해봤는데도 머리에 들어오지 않아
* 쉽지 않았고 그렇다고 전부 암기하기에는 응용을 못할 것 같아 조금 힘들고 포기하고 싶었다.
* 하지만 코드를 따라가면서 직접 배열 그림을 그려보고 눈으로 확인하면서 정리를 하니
* 훨씬 잘 이해가 됐고 재밌었던 것 같다. 
* 
* */
/*
 * # 배열 컨트롤러[1단계] : 추가 (append)
 * 
 * 프로그래밍에서 데이터의 추가는 가장 끝 (마지막)에 하는 것이 일반적인 정책이다.
 * 정답을 보고 소스를 동작을 해본뒤에 소스를 이해하고 코드를 작성해보자.
 * 
 */


public class ArrayEx19_연습2 {

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
				
				System.out.print("추가할 값 입력 : ");
				int data = scan.nextInt();
				if(elementCnt == arr.length ) {
					System.out.println("더이상 추가 할 수 없음");
					continue;
				}
				arr[elementCnt] = data;
				elementCnt ++;
			}
			else if (selectMenu == 0) {
				break; 	// while 반복문 빠져나가게
			}
			
		}
		scan.close();
		
	}
	
}
