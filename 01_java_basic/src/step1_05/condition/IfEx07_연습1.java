package step1_05.condition;

import java.util.Scanner;

// 24.01.18 time 9:34 - 9:38
/*
 * today 소감문
 * 입력 부분에서는 문제가 없었는데 합격, 불합격 if문에서
 * 100이하, 0 이상이라는 조건 추가를 못했던 것 같다.
 * 이 문제도 다음에 다시 풀어봐야겠따.
 * */

/*
 * # 성적 유효성 검사
 * 
 * 1. 성적을 입력받는다.
 * 2. 성적이 60점 이상이면 합격, 60점 미만이면 불합격이다.
 * 3. 단, 입력받은 성적이
 *    음수이거나 100점을 초과하면, 예외 메세지를 출력한다.
 *    예) 성적을 잘못 입력했습니다.
 */

public class IfEx07_연습1 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("성적 입력(0~100) : ");
		int score = scan.nextInt();
		
		
		if(score >= 60 && score <= 100)
			System.out.println("합격");
		if(score >= 0 && score < 60)
			System.out.println("불합격");
		
		if(score < 0 || score > 100)
			System.out.println("성적을 잘못 입력했습니다.");
		scan.close();
	}

}
