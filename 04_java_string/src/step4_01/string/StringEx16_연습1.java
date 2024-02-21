package step4_01.string;

import java.util.Scanner;
// 24.02.21 time 14:33-14:43
/*
 * today 소감문
 * 일단 난 이 문제를 도대체 어떻게 풀고 어떻게 건들여야 할지 몰랐다. 
 * 아예 못풀지도 모르겠다고 생각했다.
 * 근데 풀었다!!!! 내가 생각한 논리가 맞았던 것이다.
 * 굉장히 기분이 좋고 너무 신기할 따름이다.
 * */
/*
 * # 단어 검색
 * 
 * 1. 단어를 입력받아 text변수 문장 속에 해당 단어가 있는지 검색한다.
 * 2. 단어가 존재하면 true
 *    단어가 없으면 false를 출력한다.
 */

public class StringEx16_연습1 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		String text = "Life is too short.";
		System.out.println(text);
		
		System.out.print("검색할 단어를 입력하세요 : ");
		String word = scan.next();
		
		// System.out.println(text.length()); 띄어쓰기도 길이로 포함
		
		// 연속적으로 단어가 있는지 확인을 어떻게 하지?
		// text를 한글자씩 word의 첫 글자랑 같은지 확인하고 
		// word의 글자 길이만큼 subString으로 text 단어를 뽑아 word랑 같으면 check = 1 
		int check = -1;
		for(int i = 0; i < text.length(); i++) {
			if (text.charAt(i) == word.charAt(0)) {
				if (text.substring(i, i + word.length()).equals(word)) { // subString(1,4) : 인덱스 1부터 3까지 출력 
					check = 1;
					break;
				}
			}
		}
		
		if (check == 1) System.out.println("true");
		else if (check == -1) System.out.println("false");

	}

}
