package step1_06.loop;
// 24.01.24 time 12:53-12:57
/*
 *today 소감문
 *확실히 어제 풀고 나서 다시 푼 문제라 코드 한줄을 이해하면서 쓸 정도가 된 것 같다.
 *start, end 사용과 조절에 대해서는 어제의 정답이 떠올라 그대로 쓴 것 같아 
 *암기한 것을 가져다가 쓴 느낌이다. 하지만 이렇게 정답을 외우고 이해하는 것도 누적이 되면
 *결국 나의 실력이기 좋게 받아들이기로 했고 한달이상 지났을 때고 기억하고 있으면 좋겠다.  
 **/
/*
 * # 2차원 반복문
 * 
 * 1 2 3 4 5
 * 10 9 8 7 6
 * 11 12 13 14 15
 * 20 19 18 17 16
 * 21 22 23 24 25
 * 
 * 
 * 1) 오른쪽방향으로 순서대로 출력
 * 2) 왼쪽방향대로 순서대로 출력
 * 
 * 1)2) 5번 반복
 * 
 */


public class LoopEx30_연습2 {

	public static void main(String[] args) {
		int start = 1;
		int end = 5;
		for(int i = 0; i < 5; i++) {
			if(i % 2 == 0) {	// 0,2,4번째 줄 = 오른쪽 방향
				for(int j = start; j <= end; j++ ) {
					System.out.print(j+ " ");
				}
			}
			else {
				for(int j = end; j >= start; j--) {
					System.out.print(j+ " ");
				}
			}
			System.out.println();
			start = end + 1;
			end += 5;
		}
	}

}
