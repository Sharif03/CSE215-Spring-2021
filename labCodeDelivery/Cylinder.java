package labCodeDelivery;

public class Cylinder extends Circle{
	private double height = 1.0;

	public Cylinder(){
		
	}
	
	public Cylinder(double height) {
		this.height = height;
	}
	public Cylinder(double height, double radius) {
		super(radius);
		this.height = height;
	}
	public Cylinder(double height, double radius, String color) {
		super(radius, color);
		this.height = height;
	}

	public double getHeight() {
		return height;
	}


	public void setHeight(double height) {
		this.height = height;
	}


	@Override
	public String toString() {
		return "Cylinder [height=" + height + ", radius=" + getRadius() + ", color=" + getColor() + "]";
	}
	
	public double getVolume() {
		return getArea()*height;
	}
	
	
}
