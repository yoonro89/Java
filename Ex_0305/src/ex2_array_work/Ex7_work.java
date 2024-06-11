package ex2_array_work;

import java.util.Scanner;

public class Ex7_work {
	public static void main(String[] args) {
		
		//키보드에서 입력받은 값 만큼의 배열을 생성하고
		//학생들의 성적을 입력 받는다
		//입력된 모든 학생들을 기반으로 평균성적 이상인 학생들의 목록과
		//평균이상인 학생들의 수를 출력
		//----------결과----------
		//학생 수 : 3
		//학생1의 성적 : 90
		//학생2의 성적 : 75
		//학생3의 성적 : 84
		//--------------
		//평균성적 : 83.0
		//--평균성적 이상인 학생들--
		//=>학생1
		//=>학생3
		//평균이상의 학생 수 : 2
		
		Scanner sc = new Scanner(System.in);
		System.out.print("학생 수 : ");
		int stu = sc.nextInt();
		
		//성적들을 저장해둘 배열
		int[] sco = new int[stu];
		//성적을 입력 받아서 배열에 담기
		for(int i = 0; i < sco.length; i++) {
			System.out.printf("학생%d의 성적 : ", i+1);
			sco[i] = sc.nextInt();
		}
		System.out.println("-----------------");
		
		int sum = 0;
		
		for(int i : sco) {
			sum += i;
		}
		
		float average = (float)sum/stu;
		System.out.printf("평균 성적 : %.1f\n", average);		
		System.out.println("--평균석적 이상인 학생들--");
		int avgCount = 0;
		for(int i = 0; i < sco.length; i++) {
			
			if( sco[i] >= average ) {
				avgCount++;
				System.out.printf("=> 학생%d\n", i+1);
			}
			
		}
		
		System.out.println("평균 이상인 학생 수 : " + avgCount);
		
		
	}//main
}
