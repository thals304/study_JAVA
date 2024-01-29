package step1_05.condition;

import java.util.Random;
import java.util.Scanner;

// 24.01.18 time 14:30 - 14:36
/*
 * today 

 * 가위바위보 문제는 간단하게 if- else if - else를 사용해 할 수 있었던 것 같다.
 * 그리고 랜덤 숫자를 눈에 보여지는 것 없이 가위바위보 결과만 출력되서 조금 불편하다는 생각이 들어
 * 결과 비교 전에 랜덤 숫자를 한 번 출력했다.
 * 그런데 정답에서는 조건문들을 합쳐서 코드를 더 짧게 쓴 것 같아 나도 나중에 그 방법으로 도전해 보고 싶다.
 * */
/*
 * # 가위바위보 게임
 * 
 *   if - else if , else 등 구문을 활용하여 자율적으로 작성해보자.
 *   
 *   0 : 가위 , 1 : 바위 , 2 : 보
 */

public class IfEx18_연습1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Random ran = new Random();
		int com = 0;	// 랜덤으로 저장
		int me = 0;		// 키보드로 입력받아 저장
		com = ran.nextInt(3);	// [0-2]
		
		System.out.print("0 : 가위 , 1 : 바위 , 2 : 보 : ");
		me = scan.nextInt();
		
		System.out.println(com);
		
		if (me == 0) {
			if(com == 0) {
				System.out.println("비김");
			}
			else if(com == 1) {
				System.out.println("짐");
			}
			else {
				System.out.println("이김");
			}
		}
		else if (me == 1) {
			if(com == 0) {
				System.out.println("이김");
			}
			else if(com == 1) {
				System.out.println("비김");
			}
			else {
				System.out.println("짐");
			}
		}
		else {
			if(com == 0) {
				System.out.println("짐");
			}
			else if(com == 1) {
				System.out.println("이김");
			}
			else {
				System.out.println("비김");
			}
		}
			
		scan.close();
	}

}
