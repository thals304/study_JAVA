package step4_01.string;
// 24.02.02 time 20:15-20:19
/*
 * today 소감문
 * Ex7과 다르게 Ex8은 되게 간단하게 푼 것 같아서
 * 내 코드가 뭐가 잘못 된건가 싶었다.
 * 다행히 정답예시와 다른 점은 식을 풀어 쓴 것과 정답예시는 김철수/87, 이만수/42 이렇게 ,로
 * 구분했는데 나는 그냥 띄어쓰기로 ,를 대신했다.
 * */

public class StringEx08_연습1 {

	public static void main(String[] args) {
		
		// 문제) 이름과 성적을 하나의 문자열로 연결
		// 정답) "김철수/87,이만수/42,이영희/95"
		
		String[] name = {"김철수", "이만수", "이영희"};
		int[] score = {87, 42, 95};
		
		String str = "";
		
		for (int i = 0; i < name.length; i++) {
			str += name[i];
			str += "/";
			str += score[i] + "";
			str += " ";
			
		}
		System.out.println(str);
		

	}

}
