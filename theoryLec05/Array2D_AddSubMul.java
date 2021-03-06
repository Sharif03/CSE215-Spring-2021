package theoryLec05;

import java.util.Scanner;

public class Array2D_AddSubMul {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		// Array(2D) Addition && Subtraction && Multiplication
		
		System.out.print("Enter Row: ");
		int row = input.nextInt();   // 3
		
		System.out.print("Enter Column: ");
		int column = input.nextInt();  // 3
		 
		int a[][] = new int[row][column];  // 3 * 3
		System.out.println("Value of a: ");
		for (int i=0; i<row; i++) {
			for (int j=0; j<column; j++) {  
				a[i][j] = (int)(Math.random() * 100);
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}
		
		int b[][] = new int[row][column];  // 3 * 3
		System.out.println("\n\nValue of b: ");
		for (int i=0; i<row; i++) {
			for (int j=0; j<column; j++) {  
				b[i][j] = (int)(Math.random() * 100);
				System.out.print(b[i][j] + " ");
			}
			System.out.println();
		}
		
		// Addition
		int c[][] = new int[row][column];  // 3 * 3
		//System.out.println("\n\nAddition result of a & b: ");
		for (int i=0; i<row; i++) {
			for (int j=0; j<column; j++) {  
				c[i][j] = a[i][j] + b[i][j];
				
				//System.out.print(c[i][j] + " ");
			}
			//System.out.println();
		}
		
		// Subtraction
		int d[][] = new int[row][column];  // 3 * 3
		//System.out.println("\n\nSubtraction result of a & b: ");
		for (int i=0; i<row; i++) {
			for (int j=0; j<column; j++) {  
				c[i][j] = a[i][j] - b[i][j];
				
				//System.out.print(c[i][j] + " ");
			}
			//System.out.println();
		}
		
		// Multiplication
		int e[][] = new int[row][column];  // 3 * 3
		System.out.println("\n\nMultiplication result of a & b: ");
		for (int i=0; i<row; i++) {
			for (int j=0; j<column; j++) {  
				
				int sum = 0;
				for(int k=0; k<3; k++) {
					sum = sum +  a[i][k] * b[k][j];
				}
				e[i][j] = sum;
				System.out.print(e[i][j] + " ");
			}
			System.out.println();
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		/*
		for (int i=0; i<row; i++) {
			for (int j=0; j<column; j++) { 
				System.out.print(a[i][j] + " "); 
			}
			System.out.print("\n");
		}
		*/
	}

}
