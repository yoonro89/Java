package ex4_override;

public class AnimalMain {
	public static void main(String[] args) {
		
		Bear bear = new Bear();
		System.out.println("---곰---");
		System.out.println("눈 : " + bear.getEye());
		System.out.println("다리 : " + bear.getLeg());
		System.out.println("약으로씀 : " + bear.woong);
		
		System.out.println("-----------------");
		
		Elephant elephant = new Elephant();
		System.out.println("---코끼리---");
		System.out.println("눈 : " + elephant.getEye());
		System.out.println("다리 : " + elephant.getLeg());
		System.out.println("특기 : " + elephant.nose);
		
		System.out.println("-----------------");
		
		Snake snake = new Snake();
		System.out.println("---뱀---");
		System.out.println("눈 : " + snake.getEye());
		System.out.println("다리 : " + snake.getLeg());
		System.out.println("특기 : " + snake.sensor);
		
	}//main
}
