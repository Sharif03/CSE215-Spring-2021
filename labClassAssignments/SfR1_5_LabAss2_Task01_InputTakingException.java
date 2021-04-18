package labClassAssignments;


import java.util.Scanner;

public class SfR1_5_LabAss2_Task01_InputTakingException {

	public static void main(String[] args) throws Exception{
		Scanner input = new Scanner(System.in);
		// 1. Write a program that takes 10 positive integers from the user and prints the sum. 
		// If any negative value is entered, the program should catch it as an exception and display 
		// “Input positive integer only”. The program must continue taking input until it gets 10 positive 
		// integers.
		
		System.out.println("Enter number of input: ");
		int numberOfInput = input.nextInt();  // 10
		int arr[] = new int[numberOfInput];
		int valueSum = 0;
		for (int i = 0; i < arr.length; i++) {
			System.out.println("Enter a number: ");
			arr[i] = input.nextInt();
			if(arr[i] < 0)
				throw new Exception("Input positive integer only");
			else {
				valueSum = valueSum + arr[i];
			}
		}
		System.out.println("Summation: " + valueSum);
	}

}
