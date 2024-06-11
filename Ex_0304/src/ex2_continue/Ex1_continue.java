package ex2_continue;

public class Ex1_continue {
	public static void main(String[] args) {
		
		//continue문 : 반복문 내에서 특정코드를 건너뛰고자 할 때 사용하는 키워드
		
		for( int i = 1; i <= 2; i++ ) {
			
			for( int j = 1; j <=5; j++ ) {
				
				if( j % 2 == 0 ) {
					//가장 가까운 반복문이 for문이라면 증감식으로 건너뛴다
					continue;
				}//if
				
				System.out.print(j + " " );
				
			}//inner
			
			System.out.println();
			
		}//outer
		
		System.out.println("-----------------------");
		
		for(int i = 1; i <= 2; i ++ ) {
			
			for( int j = 1; j <=5; ) {
				j++;
				
				if( j % 2 == 0 ) {
					//for문에 증감식이 없을 때
					//continue를 만나면 건너뛰어서 조건식으로 간다
					continue;
				}
				
				System.out.print(j + " ");
				
			}//inner
			
			System.out.println();
			
		}//outer
		
		System.out.println("-----------------------");
		
		for( int i = 1; i <= 5; i++) {
			
			switch( i ) {
			case 2:
				//switch문이 반복문 안에 있다면
				//break;대신 continue;를 사용할 수 있다
				continue;
				
			case 4:
				continue;
			
			}//switch
			
			System.out.println(i);
			
		}//for
		
		System.out.println("-----------------------");
		
		int n = 0;
		
		while( n < 5 ) {
			n++;
			
			if( n % 2 == 0 ) {
				//while내의 continue는 
				//while문의 조건식으로 건너뛴다
				continue;
			}
			
			System.out.println(n);
		}
		
	}//main
}














