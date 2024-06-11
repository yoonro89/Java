package ex7_reader;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Ex3_BufferedReader {
	public static void main(String[] args) throws IOException {
		
		File f = new File("C:/java_ysy/file.txt");
		
		FileReader fr = null;
		BufferedReader br = null;
		
		try {
			
			
			fr = new FileReader(f);
			br = new BufferedReader(fr);
			
			String msg = "";
			
			while( (msg = br.readLine()) != null ) {
				System.out.println(msg);
			}
			
		} catch (Exception e) {
			// TODO: handle exception
		} finally {
			
			if(br != null) br.close();
			if(fr != null) fr.close();	
		}
		
	}//main
}
