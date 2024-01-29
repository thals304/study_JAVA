package step1_06.loop;
// 24.01.19 time 14:09 - 14:17
/*
 * today 소감문
 * 이 문제들은 시간이 별로 걸리지 않아야 하는데 왜 걸렸냐면 
 * 내가 2번 문제를 풀 때 위에 사용한 i를 다시 초기화 해주지 않아서
 * 위에서 이미 부푼 숫자가 된 i가 밑에서 적용이 되서 값이 자꾸 이상하게 나왔던 것 같다.
 * 그래서 이 부분은 수정했더니 잘 해결됐다.
 * */
//# 반복문 기본문제[2단계]

public class LoopEx03_연습1 {

	public static void main(String[] args) {
		
		// 문제1) 1~10까지 반복해 3미만 7이상만 출력
		// 정답1) 1 2 7 8 9 10
		
		int i = 1;
		while (i <= 10) {
			if (i < 3 || i >= 7) {
				System.out.println(i);
			}
			i++;
		}
		System.out.println();
		// 문제2) 문제1의 조건에 맞는 수들의 합 출력
		// 정답2) 37
		int sum = 0;
		i = 1;
		while (i <= 10) {	
			if (i < 3 || i >= 7) {
				sum += i;
			}
			i++;
		}
		System.out.println("합은 "+ sum);
		System.out.println();
		// 문제3) 문제1의 조건에 맞는 수들의 개수 출력
		// 정답3) 6
		i = 1;
		int cnt = 0;
		while (i <= 10) {	
			if (i < 3 || i >= 7) {
				 cnt++;
			}
			i++;
		}
		System.out.println("개수는 "+ cnt);
		System.out.println();
		// 문제4) 1~5까지의 합 출력
		// 정답4) 15
		i = 1;
		sum = 0;
		while(i<=5) {
			sum += i;
			i++;
		}
		System.out.println(sum);

	}

}
