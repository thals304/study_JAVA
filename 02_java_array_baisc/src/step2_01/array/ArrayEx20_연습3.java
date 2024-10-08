package step2_01.array;

import java.awt.Insets;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;

 // 24.01.28 time 20:59-21:03
/*
 * today 소감문
 * 기억을 더듬으면서 자신있게 써봤지만 이전과 같은 실수를 했고 
 * 추가로 중요한 for문까지 틀려서 조금 속상했지만 
 * 더욱 많은 복습을 이루어 나갈거라는 열정이 생겼다.
 * */
/*
 * # 배열 컨트롤러[1단계] : 삽입 (insert)
 * 
 * 데이터들 중간 사이에 새로운 데이터를 추가하는 것은 삽입이라고 한다.
 * 정답을 보고 소스를 동작을 해본뒤에 소스를 이해하고 코드를 작성해보자.
 * 
 */

public class ArrayEx20_연습3 {

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
				
				if(elementCnt == arr.length) {
				System.out.println("더이상 삽입할 수 없습니다.");	// 이 부분 또 놓침
				continue;
				}
				
				System.out.print("삽입할 위치(인덱스) 입력 : ");
				int insertIdx = scan.nextInt();
				
				if(insertIdx < 0 || insertIdx > elementCnt) {
					System.out.println("삽입할 수 없습니다.");
					continue;
				}
				
				System.out.print("삽입할 값 입력 : ");
				int data = scan.nextInt();
				
				for (int i = elementCnt; i > insertIdx; i--) { 	// 조건식 부등호 반대로 쓰는 실수
					arr[i] = arr[i-1];
				}
				
				arr[insertIdx] = data;
				elementCnt++;
				
				
			}
			else if (selectMenu == 0) {
				scan.close();
				break;
			}
			
		}

}}
