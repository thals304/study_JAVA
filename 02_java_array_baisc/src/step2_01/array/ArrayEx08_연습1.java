package step2_01.array;

import java.util.Arrays;
import java.util.Random;

// 24.01.24 time 14:17-14:27
/*
 * today 소감문
 * 배열 hgd에 랜덤 숫자를 저장해 주는 for문을 하나 만들고
 * answer과 hgd의 값을 비교하여 새로운 배열 정오표(reply)에 O, X로 저장해주는 for문을 하나 만들고
 * 추가로 맞으면 count값이 하나 증가하도록 해서 잘 만들어 준 것 같다.
 * 이 문제는 정답 출력에서 for문을 또 쓰기 귀찮아서 Arrays.toString()을 처음 사용해줬다.
 * */
/*
 * # OMR카드
 * 
 * 1. 배열 answer는 시험문제의 정답지이다.
 * 2. 배열 hgd에 1~5 사이의 랜덤 숫자 5개를 저장한다.
 * 3. answer와 hgd 값을 비교해 정오표를 출력한다.
 * 4. 한 문제당 20점이다.
 * 
 * 예)
 * answer  = {1, 3, 4, 2, 5}
 * hgd     = {1, 1, 4, 4, 3}
 * 정오표  = {O, X, O, X, X}
 * 성적    = 40점
 */


public class ArrayEx08_연습1 {

	public static void main(String[] args) {
		Random ran = new Random();
		int[] answer = {1, 3, 4, 2, 5};
		int[] hgd = new int[5];
		for(int i = 0; i < hgd.length; i++) {
			hgd[i] = ran.nextInt(5)+ 1;	// [0-4] + 1
		}
		System.out.println("answer = " + Arrays.toString(answer));
		System.out.println("hdg = " + Arrays.toString(hgd));
		
		String[] reply = new String[5];
		int cnt = 0;
		for(int i = 0; i < answer.length; i++) {
			if(answer[i] == hgd[i]) {
				reply[i] = "O";
				cnt++;
			}
			else reply[i] = "X";
		}
		int score = 20 * cnt;
		System.out.println("정오표 = " + Arrays.toString(reply));
		System.out.println("성적 = " + score);
		
	}
	
}
