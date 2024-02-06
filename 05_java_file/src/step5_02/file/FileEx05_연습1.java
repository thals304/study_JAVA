package step5_02.file;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

// 24.02.06 time 13:04-13:21
/*
 * today 소감문
 * 일단 BufferedReader를 BufferRead로 착각해서 쓰는 실수가 있었고
 * 문자열을 숫자로 변환하는 과정을 까먹고 오류가 난 걸 보고 나서 해결했다.
 * 그리고 temp1 배열을 split하는 과정에서 조건식이 헷갈렸고
 * names[], ages[]에 temp2[1] 을 넣어야 하는데 temp1이라고 쓴 실수를 했다.
 * 아직 파일 로드하기 형식도 완벽히 내꺼가 된게 아니라서 개념을 참고하면서 풀어서 시간이 오래 걸렸던 것 같다.
 * */
//파일 로드하기 : 연습문제1
public class FileEx05_연습1 {

	public static void main(String[] args) {
		
		// 3번 연습문제에서 작성된 텍스트파일을 읽어들여와 아래 배열에 저장하시오.
		
		String[] names = new String[3]; // 김철수 , 이만수 , 이영희
		int[] ages = new int[3];		//  20 , 30 , 40
		
		String fileName = "fileTest01.txt";
		
		File file  = new File(fileName);
		FileReader fr = null;
		BufferedReader br = null;
		
		if (file.exists()) {
			
			try {
				fr = new FileReader(file);
				br = new BufferedReader(fr);
				
				
				String data = br.readLine(); // 한 줄밖에 없어 while문 안써도 됨
				String temp = data;
					
				// names, ages에 다시 집어 넣어야 하는데
				String[] temp1 = temp.split(",");
				
				for (int i = 0; i < temp1.length; i++) {
					String[] temp2 = temp1[i].split("/");
					names[i] = temp2[0];
					ages[i] = Integer.parseInt(temp2[1]);
				}
				System.out.println("name: " + Arrays.toString(names));
				System.out.println("age: " + Arrays.toString(ages));
			}
			catch(Exception e) {
				e.printStackTrace();
			}
			finally {
				if (br != null) {try {br.close();} catch (IOException e) {e.printStackTrace();} }
				if (fr != null) {try {fr.close();} catch (IOException e) {e.printStackTrace();} }
			}
		}
		
		
	}

}
