package step1_06.loop;

import java.util.Random;
import java.util.Scanner;

// 24.01.19 time 14:19 - 14:26
/*
 * today 소감문
 * 처음에는 구구단 문제와 내 답을 while문 밖에 쓰려고 했었다.
 * 하지만 구구단 문제가 5번 출려되고 내 정답도 5번 입력하려면 
 * while문 안에 있어야 한다고 생각해서 바로 수정했던 것 같다.
 * */
/*
 * # 구구단 게임[3단계] - 2단 구구단
 * 
 * 1. 구구단 게임을 5회 반복한다.
 * 2. 정답을 맞추면 20점이다.
 * 3. 게임 종료 후, 성적을 출력한다.
 * 
 */


public class LoopEx04_연습1 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		Random ran = new Random();
		int i = 1;
		int score = 0;
		
		while(i <= 5) {
			int num1 = ran.nextInt(8)+2;	// [0-7] + 2
			int num2 = ran.nextInt(8)+2;
			
			System.out.print(num1 + " x " + num2 + " = ?");
			int myAnswer = scan.nextInt();
			
			if(num1 * num2 == myAnswer) 
			{
				score += 20;
			}
			i++;
		}
		System.out.println("점수 " + score);
		scan.close();
	}

}
