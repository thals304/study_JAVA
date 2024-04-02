package step5_02.file;
/*
 *  24.04.01 time 16:35-16:38
 *  today 소감문
 *  확실히 앞에서 개념도 정리하고 개념 보면서 문제 풀기도 해보고 하니까 
 *  이번에는 자신있게 안보고 파일 저장하기 구조를 쓸 수 있었던 것 같다.
 *  즉, 복습의 중요성인 것 같다. 뒤에서 file과 관련된 DTO가 나오는데
 *  앞에 file이 정리되어 있지 않으면 뒤에도 못풀고 계속 밀리기만 할 것이다.
 * */
//# 파일 저장하기 : 연습문제2

import java.io.FileWriter;
import java.io.IOException;

public class FileEx04_연습2 {

	public static void main(String[] args) {
		
		// momk/1111/20000
		// megait/2222/30000
		// github/3333/40000
		
		String[] names = {"momk", "megait", "github"};
		String[] pws   = {"1111",   "2222",   "3333"};
		int[]    moneys= { 20000,    30000,    40000};
		
		String fileName = "fileTest02.txt";
		
		String data = "";

		for(int i = 0 ; i < names.length; i++) {
			data += names[i] + "/" + pws[i] + "/" + moneys[i];
			data += "\n";
		}
		FileWriter fw = null;
		try {
			fw = new FileWriter(fileName);
			fw.write(data);
		}
		catch(IOException e) {e.printStackTrace();}
		finally {try{fw.close();} catch(IOException e) {e.printStackTrace();}}

	}

}
