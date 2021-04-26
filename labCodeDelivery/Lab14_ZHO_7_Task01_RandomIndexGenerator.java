package labManual14;

import java.util.Scanner;

public class Lab14_ZHO_7_Task01_RandomIndexGenerator {

	public static void main(String[] args) throws IndexOutOfBoundsException, ArithmeticException {
		Scanner input = new Scanner(System.in);
		
		int[] randomArray = new int[100];
		for (int i = 0; i < randomArray.length; i++) {
			randomArray[i] = (int) (Math.random() * 10000);
			System.out.println("["+ i +"] "+ randomArray[i]);
		}
		System.out.println("Enter a index value: ");
		int indexValue = input.nextInt(); 
		
		if(indexValue >=0 && indexValue<100) {
			System.out.println("The value is: " + randomArray[indexValue] +"\n");
			int resultValue = randomArray[indexValue]/indexValue;
			
			if(indexValue == 0)
				throw new ArithmeticException("Index number is Zero");
			else
				System.out.println("The divided value is: " + resultValue);
		}
		else {
			throw new IndexOutOfBoundsException("Invalid Index number");
		}
		System.out.println("Program Ends");
			 
		
		
	}

}

