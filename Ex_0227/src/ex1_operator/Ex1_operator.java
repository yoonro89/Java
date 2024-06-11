package ex1_operator;

public class Ex1_operator {
	public static void main(String[] args) {
	
		/*
		 1.최고연산자 : .  ()
		 2.증감연산자 : ++  --
		 3.산술연산자 : +  -  *  /  %
		 4.시프트연산자 :>>  <<  >>>				*정보보안 분야에서 암호와 작업 등에서 쓰임
		 5.비교연산자 : >  <  >=  <=  == !=
		 6.비트연산자 : &  |  ||  ^   ~			*정보보안 분야에서 암호와 작업 등에서 쓰임
		 7.논리연산자 : &&  ||  !
		 8.삼항(조건)연산자 : ?  :
		 9.대입연산자 : =  *=  /=  %=  +=  -=
		 
		 한줄 주석의 단축키 : ctrl+/
		 다중 주석의 단축키 : ctrl+shift+/  ←잘 사용되지 않는다
		 */
		
		
		//산술연산자
		//4칙연산과 나머지 연산자를 가지고 있다.
		int n1 = 20;
		int n2 = 7;
		int n3 = n1 + n2;
		System.out.println("+연산 : " + n3);
		
		n3 = n1 - n2;
		System.out.println("-연산 : " + n3);
		
		n3 = n1 * n2;
		System.out.println("*연산 : " + n3);
		
		n3 = n1 / n2;			//나누기 연산자는 나누기 연산에서 '몫'을 결과 값으로 가져온다.
		System.out.println("/연산자 : " + n3);
		
		n3 = n1 % n2;			//나머지 연산자는 나누기 연산에서 '나머지'를 결과 값으로 가져온다. 
		System.out.println("%연산자 : " + n3);
		
		float b = n1 / n2;				//실수의 초기화식을 선언할 경우, 정수끼리의 연산을 먼저한 뒤에 소수가 대입되므로 기대값이 달라진다.
		float a = (float)n1 / n2;		//그러므로 예외적 캐스팅이 필요하다.
		System.out.println("n1/n2 예외적 캐스팅을 하지않은 b값 : " + b);
		System.out.println("n1/n2 예외적 캐스팅을 실행한 a값 : " + a);

		System.out.println("--------------------------------------");
		
		//대입연산자 : 특정값을 변수에 전달하여 기억시킬 때 사용하는 연산자
		int i1 = 10;
		int i2 = 7;
		i1 += i2;	//i1 = i1 + i2;
		System.out.println("+=연산자 : " + i1);
		
		i1 -= 5;	//i1 = i1 - 5;
		System.out.println("-=연산자 : " + i1);
		
		i1 %= i2;	//i1 = i1 % i2;
		System.out.println("%=연산자 : " + i1);
		
		i2 /= 3;	//i2 = i2 / 3;
		System.out.println("/=연산자 : " + i2);
		
		
	}//main
}
