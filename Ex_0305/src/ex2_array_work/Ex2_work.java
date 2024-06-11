package ex2_array_work;

public class Ex2_work {
	public static void main(String[] args) {
		//배열 arr에 담긴 모든 값의 합을 출력
		//결과 : 145
		int[] arr = {15, 22, 17, 40, 51};
		
		int sum = 0;
		
		for(int i = 0; i < arr.length; i++ ) {
		
			sum += arr[i];
		
		}
		System.out.print("결과 : " + sum);
		System.out.println();
		System.out.println("-----------");
		
		sum=0;
		
		for(int i : arr ) {
			sum += i;
		}
		System.out.print("결과 : " + sum);
		
	}//main
}
