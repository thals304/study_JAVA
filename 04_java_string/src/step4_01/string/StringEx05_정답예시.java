package step4_01.string;



public class StringEx05_정답예시 {

	public static void main(String[] args) {
	
		String jumin = "890101-2012932";
		
		// 문제 1) 나이 출력
		// 정답 1) 36세
		
		String strAge = jumin.substring(0, 2);
		if (jumin.charAt(7) == '1' || jumin.charAt(7) == '2') {
			int intAge = Integer.parseInt(strAge);
			int age = 2024 - (1900 + intAge) + 1;
			System.out.println(age + "세");
		}
		if (jumin.charAt(7) == '3' || jumin.charAt(7) == '4') {
			int intAge = Integer.parseInt(strAge);
			int age = 2024 - (2000 + intAge) + 1;
			System.out.println(age + "세");
		}
		
		
		
		
		// 문제 2) 성별 출력
		// 정답 2) 여성
		
		char key = jumin.charAt(7);
		if (key == '1' || key == '3') {
			System.out.println("남성");
		}
		else if (key == '2' || key == '4') {
			System.out.println("여성");
		}


	}

}
