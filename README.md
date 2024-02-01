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

### 데이터 입력

- **Scanner**
    
    콘솔에 키보드로 데이터 입력받기
    
    **[ 순서 중요 ]**
    
    1. import java.util.Scanner;	// Scanner클래스를 불러온다.
    2. Scanner scan = new Scanner([System.in](http://system.in/)); // scan 객체를 생성한다.
    3. System.out.println("#나이 입력: "); // 안내문을 작성한다.
    4. scan.nextInt(); // 키보드로 입력받는다.
    5. scan.close();
    
    ```java
    // 코드의 시작부분에서 1번만 작성
    Scanner scan = new Scanner(System.in);
    		
    System.out.print("상품 가격을 입력하세요 : ");
    int productPrice = scan.nextInt();	// 메서드를 사용해 int 타입 데이터 입력 받음
    		
    System.out.println("입력하신 상품 가격은 " + productPrice + "원 입니다.");
    System.out.println("부가세는 " + (productPrice * 0.1) + "원 입니다.");
    System.out.println("총 결제 금액은 " + (productPrice + (productPrice * 0.1))+ "입니다");
    		
    System.out.print("월급을 입력하세요: ");
    int salary = scan.nextInt();
    		
    System.out.println("입력하신 월급은 "+ salary + "원 입니다.");
    double tax = salary * 0.033;
    System.out.println("원천징수 금액은 "+ salary + "원 입니다." );
    System.out.println("실 수령액은 " + (salary - tax) + "원 입니다.");
    		
    // 코드의 맨 마지막에 한 번만 작성
    scan.close();
    ```

### 데이터 제어 > 흐름, 반복

**[흐름(분기)] > if, else, else if + switch case**

**[반복] > for (for each), while  + do while**

**[보조] > continue, break;**

 > **분기문**
 - **조건문 If 문**
    
    조건식이 true이면 실행되는 구문 ( false면 실행 x )
    
    **[ 형식 ]**
    
    **if (조건식) {**
    
    `**조건식이 true일때 실행할 명령어;**`
    
    **}**
    
    ```java
    if (true) {
    			// if문 안에 종속된 명령어는 tap으로 들여쓰기 한다. 
    			System.out.println("가상의 명령어 1");
    			System.out.println("가상의 명령어 2");
    			System.out.println("가상의 명령어 3");
    		}
    if (false) {
    			System.out.println("가상의 명령어 4");
    			System.out.println("가상의 명령어 5");
    			System.out.println("가상의 명령어 6");
    		}
    		
    int num = 2;
    		
    // if문 안에 속한 명령어가 1줄이면 {}를 생략할 수 있다.
    if (num % 2 == 0) 
    		System.out.println("짝수");
    		
    if (num % 2 == 1) 
    		System.out.println("홀수");
    ```
    
- **중첩 if 문**
    
    if문에 종속된 명령어 안에 if문이 중첩으로 사용되는 형태
    
    ```java
    int grade = 99;
    		
    if (grade >= 60) {
    		 if (grade == 100) {	// 들여쓰기 중요
    				System.out.println("만점");
    			}
    			System.out.println("합격");
    		}
    		
    if (grade < 60) {
    			System.out.println("불합격");
    		}
    ```
    

- **random library ( if와 관련 x )**
    
    **[ 사용법 ]**
    
    **Random 변수명 = new Random();**
    
    - Random객체를 생성한다. (import포함)
    - ran.nextInt(범위) 메서드를 사용하여 랜덤값을 구한다.
    
    `> nextInt(범위) '0'부터 ~ '범위-1' 사이의 난수가 생성 된다.`
    
    `> 범위의 시작은 0부터이기 때문에 시작범위가 0이 아닌 경우는 추가 작업이 필요하다.`
    
    `예시) ran.nextInt(10) + 1; > 1 ~ 10까지 범위의 난수 생성`
    
    `ran.nextInt(51) + 50; > 50 ~ 100까지 범위의 난수 생성`
    
    `ran.nextInt(21) - 10; > -10 ~ 10까지 범위의 난수 생성`
    
    - random객체는 close() 메서드를 사용하지 않는다.
    
    ```java
    // 0 ~ 9 사이의 랜덤값
    int rNum1 = ran.nextInt(10);
    System.out.println(rNum1);
    		
    // 100 ~ 200 사이의 랜덤값
    int rNum2 = ran.nextInt(101)+ 100; // [0~100] + 100  
    System.out.println(rNum2);
    		
    // -3 ~ 3 사이의 랜덤값
    int rNum3 = ran.nextInt(7)- 3;	// [0~6]- 3
    System.out.println(rNum3);
    ```
    

- **if - else 문**
    
    **[ 형식 ]**
    
    if (조건식) {
    
    `명령어;`
    
    } else {
    
    `명령어;`
    
    }
    
    - if없이 else가 단독으로 올 수 없다.
    - else를 중복해서 여러 번 사용할 수 없다.
    - if와 같은 라인에 작성한다. (들여쓰기 라인 정렬)
    - else 뒤에는 조건식을 쓸 수 없다.
    - if문과 else문 사이에는 명령어가 올 수 없다.
    
    ```java
    int finalScore = 61;
    
    if (finalScore >= 60) { // 조건식이 true일 때 실행
    			System.out.println("합격");
    	} 
    else { // if 조건식이 false일 때 실행
    			System.out.println("불합격");
    	}
    /*
     * if (finalScore < 60) { // 기능적으로는 차이는 없으나 쉽게 코드 짜는게 중요
     * System.out.println("불합격"); }
     */
    ```
    

- **if - else if 문**
    
    **[ 형식 ]**
    
    **if (조건식) {**
    
    `**명령어;**`
    
    **} else if (조건식) {**
    
    `**명령어;**`
    
    **} else if (조건식) {**
    
    `**명령어;**`
    
    **}**
    
    - else if문 조건은 '다중 택일'로 참인 조건식을 만나면
    - 이하 조건은 실행하지 않는다.
    - if없이 단독으로 사용할 수 없다.
    - else문과 같이 사용할 수 있지만 else문은 맨 아래에 위치해야 한다.
    - if문과 else if문 사이에는 명령어가 올 수 없다.
    
    ```java
    finalScore = 65;
    if (finalScore >= 90) {	// 조건식이 true일 때 실행
    			System.out.println("A");
    		}
    else if (finalScore >= 80) {	// 위 조건식이 false이며 조건식이 true일 때
    			System.out.println("B");
    		}
    else if (finalScore >= 70) {	// 위 조건식이 false이며 조건식이 true일 때
    			System.out.println("C");
    		}
    else if (finalScore >= 60) {	// 위 조건식이 false이며 조건식이 true일 때
    			System.out.println("D");
    		}
    else {		// 위의 모든 조건식이 false일 때 실행
    			System.out.println("F");
    		}
    ```
    
- **switch case**
    - if문과 다르게 범위 형태로 직접적으로 분기하지 않고 데이터를 기준으로 직접 분기한다.
    - switch 기준변수에는 정수, 문자, 문자열 자료형을 사용할 수 있다.
    - 케이스들 중 해당되는 곳이 없을때 default로 분기된다.
    
    **[ before 형식 ]**
    
    **switch (변수) {**
    
    **case 데이터:
    명령어
    break;
    case 데이터:
    명령어
    break;   		
    case 데이터:
    명령어
    break;
    default:
    명령어;
    }**
    
    - 분기 case뿐만 아니라 아래 case까지 모두 수행하여
    이러한 분기를 원치않을 경우 의도적으로 break 명령어를 작성한다.
    
    ```java
    // switch case old - version 
    		int selectMenu = 1; 	// 1, 2, 3, 4, 5
    		
    		switch (selectMenu) {	// 범위 분기 안됨
    			case 1:
    				System.out.println("1번 메뉴로 분기");
    				break;
    			case 2:
    				System.out.println("2번 메뉴로 분기");
    				break;
    			case 3:
    				System.out.println("3번 메뉴로 분기");
    				break;
    			default : 
    				System.out.println("default 메뉴로 분기");
    		}
    ```
    
    **[ after 형식 ]**
    
    **switch (변수) {**
    
    **case 데이터 -> {
    명령어
    }
    case 데이터 -> {
    명령어
    }  		
    case 데이터 -> {
    명령어
    }
    default -> {
    명령어;
    }**
    
    - 새로운 case구문에서는 :(콜론) 대신 ->(애로우 구문)을 사용하여 문법을 작성한다.
    - { }로 몸체를 만들어서 명령어를 실행하며 명령어가 1줄일 경우에는 {}를 생략할 수 있다.
    - 자동으로 break가 적용되어 각 case가 분리된다.
    
    ```java
    // switch case new - version
    		switch (selectMenu) {
    			case 1 -> {
    				System.out.println("1번 메뉴로 분기");
    			}
    			case 2 -> {
    				System.out.println("2번 메뉴로 분기");
    			}
    			case 3 -> {
    				System.out.println("3번 메뉴로 분기");
    			}
    			default -> {
    				System.out.println("default로 분기");
    			}
    ```

 > **반복문**
 - **while**
    
    **[ 형식 ]**
    
    **초기식;**
    
    **while ( 조건식 ) {**
    
    `**조건식이 참일동안 실행할 명령어;**`
    
    `**증감식;**`
    
    **}**
    
    - 반복문의 조건 3가지
    
    `1) 초기식 : 조건식을 false로 바꾸기 위한 초깃값 셋업`
    
    `2) 조건식 : 조건판별`
    
    `3) 증감식 : 조건식을 false로 바꾸기 위한 증가,감소`
    
    ```java
      	int i = 0;	// 초기식
    		
    		System.out.println("반복문 시작");
    		
    		while(i < 10) {	// 조건식이 true이면 실행 false면 반복문 밖 나감
    
    			System.out.println("명령어");
    			i++;	// 증(가)감(소)식
    			
    			}
    		System.out.println("반복문 종료");
    ```
    
- **do while**
    
    **[ 형식 ]**
    
    **do {**
    
    `**반복할 명령어;**`
    
    **} while ( 조건식 );**
    
    - while문과 do~while문의 차이점은 반복 조건의 '검사시점'이다.
        
        `( while : 반복 조건식을 먼저 검사 )`
        
        `( do~while : 일단 한번 실행한 후 반복조건을 검사 )`
        
    - while문 조건식 뒤에 ;을 잊지 않고 반드시 써주어야 한다.
    
    ```java
    	 int num = 0;
    		
    		do {	// 일단 한 번 실행하고 조건을 봄
    			System.out.println("do while 명령어");
    			num++;
    		} while (num > 0 && num < 4);
    ```
    

- **for**
    - 반복문의 조건 3가지
    
    `1) 초기식 2) 조건식 3) 증감식`
    
    **[ 형식 ]**
    
    **for (초기식; 조건식; 증감식) {**
    
    `**조건식이 참일때 반복할 명령어;**`
    
    **}**
    
    - for문의 실행 순서
        
        1)초기식
        
        2)조건식 3) 명령어 4) 증감식
        
        조건이 false가 될 때까지 2)3)4) 반복
        
    - for문 안의 생성 변수는 for문 안에서만 접근 가능하다.
    - for문도 break와 continue를 같이 사용할 수 있다.
    
    ```java
        int x = 1;					// 초기식
    		while (x <= 5) {			// 조건식
    			System.out.println(x);	// 명령어
    			x++;					// 증감식
    		}
    		
    		for (int i = 1; i <= 5; i++) { // (초기식 ; 조건식 ; 증감식)
    			System.out.println(i);	// 명령어
    	}
    		
    		// i는 for문의 지역변수
    		for (int i = 0; i < 10; i++) { // 초기식 -> 조건식 -> 명령문 -> 증감식 -> 명령문 .. 반복
    			System.out.println(i);
    			if (i == 5) {
    				break;	// for문도 보조 제어문과 함께 사용 가능
    			}
    		}
    		
    		// for + [crtl + sapcebar] > for문 생성 단축키
    ```
    
