package step4_01.string;

import java.util.Arrays;

// 24.02.02 time 20:09-20:13
/*
 * today 소감문
 * 문자열을 1번 split -> 문자열(배열)
 * 문자열(배열) split 할 때는 반복문 사용해 split 해야함
 * 위의 점은 이제 조금 알게 된것 같다. 근데 아직 쪼개고 나서의 배열 출력 결과가
 * 익숙하지 않은 것 같다.
 * */

public class StringEx07_연습2 {

	public static void main(String[] args) {
		
		// 문제) 이름은 name배열에 성적은 score배열에 각각 저장 및 출력
		
		String str = "김철수/87,이만수/42,이영희/95";
		
		String[] name = new String[3];
		int[] score = new int[3];
		
		String[] temp1 = str.split(",");
		for (int i = 0; i < temp1.length; i++) {
			String[] temp2 = temp1[i].split("/");
			name[i] = temp2[0];
			score[i] = Integer.parseInt(temp2[1]);
		}
		System.out.println(Arrays.toString(name));
		System.out.println(Arrays.toString(score));
		

	}

}
