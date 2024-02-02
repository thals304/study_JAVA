package step3_01.arrayAdvanced;

import java.util.Arrays;

// 24.02.01 time 15:44-16:06
/*
 * today 소감문
 * 알고리즘 정렬은 학교 알고리즘 때 정의는 배웠어서
 * while문을 쓰기 전에 scores[0]을 max로 잡고 maxIdx를 0으로 초기화해 다른 인덱스랑 비교 후
 * temp를 이용해 서로의 값을 바꾸면 된다는 것을 알고 먼저 코드를 써봤다.
 * 그리고 그걸 i < scores.length가 아닌 i < scores.length - 1로 한다는 것도
 * 알고 적용했고 max를 i로 바꿨다.
 * 그 다음에 for문도 바꿔보려고 했으나 i 번째 다음 번호부터 비교해야 한다는 생각은 했으나
 * 그걸 표현하기 어려워 했던 것 같다. 정작 답은 j = i+1이라는 것으로 매우 간단했다.
 * 근데 이렇게 했는데도 답이 안나오는 것이다. 자꾸만 인덱스 0번부터 비교하게 되는
 * 코드가 나와 도대체 뭐가 문제인지 고민을 하고 고쳐봐도 해결되지 않았다.
 * 결론은 maxId를 0이 아닌 i로 초기화 해줘야 한다는 것을 인지하지 못한 것이다. 
 * 왜냐하면 난 maxIdx를 그저 값을 저장하는 변수라고 생각했기 때문이다. 
 * */
/*
 * # 정렬하기
 * 
 * 1. 인덱스 0번이 나머지를 검사한다.
 * 2. 제일 큰 값을 찾아 교환한다.
 * 3. 인덱스 1증가한다.
 * 4. [1~3]을 끝까지 반복한다.
 * 예)
 * 10, 50, 30, 40, 80, 7
 * 80, 50, 30, 40, 10, 7
 * 80, 50, 30, 40, 10, 7
 * 80, 50, 40, 30, 10, 7
 */


public class ArrayEx31_연습1 {

	public static void main(String[] args) {
		
		int[] scores = {10, 50, 30, 40, 80, 7};

		
		
			int i = 0;
			while (i < scores.length - 1) {
				
			System.out.println(Arrays.toString(scores));
			int max = scores[i];
			int maxIdx = i;	// maxIdx = 0이 아닌 이유? 처음부터 다시 검사하는 문제 발생
			
			for (int j = i + 1;  j < scores.length; j++) {	// i 다음번 인덱스 i+1 부터 비교해야 함
				if (max < scores[j]) {
					max = scores[j];
					maxIdx = j;
				}
			}
			
			int temp = 0;
			temp = scores[i];
			scores[i] = scores[maxIdx];
			scores[maxIdx] = temp;
			i++;
			}
	}

}
