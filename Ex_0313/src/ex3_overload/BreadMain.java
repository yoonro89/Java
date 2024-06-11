package ex3_overload;

public class BreadMain {
	public static void main(String[] args) {
		
		/*
		 빵을 만들었습니다 <--- 메서드1 호출
		 ---------------------
		 빵을 만들었습니다
		 빵을 만들었습니다
		 요청하신 2개의 빵을 만들었습니다 <--- 메서드2 호출(원하는 개수 만큼 출력)
		 ---------------------
		 크림빵을 만들었습니다		 
		 크림빵을 만들었습니다
		 요청하신 2개의 크림빵을 만들었습니다 <---메서드3 호출(원하는 개수, 종류 만큼 출력)		 
		 */
		
		Bread bread = new Bread();
		bread.makeBread();
		bread.makeBread(2);
		bread.makeBread(2, "크림빵");
		
		
		
	}//main
}
