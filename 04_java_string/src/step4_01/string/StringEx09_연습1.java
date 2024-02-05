package step4_01.string;
// 24.02.02 time 20:22-20:38
/*
 * today 소감문
 * 할 수 있다고 생각했는데 정답예시의 방법과 달리 중복 없는 랜덤 인덱스를 만드려고 했는데
 * 쉽지 않았다.
 * 답에서는 셔플을 다른 방법으로 만들었던데 그걸 먼저 이해해보고 내가 만든 코드는 따로 질문해봐야겠다.
 * 
 * */
/*
 * # 타자연습 게임[1단계]
 * 
 * 1. 문제를 섞는다.(shuffle)
 * 2. 순서대로 문제를 출제하고, 문제를 다 맞추면 게임 종료
 * 예)
 * 문제 : mysql
 * 입력 : mydb
 * 문제 : mysql
 * 입력 : mysql	<--- 정답을 맞추면, 다음 문제 제시
 * 문제 : jsp
 */

import java.util.Random;
import java.util.Scanner;

public class StringEx09_연습1 {

	public static void main(String[] args) {
		Random ran = new Random();
		Scanner scan = new Scanner(System.in);
		String[] words = {"java", "mysql", "jsp", "spring"};
		
		// 문제 셔플하는 걸 어떻게 하지
		// [4] 문제가 안나오는 이유가 뭐지 - 계속 무한 루프가 돔 
		int i = 0;
		while (i < words.length) {
			int rIdx = ran.nextInt(4);	// 랜덤 인덱스 번호 [0-3]
			boolean isDuplicate = false;
			System.out.println("!!!!");
			for (int j = 0; j < i; j++) {
				if (words[rIdx].equals(words[j])) {	// 중복일때
					isDuplicate = true;
					break;
				}
				System.out.println("***");
			}
			if (isDuplicate == false) {	// 중복이 아닌 경우
				System.out.print("["+(i+1)+"]"+"문제 : ");
				words[i] = words[rIdx];
				System.out.print(words[i]);
				System.out.println();
				
				System.out.print("입력 : ");
				String myAnswer = scan.next();
				
				if (words[i].equals(myAnswer)) {
					i++;
				}
				else {
					System.out.println("다시 입력하세요");
				}
				
				
			}
			
			
		}
		System.out.println("프로그램 종료");
		scan.close();
	}

}
