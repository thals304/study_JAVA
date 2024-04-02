package step5_02.file;
/*24.04.01 time 18:02-18:17 
 *24.04.02 time 20:52- 21:00
 * 
 * today 소감문
 * 일단 문제를 풀때 오랜만에 어레이리스트를 하는데도 불구하고 
 * 추가, 삭제 하는 코드를 잘 쓰는게 신기했다. 그리고 정답과 비교했을 때
 * 생각보다 내가 잘 기억하고 있어서 놀랐다. 하지만 완벽하게 아는게 아니라서
 * 디테일적인 부분들도 놓치고 있었고 어레이 리스트와 배열의 삭제, 추가, 삽입을 아직도
 * 헷갈려 하는 것 같다. 이 부분은 나중에 다시 복습해야겠다고 생각했다.
 * 가장 심각한 것은 파일 로드 부분이다. 파일 로드가 내가 앞에서 했던 것과 뭔가 다르게
 * 코드가 써있어서 아직 분석을 제대로 다 하지 못했다. 
 * */

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

//# 파일 컨트롤러[1단계] : 어레이리스트

public class FileEx07_연습1 {
	
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int[] arrayList = null;
		int elementCnt = 0;
		
		String fileName = "arrayList.txt";
		
		
		
		
		while (true) {
			
			System.out.println("[어레이리스트 컨트롤러]");
			System.out.println("[1]추가하기");
			System.out.println("[2]삭제하기");
			System.out.println("[3]저장하기");
			System.out.println("[4]로드하기");
			System.out.println("[5]종료하기");
			
			System.out.print("메뉴 선택 : ");
			int sel = scan.nextInt();
			
			if	(sel == 1) {
				
				
				if (elementCnt == 0) {
					arrayList = new int[elementCnt + 1];
				}
				else if (elementCnt > 0) {
					int[] temp = arrayList;
					arrayList = new int[elementCnt + 1];
					// i의 범위
					for (int i = 0; i < elementCnt; i++){
						arrayList[i] = temp[i];
					} 
					temp = null ; //temp를 다시 null로 만들어주는 것 잊지 말기!
			    }
				System.out.print("[추가]데이터 입력 : ");
				int data = scan.nextInt();
				
				arrayList[elementCnt] = data;
				elementCnt++;
			}
			else if (sel == 2) {
				
				System.out.print("삭제할 인덱스 입력 : ");
				int delIdx = scan.nextInt();
				// arraylist의 삭제에도 이렇게 조건을 써줘야 했었나?
				if (elementCnt - 1 < delIdx || delIdx < 0) {
					System.out.println("[메세지]해당 위치는 삭제할 수 없습니다.");
					continue;
				}
				if (elementCnt == 1) {
					arrayList = null;
				}
				else if (elementCnt > 1) {
					int[] temp = arrayList;
					arrayList = new int[elementCnt - 1];
					
					int j = 0;
					// i의 범위
					for (int i = 0; i < elementCnt; i++) {
						if (i != delIdx) {
							arrayList[j] = temp[i];
							j++; // 이걸 잊어버리다니!!
						}
					}
					temp = null;
				}
				elementCnt--;
			}
			else if (sel == 3) {
				
				String data = "";
				for (int i = 0; i < arrayList.length; i++) {
					data += arrayList[i];
					if (i != arrayList.length - 1) { // 문자열 추가 부분은 정답예시에서 리스트 요소 하나에 한칸 띄도록
						data+= arrayList[i];
						data+= "\n";
					}
				}
				
				FileWriter fw = null;
				
				try {
					fw = new FileWriter(fileName);
					fw.write(data); // 얘도 절대 빼먹으면 안됨
					System.out.println("arrayList : " + Arrays.toString(arrayList));
				}
				catch (IOException e) {
					e.printStackTrace();
				}
				finally {try {fw.close();} catch(IOException e) {e.printStackTrace();}}
				
			}
			else if (sel == 4) {
				
				File file = new File(fileName);
				String data = "";
				if (file.exists()) {
					
					FileReader fr = null;
					BufferedReader br = null;
					
					try {
						
						fr = new FileReader(file);
						br = new BufferedReader(fr);
						// 파일에 arraylist가 어떻게 저장되는가 ? ex) 1 \n 3 \n 5
						
						while (true) {
							String line = br.readLine(); 
							if (line == null) {
								break;
							}
							data += line;
							data +="\n"; // 왜 여기서 \n을 data에 더해주는거지? 
						}// 굳이 이렇게 안하고 한 줄씩 받아오는 대로 바로 arrayList에 저장해주면 안되나? 
						/* int index = 0;
						 * while (true){
						 * 	String line = br.readLine();
						 *  if (line == null) {
								break;
							}
							arrayList[index] = Integer.parseInt(line);   
						 *  index++;
						 * }
						 * 
						 * 
						 * */
						data = data.substring(0, data.length() - 1); // data.length() - 1 하는 이유? 마지막 \n을 지워주는 것
						
						String[] temp = data.split("\n"); // \n을 구분자로 사용한 것이었으므로 이제는 split
						elementCnt = temp.length;
						
						arrayList = new int[elementCnt];
						
						for (int i = 0; i < elementCnt; i++) {
							arrayList[i] = Integer.parseInt(temp[i]);
						}
					}
					catch (IOException e) {
						e.printStackTrace();
					}
					finally {
						if (br != null) {try{br.close();} catch(IOException e) {e.printStackTrace();}}
						if (fr != null) {try{fr.close();} catch(IOException e) {e.printStackTrace();}}
					}
				}
			}
			else if (sel == 5) {
				System.out.println("프로그램 종료");
				scan.close();
				break;
			}
			
		}
		
	}
}
