package step4_01.string;

import java.util.Scanner;

// 24.02.20 time 16:03-16:17

/*
 * today 소감문
 * 오랜만에 가벼운 걸 풀어보고 싶어 왔는데 수정할 부분이 쫌 있던 문제였다.
 * 입력한 문자열을 문자로 쪼갰기 때문에 숫자가 0-9까지 있는 문자 배열로 만들어줘야 했다.
 * 이중 for문 안쪽 for문에서 j를 i로 쓰는 치명적인 실수를 요즘 많이 하고 있는데 정신차려야겠다.
 * */
/*
 * # 문자열 속 숫자검사
 * 
 * 예) adklajsiod
 * 	     문자만 있다.
 * 예) 123123
 *    숫자만 있다.
 * 예) dasd12312asd
 *    문자와 숫자가 섞여있다.
 */

public class StringEx15_연습1 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("입력 : ");
		String text = scan.next();
		
		char[] num = {'0','1','2','3','4','5','6','7','8','9'};
		int numCnt = 0;
		// text 한 글자와 num 배열 요소 전체를 비교하고 싶었는데 숫자를 입력하면 문제 발생
		for (int i = 0; i < text.length(); i++) {
			for (int j = 0; j < num.length; j++) {
				if (text.charAt(i) == num[j]) {
					numCnt++;
					break; // break를 넣도 되고 안넣어도 됨
				}
			}
		}
		if (numCnt == 0) {
			System.out.println(text + "는 문자만 있다");
		}
		else if  (numCnt == text.length()){
				System.out.println(text + "는 숫자만 있다");
			}
		else {
				System.out.println(text + "는 문자와 숫자가 섞여있다");
			}
		
		scan.close();
	}

}
