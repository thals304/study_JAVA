package step1_06.loop;

import java.util.Scanner;

// 24.01.22 time 21:01- 21:06
/*
 * today 소감문
 * 소수라는 단어에서 못풀수도 있겠다는 두려움이 있었지만
 * 이런 생각과 달리 간단하게 답이 나온 것 같아 기분이 좋다.
 * 내가 쓴 답과 정답 예시가 같아지고 있다는 점이 뿌듯하다.
 * 하지만 좀 더 꼼꼼할 필요가 있는게 Scanner를 사용하면 코드 맨 마지막에
 * scan.close();를 써줘야 하는데 까먹는다는 점이다.
 * 이 점을 해결하기 위해서는 Scanner를 사용하는 import를 써줄 때 같이 써줘야겠다.
 
 */
/*
 * # 소수찾기[1단계]
 * 
 * 1. 소수란, 1과 자기자신으로만 나눠지는 수
 * 2. 예) 2, 3, 5, 7, 11, 13, ..
 * 3. 힌트
 * 1) 해당 숫자를 1부터 자기자신까지 나눈다.
 * 2) 나머지가 0일 때마다 카운트를 센다.
 * 3) 그 카운트 값이 2이면 소수이다.
 * 4) 6/1 6/2 6/3 6/4 6/5 6/6	cnt=4	소수x
 * 
 * 정수 한 개를 입력받아, 해당 숫자가 소수인지 아닌지 판별한다.
 * 
 */

public class LoopEx23_연습1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("정수 입력 : ");
		int num = scan.nextInt();
		int cnt = 0;
		
		for(int i = 1; i <= num; i++) {
			if(num % i == 0) {
				cnt ++;
			}
		}
		if(cnt == 2) {
			System.out.println(num + "은 소수입니다.");
		}
		else {
			System.out.println("num 은 소수가 아닙니다.");
		}
		scan.close();
	}

}
