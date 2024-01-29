package step1_02.variable;
// 24.01.16 time 13:46 - 13:59
/*
 	- today 소감문 - 
 	print만 사용하는 것보다 변수를 사용하는게 눈에 더 잘 들어오는 것 같다.
 	하지만 변수명을 어떤 걸로 할 지 가장 고민이 되었던 것 같다.
 	그리고 문제 3의 double 소수점을 자르고 싶어 구글링해서 
 	system.out.printf("%.3f", 변수명);을 통해 해결했다.
 
 * */

public class VariableEx03_연습1 {

	public static void main(String[] args) {
		
		//예) 현금이 10000원있다. 2800원짜리 과자 구입 후, 잔돈 출력
		
		int cash = 10000;
		int snack = 2800;
		int change = cash - snack;
		System.out.println("잔돈 = " + change + "원");
		System.out.println();
		
		//문제1) 프리랜서의 세율은 3.3%이다. 월급이 2000000원일때 세금을 출력
		
		int money = 2000000;
		double taxRatio = 0.033;
	    double tax = money * taxRatio;
		System.out.println("세금 = " + tax + " 원" );
		System.out.println();
		
		//문제2) 시험점수를 100, 88, 92점 을 받았다. 평균은?
		int score1 = 100;
		int score2 = 88;
		int score3 = 92;
		double avg = (score1+score2+score3)/3.0;
		System.out.printf("평균 = "+ "%.3f" + "점", avg);
		System.out.println();
		System.out.println();
		
		//문제3) 밑변이 3이고 높이가 7인 삼각형 넓이 출력 (삼각형의 넓이 구하는 공식 : 밑변 * 높이 / 2)
		int width = 3;
		int height = 7;
		double total = (width*height)/2.0;
		System.out.println("삼각형 넓이 = " + total + "cm" );
		System.out.println();
		
		//문제4) 100초를 1분 40초로 출력
		int time = 100;
		int miniute = time / 60;
		int second = time % 60;
		System.out.println("100초는 "+ miniute + "분 " + second +" 초");
		System.out.println();
		
		//문제5) 800원에서 500원짜리 개수 , 100원짜리 개수
		//정답5) 500원의 개수 = 1개
		//       100원의 개수 = 3개 
		int moneyBase = 800;
		int money_quantity1 = moneyBase/500;
		int money_quantity2 = (moneyBase%500) / 100;
		System.out.println("500원의 개수 = " + money_quantity1+"개");
		System.out.println("100원의 개수 = " + money_quantity2+"개");
		System.out.println();
		

	}

}
