package step4_01.string;

import java.util.Arrays;

// 24.02.02 time
/*
 * today 소감문
 * 문자열과 문자열 배열을 왔다갔다 하면서 적용되는 length라던지 반복문이라던지 등을
 * 구분하는 연습이 더 필요하다고 생각한다.
 * 
 * 
 * */

public class StringEx07_연습1 {

	public static void main(String[] args) {
		
		// 문제) 이름은 name배열에 성적은 score배열에 각각 저장 및 출력
		
		String str = "김철수/87,이만수/42,이영희/95";
		
		String[] name = new String[3];
		int[] score = new int[3];
				
		String[] str2 = str.split(",");	// [김철수/87,이만수/42,이영희/95] 
		// str2를 한 번 더 split 하는게 안됨 -> str2가 배열로 바뀌었으니 반복문을 사용해 split해야함
		for (int i = 0; i < str2.length; i++) {
			String[] str3 = str2[i].split("/");
			// 0,1 인덱스로만 이름, 점수 구분되는게 어떻게 가능한건가?
			// i = 0, [김철수, 87] i = 1, [이만수,42] i =2,[이영희,95]
			name[i] = str3[0];		
			score[i] = Integer.parseInt(str3[1]);
		}
		System.out.println(Arrays.toString(name));
		System.out.println(Arrays.toString(score));
		
		 
	}

}
