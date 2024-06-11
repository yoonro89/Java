package ex1_file;

import java.io.File;

public class Ex3_File {
	public static void main(String[] args) {
		
		String path = "C:/java_ysy";
		File f = new File(path);
		
		if(f.isDirectory()) {
			File[] farr = f.listFiles();
			
			for(int i = 0; i < farr.length; i++) {
				if( farr[i]. isDirectory()) {
					System.out.println( farr[i].getName());
				}
			}
		
		}
		
		
	}//main
}
