package theoryLec14_OOPWithPolymorphismAndObjToObjRln;

public class PolymorphismExample {

	public static void main(String[] args) {
		
		Animal c = new Cat("Twinkel", 2); // Upcasting
		c.speak();
		((Cat) c).findLocation();     // Downcasting
		
		
		Animal[] animalArray = new Animal[10];
		animalArray[0] =  new Cat("Mini", 1);
		animalArray[1] =  new Dog("Dhaka", "Twinkel", 2);
		animalArray[2] =  new DeshiDog("Dhaka", "Twinkel", 2);
		
		
	}
}

class Animal {
	String name;
	int age;
	
	public Animal(String name, int age) {
		this.name = name;
		this.age = age;
	}
	public void speak() {
		
	}
}

class Cat extends Animal{
	String ownerName;
	public Cat(String name, int age) {
		super(name, age);
	}
	@Override
	public void speak() {
		System.out.println("Mew Mew");
	}
	public void findLocation() {
		System.out.println("Bangladesh");
	}	
}
class Dog extends Animal{
	String location;
	public Dog(String location, String name, int age) {
		super(name, age);
		this.location = location;
	}
	@Override
	public void speak() {
		System.out.println("Baw Baw");
	}
}


class DeshiDog extends Dog{
	public DeshiDog(String location, String name, int age) {
		super(location, name, age);
		
	}
	
}
