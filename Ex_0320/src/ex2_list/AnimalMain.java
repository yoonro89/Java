package ex2_list;

import java.util.ArrayList;
import java.util.List;

public class AnimalMain {
	public static void main(String[] args) {
		
		List<Animal> arr = new ArrayList<Animal>();
		
		Animal dog = new Animal("강아지", 2, 4, "멍멍");
		Animal snake = new Animal("뱀", 2, 0, "뱀뱀뱀");
		
		arr.add(dog);
		arr.add(snake);
		
		System.out.println("이름\t눈\t다리\t울음소리");
		for(int i = 0; i < arr.size(); i++) {
			System.out.println(arr.get(i).getName() + "\t" + 
								arr.get(i).getEye() + "\t" + 
								arr.get(i).getLeg() + "\t" + 
								arr.get(i).getScream());
		}
		
	}//main
}
