package step2_01.array;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
// 24.01.25 time 13:45-14:15
/*
 * today 소감문
	나는 while(true)문에 배열 for문 안에 케이스를 나눠 front[idx1] == 1 && front[idx2] == 1일 때
	back[idx1] = 1; back[idx2] = 1;이라고 총 5번을 썼는데도 답이 이상하게 나와 잘 안됐다.
	정답 예시를 보면 while에서 count를 세서 총 5번 돌도록 만들고 
	그 안에 front[idx1] == front[idx2] 일 때 back[idx1] = front[idx2];
	back[idx2] = front[idx1]을 넣으므로 코드를 아주 간략하게 잘 쓴 것 같아서 
	배워야 할 점인 것 같다.
 * */
/*
 * # 기억력 게임
 * 
 * 1. 같은 숫자의 위치를 2개 입력해 정답을 맞추는 게임이다.
 * 2. 정답을 맞추면 back에 해당 숫자를 저장해,
 *    back에 모든 수가 채워지면 게임은 종료된다.
 * 예)
 * front = [5, 4, 1, 3, 1, 2, 4, 2, 3, 5]
 * back  = [0, 0, 0, 0, 0, 0, 0, 0, 0, 0]
 * 입력1 : 2
 * 입력2 : 4
 * 
 * front = [5, 4, 1, 3, 1, 2, 4, 2, 3, 5]
 * back  = [0, 0, 1, 0, 1, 0, 0, 0, 0, 0]
 * 
 * 입력1 : 5
 * 입력2 : 7
 * 
 * front = [5, 4, 1, 3, 1, 2, 4, 2, 3, 5]
 * back  = [0, 0, 1, 0, 1, 2, 0, 2, 0, 0]
 * 
 */

public class ArrayEx15_연습1 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		Random ran = new Random();

		int[] front = { 1, 1, 2, 2, 3, 3, 4, 4, 5, 5 };
		int[] back = new int[10];
		int cnt = 0;

		// 셔플 구현(Shuffle) : 배열의 요소들을 무작위로 섞음
		while (cnt < 1000) {
			int tempRan = ran.nextInt(9) + 1;
			int temp = front[0];
			front[0] = front[tempRan];
			front[tempRan] = temp;
			cnt++;
		}

		/*
		 * for (int i = 0; i < front.length; i++) { System.out.print(front[i] + " "); }
		 * System.out.println(); for (int i = 0; i < front.length; i++) {
		 * System.out.print(back[i] + " "); }
		 */
		cnt = 0;
		while (cnt < 5) {
			System.out.println(Arrays.toString(front));
			System.out.println(Arrays.toString(back));
			
			System.out.print("인덱스입력 1 : ");
			int idx1 = scan.nextInt();
			System.out.print("인덱스입력 2 : ");
			int idx2 = scan.nextInt();

			if(front[idx1] == front[idx2]) {
				back[idx1] = front[idx2];
				back[idx2] = front[idx1];
				cnt++;
				}
		}
	}
		
	}

