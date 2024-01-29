package step1_06.loop;

import java.util.Random;

// 24.01.22 time 21:48-22:00
/*	 today 소감문
 * 	1등 학생의 성적과 번호를 출력하는 부분은 만들어 내지 못했다.
 * 	maxScore에 첫번째 학생의 점수를 집어 넣고 앞으로 들어올 다른 학생의 점수들과 비교하려고
 *  짰는데 이 방법이 아니었던 것 같다. 
 *  이 문제는 반드시 다음에 꼭 다시 풀어봐야 될 것 같다.
 * */
/*
 * # 랜덤학생
 * 
 * 1. 10회 반복을 한다.
 * 2. 1~100 사이의 랜덤 숫자를 저장한다.(학생의 성적)
 * 3. 성적이 60점 이상이면 합격생이다.
 * ---------------------------------------
 * . 전교생(10명)의 총점과 평균을 출력한다.
 * . 합격자 수를 출력한다.
 * . 1등 학생의 번호와 성적을 출력한다.
 * 
 */

public class LoopEx24_연습1 {

	public static void main(String[] args) {
		
		Random ran = new Random();
		int totalScore = 0;
		int cnt = 0;
		int maxScore = 0;
		int studentNum = 0;
		
		for(int i = 1; i < 11; i++) {
			System.out.println(i + " 번 학생 성적 ");
			int rScore = ran.nextInt(101); // [0-100]
			System.out.println(rScore);	// 확인 차
			totalScore += rScore;
			
			if(rScore >= 60) {
				cnt++;
			}
			if(maxScore < rScore) {
				maxScore = rScore;
				studentNum = i;
			}
			
		}
		double avgScore = totalScore / 10.0;
		System.out.println("전교생(10명)의 총점 : "+ totalScore);
		System.out.println("전교생(10명)의 평균 : "+ avgScore);
		System.out.println("합격자 수 : " + cnt);
		System.out.println("1등 학생의 번호 : " + studentNum);
		System.out.println("1등 학생의 성적 : " + maxScore);
		
	}

}
