package ex2_unit;

public class UnitMain {
	public static void main(String[] args) {
		
		Terran t1 = new Terran("해병", 100, false);
		t1.decEnergy();
		t1.decEnergy();
		System.out.println("t1의 energy : " + t1.getEnergy() );
		
		Zerg z1 = new Zerg("히드라", 200, false);
		z1.decEnergy();
		System.out.println("z1의 energy : " + z1.getEnergy() );
		
		Protoss p1 = new Protoss("셔틀", 150, true);
		p1.decEnergy();
		p1.decEnergy();
		p1.decEnergy();
		System.out.println("p1 : " + p1.getEnergy() );
		
	}//main
}
