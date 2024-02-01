package step1_06.loop;

import java.util.Scanner;

// 24.01.23 time 12:26-12:37
/* today 소감문
 * 반복문 2번은 나에게 어렵게 느껴지는 주제이다.
 * 이 문제는 다른 반복문으로 푼 적이 있어 쉽게 풀 수 있을거라고 생각했는데
 * 일단, j의 조건식에서 문제가 발생했고, 숫자 출력의 위치에서 문제가 발생한 것 같다.
 * 그리고 이해가 안되는 점은 cnt를 이미 위에서 0으로 초기화 시켜줬는데 
 * for문 안에서 다시 0으로 해주는지 였던 것 같다. 일단, 반복문 2번은 어렵긴 어렵다.
 * */
/*
 * # 소수찾기[2단계]
 * 
 * 정수 한 개를 입력받아, 2부터 해당 숫자까지의 모든 소수 출력
 * 예)
 * 입력 : 20
 * 2, 3, 5, 7, 11, 13, 17, 19
 * 
 */

public class LoopEx29_연습1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("정수 입력 : ");
		int num = scan.nextInt();
		
		int cnt = 0;
		
		for(int i = 2; i <= num ; i++) {
			cnt = 0;	// 다음 숫자의 cnt 개수를 초기화 하기 위해서 필요한 코드
			for(int j = 1 ; j <= i; j++) {
				if(i % j == 0) cnt ++;
			}
			if(cnt == 2) {
				System.out.print(i + " ");
			}
			
		}
		scan.close();
	}
	
}
