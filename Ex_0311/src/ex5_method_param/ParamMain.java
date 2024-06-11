package ex5_method_param;

public class ParamMain {
	public static void main(String[] args) {
		
		ParamTest pt = new ParamTest();
		int num = 10;
		pt.setArr(num);//기본자료형을 넘기는 경우, 복사본이 넘어간다
		System.out.println("num:"+num);
		
		int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		
		pt.realArr(arr);//배열처럼 객체를 넘기는 경우, 주소를 그대로 넘긴다
						//의도치 않게 값이 변하는 경우가 있을 수 있다
		System.out.print("메인에서 출력한 arr : ");
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		
		
	}
}
