package theoryLec02;

import java.util.Scanner;

public class IterationStatement_While_DoWhile_ForLoop {

	public static void main(String[] args) {
		// b) Iteration: While + Do-While + For loop [Extra: for-each loop/ enhanced for loop] && Sentinel Value
		
		/*
		// While Loop
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
		// Do-While Loop
		int j = 10;
		do {
			//System.out.println("You Entered in Loop");
		} while(j<5);
		
		// Difference between while and do-while
		while(j<5) {   // while(j<5);
			System.out.println("You Entered in Loop");
		}
		*/
		
		
		// For Loop
		int i =0;
		for(i =0; i<5; i++) {   // for(i=0; i<5; i++);  
			System.out.println(i);
		}

		// For loop is looking as like while loop
		for(;i<5;) {   // for(i=0; i<5; i++);  
			System.out.println(i);
			i++;
		}
	}
}
