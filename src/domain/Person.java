package domain;

public class Person implements Pattern{
	private final String name;
	private final String surname;
	private final int speed;
	
	
	
	
	public Person(String name, String surname, int speed) {
		super();
		this.name = name;
		this.surname = surname;
		this.speed = speed;
	}




	@Override
	public void move() {
		System.out.println(name + " " + surname + " is moving by speed of " + speed + " km/h!");
	}



}
