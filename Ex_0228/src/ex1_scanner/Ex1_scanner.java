package ex1_scanner;

//Ctrl + Shift + o : import단축키
import java.util.Scanner; //고슬링아저씨가 미리 만들어 놓은 class
	// ㄴjava.util에서 만들어 둔 scanner라는 뜻
public class Ex1_scanner {
	public static void main(String[] args) {
		
		//키보드에서 직접 값을 입력받도록 하는 클래스
		Scanner sc = new Scanner(System.in);
		//sc + Ctrl + SPACEBAR : Scanner단축키(자동으로import)
		//new 띄고 Ctrl + SPACEBAR : Scanner(null)단축키
		
		System.out.print("정수 : ");
		//Scanner가 재생됐을때 사용자에게 가이드 라인을 주기위한 출력값
		int num = sc.nextInt();
				//ㄴ키보드로부터 정수 값을 받을거라는 뜻
		System.out.println("입력받은 값 : " + num);
		
		System.out.print("문장 : ");//print뒤의 ln은 엔터 개념
		String str = sc.next();  //char는 사용x
		System.out.print("입력받은 값 : " + str);
		//String타입은 오류 없이 다 받지만 문자로 받는 것이지
		//정수로 받는것이 아니다 (숫자를 입력해도 실제로는 문자이다)
		
		
		//Scanner sc2 = new Scanner(system.in);②를 추가
		//System.out.print("문장 : ");
		//String str = sc.nextLine(); → ①nextLine 사용할 경우  
		//System.out.print("입력받은 값 : " + str);
		
		
		//sc.close();
		// ㄴ스케너를 닫는 코드지만 문제가 생기는 경우가 많아 사용x 
		
	}//main
}
