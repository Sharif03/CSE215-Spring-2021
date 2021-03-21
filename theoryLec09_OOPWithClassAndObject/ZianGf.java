package theoryLec09_OOPWithClassAndObject;

public class ZianGf {
	// Property or field or instance variable and class variable or state
	String name;    // instance variable
	int age;        // instance variable
	float height;   // instance variable
	
	static int gfCounter = 0;  // class variable
	
	// Empty Constructor
	public ZianGf(){
		gfCounter++; //gfCounter = gfCounter + 1;
		name = "Anika";
		age = 14;
		height = 5;
	}
	// Parameterized Constructor- All value set
	public ZianGf(String newName, int newAge, float newHeight) {
		gfCounter++; //gfCounter = gfCounter + 1;
		name = newName;
		age = newAge;
		height = newHeight;
	}
	// Parameterized Constructor- Partial value set
	public ZianGf(String newName, int newAge) {
		gfCounter++; //gfCounter = gfCounter + 1;
		name = newName;
		age = newAge;
		height = 5.3f;
	}
	
	
	// Method or Behavior
	public static String sing(String prasingWord) {
		return "Bhiya, She can sing " + prasingWord;
	}
	public static void dance(int numberOf) {
		System.out.println("She can dance in " + numberOf + " types.");
	}
}