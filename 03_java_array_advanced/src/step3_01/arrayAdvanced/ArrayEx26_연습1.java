package step3_01.arrayAdvanced;
/*
 * 24.03.28 time 23:04-23:25 24:05-24:25
 * today 소감문
 * 일단 이 문제는 오늘 처음 풀어보는 문제이다. 근데 배열 인덱스 값들을 중복 없이 섞이게
 * 만드는 방법은 for문을 사용한 셔플이라는 것은 기억이 났는데 그 이후가 기억이 안났던 것 같다.
 * 그래서 정답예시를 보면서 이해하고 따라해보는 시간을 먼저 갖게 된 것 같다.
 * 근데 셔플만 표현하라고 한 것인 줄 알았는데 정답 맞추는 것까지 할 줄을 몰랐다.
 * 1 to 18은 1 - 9까지 랜덤으로 주어진 3X3 배열 형태에 1-9의 위치(인덱스)를 제대로 
 * 맞추면 10-18에 해당되는 배열의 요소들이 update 되고 10-18까지 다 맞추면 종료되도록
 * 만든 코드인 것 같다.
 * question과  -1이 무엇을 의미하는지 고민하는데만 시간을 엄청 쓴 것 같다.
 * 확실한 것은 이 문제는 꼭 다시 풀어봐야 할 문제 같다.
 * 그리고 이 매커니즘만 잘 이해한다면 나중에는 1 to 50 으로 1-25, 26-50으로 쪼개서
 * 가능할 것 같다. 
 * */
import java.util.Random;
import java.util.Scanner;
/* 
 * # 1 to 50[3단계] : 1 to 18
 * 
 * 1. 구글에서 1 to 50 이라고 검색한다.
 * 2. 1 to 50 순발력 게임을 선택해 게임을 실습해본다.
 * 3. 위 게임을 숫자범위를 좁혀 1 to 18로 직접 구현한다.
 * 4. 숫자 1~9는 oneToNine 배열에 저장하고,
 *    숫자 10~18은 tenToEightTeen 배열에 저장한다.
 */


public class ArrayEx26_연습1 {

	public static void main(String[] args) {
		Random ran = new Random();
		Scanner scan = new Scanner(System.in);
		final int SIZE = 9;
		
		int[] oneToNine = new int[SIZE];
		int[] tenToEightTeen  = new int[SIZE];
		
		for (int i = 0; i < SIZE; i++) {
			oneToNine[i] = i + SIZE ;
			tenToEightTeen[i] = (i+1) + SIZE;
		}
		// 셔플 for문 방법
		for (int i = 0; i < 1000; i++) {
			// 1-9 숫자 섞여 있는 것 만들기 (중복 x)
			int rIdx = ran.nextInt(SIZE); // [0-8]
			int temp = oneToNine[i];
			oneToNine[i] = oneToNine[rIdx];
			oneToNine[rIdx] = temp;
			
			// 10-18 숫자 섞여 있는 것 만들기 (중복 x)
			rIdx = ran.nextInt(SIZE);
			temp = tenToEightTeen[i];
			tenToEightTeen[i] = tenToEightTeen[rIdx];
			tenToEightTeen[rIdx] = temp;
		}
		
		// 1 to 18 게임
		int question = 1; // 내가 찾아야 할 숫자
		while (true) {
			
			if (question == 19) { // 1-18까지 숫자 다 찾은 것
				System.out.println("/n 모두 다 맞히셨습니다. 프로그램을 종료합니다.\n");
				break;
			}
			
			for (int i = 0; i < SIZE; i++) {
				if (oneToNine[i] == -1) System.out.println("\t"); // -1인 경우? 1-9 정답 다 맞추고 10-18 정답 맞추면 더이상 update할 숫자가 없을 때
				else 					System.out.println(oneToNine[i] + "\t");
				
				if (i % 3 == 2)         System.out.println("\n"); // 3개씩 한 줄 만들기 위해 필요한 조건식
			}
			
			System.out.print( "[" + question + "] 의 인덱스 입력 :");
			int tryAnswer = scan.nextInt();
			
			if (oneToNine[tryAnswer] == question) {
				if ( 1<= question && question <= 9 ) oneToNine[tryAnswer] = tenToEightTeen[tryAnswer];
				else								 oneToNine[tryAnswer] = -1; // question이 10 - 18 사이의 숫자일 때 정답을 맞춘 경우
			}
			
			question++;
		}
		
		
	}
	
}
