package theroyLec02;

import java.util.Scanner;

public class SelectionStatement_IfElse_Switch_TernaryOperator {

	public static void main(String[] args) {
		/*
		// a) Selection: if, if-else, if-else if-else, switch(expression){case: default:}, Ternary operator (int a = (2>a) ? 2 : a ;) ?:
		
		// If
		int value = 11;
		if(value == 10)
			System.out.println("It's ok to Access");
		
		// If-Else
		int value1 = 10;
		int value2 = 6;
		
		if(value1 > value2)
			System.out.println("Max number is: " + value1);	
		else
			System.out.println("Min number is: " + value2);
		
		// If-Else If-Else
		int month1 = 2;
		if(month1 == 1)
			System.out.println("January");	
		else if(month1 ==2)
			System.out.println("February");	
		else if(month1 ==3)
			System.out.println("March");
		else
			System.out.println("Not Match");
		
		*/
		
		/*
		//switch(expression){case: default:}
		int mon = 1;
		switch(++mon) {
		case 1:
			System.out.println("January");
			break;
		case 2:
			System.out.println("February");	
			break;
		case 3:
			System.out.println("March");	
			break;
		default:
			System.out.println("Not Match");
		}
		System.out.println(mon);
		*/
		
		// Ternary operator (int a = (2>a) ? 2 : a ;) ?:
		int a = 1;
		int b = 6;
		
		int result = (a > b) ? a : b;
		System.out.println(result);
		
		
		int number = 11;
		String res = (number%2 == 0) ? "Even" : "Odd";
		System.out.println(res);
		
		Scanner input = new Scanner(System.in);
		String message = input.nextLine();  // Hello
		String fullMessage = (message.equals("Hello")) ? "Hello" : "Hello Java";
		System.out.println(fullMessage);
		
		
		
		
		
		
		
			
			
		
		
			

	}

}
