package ex2_control_statement;

public class Ex2_if_else {
	public static void main(String[] args) {
		
		//if-else : 조건이 참일때만 결과를 만들어 낼 수 있는 if문과는 달리
		//조건이 참일때와 거짓일때를 모두 커버할 수 있는 제어문
		
		//if( 조건식 ){
		//	조건식이 참일때 수행하는 영역
		//}else{
		//	조건식이 거짓일 때 수행하는 영역
		//}
		
		char gender = '여';
		
		if( gender == '남') {
			System.out.println("남자 화장실로 가시오");		//조건식이 참일때 접근하는 영역
			
		}else {
			System.out.println("여자 화장실로 가시오");		//조건식이 거짓일 때 반드시 수행되는 영역
		}
		
		System.out.println("-------------------");
		
		int age = 20;
		String str = "";
		
		if(age >= 20) {
			str = "합격";
			
		}else{	
			str = "불합격";	
		}
		
		System.out.println(str);
		
		System.out.println("-------------------");
		
		//age변수에 나이를 대입하고
		//height변수에 키를 대입
		//나이가 15살 이상이면서 키가 150이상이면
		//'롤러코스터 탑승가능'
		//그렇지 않다면
		//'롤러코스터 타지말고 회전목마나 타시지'
		age = 15;
		int height = 150;
		String announce = "";
		
		if ( age >= 15 && height >= 150 )
			{ announce = "롤러코스터 탑승가능"; }
		else 
			{ announce = "롤러코스터 타지말고 회전목마나 타시지"; }
		System.out.println(announce);
		
		System.out.println("-------------------------------");
		
		
		//위의 회전목마 코드를 삼항연산자로 변경하시오
		age = 15;
		height = 150;
		announce = age >= 15 && height >= 150 ? "롤러코스터 탑승가능" : "롤러코스터 타지말고 회전목마나 타시지";
		System.out.println(announce);
		
		
		
	}//main
}
