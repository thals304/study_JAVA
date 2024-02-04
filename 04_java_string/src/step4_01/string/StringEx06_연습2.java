package step4_01.string;
// 24.02.02 time 19:58-20:06
/*
 * today 소감문
 * 아까 연습1에서는 정답예시를 보고 이해한 다음 코드를 써봤는데
 * 덜 이해한것 같다. 문자열이 아직 익숙하지 않은 것 같기도 하다.
 * 그런만큼 개념을 다시 복습하고 예시를 반복해서 풀어봐야 될 것 같다. 
 * */
//# 문자열 1차원

public class StringEx06_연습2 {

	public static void main(String[] args) {
		
		String str = "11/100/89";
		// 문제 1) arr 배열에 각 점수를 저장하고, 총점 출력
		// 정답 1) 200
		int[] arr = new int[3];
		String[] temp = str.split("/");
		int score = 0;
		for (int i = 0; i < arr.length; i++) {
			arr[i] = Integer.parseInt(temp[i]);
			score += arr[i];
		}
		System.out.println(score);
		
		
		// 문제 2) scores 배열의 각 점수를 슬러시를 구분자로 하나의 문자열로 연결
		// 정답 2) 11/100/89
		int[] scores = {11, 100, 89};
		String text = "";
		for (int i = 0; i < scores.length; i++) {
			text += scores[i] + "";
			if (i != scores.length - 1) 	// 이 부분 생각하기 어렵다
				text += "/";
		}
		System.out.println(text);

	}

}
