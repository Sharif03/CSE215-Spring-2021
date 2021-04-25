package theoryLec16_OOPWithExceptionHandling;

public class ExceptionHandlingCustom {

	public static void main(String[] args)   {
		// Invalid Case: 2, 3, 8 
		// Valid Case: 7, 10, 5		  
		try {
			Triangle t = new Triangle(2, 3, 8);
		} catch (InvalidTriangleException e) {
			e.printStackTrace();
		}	
	}
}
class InvalidTriangleException extends Exception {
	public InvalidTriangleException(String errorMsg) {
		super(errorMsg);
	}
}
class Triangle{
	private int sideA;    // sideA + sideB > sideC => It's Valid Triangle
	private int sideB;    // sideB + sideC > sideA => It's Valid Triangle
	private int sideC;    // sideC + sideA > sideB => It's Valid Triangle
	public Triangle(int sideA, int sideB, int sideC) throws InvalidTriangleException {
		checkValidity(sideA, sideB, sideC);
	}
	public void checkValidity(int sideA, int sideB, int sideC) throws InvalidTriangleException {
		if(sideA + sideB > sideC && sideB + sideC > sideA && sideC + sideA > sideB) {
			this.sideA =sideA;
			this.sideB = sideB;
			this.sideC = sideC;
			System.out.println("It's Valid");	
		}
		else
			throw new InvalidTriangleException("It's Invalid");	
	}
}