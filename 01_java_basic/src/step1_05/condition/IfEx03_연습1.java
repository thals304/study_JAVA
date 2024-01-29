package step1_05.condition;
// 24.01.17 time 14:34 -14:37
/*
 * 가위 바위 보 게임이니 me가 입력하시오란 print문보다
 * 가위(0) 바위(1) 보(2)라고 표현하는게 더 좋을 것 같다.
 * */

import java.util.Scanner;

/*
 * # 가위(0)바위(1)보(2) 게임[1단계]
 * 
 * 1. com은 바위(1)만 낼 수 있다.
 * 2. me는 0~2 사이의 숫자를 입력받는다.
 * 3. com과 me를 비교해,
 * 		1) 비겼다.
 * 		2) 내가 이겼다.
 * 		3) 내가 졌다.			를 출력한다.
 */


public class IfEx03_연습1 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int com = 1;
		System.out.print("가위(0)바위(1)보(2): ");
		int me = scan.nextInt();
				
		if (com > me)
			System.out.println("내가 졌다.");
		
		if (com == me)
			System.out.println("비겼다.");
		
		if (com < me)
			System.out.println("내가 이겼다.");
		
		scan.close();
		
	}

}
