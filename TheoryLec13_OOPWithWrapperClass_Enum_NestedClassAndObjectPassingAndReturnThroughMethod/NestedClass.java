package TheoryLec13_OOPWithWrapperClass_Enum_NestedClassAndObjectPassingAndReturnThroughMethod;

public class NestedClass {
	public static void main(String[] args) {
		OuterClass outerObject = new OuterClass();
		OuterClass.InnerClass innerObject =  outerObject.new InnerClass();
		
		
		//OuterClass.InnerClass.A aOBject = outerObject.obj.new A();  // When inner class has another InnerClass named A
		
		int valueA = outerObject.a;
		int valueB = innerObject.b;
		
		System.out.println("Value of Outer class: " + valueA);
		System.out.println("Value of Inner class: " + valueB);
		
		
		//InnerClass ax = new InnerClass();  // When Our InnerClass is Static
	}
	
}

// Nested Class First Version
class OuterClass{
	InnerClass obj; 
	static int a = 10;
	int x = 20;
	
	
	class InnerClass{
		int b = a;
	}
}


/*
// Nested Class Second Version
class OuterClass{
	InnerClass obj; 
	static int a = 10;
	int x = 20;
	
	
	class InnerClass{
		int b = a;
		
		class A{
	        int b = 20;
        }
	}
}

*/


// Normal Class, Which has no relation with Nested InnerClass
class InnerClass{
	int d = 10;
	
}
