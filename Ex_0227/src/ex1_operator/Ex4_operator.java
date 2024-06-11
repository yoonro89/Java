package ex1_operator;

public class Ex4_operator {
	public static void main(String[] args) {
		
		int a = 10;
		int b = 12;
		char res = ++a >= b || 2 + (b - 5) <= b && a+2 - b >= 0 && (a += b) - (a % b) > 10 ? 'O' : 'X';
//						f	|| 9	<= 12	  t && 13	>= 12 t	&& (23)-(11=23%12) =12>10 t? true:false; 정답 O(true);
		System.out.println("res : " + res);
		
		System.out.println("-----------------------");
		
		/*
		 과수원이 있다.
		 배, 사과, 오렌지를 키우고 있는데, 하루 생산량은 각각
		 5, 7, 5개.
		 
		 1) 과수원에서 하루에 생산되는 과일의 총 갯수를 출력
		 2) 시간당 전체 과일의 편균 생산 갯수를 출력
		 	*단, 평균값을 담을 변수는 float으로 생성할 것.
		 
		 결과---------
		 하루생산량 : 17
		 시간당평균 : 0.7083.....		 
		 */
		

		int pear = 5;
		int apple = 7;
		int orange = 5;
		int total = pear + apple + orange;
		float average = (float) total / 24;		//예외적 캐스팅
//		float average = total / 24f;
		System.out.println("하루생산량 : " + total);
		System.out.println("시간당평균 : " + average);
		
		
	}//main
}




