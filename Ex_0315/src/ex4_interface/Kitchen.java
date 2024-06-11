package ex4_interface;

//인터페이스는 구현 능력을 가지고 있지 않으므로, '다중구현이 가능'
//상속받고 있는 중에도 (다중)상속이 가능하다
//public class Kitchen implements Menu1, Menu2
public class Kitchen implements MenuAll{

	@Override
	public String jjajang() {
		return "중면 + 춘장소스";
	}

	@Override
	public String jjambbong() {
		return "홍합 + 오징어";
	}

	@Override
	public String tangsuyuck() {
		return "돼지고기 + 당근";
	}

	@Override
	public String boggembab() {
		return "쌀 + 등등";
	}

	@Override
	public String mandoo() {
		return "소고기 + 기타등등";
	}

}
