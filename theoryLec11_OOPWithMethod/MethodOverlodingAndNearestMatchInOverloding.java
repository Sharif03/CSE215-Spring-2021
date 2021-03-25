package theoryLec11_OOPWithMethod;

public class MethodOverlodingAndNearestMatchInOverloding {
	public static void addition() {
		System.out.println("I'm from empty perameter");
	}
	public static void addition(int a) {
		System.out.println("I'm from integer perameter");
	}
	public static void addition(float a) {
		System.out.println("I'm from float perameter");
	}

	public static void main(String[] args) {
		// Method overloading
		addition();
		addition(10);
		addition(10.5f);
		
		
		// Nearest match in overloading
		Test t = new Test();
		int i = 1;
		float f = 2.5f;
		double d = 10.0;
		
		t.print(i, i);  // Product: 1*1 = 1.0
		t.print(f, f);  // Product: 2.5 * 2.5 = 6.25
		t.print(d, d);  // Sum: 10.0 + 10.0 = 20.0
		t.print(i, f);  // Product: 1*2.5f = 2.5
	}
}
class Test{
	void print(double x, double y) {
		System.out.println("Sum: " + (x+y));
		
	}
	void print(float f, double d) {
		System.out.println("Product: " + (f*d));
	}
	
}