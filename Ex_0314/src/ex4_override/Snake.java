package ex4_override;

public class Snake extends Animal {

	String sensor = "밤에도 잘 봄";
	
	//Override : '메서드의 재 정의'를 의미
	//부모의 메서드를 가져와 자식사정에 맞게 내용만 재정의 하는 것
	@Override
	public int getLeg() {
		
		return 0;
	}
	
}
