package step1_06.loop;

import java.util.Random;
import java.util.Scanner;

// 24.01.21 time 20:37 - 20:46
/* today 소감문
 * while문을 어떻게 구상할지 고민을 했던 문제였다. 
 * 왜냐하면 while문 조건에서 myAnswer과 rNum가 같을 경우 루프를 빠져나오게 하고 싶은데
 * 다를 경우에 또 다시 스캐너를 통해 정답 맞추기를 시도하는 것에서 스캐너의 위치에 대해 
 * 많은 고민을 했던 것 같다. 
 * 고민의 결과 while문 밖에서 난수 생성 후 myAnwer를 질문하는 스캐너를 하나 만들고
 * while문 안(정답이 아닐 경우)에서 계속 스캐너를 통해 정답 맞추기를 할 수 있게 만들었다.
 * 그리고 루프문이 잘 돌아가나 확인하기 위해 단순히 스캐너랑 숫자를 감소시키는 것만 넣은 것이 아닌 
 * 정답이 아니다/맞다라는 문장으로 구성해 주었다.
 * 근데 문제의 제목을 안보고 문장만 보고 내 마음대로 짜서 그런지 up& down 문제라는 걸 지금 깨달았던 것 같다.
 * 다음에 다시 풀 때는 시간에 연연하지 않고 문제 전체를 차근차근 보는 습관부터 가져야겠다.
 * */
/*
 * # Up & Down 게임[2단계]
 * 
 * 1. 1 ~ 100까지의 난수를 생성한다.
 * 2. 스캐너를 이용해 정답을 맞추기를 시도하고 정답을 맞출경우 게임은 종료된다.
 * 3. 점수는 100점부터 시작해서 오답을 입력할 때마다 5점씩 차감된다.
 * 4. 게임 종료 후, 점수를 출력한다.
 * 
 */

public class LoopEx07_연습1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Random ran = new Random();
		int rNum = ran.nextInt(100)+ 1 ; // [0-99] + 1
		
		System.out.print("난수 맞추기(1~100) : ");
		int myAnswer = scan.nextInt();
		
		int score = 100;
		
		// System.out.println(rNum);	// 코드 전체 확인할 때 사용하는 문장
		
		while (myAnswer != rNum) {	// score도 0-100점으로 조건을 걸고 싶음 ||score >= 0 시도했는데 불가능
			
			score -= 5;
			System.out.println("정답이 아닙니다.");
			System.out.print("난수 맞추기 : ");
			myAnswer = scan.nextInt();
			
		}
		System.out.println("정답입니다.");
		System.out.println("게임 종료. 최종 점수는 " + score);
		
		scan.close();
	}

}
