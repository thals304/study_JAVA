package step2_01.array;
// 24.01.24 time 13:15-13:20
/*
 * today 소감문
 * 이번 문제는 3번보다 더 쉽게 느껴졌던 것 같다.
 * 근데 성적 평균에서 double을 만들어주고 형변환 시켜주는 걸 잊어버리는 것 같다. 
 * 이 점은 주의할만하다. 
 * */
/*
 * # 학생성적관리 프로그램[1단계] : 학생점수
 */

import java.util.Random;

public class ArrayEx04_연습1 {

	public static void main(String[] args) {
		
		int[] arr = new int[5];

		// 문제1) arr배열에 1~100점 사이의 랜덤 정수를 5개 저장
		// 예   1) 87, 11, 92, 14, 47
		Random ran = new Random();
		for(int i = 0; i< arr.length; i++) {
			arr[i] = ran.nextInt(100)+ 1; 	// [0-99] + 1
		}
		for(int i = 0; i< arr.length; i++) {
			System.out.print(arr[i]+ " ");
		}
		System.out.println();
		// 문제2) 전교생의 총점과 평균 출력
		// 예   2) 총점(251) 평균(50.2)
		int totalScore = 0;
		for(int i = 0; i < arr.length; i++) {
			totalScore += arr[i];
		}
		double avgScore = totalScore / (double)arr.length;
		System.out.println("총점 : "+ totalScore);
		System.out.println("평균 : "+ avgScore);
		
		// 문제3) 성적이 60점 이상이면 합격. 합격생 수 출력
		// 예   3) 2명
		int cnt = 0;
		for(int i = 0; i< arr.length; i++) {
			if(arr[i] >= 60) {
				cnt++;
			}
			
		}System.out.println(cnt);

	}
	
}
