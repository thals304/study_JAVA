package step2_01.array;

import java.util.Arrays;
import java.util.Scanner;

/*
 * # 배열 컨트롤러[1단계] : 삽입 (insert)
 * 
 * 데이터들 중간 사이에 새로운 데이터를 추가하는 것은 삽입이라고 한다.
 * 정답을 보고 소스를 동작을 해본뒤에 소스를 이해하고 코드를 작성해보자.
 * 
 */

public class ArrayEx20_연습1 {

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
				
				if(elementCnt == arr.length) {	// > 이면 안됨, 왜냐면 out of index가 되므로
					System.out.println("더이상 삽입할 수 없음");
					continue;
				}
				System.out.print("삽입할 인덱스(위치) 입력 : ");
				int idx = scan.nextInt();
				if(idx < 0 || idx > elementCnt) {
					System.out.println("이 위치에 삽입할 수 없음");
					continue;
				}
				System.out.print("삽입할 값 입력 : ");
				int data = scan.nextInt();
				
				for(int i = elementCnt; idx < i; i--) {	// 삽입하려면 삽입하려는 위치에 있던 요소 부터 한칸씩 뒤로 가야 하는거 아닌가?
					arr[i] = arr[i-1];
				}
				arr[idx] = data;
				elementCnt++;
				
			}
			else if (selectMenu == 0) {
				scan.close();
				break;
			}
			
		}

}}
