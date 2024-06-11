package ex2_array_work;

import java.util.Scanner;

public class Ex5_work {
	public static void main(String[] args) {
		
		//배열의 크기를 결정할 값을 입력받고, 배열의 크기만큼 모든 index에
		//키보드에서 입력받은 정수를 채워넣는다.
		//최종적으로 완료된 배열안에서 홀수와 짝수의 갯수를 찾아 출력.
		//---------------------------------
		//배열의 크기 : 5
		//정수입력 : 7
		//정수입력 : 3
		//정수입력 : 2
		//정수입력 : 11
		//정수입력 : 20
		//-------------
		//홀수의 갯수 : 3
		//짝수의 갯수 : 2
		
		Scanner sc = new Scanner(System.in);
		System.out.print("배열의 크기 : ");
		int size = sc.nextInt();
		
		int[] numbers = new int[size];
		
		//만들어진 numbers배열에 정수들 추가
		for(int i = 0; i < numbers.length; i++) { //size로 대체 가능
			System.out.print("정수입력 : ");
			numbers[i] = sc.nextInt();
		}
		
		System.out.println("------------");
		
		//홀수 및 짝수 갯수 판별
		
		int odd = 0; //홀
		int even = 0;//짝
		
		for(int i : numbers ) {
			if( i % 2 == 0) {
				even++;
			}else {
				odd++;
			}
		}
		System.out.println("홀수의 갯수 : " + odd );
		System.out.println("짝수의 갯수 : " + even );
		
		
	
		
	}//main
}
