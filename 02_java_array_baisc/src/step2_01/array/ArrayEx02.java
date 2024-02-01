package step2_01.array;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayEx02 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// 배열 사용 예시 1
		String[] test1 = new String[3];
		double[] test2 = new double[5];
		char[] test3 = new char[1];
		boolean[] test4 = new boolean[10];
		
		int[] arr1 = new int[3];
		arr1[0] = 10;
		arr1[1] = 20;
		arr1[2] = 30;
		
		// 배열 사용 예시 2 : 축약형 (배열을 처음 생성할 때 한 번만 가능)
		int[] arr2 = {10,20,30,40,50,60,70,80,90,100};
		// arr2 = {100,200,300};	// 두번 이상은 안됨
		String[] arr3 = {"하나","둘","셋","넷","다섯"};
		// arr3 = {"일","이","삼"};
		char[] arr4 = {'O','X'};
		
		// 배열 사용 예시 3 : 다른 문법과의 조합
		int[] arr5 = new int[100];
 		for(int i = 0; i < arr5.length ; i++) {
 			arr5[i]= i + 1;
 		}
 		// 배열 전체 요소 출력 : 순회
 		for(int i = 0; i < arr5.length; i++) {
 			System.out.print(arr5[i]+" ");
 		}
 		
 		System.out.println();
 		
 		for(int i = 0; i < arr2.length; i++) {
 			System.out.print(arr2[i]+" ");
 		}
 		
 		System.out.println();
 		
 		// (참고) 배열이 익숙해진 후에 사용
 		// Arrays + ctrl + spacebar -> import java.util.Arrays; 뜸
 		// Arrays.toString(배열명) > 배열의 전체요소 출력
 		
 		System.out.println(Arrays.toString(arr3));
 		System.out.println(Arrays.toString(arr4));
 		System.out.println(Arrays.toString(arr5));
	}

}
