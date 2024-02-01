package step2_01.array;

import java.awt.Insets;
import java.util.Arrays;
import java.util.Scanner;
// 24.01.26 time  21:35-21:41
/*
 * today 소감문
 * 일단 elementCnt == arr.length일 때 더이상 삽입할 수 없다는 
 * 코드를 젤 먼저 넣어주어야 하는데 이 부분이 생각나지 않았다.
 * 그리고 틀리지는 않았지만 삽입할 곳에 이미 있는 인덱스 요소부터 elementCnt까지 한칸씩
 * 밀어줘야 하는데 for문의 초기식; 조건식; 증감식이 아직도 어렵게 느껴지긴 한다.
 * */
/*
 * # 배열 컨트롤러[1단계] : 삽입 (insert)
 * 
 * 데이터들 중간 사이에 새로운 데이터를 추가하는 것은 삽입이라고 한다.
 * 정답을 보고 소스를 동작을 해본뒤에 소스를 이해하고 코드를 작성해보자.
 * 
 */

public class ArrayEx20_연습2 {

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

				if (elementCnt == arr.length) {	// 이 부분을 놓침
					System.out.println("더 이상 삽입할 수 없습니다.");
					continue;
				}
				
				System.out.print("삽입할 위치(인덱스) 입력 : ");
				int insertIdx = scan.nextInt();
				
				if(insertIdx < 0 || insertIdx > elementCnt) {	// elementCnt - 1이 아닌 이유는 삽입이 elementCnt 인덱스에서 추가같은 삽입이 가능하므로
					System.out.println("삽입할 수 없습니다.");
					continue;
				}
				System.out.print("삽입할 값 입력 : ");
				int data = scan.nextInt();
				for(int i = elementCnt; i > insertIdx; i-- ) {
					arr[i] = arr[i-1];
				}
				arr[insertIdx] = data;
				elementCnt ++;
				
				
			}
			else if (selectMenu == 0) {
				scan.close();
				break;
			}
			
		}

}}
