package step3_01.arrayAdvanced;

import java.util.Arrays;
import java.util.Random;

// 24.01.29 time 21:30-22:00
/* today 소감문
 * 문제는 간단하고 짧은데 진짜 어려워서 정답을 보고 이해해 보려고 했으나
 * 이런 코드를 쓴 이유를 내 뇌에서 아직 못 받아들이고 있는 것 같다.
 * dupleCheck와 i, j라는 변수처럼 문제를 풀 때 자유롭게 이용하고 확장할 수 있어야 하는데
 * 아직은 정답을 봐야 아 이런 걸 썼구나라는 생각이 드니 더 열심히 정답을 보고 내꺼로 만들어야겠다는
 * 생각뿐이다.
 * */
/*
 * # 중복숫자 금지[2단계]
 * 
 * 1. arr배열에 1~10 사이의 랜덤 숫자 5개를 저장한다.
 * 2. 단 중복되는 숫자가 없어야 한다.
 */


public class ArrayEx28_연습1 {

	public static void main(String[] args) {
		Random ran = new Random();
		
		int[] arr = new int[5];
		
		int i = 0;				// 왜 이런 변수들을 쓴건지 잘 이해가 안됨
		while (i < arr.length) {
			int rNum = ran.nextInt(10) + 1;
			int dupleCheck = 1;	// 중복 확인 위한 변수
			int j = 0;
			
			while (j < i) {	
				if (rNum == arr[j]) {	// rNum이 배열에 있는지 확인
					dupleCheck = -1;	// 이미 있는 숫자면 -1
				}
				j++;
			}
			if (dupleCheck == 1) {	// 중복이 없는 경우
				arr[i] = rNum;		// 배열에 rNum 할당
				i++;				// 인덱스 증가
			}
		}
		
		System.out.println(Arrays.toString(arr));
	
	}
	
}
