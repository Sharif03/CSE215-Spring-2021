package theroyLec03;

import java.util.Scanner;

public class ArrayProgram {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		// 1D Array
		System.out.println("Enter range for this array: ");
		int range = input.nextInt();
		int a[] = new int[range];      // [2^32 = 4294967296 =  -2147483648 +2147483647]
		                               //=- 2^31 TO  +2^31-1
		
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
		
		
		// 2D Array
		
		      

	}

}
