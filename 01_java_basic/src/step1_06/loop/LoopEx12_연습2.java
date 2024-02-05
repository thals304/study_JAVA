package step1_06.loop;
// 24.02.05 time 21:35-
/*
 * today 소감문
 * 연습 2는 정답예시의 풀이가 더 좋다고 느껴 분석 및 이해와 동시에 따라해보기를
 * 한 것입니다.
 * */
/*
 * # 369게임[2단계]
 * 
 * 1. 1~50까지 반복을 한다.
 * 2. 그 안에서 해당 숫자의 369게임의 결과를 출력한다.
 * 예) 1 2 짝 4 5 짝 7 8 짝 10 11 12 짝 ...
 * 
 */

public class LoopEx12_연습2 {

	public static void main(String[] args) {
		int i = 0;
		while (i <= 50) {
			int location10 = i / 10;	// 십의 자리
			int location1 = i % 10;		// 일의 자리
			
			int count369 = 0;
			
			if (location10 != 0 && location10 % 3 == 0) count369++;	// 십의 자리 : 3,6,9
			if (location1 != 0 && location1 % 3 == 0) count369++; // 일의 자리 : 3,6,9
			
			if (count369 == 2)	System.out.print("짝짝" + " ");
			else if (count369 == 1)	System.out.print("짝" + " ");
			else System.out.print(i);
			
			i++;
		}
	}

}
