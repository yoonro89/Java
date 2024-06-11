package ex1_operator;

public class Ex2_operator {
	public static void main(String[] args) {
		
		//비교연산자
		//변수의 값을 비교하여 참과 거짓을 판단하는 연산자;
		int n1 = 10;
		int n2 = 20;
		boolean res = n1 < n2;
		System.out.println("< : " + res);
		//프로그램 언어에서 코드의 진행은 좌에서 우로 진행되기 때문에 <는 작다로, >는 크다로 읽는다;
		
		res = n1 >= n2;		//n1 = n1 > n2;
		System.out.println(">= : " + res);
		
		res = n1 == n2;		//n1 = n1 = n2;
		System.out.println("== : " + res);
		
		res = n1 != n2;		//n1 = n1 ! n2;
		System.out.println("!= : " + res);
		
		System.out.println("-------------------------");
		
		//논리연산자 : 비교연산자를 통한 연산이 두 개 이상 필요할 때 사용;
		
		int age = 22;
		int limit = 30;
		//&&(and)연산자 : 앞과 뒤의 연산 결과가 모두 참이어야 결과값이 참으로 나온다;
		//ture && true → true
		//ture && false → false		앞의 연산이 거짓이면 뒤의 연산은 진행되지 않는다;
		//false && true → false		앞의 연산이 참이면 뒤의 연산이 진행된다;
		//false && false → false
		boolean result = limit - age <= 5 && age > 25;
//									t			f
		System.out.println("&&연산자 : " + result);
		
		result = limit - age >= 5 && (age += 1) <=25;
//									
		System.out.println("age : " + age);
		
		int i1 = 10;
		int i2 = 20;
		//||(or)연산자 : 앞과 뒤의 연산 결과가 모두 거짓이어야 결과값이 거짓으로 나온다;
//						앞의 연산이 true이면 뒤의 연산은 하지 않는다;
		//ture && true → true
		//ture && false → true		
		//false && true → true		*
		//false && false → false
		result = (i1 += 10) > 20 || i2 - 10 == 11;
		System.out.println("or연산 : " + result);
		
		//!(not)연산자 : 참은 거짓으로, 거짓은 참으로 값을 변경한다;
		System.out.println( !result );
		System.out.println(result);
		
		
	}//main
}
