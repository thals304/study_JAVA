package step2_01.array;
// 24.01.24 time 13:02-13:11
/*
 * today 소감문
 * 진짜 간단한 배열 문제이고 for문을 사용하는 문제였는데
 * 1번 문제에서 인덱스 벗어났다는 경고를 받았다. 
 * for문 1개만 써서 arr[0] = 10 
 *              arr[i+1] = arr[i] + 10; 을 하고 싶었으나
 *              i+1로 인해 인덱스 값이 5가 될 수 있어 경고가 나온 것 같다.
 * 그래서 이중 for문을 사용해서 이 문제를 해결했다.
 * 
 * 
 * */
/*
 * # 배열 기본문제
 */

public class ArrayEx03_연습1 {

	public static void main(String[] args) {
		
		int[] arr = new int[5]; 
		
		// 문제1) for문을 이용하여 10부터 50까지 arr 배열에 저장
		// 정답1) 10 20 30 40 50
		for(int i = 0; i < arr.length ; i++) {
			arr[0] = 10;
			for(int j = 1; j < arr.length; j++) {
				arr[j] = arr[j-1] + 10;  
			}
		}
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+ " ");
		}
		System.out.println();
		// 문제2) 1번에서 생성한 arr에서 4의 배수만 출력
		// 정답2) 20 40
		
		for(int i = 0; i < arr.length; i++  ) {
			if( arr[i] % 4 == 0) {
				System.out.print(arr[i]+ " ");
			}
			
		}
		System.out.println();
		// 문제3) 1번에서 생성한 arr에서 4의 배수의 합 출력
		// 정답3) 60
		int total = 0;
		for(int i = 0; i < arr.length; i++  ) {
			if( arr[i] % 4 == 0) {
				total += arr[i];
			}
			
		}System.out.println(total);
		
		
		// 문제4) 1번에서 생성한 arr에서 4의 배수의 개수를 출력
		// 정답4) 2
		int cnt = 0;
		for(int i = 0; i < arr.length; i++  ) {
			if( arr[i] % 4 == 0) {
				cnt++;
			}
			
		}System.out.println(cnt);
		// 문제5) 1번에서 생성한 arr에서 짝수의 개수를 출력
		// 정답5) 5
		cnt = 0;
		for(int i = 0; i < arr.length; i++  ) {
			if( arr[i] % 2 == 0) {
				cnt++;
			}
			
		}System.out.println(cnt);
		
	}
	
}
