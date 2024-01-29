package step1_06.loop;

import java.util.Scanner;
// 24.01.23 time 22:44 - 23:28
/*
 * today 소감문
 * 일단 문제의 요구사항이 너무 짤막하게 적혀있어서 1번 로그인 후 재 로그인 불가라는 걸 어떻게 표형해야 될 지 몰라
 * 1.은 정답 예시를 봤다. 그리고 나서 2-6까지는 내가 직접 짰는데 정답 예시 이외에도 이체시 비밀 번호 입력이라는 걸
 * 추가로 넣어 구현했다. 좀 더 욕심내서 비밀 번호 틀렸을 때 입력 회수 제한을 5회로 두고 싶은데 이 부분은 나중에 추가해 보도록 하겠다.
 * 정답 예시와 내 답이 거의 유사했는데 identifier가 1 또는 2일 때, 즉 로그인 상태에서만 이용 가능하다는 점에서
 * 나는 if (identifier == 1 | identifier == 2)라고 썼는데 이 부분을 정답 예시는 짧고 보기 좋게 identifier != -1이라고
 * 한 점은 나도 따라해야 된다고 생각하는 부분이다. 그리고 주어진 계좌가 2개뿐이라 이체할 계좌 번호를 입력하는 걸 구현하지 않은 점도
 * 반성해야 될 것 같다. 그리고 정답 예시처럼 첫 부분에 로그인, 로그아웃 상태를 나타내주는 부분도 넣어주면 좋을 것 같다. 
 * */

/*
 * # ATM[2단계]
 * 
 * 1. 로그인   
 * . 로그인 후 재 로그인 불가
 * . 로그아웃 상태에서만 이용 가능
 * 2. 로그아웃
 * . 로그인 후 이용가능
 * 3. 입금
 * . 로그인 후 이용가능
 * 4. 출금
 * . 로그인 후 이용가능
 * 5. 이체
 * . 로그인 후 이용가능
 * 6. 조회
 * . 로그인 후 이용가능
 * 7. 종료
 * 
 */

