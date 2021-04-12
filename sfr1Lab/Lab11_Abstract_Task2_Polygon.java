package sfr1Lab;

public class Lab11_Abstract_Task2_Polygon {

	public static void main(String[] args) {
		Triangle t1 = new Triangle(3, 3.2f, 2.9f, 1.5f);
		System.out.println("Area of a triangle: " + t1.area());
		System.out.println("Perimeter of a triangle: " + t1.perimeter());

	}
}
abstract class Polygon{
	private int numSide;

	public Polygon(int numSide) {
		this.numSide = numSide;
	}

	public int getNumSide() {
		return numSide;
	}
	public void setName(int numSide) {
		this.numSide = numSide;
	}
	public abstract double area();
	public abstract double perimeter();
}
class Triangle extends Polygon{
	private double sideA;
	private double sideB;
	private double sideC;
	public Triangle(int numSide, double sideA, double sideB, double sideC) {
		super(numSide);
		this.sideA = sideA;
		this.sideB = sideB;
		this.sideC = sideC;
	}
	public double getSideA() {
		return sideA;
	}
	public void setSideA(double sideA) {
		this.sideA = sideA;
	}
	public double getSideB() {
		return sideB;
	}
	public void setSideB(double sideB) {
		this.sideB = sideB;
	}
	public double getSideC() {
		return sideC;
	}
	public void setSideC(double sideC) {
		this.sideC = sideC;
	}
	@Override
	public double area() {
		double p = perimeter();
		return Math.sqrt(p*(p-sideA)*(p-sideB)*(p-sideC));
	}
	@Override
	public double perimeter() {
		return (sideA +sideB +sideC)/2;
	}
}
