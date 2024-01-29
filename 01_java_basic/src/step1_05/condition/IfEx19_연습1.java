package step1_05.condition;

import java.util.Scanner;

//24.01.18 time  20:50 - 20:55
/*
* today 소감문

* 	정답 예시와 달리 이체 가능 if문에서 
*   myMoney -= 이체할 금액
* 	yourMoney += 이체할 금액으로 써줘서 더 간단하게 표현했다.
* 	하지만 가장 큰 if-else 문에서 if안에 있는 작은 if-else문을 쓰는데 신경을 쓰느라
*   큰 else문을 빠뜨리는 실수를 했다. 좀 더 차분하게 글을 읽고 큰것부터 작은 부분까지 
*   세밀하게 코드를 짜는 습관을 길러야겠다. 
* 
* */

/*
 * # ATM[1단계] : 이체하기
 * 
 * 1. 이체할 계좌번호를 입력받는다.
 * 2. 계좌번호가 일치하면,
 * 3. 이체할 금액을 입력받는다.
 * 4. 이체할 금액 <= myMoney	: 이체가능
 * 			myMoney   - 이체할 금액
 * 			yourMoney + 이체할 금액
 *    이체할 금액  > myMoney 	: 이체불가
 */

public class IfEx19_연습1 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int myMoney = 8700;
		
		int yourAcc = 4321;
		int yourMoney = 12000;
		
		System.out.println("myMoney = " + myMoney + "원");
		System.out.println("yourMoney = " + yourMoney + "원");
		
		System.out.print("이체 계좌번호 : ");
		int transAcc = scan.nextInt();
		
		if (yourAcc == transAcc) {
			System.out.print("이체할 금액 : ");
			int transMoney = scan.nextInt();
			
			if(transMoney <= myMoney) {
				myMoney -= transMoney;
				yourMoney += transMoney;
				System.out.println("이체 완료");
			}
			else {
				System.out.println("계좌 잔액 부족");
		}
			}
		else {
			System.out.println("계좌 번호를 다시 확인해주세요.");
		}
		System.out.println("myMoney = " + myMoney + "원");
		System.out.println("yourMoney = " + yourMoney + "원");
		
		scan.close();
		
}
}