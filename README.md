# web_bakend
## **🔥 목표**

- 독립 (생각하는 것을 코드로 )
- 신입 개발자 이상 ( 실력, 가능성 )

## 📆 기간

24.01 ~ 24.06

## 🏃 과정

- 자바 + **프로그래밍 훈련**, 디버깅, 소스 관리 ( 형성, 버전 관리 )
- 자바 ( 객체 지향 ) + **프로그래밍 훈련**
    
    cs ( 컴퓨터 사이언스: 네트워크, 리눅스, 자료구조 )
    
- 웹 관련 언어 ( html, css, js + jquery)
    
    RDB ( 관계형 데이터베이스 > MySQL )
    
- 백엔드 관련 ( JSP 발전 과정 )
    
    → 추가 : 마이바티스, JPA, Model And View, rest api
    
- 클라우드, 문서화 > 포트폴리오
    
    Amazon > AWS

## 📖 Study - JAVA

### 데이터 출력

- **프로그램(데이터)**
    - **데이터 입력 > 연산 > 보관(저장,반복) > 제어(흐름, 반복) > 출력**
- **다양한 데이터 출력**
    - **정수 : 소수점이 없는 수**
    
    ```java
    System.out.println(10);
    ```
    
    - **실수 : 소수점이 있는 수**
    
    ```java
    System.out.println(3.14);
    ```
    
    - **문자 : 단일 문자 ( 홑따옴표 , 싱글쿼테이션 , 싱글쿼터 )**
    
    ```java
    System.out.println('S');
    ```
    
    - **문자열 : 글자 ( 쌍따옴표 , 더블쿼테이션 , 더블쿼터 )**
    
    ```java
    System.out.println("web_dev");
    ```
    
    - **불리(boolean) : 참과거짓 1: true, 0: false**
    
    ```java
    System.out.println(true);
    ```
    
    - **복수의 데이터 출력 ( , 가 아닌 + 를 사용해야 된다. )**
    
    ```java
    // 2. 복수의 데이터 출력
    // + 의미 1) 이어 붙이기 2) 더하기(연산)
    //하나라도 ""가 있으면 모든 것이 문자열로 출력
    System.out.println(1 + 3 + 5);
    System.out.println(1 +" " + 3 + " " + 5);
    System.out.println(1 + "," + 3 + "," + 5);
    
    // 2-1) 문자열 + 문자열 = 문자열
    System.out.println("수강과목: " + "웹 개발");
    
    // 2-2) 숫자 + 숫자 = 숫자
    System.out.println(100000 + 50000);
    
    // 2-3) 문자열 + 숫자 = 문자열
    System.out.println("수강료: "+ 3000000);
    
    // 2-4) 숫자 + 문자열 = 문자열
    System.out.println(100000 + "원");
    ```
    
    +) print
    
    ```java
    // System.out.print(데이터)	1) 데이터를 화면에 출력한다.
    System.out.print("-상품 주문 정보 [");
    System.out.print("가격 : 1000원 /");
    System.out.print("할인률 : 10% /");
    System.out.print("결제금액 : 9000원 ]");
    ```
    

- **이스케이프 문자 ( escape sequence )**
    
    1)    \n : 줄바꿈
    2)    \t : tab
    3)    \\ : 문자 자체 " (문법x)
    4)    \" : 문자 자체 " (문법x)

    
    ```java
      	System.out.println("1)로그인\n2)회원가입\n3)공지사항");
    		System.out.println("1)로그인\t2)회원가입\t3)공지사항");
    		System.out.println("1)로그인\\2)회원가입\\3)공지사항");
    		System.out.println("C:\\coupang\\product_img");
    		System.out.println("\"안녕하세요.\"");
    ```
    

- **서식 문자 출력 (printf)**
    
    1)   %d : 정수
    
    2)   %f : 실수
  
    3)   %c : 단일 문자
       
    4)   %s : 문자열
       
    5)    %.1f : 소수점 1자리 까지 출력(반올림)
          %.2f : 소수점 2자리 까지 출력(반올림)
          %.3f : 소수점 3자리 까지 출력(반올림)
    
    ```java
        System.out.printf("%d\n", 1);
    		System.out.printf("%f\n", 3.14);
    		System.out.printf("%.1f\n", 3.14);
    		System.out.printf("%.2f\n", 3.14);
    		System.out.printf("%.3f\n", 3.14);
    		System.out.printf("%c\n", 'a');
    		System.out.printf("%s\n", "abc");
    ```
    
