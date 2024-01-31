package step3_01.arrayAdvanced;
// 24.01.31 time 13:11- 16
/*
 * today 소감문
 * 문제 제목 그대로 기본문제라서 가볍게 워밍업 하듯이 푼 것 같다.
 * 오히려 헷갈린 부분은 문제에서 제시한 arr 배열의 각 인덱스 어떤 값이 저장되는 건지
 * 바로 캐치가 안되는 것 같다.
 * */
/*
 *	# 2차원배열 기본문제[1단계]
*/

import java.util.Arrays;

public class ArrayEx37_연습1 {

	public static void main(String[] args) {

		int[][] arr = new int[3][3];
		
		int k = 1;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = 10 * k;
				k++;
			}
		}
		
		// 문제 1) 전체 합 출력
		// 정답 1) 450
		int totalSum = 0;
		k = 1;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = 10 * k;
				k++;
				totalSum += arr[i][j];
			}
		}
		System.out.println(totalSum);
		
		// 문제 2) 4의 배수만 출력
		// 정답 2) 20 40 60 80 
		k = 1;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = 10 * k;
				k++;
				if (arr[i][j] % 4 == 0) {
					System.out.print(arr[i][j] +" ");
				}
			}
		}
		System.out.println();
		// 문제 3) 4의 배수의 합 출력
		// 정답 3) 200
		k = 1;
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = 10 * k;
				k++;
				if (arr[i][j] % 4 == 0) {
					sum += arr[i][j];
				}
			}
		}
		System.out.println(sum);
		// 문제 4) 4의 배수의 개수 출력
		// 정답 4) 4
		k = 1;
		int cnt = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = 10 * k;
				k++;
				if (arr[i][j] % 4 == 0) {
					cnt ++;
				}
			}
		}
		System.out.println(cnt);


	}

}
