package ex2_unit;

public abstract class Unit {

	String name;
	int energy;
	boolean fly;
	
	abstract public void decEnergy();
	
	public String getName() {
		return name;
	}
	public int getEnergy() {
		return energy;
	}
	public boolean isFly() {
		return fly;
	}
	
	
	
}
