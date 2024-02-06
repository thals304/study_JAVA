package step5_02.file;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
// 24.02.06 time 14:00-14:35 
/*
 * today 소감문
 * 정답예시 방법이 아닌 내가 Ex4를 이해한 대로 / / /n 으로 split을 3번 하려고 했는데
 * 쉽지 않았다. 그래서 중간 중간 sysout으로 저장한 문자열, 문자열 배열을 출력하면서
 * 문제에서 원하는 정답으로 도출하려고 노력한 끝에 완성했다.
 * 물론 좋지 않은 코드일 수도 있겠으나 그래도 내 방법으로 하나 더 완성시켰다는 점이
 * 뿌듯했고 chat gpt의 도움을 받지 않고 브레이크 포인트?인 sysout으로 한 단계씩
 * 결과를 보고 코드를 짜는 것도 실력을 늘고 내 생각을 코드로 표현하는데 도움이 된다고 
 * 큰게 느꼈던 것 같다. 당연히 출력 없이 한 번에 코드를 짜는 것이 대단하지만
 * 난 아직 성장하고 있는 사람으로서 여러 방법을 시도하면서 코드를 짜는 것도 좋다고 생각한다.
 * */
// 파일 로드하기 : 연습문제2

public class FileEx06_연습2 {

	public static void main(String[] args) {
		
		// 4번 연습문제에서 작성된 텍스트파일을 읽어들여와 아래 배열에 저장하시오.
		
		String[] names = new String[3];			// momk , megait , github
		String[] pws   = new String[3];			// 1111 , 2222   , 3333
		int[] moneys   = new int[3];			// 20000, 30000 , 40000
		
		String fileName = "fileTest02.txt";
		File file = new File(fileName);
		FileReader fr = null;
		BufferedReader br = null;
		
		if (file.exists()) {
			
		try {
			fr = new FileReader(fileName);
			br = new BufferedReader(fr);
			String temp = "";
			while (true) {
				String data = br.readLine();
				if (data == null) {
					break;
				}
				temp += data + ",";	// 맨 마지막에는 안넣고 싶었는데 문자열 배열이 아닌 문자열이라 쉽지 않음 (어차피 "," split해서 temp1에 저장할 것)
				
			}
			System.out.println(temp);	// momk/1111/20000,megait/2222/30000,github/3333/40000,
			
			String[] temp1 = temp.split(",");	
			System.out.println(Arrays.toString(temp1));	// [momk/1111/20000, megait/2222/30000, github/3333/40000]
			
			for (int i = 0; i < temp1.length; i++) {
				String[] temp2 = temp1[i].split("/");	//  i = 0, [momk,1111,20000]  / i = 1, [megait,2222,30000] / i = 2, [github,3333,40000]
				names[i] = temp2[0];
				pws[i] = temp2[1];
				moneys[i] = Integer.parseInt(temp2[2]);
			}
			
			System.out.println("name : "+ Arrays.toString(names));
			System.out.println("pws : "+ Arrays.toString(pws));
			System.out.println("moneys : "+ Arrays.toString(moneys));
			
			
		} 
		catch (Exception e) {
		
			e.printStackTrace();
		}
		finally {
			if (br != null) {try {br.close();} catch (IOException e) {e.printStackTrace();}}
			if (fr != null) {try {fr.close();} catch (IOException e) {e.printStackTrace();} }
		}
	}
		
	}
}
