package step1_06.loop;
// 24.02.05 time 22:05-22:15
/*
 * today 소감문
 * 일단 나는 문제를 잘못풀었다. 왜냐하면 문제에서는 입력한 숫자가 소수인지 아닌지만 판별하는
 * 코드를 짜라고 했는데 나는 1부터 입력한 숫자까지의 수들이 소수인지 아닌지의 대한 코드를 만들었기
 * 때문이다. 그렇다면 원래 문제대로 입력한 숫자가 소수인지 판별하는 코드를 while문으로 어떻게 짜야하는지가
 * 문제인데 그냥 while문의 조건식을 true로 하고 소수인지 아닌지 출력하고 break로 while문을
 * 빠져나오게 했다.
 * while문을 하면서 내가 많이하는 실수는 whlie문이 무한루프를 돌지 않게 하는 i++이라던지 break를
 * 코드를 돌려보고 나서야 떠오른다는 것이다. 그리고 scan.close();를 당연하게 안쓰는 습관이라는 점
 * 반드시 고쳐야겠다.
 * */
/*
 * # 소수찾기[1단계]
 * 
 * 1. 소수란, 1과 자기자신으로만 나눠지는 수
 * 2. 예) 2, 3, 5, 7, 11, 13, ..
 * 3. 힌트
 * 1) 해당 숫자를 1부터 자기자신까지 나눈다.
 * 2) 나머지가 0일 때마다 카운트를 센다.
 * 3) 그 카운트 값이 2이면 소수이다.
 * 4) 6/1 6/2 6/3 6/4 6/5 6/6	cnt=4	소수x
 * 
 * 정수 한 개를 입력받아, 해당 숫자가 소수인지 아닌지 판별한다.
 * 
 */

import java.util.Scanner;

public class LoopEx13_연습1 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("정수 입력 : ");
		int getNum = scan.nextInt();
		
		int i = 1;
		while ( i <= getNum ) {
			int cnt = 0;
			for (int j = 1; j <= i ; j++) {
				if (i % j == 0) cnt++;
			}
			if (cnt == 2) System.out.println(i +"는 소수");
			else System.out.println(i + "는 소수가 아닙니다.");
			i++;
		}
		
		int count = 0;
		while(true) {
			for (int j = 1; j <= getNum; j++) {
				if (getNum % j == 0) count++;
			}
			if ( count == 2 ) { 
				System.out.println(getNum +"은 소수입니다");
				break;
			}
			else {
				System.out.println(getNum + "은 소수가 아닙니다");
				break;
			}
		}
		scan.close();

	}

}
