package ex7_work;

import java.util.Random;

public class Scramble {
	
	private String shake;//정답을 섞어서 저장할 변수
	private String str;//랜덤으로 골라진 정답
	
	public Scramble(String[] strArr) {
		shake = "";
		int idx = new Random().nextInt(strArr.length);
		str = strArr[idx];
		
	}
	
	public String getAnswer() {
		return str;
	}
	
	//정답을 섞어서 문제로 반환
	public String getScrambled() {
		
		//정답문장을 문자 단위로 끊어서 배열에 저장
		int[] inArr = new int[str.length()];
		
		//만들어진 inArr배열에 중복되지 않는 난수를 집어넣기
		outer : for(int i = 0; i < inArr.length;) {
			
			inArr[i] = new Random().nextInt(str.length());
			
			//중복체크
			for(int j = 0; j < i; j++) {
				if( inArr[i] == inArr[j]) {
					continue outer;
				}
				
			}//inner
			i++;
			
		}//outer
		
		for(int i = 0; i < str.length(); i++ ) {
			shake += str.charAt(inArr[i]);
		}
		
		return shake;
		
		
	}//get()
	
	
}
