package step1_01.print;

public class PrintEx02 {

	public static void main(String[] args) {
		
		// 다양한 데이터 출력
		
				// 1-1) 정수   : 소수점이 없는 수
				System.out.println(10);
				System.out.println();
				
				// 1-2) 실수   : 소수점이 있는 수
				System.out.println(3.14);
				System.out.println();
				
				// 1-3) 문자   : 단일문자 ( 홑따옴표 , 싱글쿼테이션 , 싱글쿼터 )
				System.out.println('S');
				System.out.println();
				
				// 1-4) 문자열 : 글자 ( 쌍따옴표 , 더블쿼테이션 , 더블쿼터 )
				System.out.println("web_dev");
				System.out.println();
				
				// 1-5) 불리언 : 참과거짓 1: true, 0: false
				System.out.println(true);
				System.out.println();
				
				// 2. 복수의 데이터 출력 ( , 가 아닌 + 를 사용해야 된다. ) 
				// + 의미 1) 이어 붙이기 2) 더하기(연산)
				//하나라도 ""가 있으면 모든 것이 문자열로 출력
				System.out.println(1 + 3 + 5);
				System.out.println(1 +" " + 3 + " " + 5);
				System.out.println(1 + "," + 3 + "," + 5);
				System.out.println();
				
				// 2-1) 문자열 + 문자열 = 문자열
				System.out.println("수강과목: " + "웹 개발");
				System.out.println();
				
				// 2-2) 숫자 + 숫자 = 숫자
				System.out.println(100000 + 50000);
				System.out.println();
				
				// 2-3) 문자열 + 숫자 = 문자열
				System.out.println("수강료: "+ 3000000);
				System.out.println();
				
				// 2-4) 숫자 + 문자열 = 문자열
				System.out.println(100000 + "원");
				
				System.out.println("급여 :"+ 2000000 + 1000000 +"원");
				System.out.println("급여 :"+ (2000000 + 1000000) +"원");
	}

}
