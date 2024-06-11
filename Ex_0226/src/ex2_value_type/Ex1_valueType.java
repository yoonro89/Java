package ex2_value_type;

public class Ex1_valueType {

	public static void main(String[] args) {
		//main + ctrl + spacebar 메인메서드 단축키
		/*
		 다중주석 : 현재 영역 내부는 모두 주석처리된 내용이다.
		 
		 기본자료형(vlaueType)		*모든 자료형의 문자는 소문자로 기입
		 논리형 : boolean			1 bit (0과 1로 이루어짐)
		 문자형 : char			2 byte(문자마다 용량이 달라짐. ex.영어1byte 한글 2byte 일어 2byte 등)
		 정수형 : byte 			1 byte(-128 ~ 127)		*너무 작은 값이라 활용x
		 		short			2 byte(-32768 ~ 32767)	*실무에서 거의 활용x 호환성 때문에 남아있음
		 		int				4 byte(-21억 ~ 21억)		*실무에서 가장 많이 사용
		 		long			8 byte(-900경 ~ 900경)	*금융권처럼 단위가 큰 곳에서 활용
		 실수형 : float			4.x byte				*실무에서 double보다 많이 사용된다.
		 		double			8.x byte				*실수형의 디폴트값으로 설정 되어있다.
		 */
		
		/*
		 변수 : 특정 값을 저장하여 기억할 때 사용하는 식별자
		 변수 선언 규칙
		 자료형 변수명;			(선언 : 기본자료형의 8가지 중 하나의 형태를 선택)
		 변수명 = 값;			(대입 : 변수에 값을 저장)
		 자료형 변수명 = 값;	(초기화 : 선언과 대입을 한 줄로 표기한 구조)
		 ex) int a = 10;
		
		 변수 선언의 규칙
		 1) 숫자로 시작할 수 없다
		 2) _를 제회하고 특수문자를 쓸 수 없다
		 3) 한글로 이름을 짓지 않는다 
		 4) 의미있는 이름으로 짓는다(나중에 보아도 한번에 알아 볼 수 있는 변수의 이름을 짓자 ex.int apple)		
		*/
		
		//논리형(boolean) : 참(true)과 거짓(false)만을 저장하는 자료형
		boolean b;
		//int b; 중복		//하나의 main영역 안에서 자료형의 타입이 다르더라도 변수명은 다르게 지어야만 한다
		b = true;
		b = false;		//변수명의 값이 이미 정해진 상황에서 추가로 변수값을 기입할 경우 추가로 기입한 값으로 수정이 된다
		System.out.println("b : " + b);
		System.out.println("-----------------------");
		
		//문자형(char) : 홑따옴표 안에 반드시 한 글자만 저장 가능한 자료형
		//char c;
		//c = 'A';
		char c = 'A';	//변수의 값을 기입할때 =을 사용, =는 프로그래밍에선 대입의 의미
		System.out.println("c의 값 : " + c);
		
		c = 65 + 1;
		System.out.println("c의 값 : " + c);
		/*	위의 결과 값이 c의 값 : 66이 아니라 B가 되는 이유는 
			문자형(char)의 경우 두 글자를 출력할 수 없으므로 대체할 수 있는 값을 '아스키코드'에서 검색해서 출력한다
		*/
		c = '\u0041';		//유니코드를 활용한 값 대입
		System.out.println("c의 값 : " + c);
		System.out.println("----------------------------");
		
		//정수형 : 소수점을 가지고 있지 않은 자연수를 저장하는 그릇
		//byte b1 = 128; <-- byte자료형의 표현범위를 벗어나므로 오류
		byte b1 = 127;
		int i1 = 2100000000;		//정수는 기본값으로 int를 사용함
		long i2 = 2200000000L;		
		//int의 범위를 넘어서는 숫자의 경우 숫자 뒤에L을 붙여, 정수형 중에서도 long을 사용하는 것을 JVM에 알려줘야함
		
		System.out.println("b1 : " +b1);
		System.out.println("i1 : " +i1);
		System.out.println("i2 : " +i2);
		
		System.out.println("-----------------------------");
		
		//실수형 : 소수점을 가진 값을 저장하고자 할 때
		float f1 = 3.14F;			//기본값으로는 double가 지정되어있지만 실무에서는 float을 많이 사용함
		double d1 = 3.14;			//실수는 기본값으로 double을 사용함
		
		f1 = 10;
		d1 = 100;					//출력하더라도 소수점을 표기한다.
		
		System.out.println("f1 : " + f1);
		System.out.println("d1 : " + d1);
		
	}
	
	
}
