package theoryLec12_OOPWithNestedClass_Inheritence_ThisAndSuper;

import java.util.Scanner;

public class ArrayInputThroughMethod {
	public static void main(String[] args) {
		int[][] a = arrayInput();
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length; j++) {
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}
		
	}
	public static int[][] arrayInput() {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a number");
		int r = input.nextInt();
		int c = input.nextInt();
		int a[][] = new int[r][c];
		for (int i = 0; i < r; i++) {
			for (int j = 0; j < c; j++) {
				a[i][j]= input.nextInt();
			}
		}
		return a;
	}

}
