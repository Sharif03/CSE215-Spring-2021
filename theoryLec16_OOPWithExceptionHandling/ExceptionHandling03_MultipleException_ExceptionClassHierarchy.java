package theoryLec16_OOPWithExceptionHandling;

public class ExceptionHandling03_MultipleException_ExceptionClassHierarchy {
	public static void main(String[] args) {
		int array [] = new int[10];
		
		int a = 10;
		int b = 0;
		int result;
		
		try {
			result = a/b;
			array[11] = 10;
		} catch(ArithmeticException e) {
			System.out.println("Eception Handled  from ArithmeticException");
		} catch(IndexOutOfBoundsException e) {
			System.out.println("Eception Handled  from IndexOutOfBoundsException");
		} catch(NullPointerException e) {
			System.out.println("Eception Handled  from NullPointerException");
		} catch(Exception e) {
			System.out.println("Eception Handled from Exception");
		}
		
		
		
	}
}
