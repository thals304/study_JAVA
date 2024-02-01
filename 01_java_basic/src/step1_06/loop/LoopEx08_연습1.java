package step1_06.loop;
// 24.01.21 time 21:10 - 21:31
/*
 * today 소감문
 * 일단 전체적인 while문 틀을 잡혀져 있게 힌트를 주셔서 문제 한 문장 한 문장에 맞춰 
 * 구현하면 되는 거라 처음에는 겁이 났지만 하면서 별로 할게 없다는 것을 느꼈던 것 같다.
 * 하지만 while문 조건에 boolean인 true를 쓰는 부분은 아직도 어색하며
 * id 변수를 업데이트를 해주는 부분까지 생각 못한 것에 대해 아쉬움이 크고 
 * 아직 완벽하지 않은 것 같다는 생각에 속상했다.
 * 그래도 이 문제를 통해 배운 점은 디버그를 사용해 while문이 어떻게 돌아가고 빠져나오는지
 * 흐름을 잘 알게 된 것 같아서 다시 한 번 디버그(브레이크 포인트)에 대한 감사함을 느끼고 있다.
 * 다음에 다시 문제를 풀게 되면 힌트 없이 while문 부터 내 힘으로 처음부터 풀고 싶다는 생각이 들었다.
 * 
 * */
import java.util.Scanner;

/*
 * # ATM[2단계]
 * 
 * id 변수가 -1 이면 로그아웃 상태이고
 * 				   1 이면 dbAcc1유저가 로그인한 상태이며
 * 				   2 이면 dbACcc2유저가 로그인한 상태이다.
 * 
 * 
 * 1. 로그인
 *  - dbAcc1유저 및 dbAcc2유저가 로그인 후 다시 로그인을 누를경우 '현재 000 유저님 로그인중' 출력
 * 	- 로그아웃 상태에서만 이용 가능
 * 		> 로그인 되었습니다. '000 유저님 환영합니다.' 출력
 * 2. 로그아웃
 *  - 로그 아웃 상태에서 진행시 '로그인 이후 이용해주세요' 출력
 * 	- 로그인 후 이용가능 ' 로그아웃 되었습니다.' 출력
 * 
 */

public class LoopEx08_연습1 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int dbAcc1 = 1111;
		int dbPw1 = 1234;
		
		int dbAcc2 = 2222;
		int dbPw2 = 2345;
		
		int id = -1;						// -1(로그아웃), 1(dbAcc1로그인), 2(dbAcc2로그인)
		boolean isRun = true;
		
		
		while (isRun) {
			
			System.out.println("1.로그인");
			System.out.println("2.로그아웃");
			System.out.println("0.종료");
			
			System.out.print("메뉴 선택 : ");
			int selectMenu = scan.nextInt();
			
			if (selectMenu == 1) {
				if (id == -1) {
					System.out.print("계좌번호를 입력해 주세요 : ");
					int db = scan.nextInt();
					
					System.out.print("패스워드를 입력해 주세요 : ");
					int pw = scan.nextInt();
					
					if ( db == dbAcc1 && pw == dbPw1) {
						
						System.out.println("로그인이 되었습니다.");
						System.out.println(dbAcc1 + " 유저님 환영합니다.");
						id = 1;	// id가 1인 것으로 업데이트 해줘야 로그인 된걸로 인식해 메뉴 2번에서 로그아웃 가능
					}
					else if (db == dbAcc2 && pw == dbPw2) {
						System.out.println("로그인이 되었습니다.");
						System.out.println(dbAcc2 + " 유저님 환영합니다.");
						id = 2; // id가 2인 것으로 업데이트 해줘야 로그인 된걸로 인식해 메뉴 2번에서 로그아웃 가능
					}
					else {
						System.out.println("계좌번호와 비밀번호를 다시 확인해 주세요");
					}	
					
				}
				else if (id == 1) {
					System.out.println("현재 dbAcc1 유저님 로그인중");
				}
				else if (id == 2) {
					System.out.println("현재 dbAcc2 유저님 로그인중");
				}
			}
			else if (selectMenu == 2) {
				if(id != -1) {
					System.out.println("로그아웃 되었습니다.");
					id = -1;
				}
				else {
					System.out.println("로그인 이후 이용해주세요.");
				}
			}
			else if (selectMenu == 0) {
				isRun = false;
				System.out.println("프로그램 종료");
			}
		}

		scan.close();
	}

}
