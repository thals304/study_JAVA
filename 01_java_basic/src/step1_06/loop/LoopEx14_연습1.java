package step1_06.loop;

import java.util.Scanner;

// 24.02.05 time 21:57-22:00

/*
 * today 소감문
 * 이 문제도 if문? for문을 통해 푼 문제같은데 이제는 while을 사용해 풀 수 있냐고
 * 물어보는 것 같다.
 * 생각보다 쉬울거라고 생각했는데 while문 안에서 다 해결이 가능할까 고민이 되었던 것 같다.
 * 그래서 max의 선언은 while문 밖에서 하고 while문 안에서는 정수 입력 3회와
 * 입력한 변수 비교를 통한 max에 저장하기를 했던 것 같다. 
 * 그리고 가장 큰 값 출력은 while문 안에 써서 3번 출력되는 것보단  밖에 써서 한 번만 출력되도록 만들었다.
 * 근데 정수는 + - 부호를 갖는 숫자인데 음수 비교가 잘 안되었던 것 같다. 그래서 while문 안에
 * 다시 max 를 입력한 숫자가 초기값으로 저장되도록 만들었다.
 * */
/*
 * # 최대값 구하기[2단계]
 * 
 * 1. 3회 반복을 하면서 정수를 입력받는다.
 * 2. 입력받은 3개의 숫자 중 가장 큰 값을 출력한다.
 * 
 */

public class LoopEx14_연습1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int i = 0;
		int max = 0;
		while ( i < 3 ) {
			System.out.print("정수 입력 : ");
			int getNum = scan.nextInt();
			
			max = getNum;
			
			if (max < getNum) {
				max = getNum;
			}
			i++;
		}
		System.out.println(max);
	}

}
