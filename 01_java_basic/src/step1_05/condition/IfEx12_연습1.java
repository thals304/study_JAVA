package step1_05.condition;

import java.util.Scanner;

// 24.01.18 time 21:29 - 21:34
/*
 * today 소감문
 * 정수 입력을 받는 것은 문제 없었지만 
 * 정수 3개를 비교하려고 if문 중첩에 대한 생각과 이미 알고 있는 for문애 대한 생각이
 * 혼동되어서 비교하기 위한 변수 maxNum에 대한 생각을 if문에 어떻게 적용시켜야 될 지
 * 고민이 많았던 것 같다. 
 * */
/*
 * # 최대값 구하기[1단계]
 * 
 * 1. 숫자 3개를 입력받는다.
 * 2. 입력받은 3개의 수를 비교하여,
 * 3. 가장 큰 수(MAX)를 출력한다.
 */


public class IfEx12_연습1 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("정수 num1 입력 : ");
		int num1 = scan.nextInt();
		System.out.print("정수 num2 입력 : ");
		int num2 = scan.nextInt();
		System.out.print("정수 num3 입력 : ");
		int num3 = scan.nextInt();
		
		int maxNum = num1;
		if (maxNum < num2) {
			maxNum = num2;
		}
		if (maxNum < num3) {
			maxNum = num3;
		}
		System.out.println("가장 큰 숫자는 " + maxNum);
		scan.close();
}
}