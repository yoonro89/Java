package ex3_label;

public class Ex1_label_break {
	public static void main(String[] args) {
		
		//label : 가장 가까운 반복문만을 제어하는 break, continue와 달리
		//특정 반복문에 이름을 붙여서 한 번에 두 개 이상의 반복문을 제어할 수 있도록 하는 기능
		out : for( int i = 1; i <=3; i++ ) {
			
			for( int j = 1; j <=5; j++ ) {
				
				if( j % 2 == 0 ) {
					break out;
				}
				
				System.out.print(j + " ");
				
			}//inner
			
			System.out.println();
			
		}//outer
		
		System.out.println("끝");
		
		System.out.println("------------------------");
		
		lab : for( int i =0; i <= 3; i++ ) {
			
			for(int j = 1; j <= 5; j ++ ) {
			
				switch( j ) {
				case 1:
					System.out.println("나는1");
					//switch가 label을 호출하면
					//해당 반복문을 빠져나갈 수 있다
					break lab;
				case 2:
					System.out.println("나는2");
					break;
					
				}//switch
				
			}//inner
			
		}//outer
		
	}//main
}












