package step1_05.condition;

import java.util.Scanner;

// 24.01.18 9:23 - 9: 28
/*
 * today 소감문
 * 일단 단순 정수 2개를 입력 받고 내 답을 입력 받아 
 * 정수 2개의 곱(구구단)과 비교를 하는 거라 문제는 없었다.
 * 하지만 출력에서 num1 num2를 계산하는 것이 아닌
 * 둘의 곱을 저장하는 변수를 따로 만들었으면 if 문에서도 사용하기 더 좋았을 것 같다.
 * */
/*
 * # 구구단 게임[1단계]
 * 
 * 1. 구구단 문제를 출제하기 위해, 숫자 2개를 입력받는다.
 * 2. 입력받은 숫자를 토대로 구구단 문제를 출력한다.
 * 예)	3 x 7 = ?
 * 3. 문제에 해당하는 정답을 입력받는다.
 * 4. 정답을 비교 "정답" 또는 "땡"을 출력한다.
 */


public class IfEx06_연습1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		 
		System.out.print("정수 num1 입력 : ");
		int num1 = scan.nextInt();
		System.out.print("정수 num2 입력 : ");
		int num2 = scan.nextInt();
		
		System.out.println("구구단 문제");
		System.out.println(num1 +" x " + num2 + " = ?");
		System.out.print("내 정답 : ");
		int answer = scan.nextInt();
		
		if( (num1*num2) == answer )
			System.out.println("정답");
		if( (num1*num2) != answer )
			System.out.println("땡");
		
		scan.close();
		

	}

}
