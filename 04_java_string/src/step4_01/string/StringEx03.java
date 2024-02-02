package step4_01.string;

/* 
 * # 문자열 관련 메서드
 * 
 * 1. 문자열.length() 							: 문자열의 길이를 반환한다. (반환타입은 int)
 * 2. 문자열.indexOf("문자열") 					: 특정문자열이 포함된 위치를 반환한다.  (반환타입은 int)
 * 												   같은 문자가 있을경우 맨 앞에 있는 가장 앞에 위치한 문자위치 1개만 반환
 * 												   (참고) lastIndexOf("문자열") : 같은문자가 있을 경우 가장 뒤에 위치한 문자위치 1개만 반환 
 * 3. 문자열.charAt(n번째)      				: 문자열의 n번째 위치에 포함된 문자를 반환한다. (반환 타입은 char)
 * 4. 문자열.substring(index1이상, index2미만)  : 특정문자열의 index1이상 index2미만의 문자열을 잘라서 반환한다. (반환타입은 String)
 *    문자열.substring(index1)  				: 특정문자열의 index1이상부터 끝까지의 문자열을 잘라서 반환한다. (반환타입은 String)
 * 5. 문자열.split("구분자")					: 구분자로 문자열을 잘라서 반환한다. (반환타입은 String 배열)
 * 
 */

public class StringEx03 {

	public static void main(String[] args) {

		String str = "ksm";
		System.out.println(str);
		System.out.println("\n=============\n");
		
		// [1] length() : 문자열의 길이
		System.out.println(str.length());
		int length = str.length();
		System.out.println(length);
		System.out.println("\n=============\n");
		
		// [2] indexOf("글자") : 글자가 포함된 인덱스 확인 (몇 번째에 있는지) // 번호는 0부터 시작
		System.out.println(str.indexOf("k"));
		System.out.println(str.indexOf("s"));
		System.out.println(str.indexOf("m"));
		System.out.println(str.indexOf("ks"));	// 글자가 몇 번째부터 시작하는지
		System.out.println("\n=============\n");
		
		// [3] charAt(index) : 문자 한개 추출 (인덱싱)
		System.out.println(str.charAt(0));	// 몇 번째에 어떤 글자가 있는지
		System.out.println(str.charAt(1));
		System.out.println(str.charAt(2));
		char ch = str.charAt(2);	// (중요)  charAt 메소드의 결과는 char 타입!
		System.out.println(ch);
		
		System.out.println(str.charAt(str.length() - 1));
		System.out.println();
		
		for (int i = 0; i < str.length(); i++) {	// 배열과 달리 조건식에서 변수.length() 괄호 꼭 쓰기
			System.out.println(str.charAt(i));
		}
		System.out.println("\n=============\n");
		
		// [4] substring() : 문자 여러개 추출 (슬라이싱)	  // (매우 중요!!)
		// 4-1) substring(index1이상, index2미만)
		// System.out.println(str.substring(시작,끝 - 1));
		System.out.println(str.substring(0 , 2));
		System.out.println(str.substring(2 , 3));
		String subStr = str.substring(1, 3);	// substring 메소드 결과는 String
		System.out.println(subStr);
		
		System.out.println();
		// 4-2) substring(index1부터 끝까지)
		System.out.println(str.substring(0));
		System.out.println(str.substring(1));
		System.out.println(str.substring(2));
		System.out.println("\n=============\n");
		
		// [5] split("구분자") : 구분자로 잘라내기
		String str1 = "a/b/c/d/e/f/g";
		String str2 = "aa&bb&cc";
		String str3 = "aaa.bbb.ccc.ddd";	// 예외 case . > \\. (이스케이프문자로 구현)
		
		String[] temp = str1.split("/");	// split 메소드 결과는 String[] 
		System.out.println(temp.length);	// 배열이므로 변수명.length -> charAt과 비교
		
		for (int i  = 0; i < temp.length; i++) {
			System.out.print(temp[i] + " ");
		}
		System.out.println();
		
		temp = str2.split("&");	
		System.out.println(temp.length);	
		for (int i  = 0; i < temp.length; i++) {
			System.out.print(temp[i] + " ");
		}
		System.out.println();
		
		temp = str3.split("\\.");	// 예외 케이스 주의!
		System.out.println(temp.length);	
		
		for (int i  = 0; i < temp.length; i++) {
			System.out.print(temp[i] + " ");
		}
		System.out.println();
		
		System.out.println("\n=============\n");
		
		// 참고) 문자열 비교 : compareTo()  -> 알고리즘 문자열 정렬에서 사용
		String str4 = "C";
		String str5 = "JAVA";
		String str6 = "Python";
		String str7 = "C";
		
		// 왼쪽 데이터(기준)가 작을 경우 음수가 반환 (-)
		System.out.println(str4.compareTo(str5));	
		System.out.println(str4.compareTo(str6));
		
		// 왼쪽 데이터(기준)가 클 경우 양수가 반환 (+)
		System.out.println(str6.compareTo(str4));	
		System.out.println(str6.compareTo(str5));
		
		// 양쪽 데이터가 같을 경우 0이 반환
		System.out.println(str7.compareTo(str4));
		System.out.println(str4.compareTo(str7));
	}

}
