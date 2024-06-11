package ex2_array_work;

import java.util.Random;

public class Ex8_work {
	public static void main(String[] args) {
		
		//변수 money를 만들고 10 ~ 5000사이의 난수를 넣는다
		//단, 발생된 난수는 3450, 2100과 같이 1의 자리가 반드시 0이어야 한다
		//발생한 난수 money를 동전으로 바꾸면
		//500, 100, 50, 10원짜리 동전이 각각 몇개씩 필요한지 출력
		//가능한한 적은 수의 동전을 사용하도록 한다
		//------------결과-------------
		//금액 : 2590       <랜덤값
		//500원 : 5
		//100원 : 0
		//50원 : 1
		//10원 : 4
		
		int[] coin = {500, 100, 50, 10};
		int money = new Random().nextInt(500)+1;
		money *= 10;

		System.out.println("금액 : " + money);
		
		for( int i = 0; i < coin.length; i++) {
			
			int res = money / coin[i];
			if( res > 0 ) {
				System.out.println(coin[i] + "원 : " + res);
				money %= coin[i];
			}
			
		}
		
		
	}//main
}
