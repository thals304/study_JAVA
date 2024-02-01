package step3_01.arrayAdvanced;

import java.util.Random;
import java.util.Scanner;

//# 빙고 Ver1(플레이어 1명)

public class ArrayEx45_연습1 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		Random ran = new Random();
		
		int maxNum = 5;
		int[][] bingo = new int[maxNum][maxNum];
		int[][] mark = new int[maxNum][maxNum];	
		int[] temp = new int[maxNum*maxNum];
		int size = 50;	
		int win = 0;
		
		// 나는 임시 저장 없이 바로 랜덤숫자를 빙고판에 대입한 코드를 만들고 싶은데 쉽지 않고 chatgpt가 알려주긴 했는데 좋은 방법 같지는 않음
		// 중복을 제거한 랜덤숫자를 임시 저장 
		
		// 중복을 제거한 랜덤숫자를 빙고판에 대입
		
		while (true) {
			System.out.println("=============== BINGO GAME ===============");
			
			
		}

		
	}

}
