package step2_01.array;
// 24.01.24 time 21:22- 21:32
/*
 * today 소감문
 * 학번을 입력 받아 성적을 출력하는 건 앞에 예제를 통해 풀었는데
 * 갑자기 입력 받은 학번이 배열 studentNums에 없을 경우를 구현하는 곳에서 
 * 멈칫 했고 사용한 for문까지 어떻게 도는 건지 헷갈린 것 같다. 
 * 이를 해결하고자 처음에는 for문 안에 if문을 사용했으니 else로 예외 처리를 하면
 * 된다고 생각했지만 이상한 답이 출력이 되었고 못풀 것 같다고 생각해 정답을 보고 
 * 이해하려고 노력했던 것 같다. 근데 정답 예시에서 사용한 true,false의 정확한 역할에
 * 대해 아직 이해를 못했다.
 * */
/*
 * # 학생성적관리 프로그램[3단계] : 예외처리
 */

import java.util.Scanner;

public class ArrayEx06_연습1 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int[] studentNums = {1001, 1002, 1003, 1004, 1005};
		int[] scores  = {  87,   11,   45,   98,   23};
		
		// 문제) 학번을 입력받아 성적 출력
		// 		단, 없는학번 입력 시 예외처리
		// 예)
		// 학번 입력 : 1002		성적 : 11점
		// 학번 입력 : 1000		해당학번은 존재하지 않습니다.
		int outputScore = 0;
		boolean isExists = false;
		System.out.print("학번 입력 : ");
		int studentNum = scan.nextInt();
		for(int i = 0; i < studentNums.length; i++) {
			if(studentNum == studentNums[i]) {
				outputScore = scores[i];  // 성적 출력할 때 for문을 안쓰고 바로 출력하기 위해 outputScore에 학번에 따른 성적 저장
				isExists = true;	// 정확한 얘의 역할 : for문 안에 존재하는지 안하는지 코드를 쓰면 5번의 결과가 나오므로 for문 밖에서 한 번만 출력되게 함 
			}
		}
		if (isExists == true)
			System.out.print("    성적 : " + outputScore);
		else
			System.out.println("해당학번은 존재하지 않습니다.");
		
		scan.close();
		
		
	}
	
}
