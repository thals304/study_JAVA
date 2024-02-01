package step1_06.loop;

import java.util.Scanner;

// 24.01.24 time 12:41-12:51
/*
 * today 소감문
 * 이번 문제는 정답 예시를 보고 이해하는 방향으로 문제를 풀었다.
 * 정답예시처럼 원활하게 2차원 반복문을 구성하고 start, end 값을 조절하는 게
 * 잘 안되고 어렵다고 느껴져서 2차원 반복문은 따로 머리+손으로 써가며 공부해 봐야될 것 같다.
 * */
/*
 * # 2차원 반복문
 * 
 * 1 2 3 4 5
 * 10 9 8 7 6
 * 11 12 13 14 15
 * 20 19 18 17 16
 * 21 22 23 24 25
 * 
 * 
 * 1) 오른쪽방향으로 순서대로 출력
 * 2) 왼쪽방향대로 순서대로 출력
 * 
 * 1)2) 5번 반복
 * 
 */


public class LoopEx30_연습1 {

	public static void main(String[] args) {

		int start = 1;
		int end = 5;
		for(int i = 0; i < 5; i++) {	// 5번 반복
			if(i%2 == 0) {	// 1)오른쪽 방향
				for(int j = start; j <= end; j++) {
					System.out.print(j+ " ");
				}
			}
			else {	// 2)왼쪽 방향
				for (int j = end; j >= start; j--) {
					System.out.print(j + " ");
				}
			}
			System.out.println();
			start = end + 1;
			end += 5;
		}
		
	}

}
