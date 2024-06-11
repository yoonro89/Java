package ex2_string_method;

public class Ex1_StringMethod {
	public static void main(String[] args) {
		
		//스트링의 메서드들
		//메서드란! 어떠한 작업을 수행하기 위한 명령문들의 집합
		//반복적으로 사용되는 코드를 메서드의 재활용을 통해 줄여줄 수 있다
		//모든 메서드는 소괄호()를 갖고 있다
		String name = "hong Gil Dong";
		int idx = name.length();
		System.out.println("name의 길이 : " + idx);
		//공백도 갯수에 포함된다
		
		idx = name.indexOf('o');
		System.out.println("맨 처음 o의 위치 : " + idx);
		idx = name.indexOf('z');
		System.out.printf("찾고자 하는 값이 없는 경우 %d을(를) 돌려준다\n", idx);
		
		idx = name.indexOf("Gil");
		System.out.println("Gil의 위치 : " + idx);
		
		name.lastIndexOf('o');
		System.out.println("마지막 o의 위치 : " + idx);
		
		char c = name.charAt(7);
		System.out.println("7번째 위치의 문자 : " + c);
		
		String str = name.substring(5, 7);
		System.out.println("5 ~ 7보다 하나 작은 위치의 문장 : "+ str);
		//특정 위치의 문자를 잘라낼때 사용하는 메서드
		
		String[] sArr = name.split(" ");
		System.out.println(sArr[0] + sArr[1] + sArr[2]);
		//sArr배열에 " "을 기준으로 [0][1][2]에 각각 저장하는 메서드
		
		String greet = "hello world";
		String g2 = greet.replace("world", "java");
		System.out.println("greet을 변경한 g2의 값 : " + g2);
		//문장을 교체하는 메서드
		
		String s1 = " jyh ";
		System.out.println(s1.length());
		if(s1.trim().equals("jyh")) {	//문자열의 앞뒤에 의미없는 공백을 제거
			System.out.println("값이 같다");
		}
		
		String que = "apple";
		String ans = "Apple";
		if(que.equalsIgnoreCase(ans)) {	//영어의 대소문자를 무시하는 메서드
			System.out.println("사과");
		}
		
		String number = "80";
		//숫자 형태의 문자열을 실제 숫자로 변경해주는 메서드
		int num = Integer.parseInt(number);//
		System.out.println(num + 1);
		
		//기본자료형의 wrapper클래스들
		//int - Integer
		//char - CHaracter
		//boolean - Boolean
		//byte - Byte
		//short - Short
		//long - Long
		//float - Float
		//double - Double
		
	}//main
}
