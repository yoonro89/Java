package ex1_exception;

public class Ex1_try_catch {
	public static void main(String[] args) {
		
		//try-catch(예외처리)
		//자바에서 프로그램이 실행되는 도중 예외(오류, 에러, 버그...)가 발생하면
		//그 시점에서 강제적으로 종료된다. 이것은 올바른 판단이지만, 때로는 예상할 수 있는
		//예외에 대해 프로그램을 종료하지 않고 이후의 작업을 이어 나가야 할 때가 있다.
		//예외처리를 통해 프로그램의 비정상적인 종료를 줄일 수 있다.
		
		int result = 0;
		int[] arr = new int[2];
		try {
			//try영역에서 만든 변수는 지역변수로서 catch에서도 사용이 불가
			int n = 2;
			result = 10 / n;
			
			arr[1] = 100;
			
		}catch(ArithmeticException e){//예외 처리계의 Object라고 보면 됨
			//n = 10;
			System.out.println("0으로 나눌 수 없어요");
			//e.printStackTrace();//무슨 예외인지 알 수 있도록 출력
			
		}catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("존재하지 않는 index로 접근함");
			
		}finally{
			//예외발생 여부와 관계 없이 반드시 실행되는 영역
			System.out.println("finally");
		}
		
		System.out.println(result);
		
	}//main
}
