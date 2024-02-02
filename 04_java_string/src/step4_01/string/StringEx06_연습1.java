package step4_01.string;

import java.util.Arrays;

// 24.02.02 time 
/*
 * today 소감문
 * Ex6은 어려운 것 같다. 그래서 정답예시를 보고 이해하고 따라해봤는데
 * 문제1은 arr 배열에 split한 점수를 집어넣는 for문에서 Integer.parseInt()를 사용하는 것이었고
 * 문제2는 숫자를 문자열로 변환하는 것과 문자열 배열에 넣는 것이 아닌 문자열에 넣는 문제였다.
 * */
//# 문자열 1차원

public class StringEx06_연습1 {

	public static void main(String[] args) {
		
		String str = "11/100/89";
		// 문제 1) arr 배열에 각 점수를 저장하고, 총점 출력
		// 정답 1) 200
		int[] arr = new int[3];
		String[] temp = str.split("/");
		int total = 0;
		//  / 로 쪼개는건 했는데 int 배열에 String 배열을 어떻게 집어 넣지? Integer.parseInt() 사용
		for (int i = 0; i < arr.length; i++) {
			arr[i] = Integer.parseInt(temp[i]);
			total += arr[i];
		}
		System.out.println(total);
		
		
		
		// 문제 2) scores 배열의 각 점수를 슬러시를 구분자로 하나의 문자열로 연결
		// 정답 2) 11/100/89
		int[] scores = {11, 100, 89};	// 숫자
		String text = "";				// 문자열
		// 숫자 > 문자열 문제 
		for (int i = 0; i < scores.length; i++) {
			text += scores[i] + "";
			if (i < scores.length - 1) text += "/";
					
		}
		System.out.println(text);
		

	}

}
