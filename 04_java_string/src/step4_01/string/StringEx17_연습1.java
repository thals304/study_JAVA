package step4_01.string;

import java.util.Arrays;
import java.util.Scanner;
// 24.02.27 time 14:10-14:36
/*
 * today 소감문
 * 16 예제의 응용인거 같은데 진짜 어려운 것 같다.
 * 일단 고민할 부분들이 코드를 작성하면서 계속 생기는데 그 고민에 대해 대응을 바로 못하니
 * 고민만 쌓이고 해결하지도 못한채로 그대로 놔두게 되는 것 같다.
 * 정답예시를 보고 내가 써둔 부분까지 비교해봤는데 얼추 비슷했던 것 같다.
 * 근데 거기에서 한 발자국 더 생각하지 못한 것 같아서 누가 코드를 잘 짜는지는 이 부분에서 갈리는 것 같아
 * 많이 연습해봐야겠다는 생각밖에 안들었다. 
 * 
 * */
/*
 * # 단어 교체하기(replace)
 * 
 * 1. text변수 문장 속에서 변경하고 싶은 단어를 입력받아,
 * 2. 교체해주는 기능을 구현한다.
 * 예)
 * 		Life is too short.
 * 		변경하고 싶은 단어입력 : Life
 * 		바꿀 단어입력 : Time
 * 
 * 		Time is too short.
 */

public class StringEx17_연습1 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		String text = "Life is too short.";
		System.out.println(text);

		System.out.print("변경하고 싶은 단어를 입력하세요 : ");
		String word = scan.nextLine();
		
		// 일단은 변경하고 싶은 단어가 문장 안에 있는지 예외처리
		int wordSize = word.length();
	
		int delIdx  = -1;
		for (int i = 0; i < text.length(); i++) {
			if (text.charAt(i) == word.charAt(0)) {
				if (text.substring(i, i + wordSize).equals(word)) { // text 인덱스 범위는 i부터  i + wordSize - 1
					delIdx = i;
					break;
				}
			}
		}
		
		if (delIdx == -1) {
			System.out.println("변경하고 싶은 단어를 다시 확인해 주세요");
		}
		else {
			System.out.print("바꿀 단어 입력 : ");
			String changeWord = scan.next();
			// 근데 배열이 아니라 문자열이라서 문자열 수정? 삽입?을 어떻게 하지
			// 바꿀 단어가 wordSize의 길이와 다르다면?
			// replaceAll(,); , deleteCharAt(); 사용 가능? 사용하지 않고 풀고 싶음
			char[] temp = new char[text.length()];
			int j = 0;
			for (int i = 0; i < text.length(); i++) {
				temp[j] = text.charAt(i);
			}
			// 바꿀 부분의 인덱스를 아는 걸 이용해서 바꿀 부분 제외하고 front, back으로 나누어 저장 
			String front = "";
			for (int i = 0; i < delIdx; i++) {
				front += text.charAt(i);
			}
			
			String back = "";
			for (int i = delIdx + wordSize; i < text.length(); i++) {
				back += text.charAt(i);
			}
			
			String result = "";
			result = front + changeWord + back;
			
			System.out.println(result);
			
		}
		
		scan.close();
	}

}
