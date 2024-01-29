package step1_05.condition;

import java.util.Random;

import java.util.Scanner;
// 24.01.18 time 13:53 - 13:58
/*
 * today 소감문

 * random 숫자를 1-100까지 만드는데는 잘 풀었다.
 * 근데 내 choice를 중첩 if문으로 표현하는 부분에서 중첩이 아닌 
 * if( && )로 표현하는 실수를 한 것 같다. 
 * 랜덤 숫자를 모르는 상태에서 문제의 정답만 출력하는 것 보다 
 * 알아야지 코드를 이해하는게 더 쉬울꺼라 판단해 if문 앞에 한 번 출력해주었다.
 * */
/*
 * # 홀짝 게임
 * 
 * 1. 1~100사이의 랜덤 숫자를 저장한다.
 * 2. 저장된 랜덤 숫자를 보여주고,
 * 3. 해당 숫자가 홀수인지 짝수인지 맞추는 게임이다.
 * 
 */

public class IfEx16_연습1 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		Random ran = new Random();
		
		int rNum = ran.nextInt(100)+ 1;	// [0-99] +1
		
		System.out.println("1.홀수");
		System.out.println("2.짝수");

		System.out.print("번호를 선택하세요 : ");
		int choice = scan.nextInt();
		
		System.out.println("랜덤 숫자는 " +rNum);
		
		if(choice == 1) {
			if(rNum % 2 == 0)
				System.out.println("땡!");
			if(rNum % 2 == 1)
				System.out.println("정답!");
		}
		if(choice == 2) {
			if(rNum % 2 == 0)
				System.out.println("정답!");
			if(rNum % 2 == 1)
				System.out.println("땡");
		}
		
		
	}

}
