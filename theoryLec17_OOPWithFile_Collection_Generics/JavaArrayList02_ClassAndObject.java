package theoryLec17_OOPWithFile_Collection_Generics;

import java.util.ArrayList;
import java.util.Collection;

public class JavaArrayList02_ClassAndObject {

	public static void main(String[] args) {
		ArrayList<Car> carObjectContainer = new ArrayList<Car>();
		
		// Adding object
		carObjectContainer.add(new Car("Toyota", 1));
		carObjectContainer.add(new Car("Bus", 2));
		carObjectContainer.add(new Car("Truck", 3));
		carObjectContainer.add(new Car("Ena", 4));
		carObjectContainer.add(new Car("Saintmartin", 5));
		
		//System.out.println(carObjectContainer);
		
		// 	Replace of object
		//carObjectContainer.set(3, new Car("Shyamoli", 4));
		
		// Single object remove from arraylist
		//carObjectContainer.remove(3);
		
		// All object remove from arraylist
		carObjectContainer.clear();
		for (int i = 0; i < carObjectContainer.size(); i++) {
			System.out.println(carObjectContainer.get(i));
		}
	}

}

class Car{
	private String name;
	private int model;
	public Car(String name, int model) {
		this.name = name;
		this.model = model;
	}
	@Override
	public String toString() {
		return "Car [Name=" + name + ", Model=" + model + "]";
	}
	
}