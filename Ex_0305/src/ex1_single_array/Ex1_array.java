package ex1_single_array;

public class Ex1_array {
	public static void main(String[] args) {
	
		//배열 : '같은 자료형끼리 모아둔 하나의 묶음'
		//효율적인 자료관리를 위해 반드시 필요!!
		
		int su1 = 100;
		int su2 = 200;
		int su3 = 300;
		int su4 = 400;
		System.out.println(su1);
		System.out.println(su2);
		System.out.println(su3);
		System.out.println(su4);
		
		System.out.println("--------------");
		
		//위의 코드를 배열을 이용하여 생성해 보자
		//1) 배열 선언
		int[] su; //int[][][] : 대괄호의 갯수마다 '몇'차원 배열
		
		//2) 배열 생성
		su = new int[4];	//최초 생성한 배열의 방은 중간에 임의로 가감할 수 없다
		
		//3) 배열의 초기화
		su[0] = 100;
		su[1] = 200;
		su[2] = 300;
		su[3] = 400;
//		su[4] = 500;	배열의 존재하지 않는 인덱스로 접근하는 것은 불가능
		
		//4) 출력
		System.out.println( su[0] );
		System.out.println( su[1] );
		System.out.println( su[2] );
		System.out.println( su[3] );
		
		System.out.println("--------------");
		//1차원 배열에 존재하는 모든 값을 다 보고 싶을 경우 단일 for문을 이용 (cf. 2차원배열:2중 for문... )
		for( int i = 0; i < su.length; i++ ) {	//su.length : 미리 생성한 방의 갯수
			System.out.println( su[i] );
		}//for
		
		System.out.println("----------------");
		
		int[] num = new int[3];
		//num[0] = 10;
		//...
		//num[2] = 30;
		
		for(int i = 0; i < num.length; i++) {
			num[i] = ( i + 1 ) *10;
			System.out.println( num[i] );
		}
		
		
		
		
		//메모리 영역 : 자바 프로그램을 실행하게 되면 JVM은 OS로 부터 메모리를 할당 받는다;
		//				할당 받은 메모리를 자바 프로그램에 맞게 여러개 영역으로 나누어 사용하게 된다;
		//				JVM의 메모리는 크게 3가지( heap, stack, static(method) )
		//heap	: new를 사용해 객체를 생성할 때 저장;
		//		참조형 데이터 타입이 저장(String, 배열array, enum, class, interface, object)
		//stack : 메서드 내부의 기본 자료형에 해당하는 변수 적재;
		//		기본 자료형, 지역변수, 매개변수가 저장되는 메모리;
		//
		
	}//main
}
