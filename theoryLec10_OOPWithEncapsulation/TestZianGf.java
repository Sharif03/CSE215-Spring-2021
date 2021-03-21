package theoryLec10_OOPWithEncapsulation;

import java.util.Scanner;

public class TestZianGf {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		// Operation Gf0
		ZianGf gf0 = new ZianGf();  
		System.out.println("Her name is: " + gf0.getName() + ". Age: " + gf0.age + " and Height: " + gf0.height);
		System.out.println("Ok bhaiya details e bolteci........");
		System.out.println(gf0.sing("Awesome"));
		gf0.dance(3);
				
		
		// Operation Gf1
		ZianGf gf1 = new ZianGf();
		gf1.setName("Lily");  // Anamika
		gf1.age = 18;
		gf1.height = 5.3f;
		
		System.out.println("\nHer name is: " + gf1.getName() + ". Age: " + gf1.age + " and Height: " + gf1.height);
		System.out.println("Ok bhaiya details e bolteci........");
		System.out.println(gf1.sing("Awesome"));
		gf1.dance(3);
		
		
		// Operation Gf2
		ZianGf gf2 = new ZianGf(); 
		System.out.print("\n\nCan i tell her name bhiya: ");
		String n = input.nextLine();
		gf2.setName(n);  // Sadia 
		System.out.print("Can i tell her age too bhiya: ");
		gf2.age = input.nextInt();
		System.out.print("Bhiya i can tell her height too: ");
		gf2.height = input.nextFloat();
		
		System.out.println("\nHer name is: " + gf2.getName() + ". Age: " + gf2.age + " and Height: " + gf2.height);
		System.out.println("Ok bhaiya details e bolteci........");
		System.out.print("Notun kichu bolo: ");
		String goodWord = input.next();  // Nice
		System.out.println(gf2.sing(goodWord));
		gf1.dance(4);
		System.out.print("\n\n");
		
		// Operation Gf3       // Afsana
		ZianGf gf3 = new ZianGf("Antora", 19, 5.4f); 
		System.out.println("Her name is: " + gf3.getName() + ". Age: " + gf3.age + " and Height: " + gf3.height);
		System.out.println("Ok bhaiya details e bolteci........");
		System.out.println(gf3.sing("Osthir"));
		gf0.dance(10);
		
		
		// Operation Gf4
		System.out.print("\n\nCan i tell her name bhiya: ");
		String name = input.next();  // Mim
		System.out.print("\nCan i tell her age too bhiya: ");
		int age = input.nextInt();
		System.out.print("\nBhiya i can tell her height too: ");
		float height = input.nextFloat();
		                      // Mitu
		ZianGf gf4 = new ZianGf(name, age, height); 
		System.out.println("Her name is: " + gf4.getName() + ". Age: " + gf4.age + " and Height: " + gf4.height);
		System.out.println("Ok bhaiya details e bolteci........");
		System.out.println(gf4.sing("Osthir"));
		gf0.dance(7);
		
		
		System.out.println("\n\nBhiya my total gf is: " + ZianGf.gfCounter);
		
			
	}

}
