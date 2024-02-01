package step1_05.condition;

import java.util.Scanner;

// 24.01.18 time 22:28 - 22:49
/*
 * today 소감문
 * 10정거장 이후는 2정거장마다 50원씩 추가를 하게 되어
 * 입력한 정거장 수에서 10을 빼고 2로 나눈 몫으로 2정거장 마다 추가 요금의 횟수로 사용했고 
 * 입력한 정거장 수에서 10을 빼고 2로 나눈 나머지로 짝수인지 홀수인지 구분해줬다.
 * 12, 14 .. 짝수인 경우에는 plusMoney로 10을 빼고 나서 2로 나눈 몫 * 50으로 표현해줬고
 * 11, 13 .. 홀수인 경우에도 12, 14와 같은 요금이 나와야 되서 고민을 했는데 plusMoney에서
 * (10을 빼고 나서 2로 나눈 몫 + 1) * 50로 표현해주었다.
 * 근데 정답 예시처럼 fee라는 변수를 가지고 각 if문을 만들어 주는게 더 간단하다고 느꼈고 
 * 이 부분은 정말 중요한 점이라고 생각했다.
 * */

/*
 * # 지하철 요금 계산
 * 
 * 1. 이용할 정거장 수를 입력받는다.
 * 2. 다음과 같이 정거장 수에 따라 요금이 정산된다.
 * 3. 요금표
 * 1) 1~5	: 500원
 * 2) 6~10	: 600원
 * 3) 11,12 : 650원 (10정거장이후는 2정거장마다 50원추가)  ! 여기서부터는 직접 값을 지정하는 것이 아닌 계산식으로 요금 계산
 * 4) 13,14 : 700원 (10정거장이후는 2정거장마다 50원추가)
 * 5) 15,16 : 750원 (10정거장이후는 2정거장마다 50원추가)
 * ... 
 */

public class IfEx22_연습1 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		System.out.println("=== 요금표 ===");
		System.out.println("1) 1~5	: 500원");
		System.out.println("2) 6~10	: 600원");
		System.out.println("3) 11,12 : 650원 (10정거장이후는 2정거장마다 50원추가)");
		
		System.out.print("이용할 정거장 수 : ");
		int stationNum = scan.nextInt();
		
		int quotaStation = 0;
		int restStation = 0;
		int plusMoney = 0;
		
		System.out.print("요금 : ");
		
		if (stationNum >= 1 && stationNum <= 5) {
			System.out.println("500원");
		}
		else if (stationNum >= 6 && stationNum <= 10) {
			System.out.println("600원");
		}
		else {
			quotaStation = (stationNum - 10) / 2;
			restStation = (stationNum - 10) % 2;
			if( restStation == 0 ) {
				plusMoney = 50 * quotaStation;
			}
			else {
				plusMoney = 50 * (quotaStation + 1);
			}
			System.out.println((600 + plusMoney) +"원");
		}
		scan.close();
	}

}
