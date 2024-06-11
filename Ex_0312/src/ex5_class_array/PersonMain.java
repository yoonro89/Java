package ex5_class_array;

public class PersonMain {
	public static void main(String[] args) {

//		Person p = new Person();
//		p.setName("일길동");
//		p.setAge(20);
//		
//		Person p2 = new Person();
//		p2.setAge(21);
//		p2.setName("이길동");

		Person[] p = new Person[2];

		// 클래스를 배열화 하면
		// 반드시 각 인덱스의 명시적 객체생성이 이루어져야 한다
		for (int i = 0; i < p.length; i++) {
			p[i] = new Person();
		}

		p[0].setName("일길동");
		p[0].setAge(20);

		p[1].setName("이길동");
		p[1].setAge(21);

		for (int i = 0; i < p.length; i++) {

			System.out.println(p[i].getName() + " / " + p[i].getAge());

		}
	}
}
