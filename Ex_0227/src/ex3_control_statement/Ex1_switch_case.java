package ex3_control_statement;

public class Ex1_switch_case {
	public static void main(String[] args) {
		
		//switch-case문 : 비교값과 조건값을 통해 원하는 결과를 찾아내는 제어문;
		//			else-if와 달리 순차적 연산이 아님;
		//			속도적으로 switch가 이득이 있으나 조건을 추가할 수 없기때문에 가독성은 else-if가 좋다;
		
		//switch( 비교값 ){	※비교값:하나의 데이터
		//	case 조건값:
		//		비교값과 조건값이 일치하면 실행되는 영역
		//	break;
		//}
		
		int n = 3;
		//비교값과 조건값의 타입은 반드시 일치해야 한다;
		switch( n ) {//비교값
		case 1://조건값 : 조건값끼린 같은 값을 갖을 수 없다;
			System.out.println("1.게임시작");
			break;//switch문을 통째로 빠져나간다
			
		case 2:
			System.out.println("2.게임소개");
			break;
			
		case 3:
			System.out.println("3.게임종료");
			break;
				
		default:
			//비교값과 조건값이 한개도 일치하지 않을 때 강제로 출력되는 영역
			System.out.println("1 ~ 3까지만 입력하세요");
			break;
		}//switch
		
		
	}//main
}
