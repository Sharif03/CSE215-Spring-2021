package theoryClassAssignments;

public class Sec07And06_TheoryAss02_Task02_Aeroplane {

	public static void main(String[] args) {
		// Association
		Pilot pilot = new Pilot("Abir", 123);
		Aeroplane f1 = new Aeroplane("Bowing F1", 200);
		System.out.println(pilot.name + " fly " + f1.getName());
		
		// Composition
		Engine engine = new Engine(180.0, 300.0);
		Aeroplane f2 = new Aeroplane("Bowing F2", 400, engine);
		
		// Composition && Aggregation
		Aeroplane f5 = new Aeroplane("Bowing F5", 300, engine, pilot);
		
		
		Aeroplane f7 = new Aeroplane("Bowing F7", 200);
		Aeroplane f9 = new Aeroplane("Bowing F9", 150);
		// f7.compareSpeed(f9);
		
		Aeroplane newVersionOfF7 = f7.maxSpeedUpgrade("Bowing F7", 300);
		//System.out.println("Name: " +  newVersionOfF7.getName());
		//System.out.println("Speed: " +  newVersionOfF7.getMaxSpeed());
	}
}
class Pilot {
	String name;
	int id;
	public Pilot(String name, int id) {
		this.name = name;
		this.id = id;
	}	
}
class Engine {
	double maxTork;
	double fuelConsumption;
	public Engine(double maxTork, double fuelConsumption) {
		this.maxTork = maxTork;
		this.fuelConsumption = fuelConsumption;
	}
	
}

class Aeroplane {  // Has-A relation is used to check weather it's a valid property for a related class or not
	private String name;
	private double maxSpeed;
	private Engine engine;  // Object as Composition
	private Pilot pilot;    // Object as Aggregation
	private int totalPass;
	private int fair;
		
	public Aeroplane(){}

	public Aeroplane(String name, double maxSpeed, Engine engine) {
		this.name = name;
		this.maxSpeed = maxSpeed;
		this.engine = engine;
	}
	
	public Aeroplane(String name, double maxSpeed, Engine engine, Pilot pilot) {
		this.name = name;
		this.maxSpeed = maxSpeed;
		this.engine = engine;
		this.pilot = pilot;
	}

	public Aeroplane(String name, double maxSpeed) {
		this.name = name;
		this.maxSpeed = maxSpeed;
	}
	
	// Encapsulation: Accessor && Mutator or getter && setter
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public double getMaxSpeed() {
		return maxSpeed;
	}
	public void setMaxSpeed(double maxSpeed) {
		this.maxSpeed = maxSpeed;
	}
	
	// Method Overloading
	public int airFair(int totalPass, int fair) {
		this.totalPass = totalPass;
		this.fair = fair;
		int totalFair = this.totalPass * this.fair;
		
		return totalFair;
	}
	
	// Method Overloading
	public int airFair(int fixedFair) {
		this.fair = fixedFair;
		return this.fair + this.fair * (20/100);
	}
	
	// Object as parameter
	public void compareSpeed(Aeroplane  a) {
		if(maxSpeed > a.maxSpeed)
			System.out.println(name + " is faster then " + a.name);
		else
			System.out.println(name + " is less then " + a.name);
	}
	
	// Object as return type
	public Aeroplane maxSpeedUpgrade(String name, int speed) {
		this.name = this.name+ " Pro";
		this.maxSpeed = speed;
		Aeroplane newPlane= new Aeroplane(this.name, this.maxSpeed);
		
		return newPlane;
	}
}
