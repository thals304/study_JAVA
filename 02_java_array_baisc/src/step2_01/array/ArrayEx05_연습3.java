package step2_01.array;
/*  24.03.28 time 22:42-22:48
 * 	today 소감문
 *  간단한 문제였는데 그 당시 풀었을 때 문제 1에서 간단하게 푸는 방법을 못찾고
 *  for문으로 더 힘들게 풀었는데 이번에도 arr[idx]면 끝나는 걸 for문으로 풀었다.
 *  근데 for문으로 풀때 특히 if문에서 왜 괜한 짓을 하는 느낌이지? 라는 생각이 들었다. 
 *  그런데도 arr[idx]를 생각 못하고 있었다.
 *  그리고 그당시 문제 3에서 학번과 성적의 연결성에 대해 어려워 했던 것 같은데
 *  이번에는 어려움을 느끼지 않고 자연스럽게 인덱스로 연결지어 푼 것 같다. 
 * */

import java.util.Scanner;

/*
 * # 학생성적관리 프로그램[2단계] : 학생검색
 */

public class ArrayEx05_연습3 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		// 인덱스    0   1   2   3   4
		int[] arr = {87, 11, 45, 98, 23};
		
		// 문제1) 인덱스를 입력받아 성적 출력
		// 정답1) 인덱스 입력 : 1	성적 : 11점
		System.out.print("인덱스 입력 [0-4]: ");
		int idx = scan.nextInt();
		// for문 안써도 됨
		System.out.println(arr[idx]);
		/*
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == arr[idx]) {
				System.out.println("성적 : " + arr[i]);
				break;
			}
		}
		*/
		// 문제2) 성적을 입력받아 인덱스 출력
		// 정답2) 성적 입력 : 11		인덱스 : 1
		System.out.print("성적 입력 : ");
		int score = scan.nextInt();
		for (int i = 0; i < arr.length; i++) {
			if (score == arr[i]) {
				System.out.println("인덱스 : " + i);
				break;
			}
		}
		
		int[] hakbuns = {1001, 1002, 1003, 1004, 1005};
		int[] scores  = {  87,   11,   45,   98,   23};
		
		// 문제3) 학번을 입력받아 성적 출력
		// 정답3) 학번 입력 : 1003	성적 : 45점
		System.out.print("학번 입력 [1001-1005]: ");
		int hakbun = scan.nextInt();
		for (int i = 0; i < hakbuns.length; i++) {
			if (hakbuns[i] == hakbun) {
				System.out.println("성적 : " + scores[i]);
				break;
			}
		}
	}
	
}
