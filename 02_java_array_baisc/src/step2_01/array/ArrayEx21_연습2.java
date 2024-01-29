package step2_01.array;
// 24.01.26 time 21:48-21:55
/*
 * today 소감문
 * delIdx를 사용해서 입력한 값이 배열에 존재하는지 구분하는 것이 어색하긴 하다.
 * 그래도 이 부분이 나중에 개발에 있어 유용하게 쓰일 도구라고 하니 익숙해지도록 노력해보겠다.
 * 역시나 삭제한 인덱스 뒤에 있는 요소들을 앞으로 한칸씩 옮기는 for문에서 조건식이 어려웠던 것 같다.
 * i < arr.length가 아닌 i < elementCnt - 1인 이유는 
 * 밑에 arr[i] = arr[i+1] 때문인 것 같다.
 * */
import java.util.Arrays;
import java.util.Scanner;

/*
 * # 배열 컨트롤러[1단계] : 삭제 (delete)
 * 
 * 정답을 보고 소스를 동작을 해본뒤에 소스를 이해하고 코드를 작성해보자.
 * 
 */



public class ArrayEx21_연습2 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int[] arr = {10, 20, 30, 40, 50};
		int elementCnt = 5;
		int selectMenu = 0;
		
		while (true) {
			
			System.out.println(Arrays.toString(arr));
			System.out.println();

			System.out.println("[1]삭제");
			System.out.println("[0]종료");
			
			System.out.print("메뉴 선택 : ");
			selectMenu = scan.nextInt();

			if (selectMenu == 1) {
				System.out.print("삭제할 값 입력: ");
				int data = scan.nextInt();
				
				int delIdx = -1;
				for (int i = 0; i < arr.length; i++) {
					if(data == arr[i]) {
						delIdx = i;
					}
				}
				if (delIdx == -1) {
					System.out.println("입력한 값이 존재하지 않습니다.");
					continue;
				}
				else {
					for( int i = delIdx; i < elementCnt - 1; i++) {
						arr[i] = arr[i+1];
					}
					elementCnt --;
					arr[elementCnt] = 0;
				}
			}
			else if (selectMenu == 0) {
				scan.close();
				break;
			}

		}
		
	}

}