- **시간 형식 (Time stamp)**
    
    <aside></aside>
    
    1. **new Date()**
    - 현재 시간 정보를 생성한다.
      java.util.Date > 날짜 + 시간
      java.sql.Date > 날짜
    
    2.  **System.currentTimeMillis()**
    - 1970년 1월 1일 자정부터 이 메소드가 실행되는 순간까지 지나온 시간을 밀리초(1/1000초) 단위로 얻어온다.
    - 13자리의 숫자를 얻어오기 때문에 int로 처리하면 에러가 발생되므로 **long**으로 저장한다.
    3.  **시간 출력 형식 SimpleDateFormat**
    - **new Date(), System.currentTimeMillis()라는 날 것을 보관**
    - 날짜 및 시간 출력 서식 지정 방법은 SimpleDateFormat 객체를 사용하여 구현한다.
    - SimpleDateFormat 변수명 = new SimpleDateFormat("날짜 및 시간 서식"); 형태로 객체를 생성한다.
     **[ 대표서식 ]**
    yyyy(년도) MM(월) dd(일) hh(시) mm(분) ss(초)
    - 상세 서식은 구글에서 "simpledateformat 형식"을 검색하여 사용한다.
    - **sdf.format(date);** 메서드를 사용하여 날짜 표현식을 지정한다.
    중요) 날짜타입 데이터에서 글자타입으로 데이터의 형이 변환된다.
    
    </aside>
    
    ```java
        // new Date ()
    		Date now1 = new Date();    // Date + ctl + spacebar 치면 import java.util.Date; 뜸 
    		System.out.println(now1);	// Tue Jan 23 13:27:08 KST 2024 // 컴퓨터 시간에 의존
    
    		// System.currentTimeMillis()
    		long now2 = System.currentTimeMillis();		// 1705984241993 // long 타입
    
        // SimpleDateFormat()
    		SimpleDateFormat sdf = new SimpleDateFormat("yyyy.MM.dd"); // SimpleDateFormat + ctrl +spacebar 치면 import java.util.Date; 뜸 
    		String format1 = sdf.format(now1);	// Date -> String  // String 타입
    		String format2 = sdf.format(now2);	// long -> String
    		
    		System.out.println(format1);
    		System.out.println(format2);
    		
    		// 다른 예시
    		sdf = new SimpleDateFormat("yyyy-MM-dd");    
    		format1 = sdf.format(now1);	// Date -> String
    		format2 = sdf.format(now2);	// long -> String
    		
    		System.out.println(format1);
    		System.out.println(format2);
    		
    		// 다른 예시
    		sdf = new SimpleDateFormat("yyyy년 MM월 dd일 hh시 mm분 ss초");
    		format1 = sdf.format(now1);	// Date -> String
    		format2 = sdf.format(now2);	// long -> String
    		
    		System.out.println(format1);
    		System.out.println(format2);
    ```
    
- **숫자 형식**
    
    <aside>
    
    **DecimalFormat df = new DecimalFormat("숫자 서식");**
    - 숫자 서식은  "**#,##0**"을 쓰고 필요한 문자를 앞 또는 뒤에 붙여주어 표현한다.
    - **.format(숫자데이터)**; 메서드를 사용하여 숫자 출력형식을 지정한다.
    - 상세 서식은 구글에서 "DecimalFormat 형식"을 검색하여 사용한다.
    - **중요)** 숫자 타입에서 글자타입으로 데이터의 형이 변환된다.

    
    </aside>
    
    ```java
        int price1 = 10000;
    		int price2 = 100000;
    		int price3 = 100000;
    		
    		DecimalFormat df = new DecimalFormat("#,##0");  // DecimalFormat + ctrl + spacebar -> import java.text.DecimalFormat; 뜸
    		String strPrice1 = df.format(price1);	// int -> String  // String 타입
    		
    		System.out.println(strPrice1);
    		System.out.println("$"+ df.format(price2));
    		System.out.println(df.format(price3)+"원");
    ```
    

### 데이터 보관 > 변수와 상수

**변수( variable )**

- 단 하나의 값을 저장할 수 있는 메모리 공간
- 변수의 선언 그리고 초기화
    - 변수의 선언	: int nData;	// 메모리 공간 할당
    - 변수의 초기화	: nData = 0;     // 값 저장
    - 변수의 선언과 동시에 초기화 int nData = 0;

**변수의 특징**

- 변수는 변수 하나 당 한 개의 값만 저장할 수 있다. [ 고유성 ]
- 새로운 값이 변수에 저장되면 이전 값은 사라진다.

- **정수 : Integer(int)**

