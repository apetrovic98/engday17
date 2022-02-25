package domain;

public class Animal implements Pattern{
	private final String name;
	private final int speed;
	public Animal(String name, int speed) {
		super();
		this.name = name;
		this.speed = speed;
	}
	@Override
	public void move() {
		System.out.println(name + " is moving by speed of " + speed + " km/h!");
	}
	
	
	
	
	
}
