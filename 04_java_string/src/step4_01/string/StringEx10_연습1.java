package step4_01.string;

import java.util.Scanner;

// 24.02.05 time 12:40-12:46
/*
 * today 소감문
 * 문제를 봤을 때는 문자열로 끝말잇기 게임을 어떻게 만들지? 라고 어려울 거 같은데?
 * 라고 생각했는데 머릿속에 바로 charAt이 떠올랐던 것 같다.
 * charAt을 통해 start의 마지막 요소와 입력한 myWord의 첫번째 요소를 
 * 비교하면 되겠다고 생각했는데 첫 번재 고민, start의 길이가 변하는데 2라고 써야하나
 * 3이라고 써야하나라고 생각했지만 length() - 1이 떠올라 바로 적용했다.
 * 그리고 정답일 때와 quit을 입력했을 때 == 을 쓰나 equals를 쓰나 
 * 고민이 많았던 것 같다. 아직도 헷갈리긴 해서 다시 공부를 해야될 것 같다. 
 * 공부를 해본 결과 charAt는 단순 문자(한 글자) 비교이므로 ==
 *             나머지 문자열을 equals 사용 가능
 * */
/*
 * # 끝말잇기 게임
 * 
 * 제시어 : 자전거
 * 입력 : 거미
 * 제시어 : 거미
 * 입력 : 미술
 * 제시어 : 미술
 * 입력 : quit
 * 
 * - 종료 -
 * 
 */

public class StringEx10_연습1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String start = "자전거";
		System.out.println("제시어 : " + start);
		boolean isRunning = true;
		
		while (isRunning) {
		System.out.print("입력 : ");
		String myWord = scan.next();
		 if (myWord.charAt(0) == start.charAt(start.length() - 1)) { 
			 start = myWord;
			 System.out.println("제시어 : " + start);
		 }
		 else if (myWord.equals("quit")) {
			 isRunning = false;
			 }
		 
		 }
		System.out.println("-종료-");
		scan.close();
	}

}
