package theoryLec11_OOPWithMethod;

public class StaticVariableExample {
	     static String myClassVar = "Hello";
 
	public static void main(String[] args) {
		StaticVariableExample obj1 = new StaticVariableExample();
		StaticVariableExample obj2 = new StaticVariableExample();
		StaticVariableExample obj3 = new StaticVariableExample();
		
		
		//All three display "Class or static Variable"
		System.out.println(obj1.myClassVar);  // Hello
		System.out.println(obj2.myClassVar);  // Hello
		System.out.println(obj3.myClassVar);  // Hello
		
		//Change the value of static variable using obj2
		System.out.println("Changed Text"); // Changed Text
		obj2.myClassVar="Hi";
		obj3.myClassVar="Hey";
		
		//All three display "Changed Text"
		System.out.println(obj1.myClassVar);  //Hello(Z, D, M, R, F)   //Hey(T, N, I, S)  // 
		System.out.println(obj2.myClassVar);  //Hi                    //Hey
		System.out.println(obj3.myClassVar);  //Hey                   //Hey

		
	}

}
