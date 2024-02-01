package step4_01.string;

import java.util.Scanner;

/*
 * 
 * # 문자열 비교 메서드 equals();
 * 
 * - 문자열은  == 로 비교하지 않고 equals()메소드를 이용하여 비교한다.
 * 메소드 == 기능
 * */

public class StringEx02 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		String name = "Tim";	
		
		System.out.print("이름 입력 : ");
		String getName = scan.next();
		
		// 비교 불가
		if (name == getName) System.out.println("(==연산자) 이름 일치!");	// 글자가 아닌 주소가 같은지에 대한 것
		else System.out.println("(==연산자) 이름 불일치!");
		
		// 비교 가능
		if (name.equals(getName)) System.out.println("(equals) 이름 일치!");	// 글자가 같은지에 대한 것
		else System.out.println("(equals) 이름 불일치!");	
		
		// 순서 바꿔도 상관 없나?
		if (getName.equals(name)) System.out.println("(equals) 이름 일치!");
		else System.out.println("(equals) 이름 불일치!");
		
		scan.close();
		
	}
	
}
