package theoryLec16_OOPWithExceptionHandling;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

//Exception 
public class ExceptionHandling00_Practice {
	
public static void main(String[] args) throws ArithmeticException {
		/*
		 // Try-catch Checked problem
		String fileAddress = "Name.txt";
		File fileObject = new File(fileAddress);
		try {
			fileObject.createNewFile();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		int array[] = new int[10];
		//array[50] = 20;
		 
		*/
		
		
		
		/*
		 // Try-catch unchecked problem
		Scanner input = new Scanner(System.in);
	
		System.out.println("Program Start");
		int a = 10;
		
		System.out.print("Enter a number: ");
		int b = input.nextInt();
		int result = 0;
		int array[] = new int[10];
		
		try{
			array[11] = b;
			System.out.println("Try Block");
			//result = a/b;
		} catch(ArithmeticException e) {
			System.out.println("Catch Block #1");
		} catch(ArrayIndexOutOfBoundsException e) {
				System.out.println("Catch Block #2");	
		} catch(Exception e) {
			System.out.println("Catch Block #3");	
	    } finally {
			System.out.println("Finally Block");
		}
		
		System.out.println("Program End");
		*/
		
		
		/*
		//Try-catch custom problem solved with throw.
		int a = 10;
		try {
			if(a>5) {
				System.out.println("Error");
					throw new JavaBatchOneAndTwoException("Error occurred for a is greater then 5");
			}
			else
				System.out.println("Value is perfect");
		} catch(JavaBatchOneAndTwoException errorObj) {
			System.out.println(errorObj);
			
			System.out.println("Error Handled");
		}
		*/
		
		
		System.out.print("Start");
		JavaBatchOneAndTwoException a = new JavaBatchOneAndTwoException();
		a.doSum(2, 0);
		System.out.print("Start");
		
	}
	
}

class JavaBatchOneAndTwoException extends Exception{
	public JavaBatchOneAndTwoException(){
		
	}
	public JavaBatchOneAndTwoException(String errorMsg) {
		super(errorMsg);
	}
	
	public  void doSum(int b, int a) throws ArithmeticException{
		int c = a/b;
		throw new ArithmeticException();
	}
	
}

