package theroyLec03;

import java.util.Scanner;

public class ArrayProgram {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		// 1D Array
		System.out.println("Enter range for this array: ");
		int range = input.nextInt();
		int a[] = new int[range];      // [2^32 = 4294967296 = -2147483648 To +2147483647]
		                               //       = -2^31 To +2^31-1
		
		for (int i = 0; i <a.length ; i++) {
			System.out.println("Enter a number: ");
			a[i] = input.nextInt();
		} 
		 
		for (int i = 0; i <a.length ; i++) {
			System.out.print(a[i] + " ");
		}
		
		// Array declare and initialization 
		int[] b = {10, 20, 30, 40, 50}; 
		
		int []c = new int[] {10, 20, 30, 40, 50}; 
		                  // 0   1    2  3   4
		int sum = 0;
		for (int i = 0; i < c.length; i++) { //depends on location
			sum = sum + c[i];	
		}
		System.out.println(sum);
		
		int newSum = 0;
		for(int x : c) {  // Not depends on location
			newSum = newSum + x;
		}
		
		
		// 2D Array
		int twoDArray[][] = new int[3][3];

		for(int i =0; i<3; i++) {
			for(int j=0; j<3; j++) {
				twoDArray[i][j] = (i+1) * (j+1);
			}
		}
		
		for(int i =0; i<3; i++) {
			for(int j=0; j<3; j++) {
				sum = sum + twoDArray[i][j];
			}
		}
		
		
		
		
		
		for(int x[] : twoDArray) {
			for(int y : x) {
				
			}
			
		}
		
		
		      

	}

}
