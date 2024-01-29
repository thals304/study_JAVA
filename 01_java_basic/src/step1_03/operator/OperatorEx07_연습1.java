package step1_03.operator;
// 24.01.16 time 14:32 - 14:35
/*
 * today 소감문
 * 	문제 1번 같은 경우는 출력문에서 계산을 하기 싫고 
 *  각 변수가 수정될 수도 있으니 avg라는 변수를 만들어서 사용했다.
 *  조건들이 아직은 어렵지 않아 잘 푼 것 같다.
 *  
 * */
public class OperatorEx07_연습1 {
	
	public static void main(String[] args) {
		
		// 예) 3의 배수이면서 짝수이면
		int num = 12;
		System.out.println(num % 3 == 0 && num % 2 == 0);
		
		
		
		// 문제 1) 3과목의 평균이 60점 이상이면 (단 어느 한 과목이라도 50점 미만이 아니어야한다.)
		int kor = 100;
		int eng = 87;
		int math = 41;
		double avg = (kor + eng + math)/3.0;  // 계속 실수하는 부분: 3.0
		System.out.println(avg >= 60 && kor >= 50 && eng >= 50 && math >= 50);
		
		
		// 문제 2) 키가 150cm이상이고 몸무게가 30kg 이상이면
		int height = 149;
		int weight = 30;
		System.out.println(height >= 150 && weight >=30);

	}
}
