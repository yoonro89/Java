package ex3_control_statement;

public class Ex2_switch_case {
	public static void main(String[] args) {
		
		char sungjuck = 'A';
		
		switch(sungjuck) {
		case 'A':
			System.out.println("90 ~ 100");
			break;
		case 'B':
			System.out.println("80 ~ 89");
			break;
		case 'C':
			System.out.println("70 ~ 79");
			break;
		case 'D':
			System.out.println("60 ~ 69");
			break;
		case 'F':
			System.out.println("59점 이하");
		default://←를 무조건 써야하는 것은 아니지만 종종 사용한다;
			System.out.println(sungjuck + "은 존재하지 않습니다");
			break;
		}
		
		
	}//main
}
