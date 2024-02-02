package step4_01.string;
// 24.02.02 time 13:33-13:39
/*
 * today 소감문
 * 사실 첫 문제부터 문자열을 숫자로 변환하는 작업을 할 지 몰랐다.
 * 처음은 그냥 가볍게 scan.nextInt를 할 줄 알았어서 조금 고민을 한 것 같다.
 * 근데 나이 출력에서 1900 + age를 하고 2024에서 빼고 1 더하는 과정이 복잡했고
 * 만약 2000년대 나이와 1900년대 나이가 같이 공존해서 출력하는 문제라면 하나씩 다 쓰는게 아닌
 * 한 번에 쓸 수 있는 방법을 찾아봐야겠다. 
 * */

public class StringEx05_연습1 {

	public static void main(String[] args) {

		String jumin = "890101-2012932";
		// 문제 1) 나이 출력
		// 정답 1) 36세
		int age = Integer.parseInt(jumin.substring(0, 2));
		System.out.println((2024 - (1900+age)) + 1);
		
		// 문제 2) 성별 출력
		// 정답 2) 여성
		char gender = jumin.charAt(7);
		if (gender == '2') System.out.println("여성");
		else if (gender == '1') System.out.println("남성");
		
	}

}
