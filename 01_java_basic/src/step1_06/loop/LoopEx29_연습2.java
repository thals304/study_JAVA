package step1_06.loop;

import java.util.Scanner;

// 24.01.24 time 11:55-12:03
/*
 * today 소감문
 * 어제 정답 예시를 보고 풀었던 문제를 오늘은 직접 풀어보는 시간을 가졌다.
 * 아직은 어제 정답이 떠올라 내가 혼자 풀었다고는 말할 수 없으나
 * 코드를 쓰면서 이중 for문이 돌아가는 과정을 다시 한번 이해하는 걸 집중적으로 했던 것 같다.
 * 역시나 cnt를 초기화 시켜주는 부분이 아직은 어색하나 2주, 한달 뒤에 풀었을 때는 당연하게 쓸 수 있으면 좋겠다.
 * */
/*
 * # 소수찾기[2단계]
 * 
 * 정수 한 개를 입력받아, 2부터 해당 숫자까지의 모든 소수 출력
 * 예)
 * 입력 : 20
 * 2, 3, 5, 7, 11, 13, 17, 19
 * 
 */

public class LoopEx29_연습2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("정수 입력 : ");
		int num = scan.nextInt();
		int cnt = 0;
		
		for(int i = 2 ; i <= num; i++  ) {
			cnt = 0;	// cnt 초기화
			for(int j = 1; j <= i; j++) {
				if(i % j == 0) {
					cnt++;
			}
		}
			if(cnt == 2)System.out.print(i + " ");
	}
		scan.close();
	}
}

