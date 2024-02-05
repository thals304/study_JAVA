package step1_06.loop;

import java.util.Random;

// 24.02.05 time 22:05-22:27
/*
 * today 소감문
 * 저번에도 이 문제를 다른 방법으로 풀었을 때도 같은 문제가 발생했던 것 같은데
 * 1등 학생의 번호를 어떻게 출력하는지 이번에도 떠오르지 않는 것 같다.
 * 분명 그때 정답을 보고 뭐지 이렇게 쉬운거였어? 라고 했던 것 같은데
 * 이번에도 학생 번호 부분이 잘모르겠어서 정답예시를 봤는데 그냥 랜덤 값들 비교하는 조건문 안에 max값에
 * 저장하는 것과 같이 maxStudent = i;를 넣어주면 되는 것이었다.
 * 
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

public class LoopEx15_연습1 {

	public static void main(String[] args) {
		Random ran = new Random();
		int i = 1;
		int totalScore = 0;
		double avg = 0.0;	// 초기값도 0이 아닌 0.0으로 해주는 디테일 필요
		int max = 0;
		int maxStudent = 0;
		int cnt = 0;
		while (i <= 10) {
			System.out.print("[" + i  + "]" + "학생의 성적 : ");
			int rNum = ran.nextInt(100) + 1; // [0-99] + 1
			System.out.println(rNum);

			totalScore += rNum;

			if (rNum >= 60)
				cnt++;

			if (max < rNum) {
				max = rNum;
				maxStudent = i;
			}

			i++;
		}
		avg = totalScore / 10.0;
		System.out.println("총점: " + totalScore);
		System.out.println("평균: " + avg);
		System.out.println("합격자 수: " + cnt);
		System.out.println("1등 학생 번호 : " + maxStudent);
		System.out.println("1등 학생 점수 : " + max);
	}

}
