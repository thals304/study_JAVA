package step2_01.array;

import java.util.Scanner;
//24.01.25 time 13:10-13:37
/*
* today 소감문
* 진짜 진짜 어려웠던 것 같다.
* 일단 문제 이해가 하기가 쉽지 않았고 결국 디버그 모드를 사용해 정답 예시를 분석해본 결과
* player 변수는 위치를 나타낸다. 즉, game 배열의 인덱스로 사용하면 된다.(중요!)
* 그리고 입력 값에 따라 메뉴가 나눠지기 때문에 while문을 사용하고
* 1일 때는 인덱스(player)가 0이 아닐 때 왼쪽으로 이동할 수 있게 하고
* 2일 때는 인데스가 game 배열의 크기 - 1이 아닐 때 오른쪽으로 이동할 수 있게 하면 된다.
* 1과 2는 반대의 개념이므로 하나만 완성하면 다른 하나를 -로 바꿔주면 된다.  
* 
* */
/*
 * # 숫자이동[1단계]
 * 
 * 1. 숫자2는 캐릭터이다.
 * 2. 숫자1을 입력하면, 캐릭터가 왼쪽으로
 * 	    숫자2를 입력하면, 캐릭터가 오른쪽으로 이동한다.
 * 3. 단, 좌우 끝에 도달했을 때, 예외처리를 해야한다.
 * 
 * @) 정답을 보지않고 소스를 동작시켜 본뒤에 내용을 이해하고 코드를 작성할 것
 * 
 */

public class ArrayEx14_연습1 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int[] game = {0, 0, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		int player = 0;	// 플레이어가 game 배열의 인덱스라고 생각하기
		for (int i = 0; i < game.length; i++) {
			if (game[i] == 2) {
				player = i;
			}
		}
		while(true) {
		
			for(int i = 0; i < game.length; i++) {	// 캐릭터 움직이게 어떻게 만들지?
				if(game[i] == 2) {
					System.out.print("옷");
				}
				else System.out.print("_");
			}
			System.out.println();
			System.out.print("왼쪽[1] 오른쪽[2] 종료[3] 입력 : ");
			int move = scan.nextInt();
			if(move == 1) { 	// 배열에서의 2가 왼쪽 인덱스로 움직이게 해야함
				if (player != 0) {	// 좌 끝에 가면 종료하도록 제한을 준 것
					game[player] = 0;	// 기존 인덱스에 저장된 값을 0으로 바꿔준 것 
					game[player - 1] =2;	// 기존 인덱스 왼쪽에 저장된 값을 2로 바꿔준 것
					player --;				// 인덱스 값 하나 줄이기 (배열 위치 왼쪽으로 한칸)
				}
			}
			else if (move == 2) {	// 2가 오른쪽 인덱스로 움직이게 해야함
				if (player != game.length - 1) {	// 배열 크기 넘어가지 않게 제한을 둔 것
					game[player] = 0;				
					game[player + 1] = 2;			// 기존 인덱스의 오른쪽에 저장된 값을 2로 바꿔준 것
					player++;						// 인덱스 값 하나 늘리기 (배열 위치 오른쪽으로 한칸)
				}
			}
			else if (move == 3) {
				scan.close();
				break;
			}
		}
				
	}
	
}
