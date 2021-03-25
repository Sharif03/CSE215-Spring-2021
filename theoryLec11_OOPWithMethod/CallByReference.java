package theoryLec11_OOPWithMethod;

public class CallByReference {

	public static void main(String[] args) {
		TestReference ob= new TestReference(14, 30);
		ob.math(ob); //will make  change in the value of a & b
		
		System.out.println("a: " + ob.a +" b: " + ob.b);

	}

}
class TestReference {
	int a;
	int b;
	TestReference(int nawA, int newB){
		a = nawA;
		b = newB;
	}
	public void math(TestReference o) {
		o.a *=2;
		o.b /=2;
		
		System.out.println("a: " + o.a +" b: " + o.b);
	}
	
}