package step3_01.arrayAdvanced;

import java.util.Scanner;

// 24.01.31 time 13:41-14:05
/*
 * today 소감문
 * 이번에도 어려운 느낌의 문제라고 생각이 안들 정도로 잘 푼 것 같다.
 * 하지만 문제 4번에서 고민을 했던 것 같다. 왜냐하면 앞에 Ex39-4번 문제와
 * 같다고 생각해 풀었는데 호 값을 2개 입력 받아 호 값을 교체하는 것이 아닌
 * 관리비를 교체한다는 점에서 두 이차원 배열의 연결성을 어떻게 만들지 많이 고민했던 것 같다.
 * 근데 분명 1차원 배열에서 했었던 문제이기 때문에 이걸 못푼다면 1차원 배열의 그 문제 또한
 * 다시 복습해야 할 부분이라고 생각했다.
 * */
/*
 *	# 관리비
*/

public class ArrayEx40_연습1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[][] apt = {
				{101, 102, 103},	
				{201, 202, 203},	
				{301, 302, 303}	
			};
			
		int[][] pay = {
			{1000, 2100, 1300},	
			{4100, 2000, 1000},	
			{3000, 1600,  800}
		};
			
		// 문제 1) 각층별 관리비 합 출력
		// 정답 1) 4400, 7100, 5400
		// 39번 정답 예시 이해 후에 그 방법대로 풀어봐야지 - 가로 합
		int[] garo = new int[pay.length];
		for (int i = 0; i < pay.length; i++) {
			for (int j = 0; j < pay[i].length; j++) {
				garo[i] += pay[i][j];
			}
		}
		for (int i = 0; i < garo.length; i++) {
			System.out.print(garo[i] + " ");
		}
		System.out.println();
		
		// 문제 2) 호를 입력하면 관리비 출력
		// 예   2) 입력 : 202	관리비 출력 : 2000
		System.out.print("호 입력 : ");
		int getApt = scan.nextInt();
		for (int i = 0; i < apt.length; i++) {
			for (int j = 0; j < apt[i].length; j++) {
				if (getApt == apt[i][j]) 
					System.out.println("관리비 출력 : " +pay[i][j]);
				
				}
		}
		// 문제 3) 관리비가 가장 많이 나온 집, 적게 나온 집 출력
		// 정답 3) 가장 많이 나온 집(201), 가장 적게 나온 집(303)
		int maxPay = pay[0][0];
		int minPay = pay[0][0];
		
		for (int i = 0 ; i < pay.length; i++) {
			for (int j = 0; j < pay[i].length; j++) {
				if (maxPay < pay[i][j]) maxPay  = pay[i][j];
				if (minPay > pay[i][j]) minPay = pay[i][j];
			}
			
		}
		for (int i = 0 ; i < pay.length; i++) {	// 출력 부분을 위에 for문과 같이 쓸수는 없는 건가?
			for (int j = 0; j < pay[i].length; j++) {
				if (maxPay == pay[i][j]) System.out.println("가장 많이 나온 집 ("+apt[i][j]+")");
				if (minPay == pay[i][j]) System.out.println("가장 적게 나온 집 ("+apt[i][j]+")");
				
			}
			}
	
	
		// 문제 4) 호 2개를 입력하면 관리비 교체
		System.out.print("호1 입력 : ");
		int getApt1 = scan.nextInt();
		System.out.print("호2 입력 : ");
		int getApt2 = scan.nextInt();
		int firstIdx1 = 0;
		int SecondIdx1 = 0;
		int firstIdx2 = 0;
		int SecondIdx2 = 0;
		for (int i = 0; i < apt.length; i++) {
			for (int j = 0; j < apt[i].length; j++) {
				if (getApt1 == apt[i][j]) {	// Ex39-4번과는 조금 다름
					firstIdx1 = i; 
					SecondIdx1 = j;
					}
				
				else if (getApt2 == apt[i][j]) {
					firstIdx2 = i; 
					SecondIdx2 = j;
				}
			}
		}
		int temp = pay[firstIdx2][SecondIdx2];
		pay[firstIdx2][SecondIdx2] = pay[firstIdx1][SecondIdx1];
		pay[firstIdx1][SecondIdx1] = temp;
		
		for (int i = 0; i < pay.length; i++) {
			for (int j = 0; j < pay[i].length; j++) {
				System.out.print(pay[i][j] + " ");
			}
			System.out.println();
		}
		
	}

}
