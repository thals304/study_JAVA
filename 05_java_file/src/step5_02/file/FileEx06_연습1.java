package step5_02.file;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

// 24.02.06 time 13:28-13:46
/*
 * today 소감문
 * 이 문제는 Ex4의 출력물의 구조를 정확하게 이해하지 못한 나의 실수이고 나의 실력이라고 
 * 생각한다. 따라서 Ex4를 다시 이해해 보고 내가 처음에 생각했었던 3번의 split을 각각 하고 저장하는 걸
 * 다시 표현해보도록 하겠다.
 * */
// 파일 로드하기 : 연습문제2

public class FileEx06_연습1 {

	public static void main(String[] args) {
		
		// 4번 연습문제에서 작성된 텍스트파일을 읽어들여와 아래 배열에 저장하시오.
		
		String[] names = new String[3];			// momk , megait , github
		String[] pws   = new String[3];			// 1111 , 2222   , 3333
		int[] moneys   = new int[3];			// 20000, 30000 , 40000
		
		String fileName = "fileTest02.txt";
		File file = new File(fileName);	// 이 부분을 놓쳐버림
		FileReader fr = null;
		BufferedReader br = null;
		
		if (file.exists()) {
			
		try {
			fr = new FileReader(fileName);
			br = new BufferedReader(fr);
			int i = 0;
			while (true) {
				String data = br.readLine();
				if (data == null) {
					break;
				}
				/* 어떻게 이렇게 간단하게 처리할 수 있는거지? 
				 Ex4에서 / 두 번, /n 한 번 해서 split 3번 해야된다고 생각했는데 이상하게 나옴 
				 Ex4의 fileTest02.txt는 3X3 배열인 것 같음 
				 그래서 i(행)가 0,1,2일 때, (열)0,1,2를 각각 names, pws, moneys 배열에 넣어준 것 같음*/
				System.out.println(data);
				String[] temp = data.split("/");
				names[i] = temp[0];
				pws[i] = temp[1];
				moneys[i] = Integer.parseInt(temp[2]);
				
				i++;
				
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
