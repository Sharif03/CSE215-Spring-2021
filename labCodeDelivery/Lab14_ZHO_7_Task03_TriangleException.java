package labManual14;

import java.util.Scanner;

public class Lab14_ZHO_7_Task03_TriangleException {

	public static void main(String[] args)  {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter SideA: ");
		int sideA = input.nextInt();
		
		System.out.println("Enter SideB: ");
		int sideB = input.nextInt();
		
		System.out.println("Enter SideC: ");
		int sideC = input.nextInt();
		
		Triangle t1 = new Triangle(sideA, sideB, sideC);
		try {
			t1.checkValidity();
		} catch (IllegalTriangleException e) {
			System.out.println(e);
		}
	}
}
class IllegalTriangleException extends Exception{
	public IllegalTriangleException(String erroMessage) {
		super(erroMessage);
	}
}
class Triangle {
	private int sideA;
	private int sideB;
	private int sideC;
	public Triangle(int sideA, int sideB, int sideC) {
		this.sideA = sideA;
		this.sideB = sideB;
		this.sideC = sideC;
	}
	public void checkValidity() throws IllegalTriangleException{
		if(sideA+sideB<sideC || sideB+sideC<sideA || sideC+sideA<sideB)
			throw new IllegalTriangleException("Invalid Triangle");
		else
			System.out.println("Valid Triangle");
	}	
}