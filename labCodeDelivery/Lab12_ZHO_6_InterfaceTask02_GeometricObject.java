package labManual12;

public class Lab12_ZHO_6_InterfaceTask02_GeometricObject {

	public static void main(String[] args) {
		Circle circle = new Circle(5);
		System.out.println("Circle's perimeter is " + circle.getPerimeter());
		System.out.println("Circle's area is " + circle.getArea());
		System.out.println();
		
		ResizableCircle circleResizable = new ResizableCircle(10);
		System.out.println("Resizable Circle's perimeter is " + circleResizable.getPerimeter());
		System.out.println("Resizable Circle's area is " + circleResizable.getArea());
		System.out.println("Resizable Circle is " + circleResizable.resize(20) + "% resizing");
	
	}

}

interface GeometricObject{
	public double getPerimeter();
	public double getArea();
}

class Circle implements GeometricObject{
	protected double radius = 1.0;
	
	public Circle(double radius) {
		this.radius = radius;
	}
	public double getPerimeter() {
		return Math.PI * (2* radius);
	}
	public double getArea() {
		return Math.PI*radius*radius;
	}
}

interface Resizable{
	public int resize(int percent);
}
class ResizableCircle extends Circle implements Resizable {
	ResizableCircle(double radius){
		super(radius); 
	}
	public int resize(int percent) {
		return percent;
	}
}
