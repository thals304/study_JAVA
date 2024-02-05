package step4_01.string;
// 24.02.05 time 12:22-12:33
/*
 * today 소감문
 * 연습 2번은 내 방식대로 푸는 게 출력이 잘 안되서 고민 끝에 정답예시 방법대로 
 * 풀어보자 생각해서 정답예시를 보면서 분석하게 되었다.
 * 셔플이라는 단어에서 분석이 어렵고 시간이 많이 걸릴 것 같다고 생각했지만
 * 생각과 달리 이전에 배열에서 최댓값, 최솟값을 구할 때 쓰는 임시 저장 변수를
 * 그래도 쓰되 셔플이므로 반복문 안에 구현해주면 되는 것이었다.
 * 셔플 후에 while문은 예시 1번에서 내가 했던 흐름과 같아서 
 * 오히려 더 쉽게 느껴졌던 것 같다.
 * 정답예시 방법이 내 방법보다 더 좋다고 느껴 이것을 내꺼로 만들어야겠다.
 *  
 * */
import java.util.Random;
import java.util.Scanner;

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

public class StringEx09_연습2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Random ran = new Random();
		
		String[] words = {"java", "mysql", "jsp", "spring"};
		
		// 셔플
		for (int i  = 0; i < 1000; i++) {	// i의 범위 1000은 어떤 숫자로 해도 상관없음
			int rNum = ran.nextInt(4);
			
			/* 임의의 String 변수에 처음 인덱스 값을 넣고 
			   랜덤으로 뽑힌 인덱스 값과 바꿔 
			   다시 words 배열에 넣는 것*/
			String temp = words[0];		
			words[0] = words[rNum];
			words[rNum] = temp;
		}
		
		int idx = 0;
		while (idx < words.length) {
			System.out.println("["+(idx+1)+"] 문제 : " + words[idx]);
			
			System.out.print("입력 :");
			String myWord = scan.next();
			
			if (myWord == words[idx]) idx++;
		}
		System.out.println("프로그램 종료");
		scan.close();
	}

}
