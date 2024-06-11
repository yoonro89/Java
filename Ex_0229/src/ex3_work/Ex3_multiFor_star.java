package ex3_work;

public class Ex3_multiFor_star {
	public static void main(String[] args) {
		
		//2중 for문을 가지고 아래의 결과를 완성하시오
		
		//        *
		//      * * *
		//    * * * * *
		//  * * * * * * *
		//* * * * * * * * *
		for(int i = 1; i <= 5; i++ ) {
	
			for(int j = 1; j <= 5 - i ; j++) {
				System.out.print("  ");
			}//inner1
			//	111	121	131	141	f↓		5=f, out
			//	211	221	231	f↓			4=f, out
			//	311	321	f↓				3=f, out
			//	411	f↓					2=f, out
			//	f↓						1=f, out
			for(int j = 1; j <= 2*i - 1; j++ ) {
				System.out.print("* ");
			}//inner2
			//	-	-	-	-	141	f
			//	-	-	-	231	232	233	f
			//	-	-	321	322	323	324	325 f
			//	-	411	412	413	414	415	416	417 f
			//	5f1	5f2	5f3	5f4	5f5	5f6	5f7	5f8	5f9 f
			System.out.println();
		}//outer
		
		System.out.println("-------------------");
		
		//1234*6789
		//123***789
		//12*****89
		//1*******9
		//*********
		
		for(int i = 1, mi = 4, pl = 6; i <= 5; i++, mi--, pl++) {
			for(int j = 1; j <= 9; j++ ) {
				if( mi < j && j < pl ) {
					System.out.print("* ");
					
				}else {
					System.out.print("  ");
				}
			}System.out.println();
		}
	
		System.out.println("-------풀이--------");
		
		for( int i = 0; i < 5; i++ ){
			for(int j = 0; j < 5 + i; j++ ) {
				if( i + j > 3) {
					System.out.print("* ");
					
				}else {
					System.out.print("  ");
				}//if_else
				
			}//inner
			
			System.out.println();
			
		}//outer
		
		System.out.println("-----추가문제-------");
		//	      *
		//      * * *
		//    * * * * *
		//  * * * * * * *
		//* * * * * * * * *
		//  * * * * * * *
		//    * * * * *
		//      * * *
		//	      *
		for( int i = 0; i < 5; i++ ){
			for(int j = 0; j < 5 + i; j++ ) {
				if( i + j > 3) {
					System.out.print("* ");
					
				}else {
					System.out.print("  ");
				}//if_else
				
			}//inner
			
			System.out.println();
			
		}//outer
		//아래삼각형
		for(int i = 3; i >= 0; i-- ) {
			for(int j = 0; j < 5 + i; j++ ) {
				if(i + j > 3 ) {
					System.out.print("* ");
				}else {
					System.out.print("  ");
				}
			}//inner
			System.out.println();
		}//outer
		
		System.out.println("-------------------");
		
		for(int i = 1, mi = 4, pl = 6; i <= 5; i++, mi--, pl++) {
			for(int j = 1; j <= 9; j++ ) {
				if( mi < j && j < pl ) {
					System.out.print("* ");
					
				}else {
					System.out.print("  ");
				}//if
				
			}//inner
			System.out.println();
		}//outer
		
		for(int i = 3, mi = 1, pl = 9; i >= 0; i--, mi++, pl--) {
			for(int j = 1; j <= 9; j++ ) {
				if( mi < j && j < pl ) {
					System.out.print("* ");
					
				}else {
					System.out.print("  ");
				}//if
				
			}//inner
			System.out.println();
		}//outer
		
	}//main
	
}
