package step1_05.condition;

import java.util.Scanner;
// 24.01.21 time 20:28 - 20:32
/*
 * today 소감문
 * 앞에 문제 26번을 보고 와서 그런지 훨씬 더 쉽다고 느껴진 문제였다.
 * 하지만 이 문제는 12월까지만 입력해야 내가 원하는 답이 나오는데 
 * 그 이외에 숫자를 집어넣을 경우에도 제한을 주고 싶어 switch문을 if문으로 감싸서 
 * 정답 예시와 달리 한 층 더 발전된 코드를 만든 것 같아 기분이 좋았다.
 * */
/*
 * # 달력 일수 출력
 * 
 * 키보드로 월을 입력받아서 월에 해당하는 일수를 화면에 출력
 * 
 * 참고)
 * 1월  : 31일
 * 2월  : 28일
 * 3월  : 31일
 * 4월  : 30일
 * 5월  : 31일
 * 6월  : 30일
 * 7월  : 31일
 * 8월  : 31일
 * 9월  : 30일
 * 10월 : 31일
 * 11월	: 30일
 * 12월 : 31일
 * 
 * */

public class IfEx27_연습1 {

	public static void main(String[] args) {

		
		Scanner scan = new Scanner(System.in);
		System.out.print("월 입력: ");
		int getMonth = scan.nextInt();
		
		if (1 <= getMonth && getMonth <= 12) {
		
		switch (getMonth) {

		case 2 :
			System.out.print("28일");
		case 4:
		case 6:
		case 9:
		case 11:
			System.out.print("30일");
		default :
			System.out.print("31일");
		}
		}
		else
			System.out.println("다시 입력하세요.");
		
		scan.close();

	}

}
