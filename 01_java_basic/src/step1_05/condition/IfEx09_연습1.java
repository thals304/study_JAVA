package step1_05.condition;
// 24.01.18 12:46 - 12:51
/*
 * today 소감문
 * 키(cm)를 입력 받는 부분에서 정답 예시에는 int 타입으로 
 * 했지만 요즘 키는 .5 까지 이야기 하기 때문에 double 형태로 바꿔 
 * 큰 범위를 입력 가능하게 했다
 * 그리고 부모님과 함께왔는지 확인을 하기 위해 0,1을 사용했지만
 * 문자열을 입력 받는 scan.toString();을 써도 될 것 같다
 * */
/*
 * # 놀이기구 이용제한
 * 
 * 1. 키를 입력받는다.
 * 2. 입력받은 키가 120 이상이면, 놀이기구를 이용할 수 있다.
 * 3. 키가 120 미만이면, 놀이기구를 이용할 수 없다.
 * 4. 단, 부모님과 함께 온 경우 놀이기구 이용이 가능하다.
 *    예) 부모님과 함께 오셨나요?(yes:1, no:0)
 */

import java.util.Scanner;

public class IfEx09_연습1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("키(cm)를 입력하세요 : ");
		double height = scan.nextDouble();
		if (height >= 120) {
			System.out.println("놀이기구 이용할 수 있습니다.");
		}
		if (height < 120 ) {
			System.out.print("부모님과 함께 오셨나요?(yes:1, no:0) ");
			int answer = scan.nextInt();
			if(answer == 0) {
				System.out.println("놀이 기구 이용할 수 없습니다.");
			}
			if(answer == 1) {
				System.out.println("놀이 기구 이용할 수 있습니다.");
			}
			
		}
		scan.close();		
	
	}

}
