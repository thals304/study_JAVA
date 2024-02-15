package step2_01.array;

import java.awt.Insets;
import java.util.Arrays;
import java.util.Scanner;
// 24.02.15 time 21:07-21:17
/*
 * today 소감문
 * 일단 내가 예상했던 아무것도 못쓸거라는 것을 벗어나 코드 한줄 한줄 생각하면서 
 * 작성해간거 같아서 뿌듯했고 아직 개념을 잊지 않았다는 점이 기분이 좋았다.
 * 근데 continue를 빼먹는 큰 실수와 continue를 쓰는 조건식이 크게 와닿지 않고
 * 아직도 이해가 안된 느낌이라 더 많은 복습과 이해가 필요하다고 본다.
 * */
/*
 * # 배열 컨트롤러[1단계] : 삽입 (insert)
 * 
 * 데이터들 중간 사이에 새로운 데이터를 추가하는 것은 삽입이라고 한다.
 * 정답을 보고 소스를 동작을 해본뒤에 소스를 이해하고 코드를 작성해보자.
 * 
 */

public class ArrayEx20_연습4 {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int[] arr = {10 , 20 , 0 , 0 , 0 , 0 , 0 , 0 , 0 , 0};
		int elementCnt = 2;
		int selectMenu = 0;
		
		while(true) {
			
			System.out.println(Arrays.toString(arr));
			System.out.println();
			
			System.out.println("[1]삽입");
			System.out.println("[0]종료");
			
			System.out.print("메뉴 선택 : ");
			selectMenu = scan.nextInt();
			
			if (selectMenu == 1) {
				
				if (elementCnt == arr.length) {
					System.out.println("더이상 삽입할 수 없습니다.");
					continue; // continue 반드시 써줘야함
				}
				
				System.out.print("삽입할 위치(인덱스) 입력 : ");
				int insertIdx = scan.nextInt();
				
				if(insertIdx < 0 || insertIdx > elementCnt) { // insertIdx > elementCnt 
					System.out.println("삽입할 수 없는 위치입니다.");
					continue;
				}
				
				System.out.print("삽입할 값 입력 :");
				int insertData = scan.nextInt();
				
				for (int i = elementCnt; i > insertIdx; i-- ) {
					arr[i] = arr[i-1];
				}
				
				arr[insertIdx] = insertData;
				elementCnt ++;
				
			}
			else if (selectMenu == 0) {
				scan.close();
				break;
			}
			
		}


	}
}
