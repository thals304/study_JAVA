package step5_02.file;
/*
 * 24.04.01 time 16:27-16:33
 * today 소감문
 * 일단 나는 data에 이름/성적 넣는 부분을 try 안에서 썼는데 정답예시는 try 밖에서 썼길래
 * 이 부분은 솔직히 상관없을거 같긴하다.
 * 그리고 다 잊어버려서 try catch finally에 어떤 걸 써야할 지 바로 떠오르지 않아
 * 개념을 보면서 작성한 것 같다.
 * */
//# 파일 저장하기 : 연습문제1

import java.io.FileWriter;
import java.io.IOException;

public class FileEx03_연습2 {

	public static void main(String[] args) {
		
		// 김철수/20,이만수/30,이영희/40
		
		String[] names = {"김철수", "이만수", "이영희"};
		int[] ages     = {	   20,     30,     40};
		
		String fileName = "fileTest01.txt";
		FileWriter fw = null;
		
		String data = "";
		
		try {
			fw = new FileWriter(fileName);
			for (int i = 0; i < names.length; i++) {
				data += names[i] + "/" + ages[i];
				if (i != names.length - 1) {
					data += ",";
				}
			}
			
			fw.write(data);
		}
		catch(IOException e){
			e.printStackTrace();
		}
		finally {try{fw.close();} catch(IOException e) {e.printStackTrace();}}
		
	}

}
