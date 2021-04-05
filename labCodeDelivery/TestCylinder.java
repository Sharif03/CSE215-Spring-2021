package labCodeDelivery;

public class TestCylinder {

	public static void main(String[] args) {
		Cylinder c = new Cylinder(2.0);
		System.out.println(c.getRadius());
		System.out.println(c.getColor());
		System.out.println(c.getHeight());
		
		System.out.println(c.getArea());
		System.out.println(c.getVolume());
	}

}
