package step1_05.condition;
/*
 * # 중첩 if문
 * 
 * - if문에 종속된 명령어 안에 if문이 중첩으로 사용되는 형태
 * 
 * 
 * */
public class IfEx08 {

	public static void main(String[] args) {
		
		int grade = 99;
		
		if (grade >= 60) {
			if (grade == 100) {	// 들여쓰기 중요
				System.out.println("만점");
			}
			System.out.println("합격");
		}
		
		if (grade < 60) {
			System.out.println("불합격");
		}
		
	}

}
