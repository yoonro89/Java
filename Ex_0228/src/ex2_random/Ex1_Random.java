package ex2_random;

import java.util.Random;

public class Ex1_Random {
	public static void main(String[] args) {
		//난수발생 클래스 Random
		
		//12654 ~ 57128사이의 난수
		//new Random().nextInt(난수의 범위) + 시작수; ※범위임!!
		//new Random().nextInt(큰 수 - 작은 수 + 1) + 시작수; 시작수를 입력하지 않을 때는 0으로 시작한다
		int num = new Random().nextInt(57128 - 12654 + 1) + 12654;
		
		//5 ~ 9사이의 난수
		int num2 = new Random().nextInt(9 - 5 + 1) + 5;
		System.out.println(num2);
		
		System.out.println("---------");
		
		//난수로 알파벳 대문자들 중 하나를 임의로 출력
		//결과 : G
		
		int alp = new Random().nextInt( 90 - 65 + 1) + 65;
		System.out.println("결과 : " + (char)alp);
		//아스키코드를 찾아서 대입했을 경우
		
		int alpha = new Random().nextInt('Z' - 'A' + 1) + 'A';
		System.out.println("결과 : " + (char)alpha);
		//내가 아스키코드를 모르더라도 알아서 찾아서 대입해준다
		
	}//main
}
