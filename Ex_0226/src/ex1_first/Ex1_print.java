package ex1_first;

public class Ex1_print {
	//주석 : 컴파일러는 인지하지 못하는 간단한 메모등을 작성하기 위한 코드
	public static void main(String[] args) {
		//main메서드 : 프로그램 실행시 가장 먼저 호출되는 영역
		
		System.out.println("안녕하세요");
		//System.out.println();는 출력코드이며 ;은 마침표 역할을 함. ※출력전에 반드시 저장
		//저장ctrl+s, 출력ctrl+F11
		System.out.println(100);
		System.out.println(100 + 10);
		System.out.println(50 - 15);
		System.out.println("hi " + 10);
		System.out.println("2 + 2 = " + 4);
		System.out.println("2 + 2 = " + 2 + 2);
		//쌍따옴표 뒤에 오는 +는 이어붙이는 형식이므로 연산이 이루어지지 않음.
		//쌍따옴표 뒤에 오는 괄호 안의 +는 연산이 이루어짐.
		System.out.println("2 + 2 = " + (2 + 2) );
		//우선순위 확보와 연산 적용을 위해 괄호를 활용한다.
		System.out.println("hello : "+ 10 * 2);
		//쌍따옴표 뒤에 '-'는 넣을 수 없다.
		//쌍따옴표 뒤에 *의 경우 별도의 괄호 없이도 연산이 이루어진다.
		System.out.println(1 + 1 +"1" + 1 +1);
		//쌍따옴표 뒤의 +기호는 '더한다'가 아닌 '이어붙인다'의 용도로 사용됨.
		
		
		
		
		
		
	
	
	}
	
}
