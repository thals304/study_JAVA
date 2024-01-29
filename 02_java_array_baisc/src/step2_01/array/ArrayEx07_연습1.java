package step2_01.array;
// 24.01.24 time 12:09-12:14
/*
 * today 소감문
 * Ex6번 보다 Ex7번이 더 쉽게 느껴졌던 것 같다. 
 * 왜냐하면 앞에 반복문에서 최댓값 구하는 문제를 풀었어서 maxScore에 저장되는 값이
 * 배열로 바뀌면 되는 적용뿐이었기 때문이다.
 * 그리고 앞에 배열 문제에서 성적을 입력하면 학번이 출력되는 문제도 풀었어서 잘 해결한 것 같다.
 * */
/*
 * # 학생성적관리 프로그램[4단계] : 1등학생
 */


public class ArrayEx07_연습1 {

	public static void main(String[] args) {
		
		int[] studentNums = {1001, 1002, 1003, 1004, 1005};
		int[] scores  = {  87,   11,   45,   98,   23};
		
		// 문제) 1등학생의 학번과 성적 출력
		// 정답) 1004번(98점)
		int maxScore = scores[0];
		
		for(int i = 1; i < studentNums.length; i++) {
			if(maxScore < scores[i]) {
				maxScore = scores[i];
			}
		}
		for(int i = 1; i < scores.length; i++) {
			if(maxScore == scores[i]) {
				System.out.println(studentNums[i]+"번"+"("+ maxScore +")");
			}
		}
	}
	
}
