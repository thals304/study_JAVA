package step1_05.condition;
// 24.01.17 time 14:50 - 14:55
/*
 * today 소감문
 * if문과 scan의 조합이라 좋은 문제였다
 * */
/*
 * # Up & Down 게임[1단계]
 * 
 * 1. com은 8이다.
 * 2. me는 com의 숫자를 맞추는 게임이다.
 * 3. Scanner로 숫자를 입력받아 me 변수에 저장한다음 아래와 같은 기능을 구현한다.
 * 1) me가 com보다 작으면  Up! 출력 
 * 2) me와 com이 같으면 Bingo! 출력
 * 3) me가 com보다 크면 Down! 출력
 */

import java.util.Scanner;

public class IfEx02_연습1 {

	public static void main(String[] args) {
	
		Scanner scan = new Scanner(System.in); 
		int com = 8;	
		System.out.print("me의 숫자를 입력하세요 : ");
		int me = scan.nextInt();
		
		if(me < com)
			System.out.println("Up!");
		if(me == com)
			System.out.println("Bingo!");
		if(me > com)
			System.out.println("Down!");
		
		scan.close();
		
		
	}

}
