package ex3_formatter;

public class Ex1_formatter {
	public static void main(String[] args) {
		
		//저의 나이는 23 입니다
		int age = 23;
		System.out.println("저의 나이는 " + age + "입니다");
		System.out.printf("저의 나이는 %d 입니다\n", age);
		System.out.println("!");
		//printf는 줄바꿈을 지원하지 않는다
		//printf("문장\n") : 줄바꿈을 위해 문장 끝에 \n을 붙여 준다 
		
		//나는 23세 이고 형은 25세 입니다
		System.out.printf("나는 %d세 이고, 형은 %d세 입니다\n", 23, 25);
		
		//나의 성적은 B입니다
		char sj = 'B';
		System.out.printf("나의 성적은 %c입니다\n", sj);
		
		//참은 true, 거짓은 false다
		System.out.printf("참은 %b, 거짓은 %b다\n", true, false);
		
		//오늘의 기온은 2.1도 입니다
		float temp = 2.1f;
		System.out.printf("오늘의 기온은 %f도 입니다 \n", temp);
		System.out.printf("오늘의 기온은 %.1f도 입니다 \n", temp);
		// .1 : 소수점 뒤의 첫째(1)자리까지 출력 (※1이하는 반올림이 됨) 
		
		//내 이름은 홍길동이야
		String name = "홍길동";
		System.out.printf("내 이름은 %s이야\n", name);
		
		//2월 1일과 28일
		System.out.printf("2월 %02d일과 %d일\n", 1, 28);
		
		//나는 상위 10%야
		System.out.printf("나는 상위 %d%%야\n", 1, 28);
		
		//포멧의 종류
		//%d : 정수
		//%c : 문자
		//%b : 논리(boolean)
		//%f : 실수
		//%s : 문장(String)
		//%% : %기호(숫자 뒤에 %를 넣고 싶을 때 )
		
		System.out.println("가\t나\t다\t라");
		System.out.println("홍길동\t김길동");
		
		
		//escape코드
		//문자열 안에서 특정한 기능으 ㄹ가능하게 하는 키워드
		// \n : 개행(줄바꿈)
		// \"내용\" : 내용을 ""로 포장 (문장을 출력할때 이미 ""를 사용했기 때문에) 
		// \t : tab키 누른 만큼의 간격을 확보
		
		/*
		단축키 tip
		(Ctrl + Alt )누른 상태 + 방향키(↓) : 커서가 존재하는 행 복사
		(Alt)누른 상태 + 방향키(↑,↓) : 커서가 존재하는 행 이동
		Ctrl + d : 커서가 존재하는 행 삭제
		*/
		
		
	}//main
}
