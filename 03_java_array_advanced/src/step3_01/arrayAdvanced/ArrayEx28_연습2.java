package step3_01.arrayAdvanced;

import java.util.Arrays;
import java.util.Random;

// 24.01.31 time 14:15-14:22
/*
 * today 소감문
 * 다시 풀어본 결과 이 문제의 핵심은 
 * while문을 사용해 랜덤 숫자를 배열 크기만큼 저장하도록 하는 것과 
 * 중복을 표현하는 변수를 사용하는 것과
 * i 번째 랜덤 값이 이전 배열에 저장된 j번째 랜덤값들과 같은지 비교하는 것이다.
 * */

/*
 * # 중복숫자 금지[2단계]
 * 
 * 1. arr배열에 1~10 사이의 랜덤 숫자 5개를 저장한다.
 * 2. 단 중복되는 숫자가 없어야 한다.
 */


public class ArrayEx28_연습2 {

	public static void main(String[] args) {
		Random ran = new Random();
		int[] arr = new int[5];
		int i  = 0;
		
		while (i < arr.length) {
			int rNum = ran.nextInt(10) + 1;	// [0-9] + 1
			
			int check = 1;
			/*
			int j = 0;
			while (j < i) {	// for문으로 만들수 없나? 가능함
				if (arr[j] == rNum) {
					check = -1;
					}
				j++;
			}*/
			 for (int j = 0; j < i; j++) {
				if (arr[j] == rNum)
					check = -1;
				}
				
				
			
			if (check == 1){
				arr[i] = rNum;
				i++;
			}
			
		}
		System.out.println(Arrays.toString(arr));
		
	}
	
}