```java
int memberAge;			// 변수의 선언
memberAge = 20;	   	// 데이터 저장
				
System.out.println(memberAge);
```

- **실수 : double**

```java
double memberWeight = 80.5;	 // 선언과 동시에 저장
				
System.out.println(memberWeight);
```

- **문자 1개 : character(char)**

```java
char memberGenderEng = 'M';
char memberGenderKor ='남';
System.out.println(memberGenderEng);
System.out.println(memberGenderKor);
```

- **문자열 : String**

```java
String memberName = "KSM";
System.out.println(memberName);
```

- **참과 거짓 : boolean**

```java
boolean isMember = true;
System.out.println(isMember);
```

<aside>
**변수 명명 규칙 (Naming Convention)**


1. **절대적 규칙(문법)**
- 변수명에 숫자는 사용 가능하나 숫자로 시작할 수 없음
- 변수명에 특수 문자는 _ , $만 가능함
- 변수명에 예약어(키워드)는 사용할 수 없음 ex) public , class , static
- 변수명에 띄어쓰기를 사용 할 수 없음
- 변수명은 대소문자가 구분됨

1. **암묵적 규칙(질서,사회 문화)**
- 변수명은 영어로 작성 ( 한글x )
- 변수명은 소문자로 시작함 ( 클래스 이름을 대문자로 시작 )
- 두 단어가 이어지는 경우 이어지는 단어의 첫 글자를 대문자로 작성함 (camel case) Ex) productCode , productName
- 두 단어가 이어지는 경우 이어지는 단어를 _로 이어줌 (snake case) Ex) product_code , product_name
- 상수명은 전부 대문자로 작성
- 상수명에서 두 단어가 이어지는 경우 _로 이어줌
- 불리언 변수명 앞에는 is를 붙이기 Ex) isRunning , isChecked
- '제 3자'가 보아도 변수안에 어떤데이터가 있는지 '직관적'으로 알 수 있도록
    
    `변수명 작성에 마음과 정성을 들인다. ( 가장 중요 )`
    
    `Ex) a ( 절대 안됨 ) , v (절대 안됨) , productCode(o) , productName(o)`
    
</aside>

- **변수의 특징(고유성 = unique )**

```java
int goodsPrice = 18000;
// int goodsPrice = 19000;  // 똑같은 이름의 변수를 생성할 수 없음
// 자료형 타입을 생략했으므로 기존의 데이터를 수정
goodsPrice = 19800; 	
goodsPrice = 22000;
System.out.println(goodsPrice);
```

- **변수의 초깃값 : reset이 아닌 init**

```java
int deliveryPrice;				
// 변수를 초기화(init)하지 않으면 garbage data가 변수에 저장되어 있다.
//System.out.println(deliveryPrice);

int tax = 0;	// 0 데이터로 tax변수(int형) 초깃값 지정
```

- **변수의 생명주기(life cycle), 범위(scope)**
    - 지역변수 (local variable)
    - 전역변수 (global variable)

```java
int x = 12;				// global variable 전역변수
		
if (true) {
			int y = 7;			// local variable 지역변수
			System.out.println(x);
			System.out.println(y);
			// System.out.println(z);	// error
}
if (true) {
			int z = 3;
			System.out.println(x);
			// System.out.println(y);	// error
			System.out.println(z);
}
		
System.out.println(x);
// System.out.println(y);	// error
// System.out.println(z);	// error
```

**상수 (constant)**

- 값이 변하지 않는 데이터
- final 키워드를 사용하여 만든다.
- 변경되면 안되는 데이터의 보호를 위해 사용한다.
- 특정 데이터를 의미 있는 문자로 사용하여 인식하기 쉽게 한다.

```java
// 변수
int orderQty = 1;
orderQty = 3; // 수정 가능
System.out.println(orderQty);

// 상수
final String FILE_REPOSITORY_PATH = "C:\\repo";
// FILE_REPOSITORY_PATH = "D:\\"; // 수정 불가
``` 

### 데이터 연산(처리) > operator (부호, 연산자) > 수행, 이행, 동작, 실행

**산술 연산자**

