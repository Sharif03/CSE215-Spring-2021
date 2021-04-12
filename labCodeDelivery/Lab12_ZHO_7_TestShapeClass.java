package labManual12;

public class Lab12_ZHO_7_TestShapeClass {

	public static void main(String[] args) {
		Shape s1 = new Circle ("Blue", true, 6.0);
		System.out.println("color: " + s1.getColor());
		System.out.println("filed: " + s1.isFilled());
		
		System.out.println("Area: " + s1.getArea());
		System.out.println("Peremeter: " + s1.getPerimeter());
		System.out.println();
		
		
		Circle c1=(Circle) s1;
		
		System.out.println("color: " + c1.getColor());
		System.out.println("filed: " + c1.isFilled());
		
		/*
		Rectangle r=new Rectangle(12.5, 4.5, "Red", true);
		System.out.println("The Area of Rectangle: "+r.getArea());
		System.out.println("The Parameter of Rectangle: "+r.getPerimeter());
		r.setColor("Yellow");
		r.setFilled(false);
		r.setLength(10.0);
		r.setWidth(2.5);
		System.out.println(r.getColor());
		System.out.println(r.getLength());
		System.out.println(r.getWidth());
		System.out.println(r.isFilled());
		System.out.println(r);
		Circle c=new Circle("Green",true,4.6);
		System.out.println("The Area of Circle: "+c.getArea());
		System.out.println("The Parameter of Circle: "+r.getPerimeter());
		System.out.println(c);
		c.setColor("Yellow");
		c.setFilled(false);
		c.setRadius(5.0);
		System.out.println(c.getColor());
		*/
	}

}
abstract class Shape {
	private String color;
	private boolean filled;
	
	public Shape() {}
	public Shape(String color, boolean filled) {
		this.color = color;
		this.filled = filled;
	}

	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public boolean isFilled() {
		return filled;
	}
	public void setFilled(boolean filled) {
		this.filled = filled;
	}

	abstract double getArea();
	abstract double getPerimeter();
	
	@Override
	public String toString() {
		return "Shape [color=" + color + ", filled=" + filled + "]";
	}
}

class Rectangle extends Shape {
	private double width;
	private double length;
	
	public Rectangle() {};
	public Rectangle(double width, double length, String color, boolean filled) {
		super(color, filled);
		this.width = width;
		this.length = length;
	}
	public Rectangle(double width, double length) {
		super();
		this.width = width;
		this.length = length;
	}
	
	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public double getLength() {
		return length;
	}

	public void setLength(double length) {
		this.length = length;
	}

	double getArea() {
		return width*length;
	}

	double getPerimeter() {
		return 2*(width + length);
	}
	@Override
	public String toString() {
		return "Rectangle [width=" + width + ", length=" + length + "]";
	}	
}

class Circle extends Shape {
	private double radius;

	Circle() {}
	public Circle(double radius) {
		this.radius = radius;
	}
	public Circle(String color, boolean filled, double radius) {
		super(color, filled);
		this.radius = radius;
	}
	
	public double getRadius() {
		return radius;
	}
	public void setRadius(double radius) {
		this.radius = radius;
	}
	
	double getArea() {
		return Math.PI*radius*radius;
	}	

	double getPerimeter() {
		return 2*Math.PI*radius;
	}
	
	public String toString() {
		System.out.println(super.toString());	
		return getClass().getName();	
	}		
	
}





