package ex4_work;

public class Ex3_work {
	public static void main(String[] args) {

		/*
		  윤년 구하기;
		  1)연도가 4로 나누어 떨어져야 함
		  2)연도가 100으로 나눠 떨어지면 평년
		  	→ 연도가 4로 나눠지더라도 100으로도 함께 나눠지면 평년 
		  3)연도가 100으로 나눠 떨어지더라도 400으로 나누어 떨어지는 연도는 윤년
		  
		  결과----- 
		  2024년은 윤년입니다
		 */
		int year = 2023;
		String wy = "";

		if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
			wy = year + "은(는) 윤년 입니다";

		} else {
			wy = year + "은(는) 평년 입니다";
		}
		System.out.println(wy);

	}// main
}
