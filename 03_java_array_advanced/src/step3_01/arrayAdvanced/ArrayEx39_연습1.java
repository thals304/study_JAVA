package step3_01.arrayAdvanced;
// 24.01.31 time 13:14-13:39
/*
 * today 소감문
 * 일단 나는 문제에게 기본으로 주어지는 garo, sero의 배열을 활용하지 못했다.
 * 정답은 맞췄지만 이중 for문 안에 if문을 구분하는 식까지 다 쓰느라 
 * 만약 배열의 인덱스가 커지만다면 이 방법은 무리일 것 같은 코드라고 생각한다.
 * 그래서 정답 예시의 방법을 습득해야 될 것 같다.
 * */

/*
 *	# 2차원배열 기본문제[3단계]
*/

public class ArrayEx39_연습1 {

	public static void main(String[] args) {
		
		int[][] arr = {
			{101, 102, 103, 104},
			{201, 202, 203, 204},
			{301, 302, 303, 304}
		}; 
		
		int[] garo = new int[3];	// 얘를 쓰라는 문제 같은데,,
		int[] sero = new int[4];
		
		// 문제 1) 가로 합 출력
		// 정답 1) 410, 810, 1210
		int rowSum1 = 0;
		int rowSum2 = 0;
		int rowSum3 = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++ ) {
				if (i == 0) rowSum1 += arr[0][j];
				else if (i == 1) rowSum2 += arr[1][j];
				else if (i == 2) rowSum3 += arr[2][j];
			}
		}
		System.out.println(rowSum1 + ", "+rowSum2 + ", " + rowSum3);
		// 문제 2) 세로 합 출력
		// 정답 2) 603, 606, 609, 612
		int columnSum1 = 0;
		int columnSum2 = 0;
		int columnSum3 = 0;
		int columnSum4 = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++ ) {
				if (j == 0) columnSum1 += arr[i][0];
				else if (j == 1) columnSum2 += arr[i][1];
				else if (j == 2) columnSum3 += arr[i][2];
				else if (j == 2) columnSum3 += arr[i][2];
				else if (j == 3) columnSum4 += arr[i][3];
			}
		}
		System.out.println(columnSum1 + ", "+columnSum2 + ", " + columnSum3 + ", "+ columnSum4);

	}

}
