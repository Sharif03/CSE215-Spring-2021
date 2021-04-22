package theoryLec15_OOPWithAbstractionAndInterface;

public class InterfaceExample {
	public static void main(String args[]){ 
		Printer p1 = new Printer();
		p1.printing1();
		p1.printing2();
		
		// Use of static keyword in interface and it's children class also
		System.out.println(Machine.a);
		Machine.staticMethod();
		p1.staticMethod();
		Printer.staticMethod();

		// Use of default keyword through children class
		p1.defaultMethod();
	}

}

interface Machine{
	public static final int a = 10;  // Interface variable is be default Static and final
	
	public void printing1();
	public void printing2();
	
	// We can override of this static method and we can use this method through interfaces class name and children's reference variable
	// Java version 8
	public static void staticMethod() {
		System.out.println("Hello static");	
	}
	
	// We can not override of this default method, We just use it through the children's reference variable 
	// Java version 8
	public default void defaultMethod() {
		System.out.println("Hello default");	
	}
	
	// We can not use it outside of this interface because of its private access modifier
	// Java version 9
	private void privateMethod() {
		System.out.println("Hello private");	
	}
}

// Concrete class
class Printer implements Machine {	
	@Override
	public void printing1() {
		System.out.println("Method 1");	
	}
	@Override
	public void printing2() {
		System.out.println("Method 2");	
	}
	public static void staticMethod() {
		System.out.println("Static Method");	
	}
}
/*
// Achieved Multiple Inheritance  && Abstraction && Loose couple
interface A{
	void method1();
}
interface B{
	void method1();
}

//Multiple inheritance occurred through interface
class C implements A, B{

	@Override
	public void method1() {
		System.out.println("Method 1");	
	}
	
}


// interface extends interface
interface W{
	
}
interface X{
	
}

//Multiple inheritance occurred through interface
interface Y extends W, X{  
	
}

//class implements interface
class Z implements Y{
	
}


// Double inheritance (Multiple && Multiple) occurred
interface S{  
	
}
interface T{  
	
}

interface U extends S, T{  
	
}

interface Special extends U, Y{
	
}
*/

