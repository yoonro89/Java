package ex1_single_array;

public class Ex3_array {
	public static void main(String[] args) {
		
		char[] ch = new char[4];		//문자 형태의 배열 ch = 새 방 4개;
		ch[0] = 'J';	//1번방 
		ch[1] = 'A';	//2번방
		ch[2] = 'V';	//3번방
		ch[3] = 'A';	//4번방
//		ch[4] = '!';	선언된 방의 갯수를 초과할 수 없다(오류)
		
		char[] chArr = {'J', 'A', 'V', 'A'}; //한번에 출력하는 경우
		//JAVA로 출력해보시오
		
		for(int i = 0; i < chArr.length; i++ ) {
			System.out.print(chArr[i] );
		}
		System.out.println();
		System.out.println("------------");
		
		//개선된 for문(향상된 루프...)
		for( char c : chArr ) {		//처음 부터 끝까지 모든 방의 값을 대상으로 설정하기 때문에
			System.out.print(c);	//특정 방부터 시작하는 것이 불가능하다
		}
		
		
	}//main
}
