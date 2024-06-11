package ex4_constructor;

public class PokeMain {
	public static void main(String[] args) {
		
		Poke p1 = new Poke("피카츄", "전기");//생성자뒤에 ()가 붙는다
//		p1.Poke("꼬부기", "물");//생성자는 최초 한번만 생성되고 변경이 불가하다
		
//		p1.setName("피카츄");
//		p1.setType("전기");
		
		System.out.println(p1.getGeneral());
		System.out.println(p1.getName());
		System.out.println(p1.getType());
		
//		Poke p2 = new Poke();
//		p2.setName("이상해씨");
//		p2.setType("풀");
//		
//		Poke p3 = new Poke();
//		p1.setName("파이리");
//		
//		Poke p4 = new Poke();
//		p4.setName("꼬부기");
//		
//		Poke p5 = new Poke();
		
	}//main
}
