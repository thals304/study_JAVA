package step2_01.array;

import java.util.Scanner;

// 
/*
 * today 소감문
 * 
 * */
/* 
 * # 틱택토
 * 
 * 1. 구글에 검색해보면 실제로 게임을 진행해볼 수 있음
 * 2. 미니 오목처럼 1p 혹은 2p가 먼저 가로로 3줄 , 세로로 3줄, 대각선 3줄을 선택한 플레이어가 승리하는 게임
 * 3. 1p가 입력한 부분은 화면에 O표시 , 2p가 입력한 부분은 화면에 X표시
 * 
 * === 틱택토 ===
 * [X][X][O]
 * [ ][O][ ]
 * [ ][ ][ ]
 * [p1]인덱스 입력 : 6
 * === 틱택토 ===
 * [X][X][O]
 * [ ][O][ ]
 * [O][ ][ ]
 * [p1]승리
 * 
 */

public class ArrayEx17_연습1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] game = new int[9];
		int player1 = 0;
		int player2 = 0;
		int start = 1;
		int end = 3;
		System.out.println("=== 틱택토 ===");
			// 012 345 678 자리 출력
		
		
		System.out.print("p1 입력: ");
		int p1Idx = scan.nextInt();
		
		
		
	}
		
}
