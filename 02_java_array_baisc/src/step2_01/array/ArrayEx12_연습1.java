package step2_01.array;

import java.util.Arrays;
import java.util.Scanner;
// 24.01.25 time 12:10-12:43
/*
 * today 소감문
 * 1번 문제는 tmp(중간 저장값)을 사용해서 입력한 arr[idx1]을 tmp에 저장하고 
 * arr[idx1]에 arr[idx2]를 저장하고 arr[idx2]에 tmp를 저장하는 방식으로 풀었다.
 * 2번, 3번은 내 힘으로 풀지 못했다. 정답을 봐도 아직 이해가 되지 않아 다시 이해해 보고 
 * 소감문을 다시 적겠다.
 * 다시 봤는데 2번은 중간 저장값인 tmp 없이 if else 문 만으로도 저장된 값을 바꿀 수 있고
 * 3번은 배열 2개를 연결시켜야 하니 인덱스 값을 저정하는 idx1,idx2로 입력한 값이 같을 때의 인덱스 번호를 저장하고
 *  tmp로 scores[idx1]의 요소를 저장하는 1번과 비슷한 흐름을 가진다. 
 * */
/*
 * # 값 교체하기[2단계] 
 */

public class ArrayEx12_연습1 {

	public static void main(String[] args) {
	
		Scanner scan = new Scanner(System.in);
		
		int[] arr = {10,20,30,40,50};
		
		// 문제 1) 인덱스 2개를 입력받아 값 교체하기
		// 예    1) 인덱스1 입력 : 1
		//		   인덱스2 입력 : 3
		//		  {10, 40, 30, 20, 50}

		System.out.print("인덱스1 입력 : ");
		int idx1 = scan.nextInt();
		System.out.print("인덱스2 입력 : ");
		int idx2 = scan.nextInt();
		int tmp = 0;
		for(int i = 0; i < arr.length; i++)
		{
			tmp = arr[idx1];
			arr[idx1] = arr[idx2];
			arr[idx2] = tmp;
		}	
		System.out.println(Arrays.toString(arr));
		
		// 문제 2) 값 2개를 입력받아 값 교체하기
		// 예    2) 값1 입력 : 10
		//        값2 입력 : 50
		//		  {50, 20, 30, 40, 10}
		System.out.print("값1 입력: ");
		int value1 = scan.nextInt();
		System.out.print("값2 입력: ");
		int value2 = scan.nextInt();
		for (int i = 0; i < arr.length; i++) {	// 어떻게 if else 만으로 값을 교체하지?
			if (arr[i] == value1)		arr[i] = value2;						
			else if (arr[i] == value2)	arr[i] = value1;
		}
		System.out.println(Arrays.toString(arr));
		
		
		// 문제 3) 학번 2개를 입력받아 성적 교체하기
		// 예    3) 학번1 입력 : 1002
		//        학번2 입력 : 1003
		//		 {87, 45, 11, 98, 23}
		int[] hakbuns = {1001, 1002, 1003, 1004, 1005};
		int[] scores  = {  87,   11,   45,   98,   23};
		System.out.print("학번1 입력: ");
		int hakbun1 = scan.nextInt();
		System.out.print("학번2 입력: ");
		int hakbun2 = scan.nextInt();
		idx1 = 0;
		idx2 = 0;
		for(int i = 0; i < hakbuns.length; i++) {
			if(hakbuns[i] == hakbun1) idx1 = i;
			if ( hakbuns[i] == hakbun2 ) idx2 = i;
		}
		tmp = scores[idx1];
		scores[idx1] = scores[idx2];
		scores[idx2] = tmp;
		System.out.println(Arrays.toString(scores));
	}
	
}
