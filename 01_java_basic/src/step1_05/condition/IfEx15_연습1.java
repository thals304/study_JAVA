package step1_05.condition;
// 24.01.18 time 13:35 - 13:50

/*
 * today 소감문
 * 일단 이 문제는 내가 못푼 문제이다.
 * 30%의 확률을 어떻게 표현할 지 고민을 많이 했고
 * 정답 예시를 보면서 이해를 하려고 했지만 간단한 
 * 정답예시와는 달리 이해가 안되었던 것 같다.
 * 그리고 문제를 잘 못 이해하다 보니 내가 뽑은 복권과 랜덤 복권의 결과 값을 비교해서
 * 30%의 당첨이 되는 것을 표현하려고 했는데 꼬인 것 같다.
 * */
import java.util.Random;
import java.util.Scanner;

/*
 * # 당첨복권[1단계] 
 * 
 * 30%의 확률로 화면에 '당첨'이라는 글자가 화면에 출력된다.
 * 당첨되지 않은 경우는 '꽝'이라는 글자가 화면에 출력된다.
 */


public class IfEx15_연습1 {

	public static void main(String[] args) {
		Random ran = new Random();
		Scanner scan = new Scanner(System.in);
		
		int rNum = ran.nextInt(10);		// 0-9까지의 숫자 중 랜덤으로 번호 뽑기
		System.out.print("내가 뽑은 복권 숫자(0-9) : ");
		int myNum = scan.nextInt();
		
		if(rNum == myNum) {
		if(rNum < 3)
			System.out.println("당첨");
		if(rNum >= 3)
			System.out.println("꽝");
		}
		if(rNum != myNum){
			System.out.println("");
		}
		
	}

}
