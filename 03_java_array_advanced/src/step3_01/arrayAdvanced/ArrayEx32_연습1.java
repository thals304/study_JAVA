package step3_01.arrayAdvanced;

import java.util.Arrays;

// 24.02.01 time 16:13-16:25
/*
 * today 소감문
 * 앞에 Ex31에서 조금 응용해 두 1차원 배열의 연결이라서
 * 많이 어렵디 않았다.
 * 하지만 String 배열이라 그런지 tempName에 저장할 때 int 타입으로 tempName을 
 * 정의한 실수를 저질렀다.
 * 하지만 코드 오류 표시로 인해 바로 고쳤다.
 * 문제에서는 성적순으로 이름만 출력하라고 했지만, 복습차원에서 성적과 이름 둘 다 출력했다.
 * */
/*
 * # 석차 출력
 * 
 * . 성적 순으로 이름 출력
 */

public class ArrayEx32_연습1 {
	public static void main(String[] args) {

		String[] names = {"홍길동", "김영", "자바킹", "민병철", "메가맨"};
		int[] scores   = {    87,    42,    100,     11,     98};
		
		int i = 0;
		while (i < scores.length - 1) {
			int maxScore = scores[i];
			String maxName = names[i];
			int maxScoreIdx = i;
			int maxNameIdx = i;
			
			for (int j = i+1; j < scores.length; j++) {
				if (maxScore < scores[j]) {
					maxScore = scores[j];
					maxName = names[j];
					maxScoreIdx = j;
					maxNameIdx = j;
				}
			}
			int tempScore = 0;
			String tempName = " ";
			
			tempScore = scores[i];
			scores[i] = scores[maxScoreIdx];
			scores[maxScoreIdx] = tempScore;
			
			tempName = names[i];
			names[i] = names[maxNameIdx];
			names[maxNameIdx] = tempName;
			i++;
 			
		}
		System.out.println(Arrays.toString(scores));
		System.out.println(Arrays.toString(names));
	}

}
