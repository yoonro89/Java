package ex3_label;

public class Ex2_label_continue {
	public static void main(String[] args) {
		
		o : for( int i = 1; i <= 2; i++ ) {
			for( int j = 1; j <= 5; j++ ) {
				
				if( j % 2 == 0 ) {
					continue o;
				}
				System.out.print(j + " ");
			
			}//inner
			
			System.out.println();
			
		}//outer
		
	}//main
}








