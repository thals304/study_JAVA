package step1_04.input;

import java.util.Scanner;

// 24.01.17 time 13:55 - 14:00
/*
 * today 소감문
 * scan을 배워보긴 했는데 scan.close(); 사용은 처음해봐서 좋았고
 * 항상 import java.util.Scanner;을 직접 사용했었는데
 * new Scanner(System.in); + ctrl + space bar로
 * 대체 할 수 있어 너무 좋았던 것 같다.
 * 
 * */

public class InputEx02_연습1 {

	public static void main(String[] args) {
	
		Scanner scan = new Scanner(System.in);
		// 문제1) 숫자 2개를 입력받아서 합 출력
		System.out.print("num1 입력 : ");
		int num1 = scan.nextInt();
		System.out.print("num2 입력 : ");
		int num2 = scan.nextInt();
		int total = num1 + num2;
		System.out.println("num1+num2의 합은 " + total);
		
		// 문제2) 숫자 1개를 입력받아서 홀수이면 true 출력
		System.out.print("num3 입력 : ");
		int num3 = scan.nextInt();
		System.out.println( num3 % 2 == 1);
		
		// 문제3) 성적을 입력받아 60점 이상이고 100점 이하이면 true 출력
		System.out.print("성적을 입력하시오: ");
		int score = scan.nextInt();
		System.out.println(score >= 60 && score <= 100);
		
		scan.close();
		
	}
	
}
