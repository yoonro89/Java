package ex4_work;

public class Ex2_work {
	public static void main(String[] args) {

		// 10 + 5 = 15

		int su1 = 18;
		int su2 = 5;
		String op = "+";

		switch (op) { // switch의 비교값은 제시된 변수들 중에서 값이 가장 작은 변수가 와야한다;
		case "+":
//			System.out.println(su1 + " + " + su2 + " = " + (su1 + su2));
			System.out.printf("%d + %d = %d\n", su1, su2, su1+su2);
			break;
		case "-":
			System.out.println(su1 + " - " + su2 + " = " + (su1 - su2));
			break;
		case "*":
			System.out.println(su1 + " * " + su2 + " = " + (su1 * su2));
			break;
		case "/":
			System.out.println(su1 + " / " + su2 + " = " + (su1 / su2));
			break;
		default:
			System.out.println("은(는) 지원하지 않는 연산작업이거나 올바른 연산기호가 아닙니다.");
			break;
			//										라인정렬 단축키 ctrl+shift+F, 전체선택(ctrl+A) 후 ctrl+i  
		}// switch

	}// main
}
