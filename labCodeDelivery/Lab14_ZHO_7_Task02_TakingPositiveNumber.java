package labManual14;

import java.util.Scanner;

public class Lab14_ZHO_7_Task02_TakingPositiveNumber {

	public static void main(String[] args) throws Exception{
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int number = input.nextInt();
		int numberCounter = 0;
		int numberSum = 0;
		while(numberCounter < 9) {
			if(number < 0)
				throw new Exception("Input positive integer only");
			else
				numberSum = numberSum + number;
			System.out.println("Enter a number: ");
			number = input.nextInt();
			
			numberCounter++;
		}
		System.out.println("Sum: " + numberSum);
	}

}
