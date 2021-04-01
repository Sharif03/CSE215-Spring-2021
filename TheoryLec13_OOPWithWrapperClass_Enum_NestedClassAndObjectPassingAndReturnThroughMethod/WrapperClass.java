package TheoryLec13_OOPWithWrapperClass_Enum_NestedClassAndObjectPassingAndReturnThroughMethod;

public class WrapperClass {

	public static void main(String[] args) {
		String stringVlue = "10";
		int a =  Integer.parseInt(stringVlue);
		Float b = 20.3f;
		
		
		add(a, b);

	}
	
	public static void add(int a, float b){
		System.out.println("Addition: " + (a+b));
	}

}
