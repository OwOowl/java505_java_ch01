package java_test;

public class Hello {

	public static void main(String[] args) {
		//System.out.println("hello world");
		/* System.out.println("한글로 입력해도 됨");
		System.out.println("주석 사용 전에 글자 표시"); */
		System.out.println("주석 밖에 있는 글자");
		
	// 변수 선언하기
		int a = 10; //변수 선언과 동시에 데이터 저장
		char b = 'B';
		int c; // 변수 선언 후 데이터 나중에 저장
		c = 20;
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		
		a = 100; // 변수 당 1개의 데이터만 저장
		System.out.println(a);
		
		int d, e, f;
		d = 10;
		e = 20;
		f = 30;
		System.out.println(d);
		System.out.println(e);
		System.out.println(f);
		
/*		int name; 			//정상
		char student_ID; 	// 정상. 특수문자 _, $는 사용 가능
		int $func;			// $는 이름으로 사용 가능. 단, 맨앞의 특수기호는 자제할 것 
		int Monster3;		// 정상. 숫자 사용 가능(맨앞에는 불가능)
		int whatsYourNameMyNameIsKitae; // 길이 제한 없음
		int Apple;
		int apple;
		int aPple;			// 대소문자 구분.
		int 애플;			// 이왕이면 영문자로 설정.
		
		int 3Chapter;		// 불가능. 숫자가 이름의 가장 앞에 존재
		int if;				// 불가능. 자바 키워드에 등록된 문자
		char false;			// 불가능. 자바 키워드에 등록된 문자
		int null;			// 불가능. 자바 키워드에 등록된 문자 
		int %calc;			// 불가능. 이름에 특수기호 사용 */
		
	// 카멜 명명법
		// 주로 자바, 자바스크립트에서 많이 사용되고 있는 이름 작성법
		// 변수, 메서드, 클래스 등의 이름 생성 시 사용하는 이름 작성법
		// 여러개의 단어로 이루어진 이름 생성 시 첫 단어 소문자, 이후의단어 첫글자 대문자
		// 상수 : 모두 대문자
		// 클래스 : 첫글자 대문자, 나머지 소문자
		 String helloWorld = "helloWorld";
		 String leagueOfLegend = "League of Legend";
		
		
		
		
	}

}
