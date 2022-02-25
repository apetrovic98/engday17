package example01;

import domain.Animal;
import domain.Person;

public class Main {

	public static void main(String[] args) {
		Person person = new Person("Aleksandar","Petrovic",120);
		Animal animal = new Animal("Dog", 20);
		
		person.move();
		animal.move();
		
	}

}
