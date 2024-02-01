package step1_06.loop;

import java.util.Scanner;
// 24.01.22 time 11:56 - 11:59
/*
 * today 소감문
 * 이번 문제는 너무 간단했어서 빨리 푼 것 같다.
 * 하지만 boolean을 사용하는 힌트를 주지 않았다면 못풀거나 시간이 오래 걸렸을 것 같다.
 * 이 정도로 아직 while문에서 boolean을 사용하는 것이 어색한 것 같다.
 * 그래서 다음에 이 문제를 또 풀게 되면 힌트 없이 내가 직적 boolean을 생각하고 싶다.
 * */
/*
 * # 반복문 종료(-100)
 * 
 * 1. 무한 반복을 하면서 숫자를 입력받는다.
 * 2. 입력한 숫자가 -100이면, 프로그램은 종료된다.
 * 예)
 * 숫자 입력[EXIT:-100] : 1
 * 숫자 입력[EXIT:-100] : 3
 * 숫자 입력[EXIT:-100] : 4
 * 숫자 입력[EXIT:-100] : -100
 * 프로그램 종료
 * 
 */

public class LoopEx06_연습1 {

	public static void main(String[] args) {
		
			Scanner scan = new Scanner(System.in);
			
			boolean isRunning = true;
			
			while (isRunning == true) {  
				
				System.out.print("숫자 입력[EXIT:-100] : ");
				int num = scan.nextInt();
				
				if (num == -100) {
					isRunning = false;
				}
				
			}
			System.out.println("프로그램 종료");
		

	}

}
