package ex8_work;

public class Work {
	
	public void paline( String n ) {
		int len = n.length();
		
		for(int i = 0; i < len/2; i++) {
			if(n.charAt(i) != n.charAt(len - i - 1)) {
				System.out.print(n + "은(는) 회문이 아닙니다");
				break;
			}else {
				System.out.print(n + "은(는) 회문입니다");
				break;
			}
		}
		System.out.println();
		
	}
	
	public String checkStr(String ori) {
		
		String rev = "";
		
		for(int i = ori.length()-1; i >= 0; i--) {
			
			rev += ori.charAt(i);
			
		}
		
		return rev;
		
	}
	
}










