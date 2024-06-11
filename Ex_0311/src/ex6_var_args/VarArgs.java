package ex6_var_args;

public class VarArgs {
	
	//... <-variable arguments(가변인자)
	//같은 타입의 파라미터를 개수 제한없이
	//배열 구조로 받을 수 있도록 하는 개념
	public String[] setData(String... name) {
		//반환 타입에도 		파라미터 타입에도 제한이 없다
		String[] str = new String[2];
		
//		for( String s : name ) {
//			System.out.print(s + " ");
//		}
//		System.out.println();
		
		for( int i = 0; i < name.length; i++ ) {
			System.out.print(name[i] + " ");
			str[i] = name[i];
		}
		return str;
		
		
	}
	
}
