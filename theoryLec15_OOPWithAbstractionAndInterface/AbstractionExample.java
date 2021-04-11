package theoryLec15_OOPWithAbstractionAndInterface;

public class AbstractionExample {

	public static void main(String[] args) {
		//Shape s = new Shape(); // It's not possible or should not to create a abstract object
		Square s = new Square("Square", true, 12.4f);
	}

}
abstract class Shape{
	String name;
	boolean isColor;
	public Shape(String name, boolean isColor) {
		this.name = name;
		this.isColor = isColor;
	}
	public abstract float area();
}

class Square extends Shape{
	float side1;
	public Square(String name, boolean isColor, float side1) {
		super(name, isColor);
		this.side1 = side1;
	}

	public float area() {
		return (float)(Math.pow(side1,2));
	}
}
class Rectangle extends Shape{
	float side1;
	float side2;
	public Rectangle(String name, boolean isColor, float side1, float side2) {
		super(name, isColor);
		this.side1 = side1;
		this.side1 = side2;
	}
	public float area() {
		return side1*side1;
	}
}
