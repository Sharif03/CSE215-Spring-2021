package theoryLec11_OOPWithMethod;

public class StatickeywordInDetails {
	static int value1 = 10;  // Class variable- Change for everyone
	float value2 = 20.5f;    // Instance variable- Change His His who's who's

	public static void main(String[] args) {
		// Static Method
		StatickeywordInDetails stk1 = new StatickeywordInDetails(); 
		//stk1.addition(10, 20);
		Addition a1 = new Addition();
		//a1.add(10, 20);
		
		
		// Static Variable
		StatickeywordInDetails stk2 = new StatickeywordInDetails(); 
		stk2.value1 = 20;
		System.out.println("For stk2 object: " +stk2.value1); //  20
		
		stk1.value1 = 30;
		System.out.println("For stk2 object: " +stk2.value1); //  20
		System.out.println("For stk1 object: " +stk1.value1); //  30
		
		Addition a2 = new Addition();
		a1.name = "Abir";
		a2.name = "Navin";
		System.out.println(a1.name);
		System.out.println(a2.name);
		
		
		
	
	}
	// Static Block
	static {
		System.out.println("Hello");
	}
	public void addition(int a, int b) {
		System.out.println("Sum: " + (a+b));
	}
}

class Addition{
	String name;
	float fValue = 1.2f;
	
	public void add(int a, int b) {
		System.out.println("Sum: " + (a+b));
	}
}











// Static Class
class A{
	static int value = 5;
	int a = 10;
	int b = 20;
	void f1() {
		System.out.println("I'm from outer class");
	}
	
	// Exceptional use of static variable
	public void aMethod() {
		A.value = 5;
		int value = 10;
		System.out.println(value + A.value);  // Addition of static and non-static variable in method 
	}	
	
	class B{
		int r = 5;
		int s = 20;
		
		void f2() {
			System.out.println("I'm from inner class- Without Static");
		}
	}
	
	static class C{
		int r = 5;
		int s = 20;
		
		void f3() {
			System.out.println("I'm from inner class- With Static");
		}
	}
}




