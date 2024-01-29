package step1_06.loop;

import java.util.Scanner;

// 24.01.22 time 22:10 - 22:12
/*
 * today 소감문
 * 이 문제를 Ex26 풀기 전에 풀었어야 했는데 실수로 26번 먼저 풀었다.
 * 이 문제를 통해 for문에서 max값을 출력하는 방법을 알았었으면 26번 문제에서
 * 가장 큰 점수를 갖는 학생 번호의 입력에 대해서만 고민을 했으면 되었을 것 같다는 생각이
 * 들기도 하지만 이 문제를 풀지 못하지 않았을까 싶다.
 * 반복문 안, 밖에서 최댓값, 최솟값 구하는 문제는 앞에서도 뒤에서도 틀린거로 보아 
 * 내가 계속 반복하고 봐야 할 문제라고 생각한다. 
 * */
/*
 * # 최대값 구하기[2단계]
 * 
 * 1. 3회 반복을 하면서 정수를 입력받는다.
 * 2. 입력받은 3개의 숫자 중 가장 큰 값을 출력한다.
 * 
 */

public class LoopEx25_연습1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int maxNum = 0;
		for(int i = 0; i < 3; i++) {
			System.out.print("정수 입력 : ");
			int num = scan.nextInt();
			
			if(maxNum < num) {
				maxNum = num;
			}
			
		}
		System.out.println("가장 큰 정수 값 : " + maxNum);
		
		scan.close();
	}

}
