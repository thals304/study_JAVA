package step4_01.string;

import java.util.Scanner;
// 24.02.09 time 22:40-22:58
/*
 * today 소감문
 * 일단 이 문제는 정답예시를 많이 참고해서 풀었다.
 * 나는 배열이 100x2라서 도대체 아이템을 더 어떻게 추가하지부터
 * 이 문제가 이해가 안되었던 것 같다.
 * 근데 정답예시를 보고 나니 문자열이기 때문에 열이 2개밖에 없어도
 * 계속 추가가 가능했던 것이었다. 이 점을 이해하고 나니 전체 코드가
 * 이해가 잘 되었던 것 같다.
 * */
/*
 * # 쇼핑몰 [관리자]
 * 
 * 1. 카테고리와 아이템을 입력받아 아래의 예시와 같이 저장한다.
 * 2. 카테고리는 각 행의 첫번째 열에 저장한다.
 * 3. 아이템은 각 행의 두번째 열에 저장한다.
 *    단, 아이템은 여러개를 추가할 수 있도록 슬러시(/)를 구분자로 연결해준다.
 * 예)
 * {
 * 		{"과일", "사과/포도/"},
 * 		{"과자", "홈런볼/조리퐁/"},
 * 		{"음료", "콜라/"},
 * 		{"육류", "소고기/"}
 * 		...
 * 
 * 
 * } 
 */



public class StringEx11_연습1 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		String[][] items = new String[100][2];
		for(int i = 0; i < items.length; i++) {
			items[i][0] = "";
			items[i][1] = "";
		}
		
		int itemCnt = 0;
		
		while(true) {

			System.out.println("[관리자 모드]");
			System.out.println("[1]카테고리 관리");
			System.out.println("[2]아 이 템  관리");
			System.out.println("[3]전체품목 출력");
			System.out.println("[4]종료");
			
			System.out.print(": ");
			int sel = scan.nextInt();
			
			if (sel == 1) {
				
				System.out.print("카테고리 입력 : ");
				String category = scan.next();
				items[itemCnt][0] = category;
				itemCnt++;
				
			}
			else if (sel == 2) {
				for (int i = 0; i < itemCnt; i++) System.out.println("[" + i + "]" + items[i][0]);
				System.out.print("카테고리 인덱스 선택 : ");
				int choice = scan.nextInt();
				
				System.out.print("아이템 입력 : ");
				String item = scan.next();
				// String 배열 이므로 items[][1]에 문자열 계속 추가 가능
				items[choice][1] += item;
				items[choice][1] += "/";
				
			}
			else if (sel == 3) {
				for (int i = 0; i < itemCnt; i++) {
					System.out.println(items[i][0] + " : " + items[i][1]);
				}
			}
			else if (sel == 4) {
				break;
			}
			
		}
		scan.close();


	}

}
