package theoryLec14_OOPWithPolymorphismAndObjToObjRln;

public class AssociationExampleInJava {

	public static void main(String[] args) {
		Driver d = new Driver("Bijoy", "191234");
		Car c = new Car("Toyota", "X-2018");
		
		System.out.println(d.name + " drive the " + c.carName);

	}
}

class Google {
	
}

class GoogleMapSevice extends Google{
	Pathao p;
	Uber u;
	public GoogleMapSevice(Pathao p, Uber u) {
		this.p = p;
		this.u = u;
	}	
}
class Pathao{
	Driver d;
	Car c;
	
	public Pathao(Driver d, Car c) {
		this.d = d;
		this.c = c;
	}
}

class Uber{
	Driver d;
	Car c;
	
	public Uver(Driver d, Car c) {
		this.d = d;
		this.c = c;
	}
}

class Driver {
	String name;
	String licence;
	public Driver(String name, String licence) {
		this.name = name;
		this.licence = licence;
	}	
}
class Car {
	String carName;
	String model;
	public Car(String carName, String model) {
		this.carName = carName;
		this.model = model;
	}	
}
