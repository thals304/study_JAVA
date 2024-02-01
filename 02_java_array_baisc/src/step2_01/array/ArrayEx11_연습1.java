package step2_01.array;

import java.util.Arrays;
import java.util.Random;
// 24.01.24 time 21:55 - 22:24
/*
 * today 소감문
 * 역시나 이 문제도 어려웠다. 배열 자체가 너무 어려운 것 같다.
 * 하지만 익숙해지고 잘해야 하는데 배열 부분 문제를 어떻게 하면 더 잘 풀고 잘 이해할 수 있는지 부터
 * 고민해봐야 될 것 같다.
 * for문을 사용해서 자기 제외 다른 값들과 비교를 통해 
 * 같으면 다시 랜덤 숫자 부여하도록 만들고 싶었는데 인데스 범위를 넘어간다는 경고와 실패했다.
 * */
/*
 * # 중복숫자 금지[1단계]
 * 
 * 1. 0~4 사이의 숫자를 arr배열에 저장한다.
 * 2. 단, 중복되는 숫자는 없어야 한다.
 * 힌트) 랜덤 숫자를 isFirst배열의 인덱스로 활용한다.
 * 
 *  예)
 *  
 * [ 처음상태 ]
 * isFirst = {false , false , false , false , false}
 * arr     = {0, 0, 0, 0, 0}
 *  
 * 랜덤숫자 : 1
 * isFirst = {false , true , false , false , false}
 * arr     = {1, 0, 0, 0, 0}
 * 
 * 랜덤숫자 : 3
 * isFirst = {false , true , false , true , false}
 * arr     = {1, 3, 0, 0, 0}
 * 
 * 랜덤숫자 : 2
 * isFirst = {false , true , true , true , false}
 * arr     = {1, 3, 2, 0, 0}
 */


public class ArrayEx11_연습1 {

	public static void main(String[] args) {
	
		Random ran  = new Random(); 
		
		boolean[] isFirst = new boolean[5];
		int[] arr   = new int[5];
		int idx = 0;
		
		while(idx < 5) {	// for문으로도 충분히 바꿀 수 있음
			int rNum = ran.nextInt(5);	// [0-4]
			if(isFirst[rNum] == false) {	
				/*
				 * // rNum을 isFirst의 인덱스 값으로 표현하면 
				 * true인 건 이미 선택된 인덱스 번호이므로 중복이 나올리가 없음
				 * */
				isFirst[rNum] = true;		
				arr[idx] = rNum;
				idx++;
			}
		}
		System.out.print("arr : " + Arrays.toString(arr));		
		
			}
		
					
	}
	

