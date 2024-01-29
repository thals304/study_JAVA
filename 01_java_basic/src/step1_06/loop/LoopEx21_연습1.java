package step1_06.loop;

import java.util.Random;
import java.util.Scanner;

// 24.01.22 time 14:33- 14:39
/*
 * today 소감문
 * 전에 while문으로 풀었던 문제를 for문으로 다시 푸려니 while문에서 푼 것이 
 * 아직 기억에 남아있다보니 지우고 다시 쓰는데 시간이 걸렸지만 방식은 똑같고 위치만 다른다고 느꼈다.
 * */
/*
 * # 구구단 게임[3단계]
 * 
 * 1. 구구단 게임을 5회 반복한다.
 * 2. 정답을 맞추면 20점이다.
 * 3. 게임 종료 후, 성적을 출력한다.
 * 
 */

public class LoopEx21_연습1 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		Random ran = new Random();
		int score = 0;
		
		for(int i = 1; i <= 5; i++) {
			int rNum1 = ran.nextInt(8)+ 2;	// [0-7] + 2
			int rNum2 = ran.nextInt(8) + 2;
			int total = rNum1 * rNum2;
			System.out.println("구구단 게임");
			System.out.print(rNum1 + " x " + rNum2 + " = ");
			int myAnswer = scan.nextInt();
			if(myAnswer == total) {
				System.out.println("정답");
				score += 20;
			}
			else
				System.out.println("땡");
		}	
		System.out.println("총 점수 : " + score);
	}

}
