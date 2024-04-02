package step5_02.file;
/*
 * 24.04.01 time 17:15-17:24
 * today 소감문
 * 전에 이 문제를 풀었을 때는 파일 저장에서 \n을 해줬으니 
 * 로드하기에서도 \n으로 split을 해줘야 된다고 생각했었는데 어차피 data를 한 줄씩
 * 읽어오니 \n을 split 할 필요가 없다는 점을 깨우쳤던 것 같다.
 * 그래서 이번에는 그때 실수한 부분들을 생각해 내면서 열심히 풀었던 것 같다.
 * 그 결과 정답예시와 내 풀이가 변수 이름만 다를 뿐 잘 푼 것 같아 아주 뿌듯하다.
 * */
//파일 로드하기 : 연습문제2

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

public class FileEx06_연습3 {

	public static void main(String[] args) {
		
		// 4번 연습문제에서 작성된 텍스트파일을 읽어들여와 아래 배열에 저장하시오.
		
		String[] names = new String[3];			// momk , megait , github
		String[] pws   = new String[3];			// 1111 , 2222   , 3333
		int[] moneys   = new int[3];			// 20000, 30000 , 40000
		
		String fileName = "fileTest02.txt";
		File file = new File(fileName);
		
		
		if (file.exists()) {
			
			FileReader fr = null;
			BufferedReader br = null;
			
			try {
				fr = new FileReader(file);
				br = new BufferedReader(fr);
				
				int i = 0;
				
				while(true) {
					String data = br.readLine();
					
					if (data == null) {
						break;
					}
					
					String[] temp = data.split("/");
					names[i] = temp[0];
					pws[i] = temp[1];
					moneys[i] = Integer.parseInt(temp[2]);
					i++;
				}
				
				System.out.println("name : " + Arrays.toString(names));
				System.out.println("pws : " + Arrays.toString(pws));
				System.out.println("money : " + Arrays.toString(moneys));
				
			}
			catch(IOException e) {e.printStackTrace();}
			finally {
				if(br != null) try{br.close();} catch(IOException e) {e.printStackTrace();}
				if(fr != null) try{fr.close();} catch(IOException e) {e.printStackTrace();}
			}
		}

	}

}
