package theoryLec11_OOPWithMethod;

public class InstanceVariableExample {
	 String a = "Instance Variable";

	public static void main(String[] args) {
		InstanceVariableExample obj1 = new InstanceVariableExample();
		InstanceVariableExample obj2 = new InstanceVariableExample();
		InstanceVariableExample obj3 = new InstanceVariableExample();
		
		//All three display "Instance Variable"
		System.out.println(obj1.a);  // Instance Variable
		System.out.println(obj2.a);  // Instance Variable
		System.out.println(obj3.a);  // Instance Variable
		
		//Change the value of Instance variable using obj2
		obj2.a ="Changed Text";
		
		//Only obj2 display "Changed Text", rest display "Instance Variable"
		System.out.println(obj1.a);  // Instance Variable
		System.out.println(obj2.a);  // Changed Text
		System.out.println(obj3.a);	 //	Instance Variable

	}

}
