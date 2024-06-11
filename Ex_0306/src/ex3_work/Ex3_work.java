package ex3_work;

import java.util.Scanner;

public class Ex3_work {
	public static void main(String[] args) {
		
		//학생들의 수학, 영어성적을 등록하고 출력하는 프로그램을 제작
		//ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
		//등록할 인원 수 : 2
		//이름 : hong
		//수학 : 90
		//영어 : 87
		//-----------
		//이름 : kim
		//수학 : 70
		//영어 : 100
		//-----------
		//2명 등록 완료
		//hong	90	87
		//kim	70	100
		
		Scanner sc = new Scanner(System.in);
		System.out.print("등록할 인원 수 : ");
		int number = sc.nextInt();
//		
//		String[][] input = new String[number][3];
//		for(int i = 0; i < input.length; i++) {
//			
//			System.out.print("이름 : ");
//			input[i][0] = sc.next();
//			System.out.print("수학 : ");
//			input[i][1] = sc.next();
//			System.out.print("영어 : ");
//			input[i][2] = sc.next();
//			 
//			System.out.println("---------------");
//		}
		
		String[] info = {"이름", "수학", "영어"};
		String[][] input = new String[number][info.length];
		
		//값을 입력받아 stu배열에 저장
		for(int i = 0; i < input.length; i++) {
			for(int j = 0; j < input[i].length; j++) {
				
				System.out.printf("%s : ", info[j]);
				input[i][j] = sc.next();
				
			}
			System.out.println("-----------------");
		}
		
		System.out.println(number + "명 등록 완료");
		
		for(int i = 0; i < input.length; i++) {
			
			for(int j = 0; j < input[i].length; j++) {
				
				System.out.print(input[i][j] + "\t");
			
			}
			
			System.out.println();
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}//main
}
