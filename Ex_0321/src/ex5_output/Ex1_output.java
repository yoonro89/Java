package ex5_output;

import java.io.PrintStream;

public class Ex1_output {
	public static void main(String[] args) {
		
		//PrintStream은 OutputStream의 대표적인 자식클래스로서
		//화면에 데이터를 출력하도록 하는 클래스
		PrintStream ps = null;
		ps = System.out;
		
		int first = 'A';
		ps.write(first);
		ps.write('B');
		ps.write('\n');
		ps.write('C');
		
		ps.close();
		
	}//main
}
