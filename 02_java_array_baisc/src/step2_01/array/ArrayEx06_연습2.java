package step2_01.array;
/*
 *  24.03.28 time 22:52-22:55
 *  today 소감문
 *  예외처리 하면 check 변수를 인덱스로 사용하는 좋은 방법이 있다는 것을
 *  뒤에 문제들을 통해 중요성을 알게되서 자연스럽게 생각 나는 것 같다.
 * */

import java.util.Scanner;

/*
 * # 학생성적관리 프로그램[3단계] : 예외처리
 */



public class ArrayEx06_연습2 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int[] studentNums = {1001, 1002, 1003, 1004, 1005};
		int[] scores  = {  87,   11,   45,   98,   23};
		
		// 문제) 학번을 입력받아 성적 출력
		// 		단, 없는학번 입력 시 예외처리
		// 예)
		// 학번 입력 : 1002		성적 : 11점
		// 학번 입력 : 1000		해당학번은 존재하지 않습니다.
		System.out.print("학번 입력 : ");
		int studentNum = scan.nextInt();
		
		int check = -1;
		for (int i = 0; i < studentNums.length; i++) {
			if (studentNums[i] == studentNum) {
				check = i;
				break;
			}
		}
		
		if (check == -1) System.out.println("해당학번은 존재하지 않습니다.");
		else System.out.println("성적 : " + scores[check]);
		
		scan.close();
	}
	
}
