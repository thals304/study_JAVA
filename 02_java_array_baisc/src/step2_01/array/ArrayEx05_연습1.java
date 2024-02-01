package step2_01.array;
// 24.01.24 time 13:20-13:40
/*
 * today 소감문
 * 1, 3번 문제에서 막혀서 시간을 많이 썼고 풀지 못했다.
 * 정답을 보니 너무 꼬아서 어렵게 생각한 나와 달리 정답은 굉장히 간단했던 것 같다.
 * 인덱스, 저장된 값을 scan으로 입력해 저장된 값, 인데스로 출력되는 문제들은 중요하다고
 * 생각하므로 두 문제는 다음에 다시 풀어볼 것이다. 
 * */
/*
 * # 학생성적관리 프로그램[2단계] : 학생검색
 */

import java.util.Scanner;

public class ArrayEx05_연습1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// 인덱스    0   1   2   3   4
		int[] arr = {87, 11, 45, 98, 23};
		
		// 문제1) 인덱스를 입력받아 성적 출력
		// 정답1) 인덱스 입력 : 1	성적 : 11점
	
		System.out.print("index 입력 : ");
		int idx = scan.nextInt();
		System.out.println(arr[idx] + "점");
		
		// 문제2) 성적을 입력받아 인덱스 출력
		// 정답2) 성적 입력 : 11		인덱스 : 1
		System.out.print("성적 입력 : ");
		int score = scan.nextInt();
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] == score) {
				System.out.print("index : "+ i);
				}
		}
		System.out.println();
		// 문제3) 학번을 입력받아 성적 출력
		// 정답3) 학번 입력 : 1003	성적 : 45점
		int[] hakbuns = {1001, 1002, 1003, 1004, 1005};
		int[] scores  = {  87,   11,   45,   98,   23};
		System.out.print("학번 입력 : ");
		int hakbunNum = scan.nextInt();
		for(int i = 0; i < hakbuns.length; i++) {
				if(hakbunNum == hakbuns[i]) {	// 여기서 막혔었음
					System.out.println("성적 : "+ scores[i]);
				}
			
		}

	}
	
}
