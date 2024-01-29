package step1_06.loop;
// 24.01.23 time 1-2시간
/*
 * today 소감문
 * 일단 내가 가장 자신 없는 이중 for문인데 거기에 가장 못한다고 자부할 수 있는
 * 별찍기 문제가 무려 7문제나 나왔는데 1, 3번은 짰는데 2, 4는 머리만으로 풀 수 없어서 
 * 태블릿으로 i를 행 j를  열이라고 생각하면서 코드를 짜려고 노력했지만 쉽지 않았다.
 * 그래서 문제 2번은 답을 보고 했는데 답 마저도 처음에는 이해가 안되어 디버그를 사용해 
 * 이해했다. 
 * 결론적으로 별찍기 문제 2,4번은 공백과 #의 for문을 각각 만들어 주는 것이고
 * 5번은 공백 대신 @와 #을 써주면 되는 것이고
 * 6,7번은 공백, #의 for문을 각각 2번씩 써주면 되는 것이었다.
 * 추가로 for문이 여러 개 있을 때 돌아가는 흐름에 대해 고민해보고 코드를 짜면 훨씬 더
 * 잘 짜지는 것 같다.
 * 그리고  1-4번을 해결하면 5-7은 1-4번을 그래도 가져다 쓰는 문제라는 점!
 * 
 * */

// # 삼각형 그리기

public class LoopEx28_연습1 {
	
	public static void main(String[] args) {
		
		/*
		 * 예)
		 * ###
		 * ###
		 * ###
		 */
		
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print("#");
			}
			System.out.println();
		}
		System.out.println();
		
		
		/*
		 * 문제 1)
		 * #
		 * ##
		 * ###
		 */
		for(int i = 0; i < 3; i++) {
			for(int j = 0 ; j <= i ;j++) {
				System.out.print("#");
				
			}
			System.out.println();
		}
		
		System.out.println();
		
		/*
		 * 문제 2)
		 *   #
		 *  ##
		 * ###
		 */
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 3 - (i+1); j++ ) {
				System.out.print(" ");
			}
			for(int j = 0; j <= i; j++)
			{
				System.out.print("#");
			}System.out.println();
			}
		System.out.println();
		
		/*
		 * 문제 3)
		 * ###
		 * ##
		 * #
		 */
		System.out.println();
		for(int i = 0; i < 3; i++) {
			for(int j = i; j < 3; j++) {
				System.out.print("#");
			}System.out.println();
		}
		System.out.println();
		
		for(int i = 0; i < 3; i++) {
			for(int j = 3; j > i; j--) {
			System.out.print("#");
			}System.out.println();
		}
		System.out.println();
		/*
		 * 문제 4)
		 * ###
		 *  ##
		 *   #
		 */
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < i; j++) {
				System.out.print(" ");
			}
			for(int j = i; j < 3; j++) {
				System.out.print("#");
			}System.out.println();
				}
		System.out.println();
		
		/*
		 * 문제 5)
		 * @##
		 * @@#
		 * @@@
		 */
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j <= i; j++) {
				System.out.print("@");
			}
			for(int j = 0; j < 3 - (i+1); j++) {
				System.out.print("#");
			}System.out.println();
		}
		
		System.out.println();
		
		/*
		 * 문제 6)
		 *   #
		 *  ###
		 * #####
		 */
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 3-(i+1); j++) {
				System.out.print(" ");
			}
			for(int j = 0; j <= i; j++) {
				System.out.print("#");
			}
			for(int j = 0; j <= i-1; j++) {
				System.out.print("#");
			}
			for(int j = 0; j < 3-(i+1); j++) {
				System.out.print(" ");
			}
			System.out.println();
			
		}
		System.out.println();
		/*
		 * 문제 7)
		 *  #####
		 *   ###
		 *    #
		 */
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < i; j++) {
				System.out.print(" ");
			}
			for(int j = i; j < 3; j++) {
				System.out.print("#");
			}
			for(int j = 0; j < 3 - (i+1); j++) {
				System.out.print("#");
			}
			for(int j = 0; j < i; j++ ) {
				System.out.print(" ");
			}
			System.out.println();
		}
		
		
	}
}
