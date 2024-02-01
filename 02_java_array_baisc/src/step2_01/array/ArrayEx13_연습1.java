package step2_01.array;

import java.util.Arrays;

//24.01.25 time 12:43-12:58
/*
* today 소감문
* temp의 배열 크기가 null이라 첫 번째 for문의 if문 안에서 arr의 값들이 4의 배수이면 count를 세서
* temp의 배열의 크기로 정하고 저장하려고 했는데 nullPointerException이라는 경고가 떴다.
* 그래서 chat gpt를 통해 뭐가 문제인지 봤더니 배열의 크기를 초기화해야 된다고 했다.
* 결국 이 문제는 위의 방법으로 간단하게 풀 수 없고 if문 안에서는 4의 배수를 count만 세서
* 그걸 for문 밖에서 temp의 배열 크기로 초기화 해주고
* 또 tempIdx를 만들어서 for문에서 arr[i] 가 4의 배수이면 temp의 인덱스 값에 저장하도록
* 만들어야 했다. 
* 
* */
/*
 * # 4의 배수만 저장
 * 
 * - arr 배열에서 4의 배수의 개수를 계산하여 4의 배수만큼 temp 배열을 생성한뒤에 
 *   arr배열의 4의 배수들을  temp배열로 이관하여보시오.
 * 
 */

public class ArrayEx13_연습1 {

	public static void main(String[] args) {
		
		int[] arr = {44, 11, 29, 24, 76};
		int[] temp = null; 
		int cnt = 0;
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] % 4 == 0) {
				cnt++;
			}
		}
		temp = new int[cnt];
		int tempIdx = 0; 		// 이걸 사용해야 한다고 생각해야해
		for (int i = 0; i < arr.length; i++) {	//arr 배열의 4의 배수를 temp 배열로 옮김
		    if (arr[i] % 4 == 0) {
		        temp[tempIdx] = arr[i];
		        tempIdx++;
		    }
		}
		System.out.println(Arrays.toString(temp));
	}
	
}
