package ex1_class;

public class Computer {
	//클래스의 구성요소
	//1)속성, 변수, 멤버.....
	//2)메서드, 함수, 기능.....
	
	//컴퓨터를 만들기 위한 설계도
	private String brand = "samsung";
	public int ssd = 256;
	public int ram = 512;
	public float cpu = 2.4f;
	public String color = "white";
	
	//대량 생산을 목적으로 만들어진 설계도를 class라고 한다.
	//설계도를 보고 만든 실물(제품)을 객체라고 한다.
	//설계도만을 목적으로 만드는 메서드는 메인을 생성하지 x.
	
	
	//컴퓨터의 속성을 출력하기 위한 메서드	
	//메서드 : 어떤 작업을 수행하기 위한 명령문들의 집합
	
	//접근제한자 반환형 메서드명( 인자, 파라미터 ){ 메서드의 실행 영역 }
	//public void getInfo(){}
	public void getInfo() {
		System.out.println("brand : " + brand);
		System.out.println("ssd : " + ssd + "GB");
		System.out.println("ram : " + ram + "GB");
		System.out.println("cpu : " + cpu + "GB");
		System.out.println("color : " + color);
		System.out.println("-------------------");
	}//getInfo()
	
	//접근제한자의 종류
	//1.public : 같은 프로젝트의 모든 클래스에서 사용을 허가
	//2.private : 현재 클래스에서만 사용을 허가
	
	//3.protected : 상속관계의 클래스에서 사용을 허가
	//4.default : 같은 패키지의 클래스에서 사용을 허가 (접근제한자 위치에 아무것도 없는 경우)
	
	
}
