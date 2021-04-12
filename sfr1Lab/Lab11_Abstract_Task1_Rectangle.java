package sfr1Lab;

public class Lab11_Abstract_Task1_Rectangle {

	public static void main(String[] args) {
		Rectangle r1 = new Rectangle("Rectangle", 3.2f, 1.5f);
		System.out.println("Area of a Rectangle: " + r1.area());
		System.out.println("Perimeter of a Rectangle: " + r1.perimeter());


	}
}
abstract class Shape{
	private String name;

	public Shape(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public abstract double area();
	public abstract double perimeter();
}
class Rectangle extends Shape{
	private double length;
	private double width;
	public Rectangle(String name, double length, double width) {
		super(name);
		this.length = length;
		this.width = width;
	}
	public double getLength() {
		return length;
	}
	public void setLength(double length) {
		this.length = length;
	}
	public double getWidth() {
		return width;
	}
	public void setWidth(double width) {
		this.width = width;
	}
	@Override
	public double area() {
		return length*width;
	}
	@Override
	public double perimeter() {
		return length+width;
	}	
}

