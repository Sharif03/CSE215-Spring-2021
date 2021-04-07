package labManual11;

public class ZHO_S7_Lab11_TestShapeClass {

	public static void main(String[] args) {
		Circle c1 = new Circle(2.3);
		System.out.println("Circle objecte created: " +Circle.getCircleCounter() );
		Rectangle r1 = new Rectangle(2.2, 3.2);
		System.out.println("Rectangle objecte created: " + Rectangle.getRectangleCounter());
		
	}
}

class Shape {
	private double dim1;
	private double dim2;
	
	public Shape(double dim1, double dim2) {
		this.dim1 = dim1;
		this.dim2 = dim2;
	}

	public double getDim1() {
		return dim1;
	}

	public void setDim1(double dim1) {
		this.dim1 = dim1;
	}

	public double getDim2() {
		return dim2;
	}

	public void setDim2(double dim2) {
		this.dim2 = dim2;
	}
	
	public double getArea() {
		return dim1*dim2;
	}

	public String toString() {
		return "Shape [Dim1=" + dim1 + ", Dim2=" + dim2 + "]";
	}	
}

class Circle extends Shape{
	private int circleId;
	private static int circleCounter = 0;
	
	public Circle(double radius) {
		super(radius, radius);
		circleCounter++;
	}

	public double getRadius() {
		return super.getDim1();
	}
	public void setRadius(double radius) {
		this.setDim1(radius);
	}

	public static int getCircleCounter() {
		return circleCounter;
	}
	
	@Override
	public double getArea() {
		return Math.PI*Math.pow(super.getDim1(), 2);
	}

	@Override
	public String toString() {
		return "Circle [Radius=" + super.getDim1() + "]";
	}		
}
class Rectangle extends Shape {
	private int rectangleId;
	private static int rectangleCounter = 0;
	
	public Rectangle(double side1, double side2) {
		super(side1, side2);
		rectangleCounter++;
	}
	
	public static int getRectangleCounter() {
		return rectangleCounter;
	}
	
	public double getSide1() {
		return super.getDim1();
	}
	public void setSide1(double side1) {
		super.setDim1(side1);
	}
	public double getSide2() {
		return super.getDim2();
	}
	public void setSide2(double side2) {
		this.setDim2(side2);
	}
	
	@Override
	public double getArea() {
		return super.getDim1() * super.getDim2();
	}
	
	@Override
	public String toString() {
		return "Rectangle [Side1=" + super.getDim1() + ", Side2=" + super.getDim2() + "]";
	}	
}
