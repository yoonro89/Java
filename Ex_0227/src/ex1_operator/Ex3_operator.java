package ex1_operator;

public class Ex3_operator {
	public static void main(String[] args) {
		
		//증감연산자
		//1씩 증가시키거나 1씨 감소시키는 연산자
		//선행증감과 후행증감의 차이점을 구별할 줄 알아야 한다
		int a = 10;
		System.out.println("a : " + ++a);
			//변수의 앞에 ++가 붙어 있으면 '선행증감연산자' : 곧 바로 연산에 적용; (현재 쓰인 출력코드에 반영)
		int b = 10;
		System.out.println("b : " + b++);
			//변수의 뒤에 ++가 붙어 있으면 '후행증감연산자' : 곧 바로 연산이 적용x (현재 쓰인 출력코드에 반영x)
		System.out.println(b);						//(이후의 출력코드부터 반영된것을 확인할 수 있다;)
		
		b++;
		--b;
		--b;
		++b;
		b--;
		++b;
		b++;
		System.out.println(b--);		//12 이후에 11
		System.out.println("↑는 b--값, 이후에 --가 적용된 값 → " +b);
		
		System.out.println("----------------------");
		
		//삼항(조건)연산자 : 하나의 조건식을 주고, 
//						그 결과가 참일때와 거짓일때에 따라 원하는 형태의 값을 얻어내고자 할 때 사용하는 연산자
//						삼항연산자를 사용할 경우 뒤의 결과값에 따라 사용하는 자료형의 형태가 정해진다;
		a = 10;
		b = 15;
		int res = ++a >= b ? 10 : 50;
//						f  ?  t :  f;
		System.out.println("res : " + res);
		
		int n1 = 10;
		int n2 = 20;
		char res2 = ( n1 += n1 ) == n2 ? 'A' : 'B';
//					20=n1=n1+n1 ==20=n2? true:false; 
		System.out.println("res2 :" + res2 );
		
	}//main
}






