package step1_02.variable;

/*
# 변수 ( variable )
*  
*  - 단 하나의 값을 저장할 수 있는 메모리 공간
*  
*  	1) 변수의 선언 그리고 초기화
*  	
*  	변수의 선언 	: int nData;	// 메모리 공간 할당
*  	변수의 초기화	: nData = 0;    // 값 저장
*  
*  	
*  	2) 변수의 선언과 동시에 초기화
*  	
*  	int nData = 0;
*  	
*  
*  	3) 변수의 특징
*  	
*  	3-1) 변수는 변수 하나당 값을 한개만 저장할 수 있다. [ 고유성 ]
*  	3-2) 새로운 값이 변수에 저장되면 이전값은 사라진다.
*  
* 
* */

public class VariableEx01 {

	public static void main(String[] args) {
		
		// 데이터 보관 > 변수와 상수
				// 1. 정수 : Integer(int)		
				int memberAge;			// 변수의 선언
				memberAge = 20;	   		// 데이터 저장
				
				System.out.println(memberAge);
				System.out.println();
				
				// 2. 실수 : double
				double memberWeight = 80.5;	 // 선언과 동시에 저장
				
				System.out.println(memberWeight);
				System.out.println();
				
				
				// 3. 문자 1개 : character(char)
				char memberGenderEng = 'M';
				char memberGenderKor ='남';
				System.out.println(memberGenderEng);
				System.out.println(memberGenderKor);
				System.out.println();
				
				// 4. 문자열 : String
				String memberName = "KSM";
				System.out.println(memberName);
				System.out.println();
				
				// 5. 참과 거짓 : boolean
				boolean isMember = true;
				System.out.println(isMember);
				System.out.println();
				
				// 변수의 특징 (고유성 = unique)
				int goodsPrice = 18000;
				// int goodsPrice = 19000;  // 똑같은 이름의 변수를 생성할 수 없음
				// 자료형 타입을 생략했으므로 기존의 데이터를 수정
				goodsPrice = 19800; 	
				goodsPrice = 22000;
				
				// 가장 최근데이터 1개만 저장이 되어 있음
				System.out.println(goodsPrice);
				System.out.println();
				
				// 변수의 초깃값 : reset이 아닌 init
				int deliveryPrice;
				
				// 변수를 초기화(init)하지 않으면 garbage data가 변수에 저장되어 있다.
				//System.out.println(deliveryPrice);
				
				int tax = 0;	// 0데이터로 tax변수(int형) 초깃값 지정
				
	}

}
