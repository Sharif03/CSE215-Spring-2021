package theoryLec12_OOPWithNestedClass_Inheritence_ThisAndSuper;

public class Test_InnerAndOuterClass {

	public static void main(String[] args) {
		MyOuter outerObject = new MyOuter();
		MyOuter.MyInner innerObject =outerObject.new MyInner();

		
	}

}

class MyOuter{
	private int x;
	MyInner inner = new MyInner();
	public void doStuff() {
		inner.go();
	}
	class MyInner{
		void go() {
			x = 10;
		}
	}
}