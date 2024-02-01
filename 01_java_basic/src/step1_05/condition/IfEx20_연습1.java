package step1_05.condition;

import java.util.Random;

// 24.01.18 time 21:42 - 21:53
/*
 * today 소감문

 * 문제를 보자마자 %와 /를 사용해야겠다는 생각이 들었던 것 같다.
 * 하지만 두번 째 자리 숫자를 내가 원하던 것이었기에
 * 백의 자리 숫자를 제거를 하기 위해 %를 사용했고
 * 사실 if-else를 사용하기가 어려웠는데
 * 어떻게든 if-else문을 쓰기 위해 십의 자리 숫자는 몫이 0이거나 0이 아닌 경우를 분류해
 * 몫(/)을 사용해서 두번째 자리 숫자를 구했다.
 * 그리고 숫자를 맞추는 게임인데 나는 두번째 자리 수만 구하면 되는 것으로 문제를 잘 못봐서
 * 아예 정답이 틀렸다고 봐야할 것 같다.
 * 
   
 * */

/*
 * # 가운데 숫자 맞추기 게임
 * 
 * 1. 150~250 사이의 랜덤 숫자 저장
 * 2. 랜덤 숫자의 가운데 숫자를 맞추는 게임이다.
 * 예)
 * 		249	: 4
 * 	    123 : 2
 * 		771 : 7
 */

public class IfEx20_연습1 {

	public static void main(String[] args) {
		
		Random ran = new Random();
		
		int rNum = ran.nextInt(101)+150; // [0-100] + 150
		
		int secondNum = 0;
		if (rNum / 100 == 1 || rNum / 100 ==2) {
			int changeNum = rNum % 100;
			if (rNum / 10 != 0) {
				secondNum = changeNum / 10;
			}
			else {
				secondNum = 0;
			}
		}
		System.out.println(rNum + " : " + secondNum);
	}

}
