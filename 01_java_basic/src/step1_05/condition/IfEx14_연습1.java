package step1_05.condition;

import java.util.Random;

import java.util.Scanner;
// 24.01.18 time 13:29 - 13:34
/*
 * today 소감문

 * 이미 random에 대한 것은 힌트로 적혀 있어 
 * scan문과 if문만 문제에 맞게 작성해주면 되서 간단했다.
 * 
 * */
/*
 * # 코인 게임
 * 
 * 1. 0 또는 1의 랜덤 숫자를 저장한다.
 * 2. 0은 동전의 앞면, 1은 동전의 뒷면이다.
 * 3. 동전의 앞뒷면을 맞추는 게임이다.
 */

public class IfEx14_연습1 {

	public static void main(String[] args) {
		
		Random ran = new Random();
		Scanner scan = new Scanner(System.in);
		int coin = ran.nextInt(2);	// [0-1]

		if (coin == 0)
			System.out.println("동전 앞면");
		if (coin == 1)
			System.out.println("동전 뒷면");
		
		System.out.print("동전 앞면(0), 뒷면(1) 입력: ");
		int myAnswer = scan.nextInt();
		
		if (coin == myAnswer)
			System.out.println("정답");
		if (coin != myAnswer)
			System.out.println("오답");
		
		scan.close();
	}

}
