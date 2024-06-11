package ex2_array_work;

public class Ex3_work {
	public static void main(String[] args) {
		//배열 arr에 담긴 값 중, 가장 큰 값을 출력
		//------------
		//가장 큰 값 : 19
		int[] arr = {4, 13, 7, 19, 1, 15};
		
		int max = arr[0];
		
		for(int i = 1; i < arr.length; i++ ) {
			
			if( arr[i] > max ) {
				max = arr[i];
			}
		}
		System.out.print("가장 큰 값 : " + max);
		System.out.println();
		
		System.out.println("-------------");
		
		max = arr[0];
		
		for(int num : arr) {
			if( num > max ) {
				max = num;
			}
		}
		System.out.print("가장 큰 값 : " + max);
		
		
	}//main
}
