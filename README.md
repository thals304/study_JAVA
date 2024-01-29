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

## 📖 Study

### 01 - JAVA

> **데이터 출력**

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
    5)   %.1f : 소수점 1자리 까지 출력(반올림)
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

