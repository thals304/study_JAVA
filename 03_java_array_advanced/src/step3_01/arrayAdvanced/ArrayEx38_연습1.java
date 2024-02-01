package step3_01.arrayAdvanced;
// 24.01.31 time 13:20-13:30
/*
 * today 소감문
 *  확실히 앞에 for문, 1차원 배열에서 비슷한 문제를 풀었더니 2차원도 응용할 수 있는
 *  능력이 생긴 느낌이다. 특히 마지막 문제 값 두 개 입력 받고 위치 바꾸기는 
 *  내가 진짜 못하고 너무 어렵게만 생각한 문제인데 짧고 간단하게 식을 쓸 수 있게 되서
 *  기분이 좋았던 것 같다.
 * */
/*
 *	# 2차원배열 기본문제[2단계]
*/

import java.util.Scanner;

public class ArrayEx38_연습1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[][] arr = new int[3][3];
		
		int k = 1;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = 10 * k;
				k += 1;
			}
		}
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
		
		// 문제 1) 인덱스 2개를 입력받아 값 출력
		// 예    1) 인덱스1 입력 : 1	인덱스2 입력 : 2
		//		   값 출력 : 60 
		System.out.print("인덱스 1 입력 : ");
		int idx1 = scan.nextInt();
		System.out.print("인덱스 2 입력 :  ");
		int idx2 = scan.nextInt();
		
		System.out.println(arr[idx1][idx2]);
		
		// 문제 2) 값을 입력받아 인덱스 2개 출력
		// 예    2) 값 입력 : 60
		//		   인덱스1 출력 : 1	인덱스2 출력 : 2
		System.out.print("값 입력 : ");
		int data = scan.nextInt();
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				if ( data == arr[i][j]) {
					System.out.println("인덱스1 출력 : " + i);
					System.out.println("인덱스2 출력 : " + j);
					
				}
			}
		}
		
		// 문제 3) 가장 큰 값의 인덱스 2개 출력
		// 정답 3) 2 2
		int maxNum = arr[0][0];
		idx1 = 0;
		idx2 = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j <arr[i].length; j++) {
				if (maxNum < arr[i][j]) {
					maxNum = arr[i][j];
					idx1 = i;
					idx2 = j;
				}
			}
		}
		System.out.println(idx1 + " " + idx2 );
		
		// 문제 4) 값 2개를 입력받아 값 교체
		
		System.out.print("값1 입력 : ");
		int data1 = scan.nextInt();
		System.out.print("값2 입력 : ");
		int data2 = scan.nextInt();
		for ( int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				if (data1 == arr[i][j]) arr[i][j] = data2;
				else if (data2 == arr[i][j]) arr[i][j] = data1;
			}
		}
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}



	}

}
