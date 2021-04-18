package labClassAssignments;

public class SfR1_5_LabAss2_Task02_InputTriangleException {

	public static void main(String[] args) {
		
		// 2. Create a Triangle class. Now create IllegalTriangleException class that extends Exception. 
		// If the sum of any two sides is not greater than the third side, the Triangle class should throw 
		// IllegalTriangleException
		try {
			Triangle t1 = new Triangle(1, 2, 6);
			t1.checkException();
			
		} catch(IllegalTriangleException errorMessage) {
			System.out.println(errorMessage);	
		}
	}
}
class IllegalTriangleException extends Exception {
	public IllegalTriangleException(String errorMessage) {
		super(errorMessage);
	}
}

class Triangle{
	double side1;
	double side2;
	double side3;
	
	public Triangle(double side1, double side2, double side3) {
		this.side1 = side1;
		this.side2 = side2;
		this.side3 = side3;
	}
	
	public void checkException() throws IllegalTriangleException {
		if((side1+side2)>side3  && (side1+side3)>side2 && (side2+side3)>side1)
			System.out.println("It's permissible");	
		else
			throw new IllegalTriangleException("It's not permissible");
	}	
}