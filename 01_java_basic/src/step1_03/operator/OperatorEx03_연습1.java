package step1_03.operator;

// 24.01.16 time 13:35 - 13:40
/*
   today 소감
   오늘 연습 문제는 간단한 산술계산이라 좋았던 것 같다.
   나는 double로 형변환해서 점수 평균과 삼각형 넓이를 구했는데 
   그것보다 식에서 실수형으로 써주는게 더 간단한 코드였던 것 같다. 
   그리고 계속 print 안에서 식을 쓰고 출력을 하는 것보다 
   변수로 계산해서 print 하는 것이 더 편할 것 같다.
   
 * */

public class OperatorEx03_연습1 {

	public static void main(String[] args) {
		
		//예) 현금이 10000원있다. 2800원짜리 과자 구입 후, 잔돈 출력 
		System.out.println(10000 - 2800);
		System.out.println("잔돈 = " + (10000 - 2800) + "원");
		System.out.println();
		
		//문제1) 프리랜서의 세율은 3.3%이다. 월급이 2000000원일때 세금을 출력
		System.out.println(2000000*0.033);
		System.out.println("프리랜서 세금 = " + (2000000*0.033)+ "원");
		System.out.println();
		
		//문제2) 시험점수를 100, 88, 92점 을 받았다. 평균은?
		System.out.println((double)(100+88+92)/3);
		System.out.println("평균 = "+ (double)((100+88+92)/3) + "점");
		System.out.println();
		
		//문제3) 밑변이 3이고 높이가 7인 삼각형 넓이 출력 (삼각형의 넓이 구하는 공식 : 밑변 * 높이 / 2)
		System.out.println((double)(3*7)/2);
		System.out.println("삼각형 넓이 = "+(double)(3*7)/2 + "cm");
		System.out.println();
		
		
		//문제4) 100초를 1분 40초로 출력
		System.out.println(100/60+"분"+ 100%60 +"초");
		System.out.println();	
		
		//문제5) 800원에서 500원짜리 개수와 100원짜리 개수 출력
		//정답5) 500원 = 1개 
		//		100원 = 3개 
		System.out.println("500원 = " + 800/500+ "개");
		System.out.println("100원 = " + (800%500)/100 + "개");
		System.out.println();
		
		

	}

}
