package ex2_control_statement;

public class Ex3_else_if {
	public static void main(String[] args) {
		
		//else-if : 여러개의 조건비교가 필요할 때 사용
		int num = 75;
		String res = "";
		
		if( num >= 90 ) {				//조건식1
			res = "A";		
		}else if ( num >= 80 ) {		//조건식2
			res = "B";			
		}else if ( num >= 70 ) {		//조건식3
			res = "C";					//else-if의 조건식중 중간의 결과값이 참이면 if조건식을 빠져나가서 결과값을 출력;
		}else if ( num >= 60 ) {		//조건식4
			res = "D";
		}else {							//위의 모든 조건이 거짓일 때 강제로 호출되는 영역					
			res = "F";
		}
		
		System.out.println(res);
		
	}//main
}







