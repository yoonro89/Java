package ex1_pokemon;

public class Poke {
	//다형성 : 하나의 객체가 다양한 타입을 가지는 것
	private String name = "";
	private String type = "";
	
	public String getType() {
		return type;
	}
	
	public void setType(String t) {
		type = t;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String n) {
		name = n;
	}
	
	public void myPoke() {
		System.out.println("이름 : " + name);
		System.out.println("타입 : " + type);
		System.out.println("---------------------");
	}
	
}
