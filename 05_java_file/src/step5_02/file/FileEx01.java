package step5_02.file;

import java.io.FileWriter;	// io : input output
import java.io.IOException;

// 파일 입력 (File Input)

public class FileEx01 {

	public static void main(String[] args) {
		
		String fileName = "ex01.txt";	// 나중에 파일을 가져올 수 있게끔 변수에 저장
		FileWriter fw = null;
		// 파일이 생성되는 기본적인 위치는 현재 자바파일과 같은 프로젝트 폴더이다.(위치 변경 가능)
		// 소스를 실행한 후 프로젝트를 선택 한 뒤 F5(Refresh)를 누르면 생성된 파일을 확인할 수 있다.
		
		try {	 // 파일 입출력은 try , catch구문 없이 사용하지 못하도록 강제성을 부여해 놓았다.
			fw = new FileWriter(fileName);	// 파일을 생성하는 기능의 객체 생성
			
			/*
			 
		 	- write메서드를 통해서 파일에 데이터 입력이 가능하다.
		 
		 	1) 문자열 데이터 형식만 가능하다. 
		 	2) 개행기능이 없기 때문에 \n를 의도적으로 작성해야 한다.
		 	3) write메소드를 여러번 사용하지 않고
		    	데이터를 미리 +=로 만들어 놓고 한번만 write메소드를 사용하는 것을 권장한다.
		    	
		*/
		
			fw.write("파일에 데이터 입력하기 연습1\n");
			fw.write("파일에 데이터 입력하기 연습2\n");
			fw.write("파일에 데이터 입력하기 연습3\n");
			
			// JDK 17 - version
			String data = "파일에 데이터 입력하기 연습4\n";
				   data += "파일에 데이터 입력하기 연습5\n";
				   data += "파일에 데이터 입력하기 연습6\n";
				   
				   fw.write(data);
				   
			// JDK 17 이후 - version	   
			data = """
					파일에 데이터 입력하기 연습7
					파일에 데이터 입력하기 연습8
					파일에 데이터 입력하기 연습9
					파일에 데이터 입력하기 연습10
					""";
			
			fw.write(data);
			
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {fw.close();} catch (IOException e) {e.printStackTrace();}  }	// 파일 객체 종료 [중요]
			
	}

}
