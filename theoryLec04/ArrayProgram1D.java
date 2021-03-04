package theoryLec04;

import java.util.Scanner;

public class ArrayProgram1D {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter range: ");
		int range = input.nextInt();
		int a[] = new int[range];  // 5
		
		for (int i = 0; i < a.length; i++) {
			a[i] =(int)(Math.random() * 100);
		}
		int sum = 0;
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");   //   0  1  2  3  4  
			sum = sum + a[i];
		}
		System.out.println("\nSummation: " + sum);
		
		// Enhanced for loop or For each loop
		System.out.println();
		int newSum = 0;
		for(int x : a) {
			System.out.print( x + " ");
			newSum = newSum + x;
		}
		System.out.println("\nSummation: " + newSum);
		
		
		
		
	
		
		
		
		

	}

}