- **이중 for문** (별찍기 문제로 점검)
  
 > **보조제어문**
 - **break, continue**
    - 반복문 안에서 동작한다.
    - 반복문 안에서 반복문의 역할을 보조한다.
        
        `break : 반복문을 종료한다.`
        
        `continue : 반복문의 조건시점으로 점프한다.`
        
    
    ```java
      	int i = 0;
    		while (true) {	// while은 조건식에 true, false가 더 잘 어울림
    			if (i == 3) {	// 특정 이벤트 발생
    				break;	// 반복문 종료
    			}
    			System.out.println(i);
    			i++;
    		} // break 하면 이 밑으로 빠져나감
    		
    		System.out.println();
    		
    		i = 0;
    		while(i < 8) {	// continue 하면 다시 while 조건식으로 감
    			i++;	// if continue 앞에 있어야 계속 값이 올라감
    			if( i % 2 == 1 ) {
    				continue;	// continue가 들어간 if문은 가운데 위치하기
    			}
    			System.out.println(i);
    	}
    		
    		System.out.println();
    		
    		// continue 사용예제
    				Scanner scan = new Scanner(System.in);
    				
    				while (true) {
    					
    					System.out.println("1. 햄버거");
    					System.out.println("2. 콜라");
    					System.out.println("3. 감자");
    					
    					System.out.print("#메뉴입력 : ");
    					int getMenu = scan.nextInt();
    					
    					if (getMenu < 1 || getMenu > 3) {	// 결계 
    						System.out.println("1~3번 중에 선택하세요.\n");
    						continue;
    					}
    					
    					if      (getMenu == 1) System.out.println("입력하신 메뉴는 '햄버거' 입니다.");
    					else if (getMenu == 2) System.out.println("입력하신 메뉴는 '콜라' 입니다.");
    					else if (getMenu == 3) System.out.println("입력하신 메뉴는 '감자' 입니다.");
    					
    					System.out.print("#현금 투입 :");
    					int getMoney = scan.nextInt();
    					
    					System.out.println(getMoney + " 원이 투입 되었습니다.");
    					System.out.println(" - 구매 작업 - \n\n"); // \n : new line
    					break;
    					
    				}
    ```

    ### 배열 (array)

   
