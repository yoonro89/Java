package ex1_objStream;

import java.io.Serializable;
//implements Serializable을 통해 메모리에 흩어져 있던 멤버변수들을 한번에 쓰고 받을 수
//있도록 새로운 영역에 일렬로 만들어 복사해둔다(직렬화)
public class RspInfo implements Serializable{ //인터페이스 클래스를 직렬화 구현
	private int win, lose, draw;
	private String id;
	
	public int getWin() {
		return win;
	}
	public void setWin(int win) {
		this.win = win;
	}
	public int getLose() {
		return lose;
	}
	public void setLose(int lose) {
		this.lose = lose;
	}
	public int getDraw() {
		return draw;
	}
	public void setDraw(int draw) {
		this.draw = draw;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	
	
}
