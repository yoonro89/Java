package ex1_single_array;

public class Ex2_array {
	public static void main(String[] args) {
		
		int[] arr = new int[3]; 	//정수 형태의 배열 변수명 arr의 새로운 방3개 생성 (항상 [0]번 방부터 생성)
		arr[0] = 7;					//변수명 arr의 [0]번방의 초기값은 7; 
		arr[1] = 15;				//변수명 arr의 [1]번방의 초기값은 15;
		arr[2] = 30;				//변수명 arr의 [2]번방의 초기값은 30;
		
		//배열의 선언 생성 초기화를 한 번에
		int[]arr2 = {7, 15, 30};	//정수 형태의 변수명 arr2의 방{각 방에 해당하는 초기값}을 생성;

		for(int i = 0; i < arr2.length; i++ ) {
			System.out.println(arr2[i]);
		}
		
	}//main
}
