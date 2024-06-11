package ex4_work;

import java.util.Scanner;

public class Ex1_work {
	public static void main(String[] args) {
		//9월은 30일까지 있습니다
		Scanner sc = new Scanner(System.in);
		
		System.out.print("몇월? : ");
		int month = sc.nextInt();
		
		switch(month) {	//비교값
		case 1: case 3: case 5: case 7: case 8: case 10: case 12:		
			System.out.println(month + "월은 31일까지 있습니다");
			break;
//						비교값의 결과값이(각 조건값의 출력값이 같다면) case의 break를 생략하여 부피를 줄일 수 있다;
		case 2: 
			System.out.println(month + "월은 28일까지 있습니다");
			break;
		
		case 4: case 6: case 9: case 11: 
			System.out.println(month + "월은 30일까지 있습니다");
			break;
		
		default:
			System.out.println(month + "월은 존재하지 않는 달입니다");
			break;
		}
		sc.close();  //스캐너 마무리 코드 인데 에러가 생길지도 몰라 잘 쓰지 않는다.
		
	}//main
}
