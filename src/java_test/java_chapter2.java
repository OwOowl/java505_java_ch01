package java_test;

public class java_chapter2 {

	public static void main(String[] args) {
		System.out.println("정상 실행");
		
	// 여러가지 데이터 타입으로 변수 선언
		// 기본 타입 : boolean(논리형), char(문자형), byte, short, int(기본값, 정수형),
		// long, float(실수형), double(기본값, 실수형) 
		// 레퍼런스 타입 : class, array, String(문자열형)
		
		boolean flagA = true;
		boolean flagB = false;
		System.out.println(flagA);
		System.out.println(flagB);
		
		// 문자 1글자만 저장. ''로 감싸져 있음
		char charA = 'A';
		char charB = 'B';
		System.out.println(charA);
		System.out.println(charB);
		charA = '한';
		System.out.println(charA);
		charB = '\uae00'; // '글'의 유니코드 값
		System.out.println(charB);
		
		
		byte byteA = -100;
		short shortA = -100;
		int intA = -100;
		long longA = -100L; // long타입이 정수의 기본 데이터 타입인 int형 보다 크기가 크기때문에
							// 데이터를 저장 할 경우 int형과의 구분을 위해서 데이터 뒤에 L표시
		System.out.println(byteA);
		System.out.println(shortA);
		System.out.println(intA);
		System.out.println(longA);
		
		float floatA = 3.14F; // float타입은 실수의 기본데이터 타입인 double형과 구분하기 위해
							  // 데이터 뒤에 F표시
		double doubleA = 3.14;
		System.out.println(floatA);
		System.out.println(doubleA);
		
		// String : 레퍼런스 타입의 데이터 타입. ""로 감싸면 모두 문자열.
		// 문자열을 저장하기 위한 데이터 타입으로 아주 많이 사용되기 때문에 기본 타입처럼 사용 가능 (기본형은 아님)
		// 이스케이프(\)문자와 함께 사용 할 수 있음
		// '+'기호를 사용하여 문자열 연산(연결)이 가능
		String strA = "문자열 데이터 타입";
		String strB = "문자열을 저장하기 위한 클래스 타입";
		String strC = "편의를 위해서 기본 데이터 타입처럼 사용함";
		System.out.println(strA);
		System.out.println(strB);
		System.out.println(strC);
		
		// 이스케이프 문자 : 문자열 내에서 특수한 기능을 사용하기 위한 문자
		// \n, \t, \", \', \\
		// \n : 줄바꿈 기호
		// \t : 탭을 사용한것과 동일한 효과
		// \" : 문자열 내에서 "를 표시하기 위한 기호
		// \' : 문자열 내에서 '를 표시하기 위한 기호
		// \\ : 문자열 내에서 \를 표시하기 위한 기호
		
		String str1= "이스케이프\n 문자\t\t 사용하기";
		System.out.println(str1);
		
		System.out.println("문자열 내에서 '작은' '따옴표' 출력");
		// 문자열은 ""로 감싸고, 문자는 ''로 감싸여진 것
		// 문자로서의 작은 따옴표를 저장/출력하고자 할 경우 \'를 사용
		char char1 = '\'';
		System.out.println(char1);
		
		// 문자로서의 큰 따옴표를 저장/출력하고자 할 경우 \"를 사용
		System.out.println("\"");
		char char2 = '\"';
		System.out.println(char2);
		
		// 문자로서의 역슬래쉬를 저장/출력하고자 할 경우 \\를 사용
		System.out.println("문자로써의 \\를 출력");
		
		String strOri = new String("원래는 이렇게 사용");
		System.out.println(strOri);
		String strCur = "그냥 이렇게 사용";
		System.out.println(strCur);
	}

}
