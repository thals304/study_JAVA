package step3_01.arrayAdvanced;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

// 24.01.29 time 14:10-14:25
/*
 * today 소감문 
 * 일단 앞에 문제처럼 배열에 중복 없이 랜덤 값 넣는 것과 다른 점은 정수를 입력하는 것 뿐이었다.
 * 근데 중복인지 아닌지를 확인하는 부분이 새로운 변수를 만들어서 이중 for문을 사용하는 복잡한 과정이라
 * 어려웠고 쉽게 이해하지 못했다.
 * 그리고 strike가 3이면 프로그램 종료가 뜨게 해야 하는데 그럴라면 while문을 써야 한다는 점은
 * 알고 있었지만 문제 설명 2번은 1번과 분리되어 있다고 생각해 2번끼리만 while로 묶는다고 생각했다. 
 * */

/*
 * # 숫자 야구 게임
 * 
 * 1. me에 1~9 사이의 숫자 3개를 저장
 *    (단, 중복되는 숫자는 저장 불가)
 * 2. com과 me를 비교해 정답을 맞출 때까지 반복
 * 3. 숫자와 자리가 같으면 		    strike += 1
 *    숫자만 같고 자리가 틀리면 	ball += 1
 * 예)
 * 정답 : 1 7 3
 * 3 1 5		: 2b
 * 7 5 1        : 2b
 * 1 5 6		: 1s
 * 1 3 7        : 1s 2b
 * 2 4 9        : 없음
 * 1 7 3        : 3s  > 게임종료
 * 
 */

public class ArrayEx29_연습1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] com = { 1, 7, 3 };
		int[] me = new int[3];

		while (true) {
			int strike = 0;	// 누적되지 않게 맨 위에 써서 3s 될 때까지 쓸 수 있도록 초기화 해줘야함 
			int ball = 0;
			
			for (int i = 0; i < me.length; i++) {
				System.out.print("[" + (i+1) + "] 1~9 입력 : ");
				int getNum = scan.nextInt();
				
				int check = 1;
				for (int j = 0; j < i; j++) {
					if (getNum == me[j])
						check = -1;
				}
				
				if (check == -1) i--;
				else me[i] = getNum;
			}
			
			for (int i = 0; i < com.length; i++) {
				for (int j = 0 ; j < me.length; j++ ) {
					if (com[i] == me[j]) strike++;
					else if (com[i] != me[j]) ball++;
				}
			}
			
			System.out.print(strike + "s  ");
			System.out.print(ball + "s");
			System.out.println();
			
			if (strike == 3) {
				System.out.println("정답! 게임 종료");
				break;
			}
		}
		scan.close();
	}
}
