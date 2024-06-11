package ex2_list;

public class Animal {
	private String name;
	private int eye;
	private int leg;
	private String scream;
	
	public Animal(String name, int eye, int leg, String scream) {
		this.name = name;
		this.eye = eye;
		this.leg = leg;
		this.scream = scream;
	}

	public String getName() {
		return name;
	}

	public int getEye() {
		return eye;
	}

	public int getLeg() {
		return leg;
	}

	public String getScream() {
		return scream;
	}
	
	
	
}
