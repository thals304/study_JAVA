package step1_05.condition;

import java.util.Random;

// 23.01. time 
/*
 * 
 * */

/*
 * # 연산자 기호 맞추기 게임
 * 
 * 1) 1~10 사이의 랜덤 숫자 2개를 저장한다.
 * 2) 1~4 사이의 랜덤 숫자 1개를 저장한다.
 * 3) 위 숫자는 연산자 기호에 해당된다.
 * 	  1) 덧셈	  2)  뺄셈     3) 곱셈	 4) 나머지
 * 4) 사용자는 연산자 기호를 맞추는 게임이다.
 * 예) 3 ? 4  = 7
 *    1) + 2) - 3) * 4) %
 *    정답 : 2번
 */

public class IfEx23_연습1 {

	public static void main(String[] args) {
		Random ran = new Random();
		int rNum1 = ran.nextInt(10)+ 1;	// [0-9] + 1
		int rNum2 = ran.nextInt(10)+ 1;
		int rNum3 = ran.nextInt(3)+ 1;	// [0-3] + 1
		
		
	}
	

}
