package step1_05.condition;

import java.util.Random;

// 24.01.18 time 22:00 - 22:05
/*
 * today 소감문
 * 각 자리 수 숫자가 369인지 확인하기 위해 
 * 첫번째 자리 수, 두번째 자리 수 숫자를 표현하는 변수가 추가로 필요했다고 느껴
 * firstNum, secondNum으로 각각 rNum을 /, %를 사용해 나오게 해주었고
 * if-else를 사용해 firstNum이 369인지 아닌지의 큰 틀을 잡고
 * 그 다음에 secondNum이 369인지 아닌지로 좁혀나가 문제를 푼 것 같다.
 * 이전까지 가지고 있던 실수들을 이 문제를 통해 만회한 것 같아 기분이 좋다. 
 * 정답예시에서는 369 숫자가 몇 개 있는지 count를 세서 표현한 것이 기발하다고 생각했고
 * 이미 정답을 맞춘 문제지만 count를 사용해 다시 풀어보고 싶다는 생각을 가졌다.
 * */

/*
 * # 369게임[1단계]
 * 
 * 1. 1~50 사이의 랜덤 숫자를 저장한다.
 * 2. 위 수에 369의 개수가
 * 	1) 2개이면, 짝짝을 출력
 *  2) 1개이면, 짝을 출력
 *  3) 0개이면, 해당 숫자를 출력
 * 예)
 * 		33	 : 짝짝
 * 		16	 : 짝
 * 		 7	 : 7
 */

public class IfEx21_연습1 {

	public static void main(String[] args) {
		
		Random ran = new Random();
		int rNum = ran.nextInt(51);	// [0-50]
		int firstNum = rNum / 10;
		int secondNum = rNum % 10;
		
		if (firstNum == 3 || firstNum == 6 || firstNum == 9) {
			if(secondNum == 3 || secondNum == 6 || secondNum == 9) {
				System.out.println(rNum + " : " + "짝짝");
			}
			else
				System.out.println(rNum + " : " + "짝");
		}
		else {
			if(secondNum == 3 || secondNum == 6 || secondNum == 9) {
				System.out.println(rNum + " : " + "짝");
			}
			else
				System.out.println(rNum + " : " + secondNum);
		}
		
	}

}
