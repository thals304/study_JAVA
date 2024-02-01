package step1_05.condition;

import java.util.Random;
import java.util.Scanner;

// 24.01.21 time 21:46 - 22:22
/*
 * today 소감문
 * 출력부터 if문까지 배운 걸 test하는 문제이다. 
 * 가위(0), 바위(1), 보(2) -> 0 < 1, 0 > 2, 1 < 2
 * 왼손 (3), 오른손(4)
 * L(3) L(3) - 012 012 -> L 이김 : 0 > 2, L 짐 : 0 < 1, 1 < 2
 *                     -> R 이김 : 2 < 0, R 짐 : 1 > 0, 2 > 1  
 * L(3) R(4)
 * R(4) L(3)
 * R(4) R(4)
 * 
 * 코드를 생각하는 것에는 시간이 별로 안들었는데 
 * 가위, 바위, 보를 숫자로 둔다고 생각하느라 경우의 수가 9개에 오른손, 왼손까지 있으니
 * 누가 이겼는지 졌는지 생각하느라 실수도 하고 고치는 등의 검토 시간을 엄청 써서
 * 굳이 또 풀고 싶지는 않은 문제이다.
 * 또 풀게 된다면 if문 안에 switch문을 넣어 풀고 싶은데 그건 chat gpt를 통해 해결해보고자 한다.
 * 
 * 왼손 오른손을 3,4라는 숫자 말고 사용하는 방법 -> 가위 바위 보를 저장하는 또 다른 변수? 사용
 * */
/*
	==== 가위 바위 보 (하나빼기) ====
	      
	1) 가위바위보 2개씩 저장
	meLeft 에 가위바위보 (입력)   scanner
	meRight 에 가위바위보 (입력)
	
	comLeft에 가위바위보 입력  (랜덤) random
	comRight에 가위바위보 입력 (랜덤)
	
	2) 둘중 하나만 저장 
	meFinal에  meLeft 또는 meRight 저장   (직접)
	comFinal에 comLeft 또는 comRight 저장 (랜덤)
	
	3) 최종판정
	comfinal, mefinal 중 어떤 게 이겼는지
*/
public class IfEx28_테스트문제 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Random ran = new Random();
		
		System.out.println("가위(0) 바위(1) 보(2) (하나 빼기)");
		System.out.print("me 왼쪽 : ");
		int meLeft = scan.nextInt();
		System.out.print("me 오른쪽 : ");
		int meRight = scan.nextInt();
		
		System.out.print("company 왼쪽 : ");
		int comLeft = ran.nextInt(3);	// [0-2]
		System.out.println(comLeft);
		System.out.print("com 오른쪽 : ");
		int comRight = ran.nextInt(3);	// [0-2]
		System.out.println(comRight);
		
		System.out.println();
		
		System.out.println("왼쪽(L) : 3, 오른쪽(R) : 4");
		System.out.print("me 최종 선택 : ");
		int meFinal = scan.nextInt(); 	// L : 3 R : 4 
		
		System.out.print("com 최종 선택 : ");
		int comFinal = ran.nextInt(2) + 3;	// L : 3 R : 4 [0-1] + 3
		System.out.println(comFinal);
		
		if( comFinal == 3 ) {	
			if ( meFinal == 3 ) {	// 둘 다 L
				if (meLeft == 0) {
					if(comLeft == 0) {
						System.out.println("비김");
					}
					else if(comLeft == 1) {
						System.out.println("comFinal가 이김");
					}
					else {
						System.out.println("meFinal가 이김");
					}
				}
				else if (meLeft == 1) {
					if(comLeft == 0) {
						System.out.println("meFinal가 이김");
					}
					else if(comLeft == 1) {
						System.out.println("비김");
					}
					else {
						System.out.println("comFinal가 이김");
					}
				}
				else {
					if(comLeft == 0) {
						System.out.println("comFinal가 이김");
					}
					else if(comLeft == 1) {
						System.out.println("meFinal가 이김");
					}
					else {
						System.out.println("비김");
					}
				}				
			}
			else {	// com : L , me : R
				if (meRight == 0) {
					if(comLeft == 0) {
						System.out.println("비김");
					}
					else if(comLeft == 1) {
						System.out.println("comFinal가 이김");
					}
					else {
						System.out.println("meFinal가 이김");
					}
				}
				else if (meRight == 1) {
					if(comLeft == 0) {
						System.out.println("meFinal가 이김");
					}
					else if(comLeft == 1) {
						System.out.println("비김");
					}
					else {
						System.out.println("comFinal가 이김");
					}
				}
				else {
					if(comLeft == 0) {
						System.out.println("comFinal가 이김");
					}
					else if(comLeft == 1) {
						System.out.println("meFinal가 이김");
					}
					else {
						System.out.println("비김");
					}
				}
			}
				
		}
		else {
			if ( meFinal == 3 ) {	// com : R , me : L
				if (meLeft == 0) {
					if(comRight == 0) {
						System.out.println("비김");
					}
					else if(comRight == 1) {
						System.out.println("comFinal가 이김");
					}
					else {
						System.out.println("meFinal가 이김");
					}
				}
				else if (meLeft == 1) {
					if(comRight == 0) {
						System.out.println("meFinal가 이김");
					}
					else if(comRight == 1) {
						System.out.println("비김");
					}
					else {
						System.out.println("comFinal가 이김");
					}
				
			}
			else {	// 둘 다 R
				if (meRight == 0) {
					if(comRight == 0) {
						System.out.println("비김");
					}
					else if(comRight == 1) {
						System.out.println("comFinal가 이김");
					}
					else {
						System.out.println("meFinal가 이김");
					}
				}
				else if (meRight == 1) {
					if(comRight == 0) {
						System.out.println("meFinal가 이김");
					}
					else if(comRight == 1) {
						System.out.println("비김");
					}
					else {
						System.out.println("comFinal가 이김");
					}
				}
			}
			
		}
			
		scan.close();

	}

}
}