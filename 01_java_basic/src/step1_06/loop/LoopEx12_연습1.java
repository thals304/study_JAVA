package step1_06.loop;
// 24.02.05 time 11:57 - 12:06

/*
 *	today 소감문
 *	이전에 이 문제와 같은 문제를 반복문?조건문? 에서 풀었던 기억이 있다.
 *	근데 이 문제는 loop를 사용해서 풀어야 하는데 풀긴 풀었지만
 *	내 방법은 너무 전문가 같지 않게 푼 느낌이라 정답 예시를 참고해
 *  더 좋은 방법으로 풀어야 될 것 같다.
 * */
/*
 * # 369게임[2단계]
 * 
 * 1. 1~50까지 반복을 한다.
 * 2. 그 안에서 해당 숫자의 369게임의 결과를 출력한다.
 * 예) 1 2 짝 4 5 짝 7 8 짝 10 11 12 짝 ...
 * 
 */

public class LoopEx12_연습1 {

	public static void main(String[] args) {

		// 근데 10,20,30,40,50 일 때 출력이 문제 & 더 간단하게 풀고 싶음
		for (int i = 1; i <= 10; i++) {
			if (i == 10)
				System.out.print(i + " ");
			else if (i % 3 == 0)
				System.out.print("짝" + " ");
			else
				System.out.print(i + " ");

		}
		for (int i = 11; i <= 30; i++) {
			if (i == 20)
				System.out.print(i + " ");
			else if ((i % 10) % 3 == 0)
				System.out.print("짝" + " ");
			else
				System.out.print(i + " ");
		}
		for (int i = 31; i <= 40; i++) {
			if (i == 40) System.out.print(i + " ");
			else if ((i % 10) % 3 == 0)
				System.out.print("짝짝" + " ");
			else
				System.out.print("짝" + " ");
		}
		for (int i = 41; i <= 50; i++) {
			if ( i == 50 ) System.out.print(i+ " ");
			else if ((i % 10) % 3 == 0)
				System.out.print("짝" + " ");
			else
				System.out.print(i + " ");
		}

	}

}
