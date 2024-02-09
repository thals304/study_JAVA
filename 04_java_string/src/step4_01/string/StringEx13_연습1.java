package step4_01.string;

import java.util.Arrays;

// 24.02.09 time 23:04-23:19
/*
 * today 소감문 
 * 일단 내가 문제를 잘못읽은 실수를 저지른 점!
 * 사전순이면 ㄱ,ㄴ,ㄷ .. / a,b,c.. 의 형태인데 전에 풀어본 max로 너무 당연하게
 * 푼 점 반성해야겠다.
 * 그래도 코드를 간결히 잘 쓴 것 같은데 돌려보면 무한루프가 돌아서 도대체 뭐가 문제지라고
 * 생각했는데 너무나 중요한 while문을 빠져나오게 하는 i의 증감 코드가 빠진 것이다.
 * 진짜 다 잘해놓고 항상 마지막에 까먹어서 문제이다. 좀 더 꼼꼼함이 필요하다.
 * */
// # 정렬 (사전순으로 정렬해 보시오.) // 사전순 ㄱ ㄴ ㄷ 

public class StringEx13_연습1 {

	public static void main(String[] args) {
		
		String[] names = {"홍길동", "김유신", "마동석", "자바킹", "서동요"};
		
		int i = 0;
		while (i < names.length - 1) { // 맨 마지막 배열은 비교 안해도 됨
			
			String min = names[i];
			int minIdx = i;
			
			for (int j = i; j < names.length; j++) {
				if ( names[j].compareTo(min) < 0) {	// 왼쪽 데이터가 작으면 음수 나옴
					min = names[j];
					minIdx = j;
				}
			}
			
			String temp = names[i];
			names[i] = names[minIdx];
			names[minIdx] = temp;
			
			i++;	// while문 나오기 위해 반드시 필요
		}
		System.out.println(Arrays.toString(names));
	}

}
