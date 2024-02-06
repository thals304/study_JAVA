package step5_02.file;

import java.io.FileWriter;
import java.io.IOException;

// 24.02.05 time 21:12-21:20
/*
 * today 소감문
 * Ex03 문제와 다른 부분이 거의 없어 쉽게 접근하면서 풀었던 것 같다.
 * 근데 한 줄 띄우는 걸 어떻게 해야하는지가 이 문제의 관건이었던 것 같다.
 * 처음에는 for문 안에 System.out.println();을 넣었는데 적용이 안되었다.
 * 왜 그런지 고민해봤는데 data에 names, pws, moneys를 저장해야 한다는 걸
 * sysout 쓰기 전에 생각했어야 했는데 이 부분을 간과해서 정답이 일자로 쭉 출력되었던 것 같다.
 * 이 부분을 알아채고 난 뒤 가장 쉬운 방법인 data에 "\n"을 더해주자는 간단한 사고를 했고
 * 문제에서 요구하는 대로 답이 잘 나왔던 것 같다.
 * 그리고 아직 아쉬운 점은 try catch finally {} 안에 왜 그렇게 쓰는지 생각하지 않고 외운대로
 * 쓰고 있는 느낌이라 다시 복습으로 이해가 필요하다고 느꼈다.
 * */
//# 파일 저장하기 : 연습문제2

public class FileEx04_연습1 {

	public static void main(String[] args) {
		
		// momk/1111/20000
		// megait/2222/30000
		// github/3333/40000
		
		String[] names = {"momk", "megait", "github"};
		String[] pws   = {"1111",   "2222",   "3333"};
		int[]    moneys= { 20000,    30000,    40000};
		
		String fileName = "fileTest02.txt";
		String data = "";
		
		for (int i = 0; i < names.length; i++) {
			data += names[i] + "/" + pws[i] + "/" + moneys[i] + "\n";
			// 한 줄 띄기를 어떻게 표현하지? \n으로 표현함
		}
		
		FileWriter fw = null;
		try {
			fw = new FileWriter(fileName);
			fw.write(data);
		}
		catch (IOException e){
			e.printStackTrace();
		}
		finally {
			try {fw.close();} catch (IOException e) {e.printStackTrace();}}
		
	}

}
