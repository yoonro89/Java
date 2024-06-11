package ex3_casting;

public class Ex2_demotion {
	public static void main(String[] args) {
		
		//2.디모션 캐스팅
		// -> 작은 자료형에 큰 자료형이 대입되는 것
		
		//서로 다른 자료형 간 디모션 캐스팅
		char c = 'C';		//문자형 char의 경우 2 byte
		int n = c + 1;		//정수형 int의 경우 4 byte
		//c = n;			손실될 데이터가 있기때문에 오류가 남
		c = (char)n;		//정수형을 문자형으로 변환할 것을 개발자가 인지하고 있다고 알려주는 코드
		System.out.println(c);
		
		//같은 유형의 자료형 간 디모션 캐스팅
		float f = 5.5F;		//실수형 float의 경우 4.xx byte 
		int n2 = 0;			//정수형 int의 경우 4 byte
		//n2 = f;			손실될 데이터가 있기때문에 오류가 남
		n2 = (int)f;		//실수형을 더 작은 정수형으로 변환할 것을 개발자가 인지하고 있음을 알려주는 형태
		System.out.println(n2);
		
		
		//예외적인 캐스팅의 예
		int i1 = 10;
		int i2 = 3;
		
		//사이즈가 더 작은 int타입도 float형태로 디모션 캐스팅이 가능
		float a1 = (float)i1;	//프로모션 캐스팅 상황에서도 디모션 캐스팅처럼 기입해야하는 상황
		float a2 = (float)i2;
		System.out.println(a1);
		System.out.println(a2);
		
	}//main
}
