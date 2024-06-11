package ex3_control_statement;

public class Ex3_switch_case {
	public static void main(String[] args) {
		
		//Switch문에서 사용가능한 비교값의 타입
		//정수(byte, short, int)	※long은 사용x
		//문자(char)
		//문자열(String)
		
		String lastName = "김해김씨";
		
		switch ( lastName ) {
		case "김해김씨":
			System.out.println("412만명");
			break;	//앞쪽 케이스문에 break를 쓰지 않더라도 오류가 나지는 않지만 다음 break를 만나야만 출력이된다. 
		case "경주김씨":
			System.out.println("173만명");
			break;	//↖앞쪽break가 누락 또는 생략된 경우 break가 존재하는 case까지의 결과값이 모두 출력된다.
		case "광산김씨":
			System.out.println("83만명");
			break; //
		default:
			System.out.println("죄송합니다. 데이터가 없습니다");
			break;
		}
		
	}//main
}
