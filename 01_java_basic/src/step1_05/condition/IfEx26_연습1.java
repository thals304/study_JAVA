package step1_05.condition;

import java.util.Scanner;
// 24.01.21 time 20:19 - 20:25
/*
 * today 소감문
 * 이 문제는 정답을 보고도 case 3,2,1을 이해를 못해서 
 * 곤란했던 것 같다. 계속 문제와 코드를 번갈아가면서 이해한 결과
 * switch 문으로 이상, 이하의 숫자 문제를 이렇게 해결할 수 있구나 라는
 * 신기한 느낌을 받았던 것 같고 다음에 이 문제를 다시 풀어봐야겠다고 생각했다.
 * */
/*
 * 
 *  # 선택할 수 있는 야식
 * 
 *  금액을 입력받아서
 *   
 *  3만원 이상이면 아래와 같이 화면에 출력 후 종료
 *  족발세트 
 *  치킨세트 
 *  분식세트 
 *   
 *  2만원 이상 3만원 미만이면 아래와 같이 화면에 출력 후 종료
 *  치킨세트
 *  분식세트
 *  
 *  1만원 이상 2만원 미만이면 아래와 같이 화면에 출력 후 종료
 *  분식세트
 *  
 *  1만원 미만이면 아래와 같이화면에 출력 후 종료
 *  아무것도 사지 못합니다.
 *  
 * */

public class IfEx26_연습1 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("--- 선택할 수 있는 야식 ---");
		System.out.println("족발세트 (30000이상 40000미만)");
		System.out.println("치킨세트 (20000이상 30000미만)");
		System.out.println("분식세트 (10000이상 20000미만)\n");
		
		System.out.print("소유한 금액 입력: ");
		int getMoney= scan.nextInt();
		
		getMoney /= 10000;
		
		switch (getMoney) {
		
		case 3:			
			System.out.println("족발 세트");	// 3만원 이하 일 때
		case 2:
			System.out.println("치킨 세트");	// 2만원 이하 일 때
		case 1:
			System.out.println("분식 세트");	// 1만원 이하 일 때
			break;
		case 0 :
			System.out.println("아무 것도 사지 못합니다."); 	// 만원 미만
		default:	// 4만원 이상
			System.out.println("족발 세트");
			System.out.println("치킨 세트");  
			System.out.println("분식 세트");
		}
		
				
		scan.close();
		
	}

}
