package step1_06.loop;
// 24.01.22 time 21:11-21:34
/* today 소감문
 * 오히려 문제는 쉽다고 생각을 했으나
 * 코드를 짜보고 수정을 많이 한 문제였던 것 같다.
 * 특히 10,20,30,40,50 일때를 어떻게 처리해줘야 할 지 고민을 한 문제이다.
 * for문 안에서 i가 1-9 일때는 i를 3으로 나눈 나머지가 0일 경우 짝, 아닐 경우 i값(본인) 출력
 *            10-29 & 40-50 일때는 변수 rest에 i를 10으로 나눈 나머지를 저장하고 
 * i가 10, 20, 40, 50일때는 rest에 임의로 1을 더해 i 값으로 나오도록 만들어줬다. 
 *            30-39 일때는 기본적으로 짝이 1번씩 나오고 
 * 일의 자리가 3,6,9가 나오는 애들은 짝짝이 출력되게 만들어 줬고 30인 경우는 위에 10,20,40,50처럼 조건을 걸어줬다.
 * 문제를 풀고 정답 예시를 봤는데 나는 너무 복잡하게 코드를 짠 것 같아 다음에는 정답 예시 대로 문제를 풀어볼 것이다.
 * */

/*
 * # 369게임[2단계]
 * 
 * 1. 1~50까지 반복을 한다.
 * 2. 그 안에서 해당 숫자의 369게임의 결과를 출력한다.
 * 예) 1 2 짝 4 5 짝 7 8 짝 10 11 12 짝 ...
 * 
 */

public class LoopEx26_연습1 {

	public static void main(String[] args) {
		
		int rest = 0;
		for(int i = 1; i <= 50; i++) {
			if( i < 10 ) {
				if(i%3 == 0) {
					System.out.print("짝 ");
				}
				else System.out.print(i+" ");
				}
			else if (10 <= i && i < 30) {
				rest = i % 10; 
				if ( i == 10 || i == 20) {
					rest += 1;
				}
				if(rest % 3 == 0) {
					System.out.print("짝 ");
				}
				else System.out.print(i+ " ");
				}
			else if ( 30 <= i && i < 40) {
				rest = i % 10;
				if ( i == 30 ) {
					rest += 1;
				}
				if(rest % 3 == 0) {
					System.out.print("짝짝 ");
				}
				else System.out.print("짝 ");
			}
			else {
				rest = i % 10;
				if(i == 40 || i == 50) {
					rest += 1;
					}
				if(rest % 3 == 0 || rest % 6 == 0 || rest % 9 == 0) {
					System.out.print("짝 ");
				}
				else System.out.print(i + " ");
			}
			
			}
			}
	}


