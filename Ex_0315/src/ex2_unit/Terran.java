package ex2_unit;

public class Terran extends Unit{

	public Terran( String name, int energy, boolean fly ) {
		super.name = name;
		super.energy = energy;
		super.fly = fly;
	}
	
	@Override
	public void decEnergy() {
		energy -= 3;
	}

}
