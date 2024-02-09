package step4_01.string;

import java.util.Scanner;
// 24.02.09 time 23:22-23:30
/*
 * today 소감문
 * 보자마자 문자열 비교에서 equals를 사용 안한다? 그러면 한 글자씩 indexOf로 비교하자는
 * 생각이 들었다. 반복문을 통해 비교할까 했는데 내가 입력한 글자가 주어진 것보다 길다면?
 * 어떻게 비교해야하지? 했는데 if문으로 문자열 length가 3일 때 indexOf로 비교해서 
 * cnt를 증가시키는 방법을 생각해냈다. 그래서 cnt 가 3개면 name과 myName은 같은 문자열인 것이고
 * 아니면 다른 문자열이라는 메세지를 출력하도록 했다.
 * */
/*
 * # 문자열 비교
 * 
 *  equals메서드를 사용하지 않고 두 문자열이 같은지 판별하는 코드를 작성해보시오.
 *  
 */

public class StringEx14_연습1 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		String name = "코끼리";

		System.out.print("동물 이름을 입력하세요 : ");
		String myName = scan.next();

		int cnt = 0;
		if (myName.length() == 3) {
			for (int i = 0; i < name.length(); i++) {
				if (name.indexOf(i) == myName.indexOf(i)) {
					cnt ++;
				}
			}
		}
		
		if (cnt == 3) {
			System.out.println(name + "과 " + myName + "은 같습니다.");
		}
		else System.out.println(name + "과 " + myName + "은 같지 않습니다.");

	}

}
