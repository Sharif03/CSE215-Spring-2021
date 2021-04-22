package theoryLec15_OOPWithAbstractionAndInterface;

public class ComparableObject_TestBox {

	public static void main(String[] args) {
		Box b1= new Box(5, 2);
		Box b2= new Box(2, 9);
		
		System.out.println(b1.compareTo(b2));
		
		/*
		// Use of generic Type
		GenericType<Float> g1 = new GenericType<Float>(10.f);
		g1.printValue();
		
		GenericType<Integer> g2 = new GenericType<Integer>(10);
		g2.printValue();
		
		GenericType<String> g3 = new GenericType<String>("Hi");
		g3.printValue();
		*/
	}

}

class Box implements Comparable <Box> {
	private int a;
	private int b;
	
	public Box(){
		
	}
	public Box(int a, int b) {
		this.a = a;
		this.b = b;
	}
	
	@Override
	public int compareTo(Box o) {
		if(a> o.a)
			return 1;
		else if(a == o.a)
			return 0;
		else
			return -1;
	}	
}
/*
// Generic Type class who actually deal with abstract data type
// Abstract data type means you can use Integer, Float, String even though a Object in this class and it's method
class GenericType<Tash>{
	private Tash a;
	
	GenericType(){
		
	}
	GenericType(Tash a){
		this.a = a;

	}
	public void printValue() {
		System.out.println("Value is: " + this.a);
	}
}
*/
/*
 
 // Generic or abstract Type Comparable interface, which actually underneath of System
interface Comparable<T> {
	public int compareTo(T t);
}
*/