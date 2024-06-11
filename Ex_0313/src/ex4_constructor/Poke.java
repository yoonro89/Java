package ex4_constructor;

public class Poke { //모든 클래스는 자기이름과 같은 생성자를 갖고 시작한다
	
	//생성자 : 객체생성시 메모리 할당 및 멤버의 초기화를 위해 사용하는 영역
	//객체가 생성 될 때, 딱 한 번만 호출할 수 있다
	//반환형을 갖고 있지x, 클래스와 반드시 동일 이름
	
	private String general;	// = "1세대"; 멤버변수에 미리 입력할 경우 메모리를 할당 받아 넣는다 
	private String name;
	private String type;
	
	public Poke(String name, String type) {	//인자에 파라미터를 강제하여
		general = "1세대";//이미 생성자쪽에 할당 받은 메모리에 넣기 때문에 속도가 빠름 
		this.name = name;					//메인에서의 누락 혹은 오기입을 방지 
		this.type = type;
		System.out.println("나는 Poke의 생성자야");
	}
	
	public String getGeneral() {
		return general;
	}
	
	
	
	public String getName() {
		return name;
	}



	public String getType() {
		return type;
	}



	public void setType(String type) {
		this.type = type;
	}



	
	
}
