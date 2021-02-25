package theroyLec02;

public class MathClass {

	public static void main(String[] args) {
	
		final float PI = 3.14F;  // Constant
		int a = 10;
		
		int result = (int) (Math.pow(a, 2));
		System.out.println(result);
		
		double radious = 2 * Math.PI * Math.pow(2, 3);
		System.out.println("The Radious is: " + radious);
		
		System.out.println(	Math.PI);
		
		System.out.println("Absulate value is: " + Math.abs(-10));
		
		System.out.println("Max value is: " + Math.max(5, 19));
		
		System.out.println("Floor value is: " + Math.floor(2.99));
		
		System.out.println("Floor value is: " + Math.ceil(2.01));
		
		

	}

}
