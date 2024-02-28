package step4_01.string;

import java.util.Random;
import java.util.Scanner;
// 24.02.27 time 22:14-22:48
//24.02.28 time 13:31-13:54
/*
 * today 소감문
 * 문제에서 주어진 조건은 별로 없는데 구현하는게 쉽지 않은 것 같다.
 * 내일 좀 더 시간을 투자해 고민해 보고 정 안되면 정답예시를 보면서 충분히 이해한 후 
 * 나만의 방법으로 바꾸는 시도를 해봐야겠다.
 * 
 * 도저히 구현을 못할 거 같아 정답예시를 먼저 분석을 했는데
 * 랜덤 숫자 중 이미 선택된 것 제외하기, *가 다 벗겨졌을 때 게임 종료, 하나씩 *가 까지는게 누적이 
 * 되도록 해야 하는 고민이 많았는데 이 모든 것을 isChecked 배열 하나로 해결한 게 너무 신기했다.
 * 이 아이디어는 영화관 좌석 예매에서 자리를 O, X로 따로 표현해 주는 배열이 이미 힌트로 주어졌는데
 * 이 문제는 스스로 배열을 따로 만드는 아이디어를 생각할 수 있는지와 그걸 사용해서 조건들을 어떻게 표현할 지의
 * 생각을 길러준 것 같다. 
 * 나는 조건 하나에 코드 하나를 짜는것으로 생각하려고 하는 습관이 있는데 앞으로는 유연하게 조건들을 같이 해결할 수
 * 있는 방안을 계속 생각해 보는 습관을 가져야 될 것 같다. 
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
		int[] isChecked = new int[word.length()];
		
		while (true) {
			
			int cnt = 0;
			
			for (int i = 0; i < isChecked.length; i++) {
				if (isChecked[i] == 0) {
					cnt++;
					break;
				}
			}
			if (cnt == 0) {
				System.out.println("정답 맞추기 기회를 다 써버렸습니다");
				break;
			}
			
			System.out.println("뜻 : " + meaning);
			System.out.print("문제 : ");
			
			for (int i = 0; i < word.length(); i++) {
				if (isChecked[i] == 1) {
					System.out.print(word.charAt(i));
				}
				else System.out.print("*");
				
			}
			System.out.println();
			
			System.out.print("영어단어를 입력하세요 >>> ");
			String answer = scan.next();
			// 추가로 넣은 부분
			if (answer.length() != word.length()) {
				System.out.println("글자수가 다릅니다 다시 입력하세요");
				continue;
			}
			
			if (!answer.equals(word)) {
				score -= 5;
				while(true) {
					int rNum = ran.nextInt(word.length());
					if (isChecked[rNum] == 0) {
						isChecked[rNum] = 1;
						for (int i = 0; i < word.length(); i++) {
							if (word.charAt(i) == word.charAt(rNum)) {
								isChecked[i] = 1;
							}
						}
						break;
					}
					
				}
			}
			else {
				System.out.println("정답!");
				System.out.println("점수 : " + score);
				break;
			}
				
		}
		System.out.println("게임종료");
		scan.close();
	}

}
