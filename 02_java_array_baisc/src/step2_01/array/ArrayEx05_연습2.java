package step2_01.array;
// 24.01.25 time 11:43- 11:46
/*
 * today 소감문
 * 어제 1,3번이 어렵다고 느껴졌고 풀지 못해서 정답 예시를 보고 이해 했고
 * 오늘 다시 복습하고자 1,3번만 풀어봤다. 배열은 인덱스와 인덱스에 저장 된 값의 관계성만
 * 잘 파악하고 있다면 다른 문제도 잘 풀 수 있을 것 같다.
 * */
/*
 * # 학생성적관리 프로그램[2단계] : 학생검색
 */

import java.util.Scanner;

public class ArrayEx05_연습2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// 인덱스    0   1   2   3   4
		int[] arr = {87, 11, 45, 98, 23};
		
		// 문제1) 인덱스를 입력받아 성적 출력
		// 정답1) 인덱스 입력 : 1	성적 : 11점
		System.out.print("index 입력 : ");
		int idx = scan.nextInt();
		System.out.println("성적 : " + arr[idx]);
		// 문제2) 성적을 입력받아 인덱스 출력
		// 정답2) 성적 입력 : 11		인덱스 : 1
		
		
		int[] hakbuns = {1001, 1002, 1003, 1004, 1005};
		int[] scores  = {  87,   11,   45,   98,   23};
		
		// 문제3) 학번을 입력받아 성적 출력
		// 정답3) 학번 입력 : 1003	성적 : 45점
		System.out.print("학번 입력 : ");
		int hakbun = scan.nextInt();
		for(int i = 0; i < hakbuns.length; i++ ) {
			if(hakbun == hakbuns[i]) {
				System.out.println("성적 : " + scores[i]);
			}
		}

	}
	
}