public class LoopEx10_연습1 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int dbAcc1 = 1111;
		int dbPw1 = 1234;
		int dbMoney1 = 50000;

		int dbAcc2 = 2222;
		int dbPw2 = 2345;
		int dbMoney2 = 70000;

		int identifier = -1; // -1(로그아웃), 1(dbAcc1로그인), 2(dbAcc2로그인)
		int acc = 0;
		int pw = 0;
		int inputMoney = 0;
		int outputMoney = 0;
		int transferMoney = 0;
		boolean isRun = true;
		while (isRun) {
			System.out.println("dbMoney1 = " + dbMoney1 + "원"); // 이 부분부터
			System.out.println("dbMoney2 = " + dbMoney2 + "원");

			System.out.print("*상태 : ");
			if (identifier == -1) {
				System.out.println("로그아웃");
			} else if (identifier == 1) {
				System.out.println(dbAcc1 + "로그인");
			} else if (identifier == 2) {
				System.out.println(dbAcc2 + "로그인");
			} // 이 부분까지는 생각 못함 있으면 좋을 거 같긴해

			System.out.println("1.로그인");
			System.out.println("2.로그아웃");
			System.out.println("3.입금");
			System.out.println("4.출금");
			System.out.println("5.이체");
			System.out.println("6.조회");
			System.out.println("0.종료");

			System.out.print("메뉴 선택 : ");
			int sel = scan.nextInt();

			if (sel == 1) {
				if (identifier == -1) {

					System.out.print("계좌 번호 입력 : ");
					acc = scan.nextInt();

					System.out.print("비밀 번호 입력 : ");
					pw = scan.nextInt();

					if (acc == dbAcc1 && pw == dbPw1) {
						identifier = 1;
						System.out.println(dbAcc1 + " 님 환영합니다.");
					} else if (acc == dbAcc2 && pw == dbPw2) {
						identifier = 2;
						System.out.println(dbAcc2 + " 님 환영합니다.");
					} else {
						System.out.println("계좌 번호와 비밀 번호를 다시 확인해 주세요.");
					}
				} else {
					System.out.println("이미 로그인 중..");
				}

			} else if (sel == 2) {
				if (identifier == 1 || identifier == 2) {
					identifier = -1;
				} else
					System.out.println("로그인 후 이용 가능..");
			} else if (sel == 3) {
				if (identifier == 1 || identifier == 2) {
					System.out.print("입금 금액 입력 : ");
					inputMoney = scan.nextInt();
					if (identifier == 1) {
						dbMoney1 += inputMoney;
					} else if (identifier == 2) {
						dbMoney2 += inputMoney;
					}
					System.out.println("입금 완료");
				} else
					System.out.println("로그인 후 이용 가능..");
			} else if (sel == 4) {
				if (identifier == 1 || identifier == 2) {
					System.out.print("출금 금액 : ");
					outputMoney = scan.nextInt();

					if (identifier == 1) {
						if (dbMoney1 >= outputMoney) {
							dbMoney1 -= outputMoney;
							System.out.println("출금 완료");
						} else
							System.out.println("계좌 잔액 부족");
					} else if (identifier == 2) {
						if (dbMoney2 >= outputMoney) {
							dbMoney2 -= outputMoney;
							System.out.println("출금 완료");
						} else
							System.out.println("계좌 잔액 부족");
					}

				} else
					System.out.println("로그인 후 이용 가능..");
			} else if (sel == 5) {

				if (identifier == 1 || identifier == 2) {

					if (identifier == 1 || identifier == 2) {

						if (identifier == 1) {
							System.out.print("이체 금액 입력 : ");
							transferMoney = scan.nextInt();

							if (dbMoney1 >= transferMoney) {
								System.out.print("비밀 번호 입력 : "); // 이체 시 비밀 번호 확인 하는 것 넣고 싶었음
								pw = scan.nextInt();

								while (pw != dbPw1) {
									System.out.println("비밀 번호를 다시 확인해주세요.");
									System.out.print("비밀 번호 입력 : ");
									pw = scan.nextInt();
								}
								/*
								 * // 비번 입력 제한 횟수 5번 System.out.println("비밀 번호를 다시 확인해주세요.");
								 * System.out.print("비밀 번호 입력 : "); pw = scan.nextInt();
								 * 
								 * for (int cnt = 5; i > 1; i--){ if (pw == dbPw1){ break; } else {
								 * 
								 * System.out.println("비밀 번호를 다시 확인해주세요." + cnt + "/" + 5);
								 * System.out.print("비밀 번호 입력 : ");
								 * 
								 * } }
								 */
								dbMoney1 -= transferMoney;
								dbMoney2 += transferMoney;
								System.out.println("이체 완료");
							} else
								System.out.println("계좌 잔액 부족");
						} else if (identifier == 2) {
							System.out.print("이체 금액 입력 : ");
							transferMoney = scan.nextInt();

							if (dbMoney2 >= transferMoney) {
								System.out.print("비밀 번호 입력 : "); // 출금시 비밀 번호 확인 하는 것 넣고 싶었음
								pw = scan.nextInt();
								while (pw != dbPw2) {
									System.out.println("비밀 번호를 다시 확인해주세요.");
									System.out.print("비밀 번호 입력 : ");
									pw = scan.nextInt(); // 나중에 비번 입력 횟수도 넣고 싶음
								}
								dbMoney2 -= transferMoney;
								dbMoney1 += transferMoney;
								System.out.println("이체 완료");
							} else
								System.out.println("계좌 잔액 부족");
						}
					}
				} else
					System.out.println("로그인 후 이용 가능..");
			}

			else if (sel == 6) { // 조회
				if (identifier == 1 || identifier == 2) {
					if (identifier == 1) {
						System.out.println(dbAcc1 + "님의 계좌 잔고 = " + dbMoney1 + "원");
					} else if (identifier == 2) {
						System.out.println(dbAcc2 + "님의 계좌 잔고 = " + dbMoney2 + "원");
					}
				} else
					System.out.println("로그인 후 이용 가능..");
			} else if (sel == 0) {
				isRun = false;
				System.out.println("프로그램 종료");
			}
		}

		scan.close();

	}

}
