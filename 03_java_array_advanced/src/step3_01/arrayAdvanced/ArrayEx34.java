package step3_01.arrayAdvanced;

import java.util.Arrays;

// 배열의 주소
// 배열의 이름 = 주소
// temp 배열에 arr 배열을 저장하는 것 = 권리를 부여하는 것
public class ArrayEx34 {

	public static void main(String[] args) {
		// 일반 변수
		int nVar1 = 10;
		int nVar2 = nVar1;	// 데이터를 (복사하여) 대입
		
		nVar1 = 20;
		System.out.println(nVar1);	// 20
		System.out.println(nVar2);	// 10
		
		System.out.println();
		
		// 배열
		int[] arr = {87, 100, 24, 11, 79};
		int[] temp = arr; // 주소(레퍼런스, 참조)를 대입  //temp는 임시라는 의미를 가진 변수
		
		System.out.println("arr" + arr);	// 링크(주소)가 나옴
		System.out.println("temp" + temp);
		System.out.println();
		
		System.out.println("arr : " + Arrays.toString(arr));	
		System.out.println("temp : " + Arrays.toString(temp));
		System.out.println();
		
		arr[0] = 0;
		temp[1] = 0;
		arr[2] = 0;
		temp[3] = 0;
		arr[4] = 0;
		// 배열은 한쪽에서 바뀌어도 양쪽에서 바뀜
		System.out.println("arr : " + Arrays.toString(arr));	
		System.out.println("temp : " + Arrays.toString(temp));
		
		
	}

}
