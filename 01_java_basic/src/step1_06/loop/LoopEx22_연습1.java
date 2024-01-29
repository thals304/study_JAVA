package step1_06.loop;
// 24.01.22 time 14:42 - 14:47
/*
 * today 소감문
 * for문의 조건식을 어떻게 구성해야될 지 고민을 했던 것 같다.
 * 고민의 결과 총 100점에서 틀릴때마다 5점씩 점수를 깎는 문제이니
 * 점수가 최소 0점 이상이 될 수 있도록 반복문을 20번 돌게한 것 같다.
 * 그리고 정답을 맞추게 되면 반복문을 더 도는 것이 아닌 빠져나오게 해야 하는데
 * 이 방법은 break;를 통해 가능하게 만들었다.
 * */
/*
 * # Up & Down 게임[2단계]
 * 
 * 1. 정답을 맞추면 게임은 종료된다.
 * 2. 100점부터 시작해 오답을 입력할 때마다 5점씩 차감된다.
 * 3. 게임 종료 후, 점수를 출력한다.
 * 
 */

import java.util.Random;
import java.util.Scanner;

public class LoopEx22_연습1 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		Random ran = new Random();
		int score = 100;
		
		System.out.println("Up & Down 게임");
		int rNum = ran.nextInt(100)+ 1;	// [0-99] + 1
		System.out.println(rNum);	// 코드 확인차
		
		for(int i = 1; i <= 20; i++) {	// 점수를 0-100점으로 하고 싶어 틀리면 5점씩 감점된다고 할 때 반복문 20번 반복 
			System.out.print("정답(1-100) : ");
			int myAnswer = scan.nextInt();
			if(rNum > myAnswer) {
				System.out.println("UP!");
				score -= 5;
				}
			else if (rNum < myAnswer) {
				System.out.println("Down!");
				score -= 5;
		}
			else {
				System.out.println("정답");
				break;
			}
			
		}
		System.out.println("최종 점수 : " + score);
		scan.close();
	}

}
