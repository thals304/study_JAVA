package step3_01.arrayAdvanced;

import java.util.Arrays;
import java.util.Scanner;

// 24.01.29 time 20:47-21:05
/*
 * today 소감문
 * 이 문제는 최댓값 구하는 문제와 비슷해 딱히 어렵게 느껴지지 않았다.
 * 그래서 정답에서 표현하지 않은 myAnswer != max 일 때도 내가 추가로 코드를 만들었다.
 * 근데 정답을 5번 맞추었을 때도 종료가 되는 부분을 while문 어디에 써야 하는지에 대한
 * 고민을 5분 이상 하고 디버그도 돌렸는데도 모르겠어서 답지를 확인했다. 
 * */
/*
 * 
 * # 최대값 구하기[3단계]
 * 
 * 1. 가장 큰 값을 찾아 입력한다.
 * 2. 정답이면 해당 값을 -1로 변경한다.
 * 3. arr배열의 모든 값이 -1로 변경되면 프로그램은 종료된다.
 * 예)
 * 11, 87, 42, 100, 24
 * 입력 : 100
 * 
 * 11, 87, 42, -1, 24
 * 입력 : 87
 * 
 * 11, -1, 42, -1, 24
 * 
 */


public class ArrayEx25_연습1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int[] arr = {11, 87, 42, 100, 24};
		
		boolean isRunning = true;
		int cnt = 0;
	    while (isRunning) {
	    
		System.out.println(Arrays.toString(arr));
		
		int max = arr[0];
		int idx = 0;
		
		for (int i = 1; i < arr.length; i++) {
			if (max < arr[i]) {
				max = arr[i];
				idx = i;
			}
		}
		
		System.out.print("가장 큰 값 입력 : ");
		int myAnswer = scan.nextInt();
		
		if (myAnswer == max) {
			System.out.println("정답!");
			arr[idx] = -1;
			// 만약 정답이 5번 나와 모두 -1로 바뀌면 종료 되는 부분도 필요할 것 같은데
			cnt ++;
			
		}
		else {
			System.out.println("땡! 가장 큰 값이 아닙니다.");
			for (int i = 0; i < arr.length; i++) {
				arr[i] = -1;
				isRunning = false;
			}
		}
		if (cnt == 5) {
    		isRunning = false;
    	}
	    }
	    scan.close();
	}
	
}
