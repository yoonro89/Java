package ex3_input;

import java.io.IOException;

public class Ex1_Input {
	public static void main(String[] args) {
		
		byte[] console = new byte[100];
		
		try {
			System.out.print("값 : ");
			System.in.read(console);
			
			String str = new String(console);
			System.out.println(str.trim());
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}//main
}
