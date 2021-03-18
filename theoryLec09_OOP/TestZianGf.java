package theoryLec09_OOP;

import java.util.Scanner;

public class TestZianGf {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		// Operation Gf0
		ZianGf gf0 = new ZianGf();  
		System.out.println("Her name is: " + gf0.name + ". Age: " + gf0.age + " and Height: " + gf0.height);
		System.out.println("Ok bhaiya details e bolteci........");
		System.out.println(gf0.sing("Awesome"));
		gf0.dance(3);
				
		
		// Operation Gf1
		ZianGf gf1 = new ZianGf();
		gf1.name = "Anamika";
		gf1.age = 18;
		gf1.height = 5.3f;
		
		System.out.println("\n\nHer name is: " + gf1.name + ". Age: " + gf1.age + " and Height: " + gf1.height);
		System.out.println("Ok bhaiya details e bolteci........");
		System.out.println(gf1.sing("Awesome"));
		gf1.dance(3);
		
		
		// Operation Gf2
		ZianGf gf2 = new ZianGf(); 
		System.out.print("\n\nCan i tell her name bhiya: ");
		gf2.name = input.nextLine();  // Sadia
		System.out.print("Can i tell her age too bhiya: ");
		gf2.age = input.nextInt();
		System.out.print("Bhiya i can tell her height too: ");
		gf2.height = input.nextFloat();
		
		System.out.println("\nHer name is: " + gf2.name + ". Age: " + gf2.age + " and Height: " + gf2.height);
		System.out.println("Ok bhaiya details e bolteci........");
		System.out.print("Notun kichu bolo: ");
		String goodWord = input.next();  // Nice
		System.out.println(gf2.sing(goodWord));
		gf1.dance(4);
		
		
		// Operation Gf3
		ZianGf gf3 = new ZianGf("\n\nAntora", 19, 5.4f); 
		System.out.println("Her name is: " + gf3.name + ". Age: " + gf3.age + " and Height: " + gf3.height);
		System.out.println("Ok bhaiya details e bolteci........");
		System.out.println(gf3.sing("Osthir"));
		gf0.dance(10);
		
		
		// Operation Gf4
		System.out.print("\n\nCan i tell her name bhiya: ");
		String name = input.next();
		System.out.print("\nCan i tell her age too bhiya: ");
		int age = input.nextInt();
		System.out.print("\nBhiya i can tell her height too: ");
		float height = input.nextFloat();
		
		ZianGf gf4 = new ZianGf(name, age, height); 
		System.out.println("Her name is: " + gf4.name + ". Age: " + gf4.age + " and Height: " + gf4.height);
		System.out.println("Ok bhaiya details e bolteci........");
		System.out.println(gf4.sing("Osthir"));
		gf0.dance(7);
		
		
		System.out.println("\n\nBhiya my total gf is: " + ZianGf.gfCounter);
			
	}

}


class ZianGf {
	// Property 
	String name;
	int age;
	float height;
	
	static int gfCounter = 0;
	
	// Empty Constructor
	public ZianGf(){
		gfCounter++; //gfCounter = gfCounter + 1;
		name = "Anika";
		age = 14;
		height = 5;
	}
	// Parameterized Constructor
	public ZianGf(String newName, int newAge, float newHeight ) {
		gfCounter++; //gfCounter = gfCounter + 1;
		name = newName;
		age = newAge;
		height = newHeight;
	}
	
	
	// Method
	public static String sing(String prasingWord) {
		return "Bhiya, She can sing " + prasingWord;
	}
	public static void dance(int numberOf) {
		System.out.println("She can dance in " + numberOf + " types.");
	}
}