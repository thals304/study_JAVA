package step1_06.loop;

// 24.01.22 time 14:25 - 14:30
/*
 * today 소감문
 * 4개의 문제는 for문의 사용법에 대한 간단한 예제였기 때문에
 * 문제는 없었으나 정답 예시처럼 출력에서 세로로 출력되는 것이 아닌
 * 가로로 출력이 되도록 하는 방법만 추가해 주면 더욱 좋을 것 같다.
 * */
public class LoopEx20_연습1 {

	public static void main(String[] args) {
		

		// 문제 1) 1부터 5까지 출력
		// 정답 1) 1 2 3 4 5
		 for(int i = 1; i <= 5 ; i++) {
			 System.out.print(i);
		 }
		 System.out.println();
		// 문제 2) 1부터 10까지 반복해 5~9까지 출력
		// 정답 2) 5 6 7 8 9
		 for(int i = 1; i <= 10 ; i++) {
			 if(i >= 5 && i <= 9) {
				 System.out.println(i);
			 }
		 }
		System.out.println();
		
		// 문제 3) 10부터 1까지 반복해 6~3까지 출력
		// 정답 3) 6 5 4 3
		for(int i = 10; i >= 1; i--) {
			if(i >= 3 && i <= 6 ) {
				System.out.println(i);
			}
			
		}
		System.out.println();
		
		// 문제 4) 1부터 10까지 반복해 3미만 7이상 출력
		// 정답 4) 1 2 7 8 9 10
		for(int i = 1; i <= 10; i++) {
			if (i < 3 || i >= 7) {
				System.out.println(i);
			}
		
	}
	}
}
