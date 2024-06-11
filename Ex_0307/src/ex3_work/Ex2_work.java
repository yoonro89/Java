package ex3_work;

import java.util.Scanner;

public class Ex2_work {
	public static void main(String[] args) {
		
		//값 : abc123
		//결과 : `~!wer
		
		//abcdefghijklmnopqrst
		//`~!@#$%^&*()-_+=|[]{
		
		//uvwxyz
		//};:,./
		
		//0123456789
		//qwertyuiop
			
		Scanner sc = new Scanner(System.in);
		System.out.print("값 : ");
		String str = sc.next();
		String result = "";
				
		char[] code = {'`','~','!','@','#','$','%','^','&','*','(',')','-','_','+','=','|','[',']','{','}',';',':',',','.','/'};
		char[] number = {'q','w','e','r','t','y','u','i','o','p'};

		for(int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
				
			if(ch >= 'a' && ch <= 'z') {
				result += code[ch - 'a'];
			}else if( ch >= '0' && ch <= '9') {
				result += number[ch - '0'];
			}
			
		}
		
		System.out.println("결과 : " + result);
		
	}//main
}
