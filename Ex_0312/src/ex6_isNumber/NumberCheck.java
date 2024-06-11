package ex6_isNumber;

public class NumberCheck {
	
	public boolean check(String n){
		//메인에서 받아온 문자열이 모두 숫자로만 이루어져 있는지 판단
		int cnt = 0;
		
		for(int i = 0; i < n.length(); i++) {
			char c = n.charAt(i);
			if(c < '0' || c < '9') {
				return false;
			}
		}	
		return true;
		
		}
	
}
