package step4_01.string;

import java.util.Random;
import java.util.Scanner;
// 24.02.27 time 22:14-22:48
/*
 * today 소감문
 * 문제에서 주어진 조건은 별로 없는데 구현하는게 쉽지 않은 것 같다.
 * 내일 좀 더 시간을 투자해 고민해 보고 정 안되면 정답예시를 보면서 충분히 이해한 후 
 * 나만의 방법으로 바꾸는 시도를 해봐야겠다.
 * */
/*

	# 영어단어 맞추기  
	
	1) 영어단어가 전부 * 로 표시된다. 
	2) 영어단어를 입력받고 틀릴때마다 랜덤으로 한글자씩 벗겨진다. (점수는 100점 만점이며 한번 틀릴때마다 5점씩 감점)
	3) 만약에 같은 철자가 여러 개면 한번에 벗겨진다. 
	4) 전부 벗겨지거나 맞추면 종료하고 점수를 화면에 출력한다.

*/
public class StringEx18_연습1 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		Random ran = new Random();
		int score = 100;
		String word = "performance";
		String meaning = "공연";
		System.out.println("뜻 : " + meaning);
		System.out.print("문제 : ");
		for (int i = 0; i < word.length(); i++) {	
			System.out.print("*");
			
		}
		while (true) {
			
			
			System.out.println();
			System.out.print("영어단어를 입력하세요 >>> ");
			String answer = scan.next();
			int cntStar = word.length();
			String temp = word;
			if (answer.length() != word.length()) {
				System.out.println("글자수가 다릅니다 다시 입력하세요");
				continue;
			}
			
			if (word.equals(answer)) {
				System.out.println("정답! 게임종료");
				break;
			}
			else if (cntStar == 0) { // *가 전부 벗겨지면을 어떻게 표현하지? 개수가 0이 되는 조건식을 걸면 될 거 같은데 
				System.out.println("*가 전부 벗겨져서 게임종료");
				break;
			}
			else { // 정답이 아닐 경우 랜덤으로 한 글자씩 벗겨짐
				score -= 5;
				System.out.println("뜻 : " + meaning);
				System.out.print("문제 : ");
				// 근데 한 글자씩 벗겨진 것이 누적이 되도록 어떻게 하지?
				int ranIdx = ran.nextInt(word.length());	// [0-10]
				for (int i = 0; i < word.length(); i++) {
					if (temp.charAt(ranIdx) == temp.charAt(i)) {	// 글자들 중 랜덤 인덱스에 해당하는 글자와 같은 경우
						System.out.print(temp.charAt(i));
						temp += temp.charAt(i);
						cntStar --;
					}
					else {
						System.out.print("*"); 
						temp += "*";
					}
				}
			}
			
			
		}

	}

}
