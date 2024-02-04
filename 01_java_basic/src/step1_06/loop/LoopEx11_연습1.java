package step1_06.loop;
// 24.02.02 18:30-18:44
/*
 * today 소감문
 * 어려울 것 같다는 생각과 다르게 어렵지 않은 문제였다.
 * 정답예시는 while문 안에서 누가 승리했는지 메시지, 게임종료 메시지를 출력할 수 있게 했다.
 * 나는 turn이라는 변수를 사용해 br이 31이 되면 while문 밖을 나오게 해서 누가 승리했는지 출력하게 했다.
 * 근데 while문 조건이 약간 헷갈리긴 한다. br <= 31로 했었는데 그러면 1을 입력해도 while문이 종료가 
 * 안되었다. 그래서 br < 31로 했는데 맞는거 같은데 내 답에 자신이 없다.
 * */
/*
 * # 베스킨라빈스31
 * 
 * 1. p1과 p2가 번갈아가면서 1~3을 입력한다.
 * 2. br은 p1과 p2의 입력값을 누적해서 저장한다.
 * 3. br이 31을 넘으면 게임은 종료된다.
 * 4. 승리자를 출력한다.
 * 
 * 예) 
 * 1턴 : p1(2)	br(2)
 * 2턴 : p2(1)	br(3)
 * 3턴 : p1(3)	br(6)
 * ...
 */

import java.util.Scanner;

public class LoopEx11_연습1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int p1 = 0;
		int p2 = 0;
		
		int br = 0;
		int turn = 0;
		
		while(br < 31) {
			System.out.print((turn + 1) + "턴 - ");
			
			if ((turn + 1) % 2 != 0) {
				System.out.print("p1 입력(1~3) : ");
				int p1Num = scan.nextInt();
				br += p1Num;
				System.out.print("br : "+br);
				turn ++;
				System.out.println();
			}
			else {
				System.out.print("p2 입력(1~3) : " );
				int p2Num = scan.nextInt();
				br += p2Num;
				System.out.println("br : "+br);
				turn ++;
				
			}
		}
		if (turn % 2 == 0) System.out.println("p1 승리");
		else System.out.println("p2 승리");
		
		scan.close();
	}

}
