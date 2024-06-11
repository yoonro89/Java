package ex2_array_work;

public class Ex4_work {
	public static void main(String[] args) {
		
		//배열 arr이 가진 내용들을 오름차순으로 정렬하여 출력
		//------------
		//1 4 7 13 15 19
		
		int[] arr = {4, 13, 7, 19, 1, 15};
//		index		→0,	 1,	2,	3, 4,  5
		int x = 0;
		
		for(int i = 0; i < arr.length; i++) {
			
			for(int j = i; j < arr.length; j++ ) {
			
				if(arr[i] > arr[j]) { //부등호만 바꿔도 내림차순으로 변한다
					x = arr[i];			
					arr[i] = arr[j];	
					arr[j] = x;			
				}
				
			}//inner
			
		}//outer
		
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}//main
}
