package theoryLec10_OOPWithEncapsulation;

public class BoxTestDrive {

	public static void main(String[] args) {
		Box b1 = new Box(2, 3, 4);
		System.out.println(b1.toString());
		System.out.println("Volume: " + b1.volume());

	}

}