- 더하기 연산	**+**
- 빼기 연산	**-**
- 곱하기 연산	  *
- 나누기 연산     **/**
- 나머지 연산    **%**

**[중요]**

- 자바에서는 나누기 연산의 결과가 실수타입이 아니라 정수타입이다.
- 의도적으로 실수 타입으로 형변환(casting)작업을 해주어야 한다.

```java
System.out.println(10 + 3);		// 덧셈
System.out.println(10 - 3); 	// 뺄셈
System.out.println(10 * 3); 	// 곱셈
System.out.println(10 / 3); 	// 나눗셈
System.out.println(10 % 3); 	// 나머지
```

**[ 중요 ]**

- 정수 / 정수 = 정수
- 정수 / **실수** = 실수
- **실수** / 정수 = 실수
- 실수 / 실수 = 실수

- 최소 1개 이상 실수 형태의 모습을 가지고 있어야 실수 타입으로 결과를 얻을 수 있다.
- 프로그래밍 언어마다 약간씩 차이가 있다.

```java
System.out.println(10 / 3);
System.out.println(10.0 / 3);
System.out.println(10 / 3.0);
System.out.println(10.0 / 3.0);
		
System.out.println((double)10 / 3);
System.out.println(10 / (double)3);
System.out.println((double)10 / (double)3);
```

**비교 연산자**

- 좌변이 우변보다 크다    **>**
- 좌변이 우변보다 크거나 같다 **>=**
- 좌변이 우변보다 작다 **<**
- 좌변이 우변보다 작거나 같다 **<=**
- 좌변이 우변과 같다 **==**
- 좌변이 우변과 다르다 **!=**

**[ 중요 ]**

- 비교 연산자의 결과는 '항상' 참(true) 또는 거짓(false)이다.

```java
System.out.println(10 > 3);
System.out.println(10 >= 3);
System.out.println(10 < 3);
System.out.println(10 <= 3);
System.out.println(10 == 3);
System.out.println(10 != 3);
```

**논리 연산자**

- **&& (AND)** : 양쪽 모두다 참이어야 최종적으로 참(true)
- **|| (OR) : 어느 한쪽이라도 참이면 최종적으로 참(true)**
- **! (NOT)** : 부정 연산자 ( true > false , false > true )

**[ 중요 ]**

- 논리 연산자의 결과도 참(true) 또는 거짓(false)이다.

```java
System.out.println(10 == 10 && 3 == 3);
System.out.println(10 != 10 && 3 == 3);
System.out.println(10 == 10 && 3 != 3);
System.out.println(10 != 10 && 3 != 3);
		
System.out.println(10 == 10 || 3 == 3);
System.out.println(10 != 10 || 3 == 3);
System.out.println(10 == 10 || 3 != 3);
System.out.println(10 != 10 || 3 != 3);
		
System.out.println(!(10 == 10));
System.out.println(!(10 != 10));
```

- **증감 연산자**
    - 좌변에 우변의 값을 더한 후 저장	**+=**
    - 좌변에 우변의 값을 뺀 후 저장	**-=**
    - 좌변에 우변의 값을 곱한 후 저장	***=**
    - 좌변에 우변의 값을 나눈 후 저장	**/=**
    - 좌변에 우변의 값을 나눈 나머지를 저장	 **%=**
    - 변수의 값에 1을 더한 후 저장	**++**
    - 변수의 값에 1을 뺀 후 저장	**--**
    
    ```java
    int orderCnt = 3;
    orderCnt += 2;		// orderCnt = orderCnt + 2;
    System.out.println(orderCnt);
    		
    int balance = 10000;
    balance -= 3200;	// balance = balance - 3200;
    System.out.println(balance);
    		
    int totalPrice = 1000;
    totalPrice *= 7;	// totalPrice = totalPrice * 7;	 
    System.out.println(totalPrice);
    /*
    		 * (참고)
    		 * 
    		 * 변수++, ++변수
    		 * 변수--, --변수
    		 * 
    		 * - 명령어 실행순서의 차이
    		 * 
    */
    		int x = 0;
    		x++;	// x += 1;  x = x + 1;  // +1 저장 - 순서의 영향이 없음
    		System.out.println(x);
    		++x;	// +1 저장	// 순서의 영향이 없음
    		System.out.println(x);
    		
    		int y = 0;
    		System.out.println(y++);	// y 출력 후 +1 저장 // sysout 명령어를 실행 후 y를 증가
    		System.out.println(y);
    		
    		int z = 0;
    		System.out.println(++z);	// z에 +1 저장 후 출력 // z를 증가 후 sysout 명령어 실행
    		System.out.println(z);
    ```
    

- **삼항 연산자**
    
    **[ 형식 ]**
    
    조건식 ? 참일때의 결과값 : 거짓일때의 결과값
    
    ```java
    int totalGrade = 61;
    System.out.println(totalGrade >= 60 ? "합격" : "불합격");
    System.out.println(totalGrade < 60 ? "불합격" : "합격");
    
    char result = totalGrade >= 60 ? 'P' : 'F';
    System.out.println(result);
    ```
