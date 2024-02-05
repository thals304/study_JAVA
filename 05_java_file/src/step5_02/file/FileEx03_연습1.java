package step5_02.file;

import java.io.File;
import java.io.FileWriter;
import java.io.FilterWriter;
import java.io.IOException;

//# 파일 저장하기 : 연습문제1
// 24.02.05 time 14:35-14:43
/*
 * today 소감문
 * try, catch, finally, 파일 입력 등이 아직 어색해서 
 * 문제 풀 때 개념을 조금 참고했고 나머지는 이미 전에 했었던 문제에
 * 파일에 문자열 data를 저장하는 것 뿐이라 풀만 했던것 같다.
 * 근데 Fil만 치고 자동 완성으로 눌렀더니 FilterWriter로 되어 있는 실수를 저질렀다.
 * 이 부분은 문제 풀 때 다시 한 번 확인해야 될 부분이라고 생각한다.
 * */

public class FileEx03_연습1 {

	public static void main(String[] args) {
		
		// 김철수/20,이만수/30,이영희/40
		
		String[] names = {"김철수", "이만수", "이영희"};
		int[] ages     = {	   20,     30,     40};
		
		String fileName = "fileTest01.txt";
		FileWriter fw = null;
		
		String data = "";
		
		for (int i = 0; i < names.length; i++) {
			data += names[i];
			data += "/";
			data += ages[i];
			if (i < names.length -1) {
				data += ",";
			}
		}
		
		try {
			fw = new FileWriter(fileName);	// 이게 왜 에러가 뜨지? FileWriter인데 FilterWriter라고 잘못씀
			
			fw.write(data);
			
		}catch (IOException e){
			e.printStackTrace();
		}finally {
			try {fw.close();} catch (IOException e) {e.printStackTrace();}}
	
		
	}

}
