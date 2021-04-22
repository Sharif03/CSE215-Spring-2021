package theoryLec16_OOPWithExceptionHandling;

public class ExceptionHandling01_UncheckedException {
	
	public static void main(String[] args) {
		int a = 10;
		int b = 0;
		
		int result = 0;
		
		try {
			result = 10 / 0;  
			System.out.println("Code is Working");
		} catch(ArithmeticException e) {
			System.out.println("Eception Handled from ArithmeticException");
		} finally {
			System.out.println("Finally Block executed");
		}
		
		System.out.println("Result: " + result);		
	}
}



