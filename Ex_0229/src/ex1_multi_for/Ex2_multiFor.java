package ex1_multi_for;

import java.util.Iterator;

public class Ex2_multiFor {
	public static void main(String[] args) {
		
		//01 02 03 04
		//05 06 07 08
		//09 10 11 12
		
		int cnt = 0;
		
		for(int i = 1; i <= 3; i++ ) {
			for(int j = 1; j <= 4; j++ ) {
				System.out.printf("%02d ", ++cnt);
			}//inner
			System.out.println();
		}//outer

		System.out.println("-------------------------");
		
		
		//A B C D 
		//E F G H
		//I J K L
		
		char gg = 'A';
		
		for(int i = 1; i <= 3; i++) {
			for(int j = 0; j <= 3; j++ ) {
				System.out.printf("%c ", gg++);
				
			}
			System.out.println();
		}
		//아스키코드 활용
		int ch = 65;
		
		for( int i = 1; i <= 3; i++ ) {
			for( int j = 1; j <= 4; j++ ) {
				System.out.print(ch++ + " ");
				
			}System.out.println();
		}
		
		
	}//main
	
}
