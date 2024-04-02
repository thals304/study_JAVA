package step5_02.file;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

/*
 * 24.04.01 time 16:42-16:53
 * today 소감문
 * 확실히 파일 로드하는게 파일 저장보다 어려운 것 같다.
 * 왜냐하면 저장한 파일의 문자열을 split을 하는 경우도 많고
 * 그걸 다시 배열에 집어 넣어야 하니까 만만치 않은 것 같다.
 * */
//파일 로드하기 : 연습문제1
public class FileEx05_연습2 {

	public static void main(String[] args) {
		
		// 3번 연습문제에서 작성된 텍스트파일을 읽어들여와 아래 배열에 저장하시오.
		
		String[] names = new String[3]; // 김철수 , 이만수 , 이영희
		int[] ages = new int[3];		//  20 , 30 , 40
		
		String fileName = "fileTest01.txt";
		File file = new File(fileName);
		
		FileReader fr = null;
		BufferedReader br = null;
		
		if(file.exists()) {
			try {
				fr = new FileReader(file);
				br = new BufferedReader(fr);
				String data = br.readLine();;
				
				
				String[] temp = data.split(",");
				for(int i = 0; i < temp.length; i++) {
					String[] temp2 = temp[i].split("/");
					names[i] = temp2[0];
					ages[i] = Integer.parseInt(temp2[1]);
				}
					
				
				System.out.println("names" + Arrays.toString(names));
				System.out.println("ages" + Arrays.toString(ages));
			}
			catch(IOException e) {e.printStackTrace();}
			finally {
				if (br != null) try {br.close();} catch(IOException e) {e.printStackTrace();}
				if (fr != null) try {br.close();} catch(IOException e) {e.printStackTrace();}
			}
		}
	}

}
