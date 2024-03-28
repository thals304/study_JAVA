package step4_01.string;
/*
 *  24.03.29 time 01:02-01:08
 *  today 소감문
 *  오랜만에 문자열을 했고 split, Integer.parseInt에 대한 
 *  내용이 헷갈려서 문자열 정리해둔 메모를 빨리 보고 와서 문제를 풀었다.
 *  그래도 문제 2에서 슬래쉬(/)를 그냥 text += "/" 에 넣어도 되는데
 *  조건문을 사용해서 맨 마지막 인덱스 제외 사이에 /를 넣는 방법을 자연스럽게 쓰고
 *  문법에 틀리지 않게 코드도 잘 짠 것 같아서 기분이 좋았다.
 * */
//# 문자열 1차원

public class StringEx06_연습3 {

	public static void main(String[] args) {
		
		String str = "11/100/89";
		// 문제 1) arr 배열에 각 점수를 저장하고, 총점 출력
		// 정답 1) 200
		int[] arr = new int[3];
		int score = 0;
		for (int i = 0; i < arr.length; i++) {
			String[] temp = str.split("/");
			arr[i] = Integer.parseInt(temp[i]); // 문자열 > 숫자 Integer.parseInt()
			score += Integer.parseInt(temp[i]);
		}
		System.out.println("총점 : " + score);
		
		// 문제 2) scores 배열의 각 점수를 슬러시를 구분자로 하나의 문자열로 연결
		// 정답 2) 11/100/89
		int[] scores = {11, 100, 89};
		String text = "";
		for (int i = 0; i < scores.length; i++) {
			text += scores[i]+ "";
			if (i < scores.length - 1) { // i != scores.length - 1
				text += "/";
			}
		}
		System.out.println(text);
	}

}
