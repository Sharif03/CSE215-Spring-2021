package theoryLec11_OOPWithMethod;

public class UseStatic {
	static int a = 3;
    static int b;
    
	public static void main(String[] args) {
		math(42);
	}
	
	//Output:
	  // Static block initialized
	  // 42
      // 3
	  // 12
	           
	
	public static void math(int x) {
    	System.out.println(x);
    	System.out.println(a);
    	System.out.println(b);
    }
    
    //This used for the initialization of static variables.
    static {
    	System.out.println("Static block initialized");
    	b = a*4;  //b = 12  a = 3 
    }

}




