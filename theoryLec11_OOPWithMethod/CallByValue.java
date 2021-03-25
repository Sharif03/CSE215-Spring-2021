package theoryLec11_OOPWithMethod;

public class CallByValue {

	public static void main(String[] args) {
		int a = 15;
		int b = 20;
		
		TestValue ob = new TestValue();
		ob.math(a, b); //will make no change in the value of a & b
		System.out.println("a: " + a + " b: " + b);

	}

}
class TestValue {
	
	public void math(int i, int j) {
		i*=2;
		j/=2;
		
		System.out.println("i: " + i + " j: " + j);
	}
}