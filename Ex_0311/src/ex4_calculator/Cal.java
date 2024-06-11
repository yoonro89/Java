package ex4_calculator;

public class Cal {
	
	public int getResult( int n1, int n2, String oper ){
		
		switch(oper) {
		case"+": 
			return n1 + n2;
		case"-":
			return n1 - n2;
		case"*": 	
			return n1 * n2;
		case"/": 
			return n1 / n2;
		default:
			return -1;
		}
	}
	
	
}
