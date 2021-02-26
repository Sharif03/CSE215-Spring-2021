package theroyLec02;

import java.util.Scanner;

public class IterationStatement_While_DoWhile_ForLoop {

	public static void main(String[] args) {
		// b) Iteration: While + Do-While + For loop [Extra: foreach loop] && Sentinal Value
		
		/*
		// While
		Scanner input = new Scanner(System.in);
		System.out.println("Enter number: ");
		int value = input.nextInt();
		
		while(true) {
			if(value == 0)
				break;
			else {
				System.out.println(value);
				System.out.println("Enter number: ");
				value = input.nextInt();
			}
		}
		*/
		
		/*
		// Do-While
		int j = 0;
		do {
			System.out.println("You Entered in Loop");
		} while(j<0);
		
		// Difference between while and do-while
		while(j<0) {
			System.out.println("You Entered in Loop");
		}
		*/
		
		
		/*
		// For loop
		for(int i=0; i<5; i++) {
			System.out.println(i);
		}
		*/
		
		
		/*
		// Jump Statement(Break && Continue && Level-block)
		// Break
		for(int i=0; i<5; i++) {
			if(i == 3)
				break;
			System.out.println(i);
		}
		
		// Continue
		for(int i=0; i<5; i++) {
			if(i == 3)
				continue;
			System.out.println(i);
		}
		*/
		
		// Level-block
		boolean truthValue = true;
		System.out.println("Hello");
		a:{
			b:{
			   c:{
				truthValue = false;
				if(truthValue == false)
					break c;
				System.out.println("Block C");
			   }
			 System.out.println("Block B");
			}
		 System.out.println("Block A");
		}
		
		System.out.println("Normal");
		
	}

}
