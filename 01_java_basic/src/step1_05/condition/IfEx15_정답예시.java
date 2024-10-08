package step1_05.condition;

import java.util.Random;

/*
 * # 당첨복권[1단계] 
 * 
 * 30%의 확률로 화면에 '당첨'이라는 글자가 화면에 출력된다.
 * 당첨되지 않은 경우는 '꽝'이라는 글자가 화면에 출력된다.
 */


public class IfEx15_정답예시 {

	public static void main(String[] args) {
		
		Random ran = new Random();
		
		int rNum = ran.nextInt(10);	// [0-9]
		
		if (rNum < 3) 	System.out.println("당첨");	// 0-2를 30% 당첨 확률로 표현
		if (rNum >= 3) 	System.out.println("꽝");	// 3-9를 70% 꽝 확률로 표현
		
	}

}
