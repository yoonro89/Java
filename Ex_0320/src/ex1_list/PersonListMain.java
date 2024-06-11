package ex1_list;

import java.util.ArrayList;
import java.util.List;

public class PersonListMain {
	public static void main(String[] args) {
		
		List<Person> arr = new ArrayList<Person>();
		
		Person p1 = new Person();
		p1.setName("홍길동");
		p1.setEng(99);
		p1.setKor(67);
		
		Person p2 = new Person();
		p2.setName("김길순");
		p2.setEng(100);
		p2.setKor(80);
		
		arr.add(p1);
		arr.add(p2);
		
		for(int i = 0; i < arr.size(); i++) {
			System.out.println(arr.get(i).getName() + "/" 
					+arr.get(i).getEng() + "/"
					+arr.get(i).getKor() );
			
		}
		
	}//main
}
