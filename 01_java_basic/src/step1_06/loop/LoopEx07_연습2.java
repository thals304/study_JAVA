package step1_06.loop;

import java.util.Random;
import java.util.Scanner;

/*
 * 24.03.28 time 22:27-22:35
 * today 소감문
 *  일단 while문 조건을 단순히 true로 쓴게 아닌 불리언 변수를 만들어 그걸 자연스럽게 사용했다는
 *  사실에 실력이 조금 늘었다? 자바에 조금 익숙해졌다는 생각이 들어 뿌듯하다.
 * */

/*
 * # Up & Down 게임[2단계]
 * 
 * 1. 1 ~ 100까지의 난수를 생성한다.
 * 2. 스캐너를 이용해 정답을 맞추기를 시도하고 정답을 맞출경우 게임은 종료된다.
 * 3. 점수는 100점부터 시작해서 오답을 입력할 때마다 5점씩 차감된다.
 * 4. 게임 종료 후, 점수를 출력한다.
 * 
 */

public class LoopEx07_연습2 {

	public static void main(String[] args) {
		
		Random ran = new Random();
		Scanner scan = new Scanner(System.in);
		
		int rNum = ran.nextInt(100) + 1; // [0-99] + 1
		System.out.println("난수 확인 : " + rNum); // 확인차
		
		boolean isRunning = true;
		int score = 100;
		
		while (isRunning) {
			if (score == 0) {
				System.out.println("점수 0점으로 게임 종료 ");
				break;
			}
			
			System.out.println("난수 맞추기");
			System.out.print("내 정답 : ");
			int myAnswer = scan.nextInt();
			
			if (rNum == myAnswer) {
				System.out.println("정답입니다.");
				isRunning = false;
		    }
			else if (rNum > myAnswer){
				System.out.println("Up!");
				score -= 5;
			}
			else if (rNum < myAnswer) {
				System.out.println("Down!");
				score -= 5;
			}
		}
		System.out.println("게임 종료 ! 최종 점수 : " + score);
		scan.close();
	}

}
