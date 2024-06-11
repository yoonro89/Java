package ex2_unit;

public class Zerg extends Unit{

	public Zerg(String name, int energy, boolean fly ) {
		super.name = name;
		super.energy = energy;
		super.fly = fly;
	}
	
	@Override
	public void decEnergy() {
		energy -= 10;
	}

}
