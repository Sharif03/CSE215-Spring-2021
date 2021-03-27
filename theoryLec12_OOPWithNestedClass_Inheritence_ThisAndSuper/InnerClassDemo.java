package theoryLec12_OOPWithNestedClass_Inheritence_ThisAndSuper;
public class InnerClassDemo {

	public static void main(String[] args) {
		Outer outer = new Outer();
		outer.test();

	}

}

class Outer{
	int outerX=3;
	void test() {
		Inner inner = new Inner();
		inner.display();
	}
	class Inner {
		void display() {
			System.out.println("Display: OuterX = " + outerX);
		}
	}	
}
