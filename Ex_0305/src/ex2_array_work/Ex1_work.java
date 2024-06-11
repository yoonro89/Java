package ex2_array_work;

import java.util.Scanner;

public class Ex1_work {
	public static void main(String[] args) {
		
		//배열의 길이 : 5
		//ABCDE
		
		Scanner sc = new Scanner(System.in);
		System.out.print("배열의 길이 : ");
		int n = sc.nextInt();
		
		char[] c = new char[n]; //char 형태의 배열명 c = n개의 배열;  
		char alpha = 'A';		//char 형태의 배열명 alpha = 'A';
		
		for(int i = 0; i < c.length; i++ ) {
			//c[i] = alpha++;					//배열명 c의[i번째방]=alpha가 증가한값
			//System.out.print(c[i]);			//i=0이고 alpha='A'가 1번방, .... 
			System.out.print(c[i] = alpha++ );	//위와 결과는 같다
		}
		System.out.println();
		System.out.println("---String배열의 초기값---");
		String[]sArr = new String[2];
		sArr[0] = null;		//아무것도 없는 것
		sArr[1] = "";		//빈값을 넣어 놓은 것
		
		System.out.println("null로 초기화 : " + sArr[0]);
		System.out.println("빈 값(\"\")으로 초기화 : " + sArr[1]);
				
		String a = null; 		//초기화를 할때 null;을 넣을 경우 
		a += "안녕";				//a에 붙여질때 
		System.out.println(a);	//null안녕이 된다 그러므로 초기값을 null말고 ""로 한다
		
	}//main
}
