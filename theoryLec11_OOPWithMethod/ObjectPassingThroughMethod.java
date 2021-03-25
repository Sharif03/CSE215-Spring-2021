package theoryLec11_OOPWithMethod;

public class ObjectPassingThroughMethod {

	public static void main(String[] args) {
		Box box1 = new Box(3, 3);
		Box box2 = new Box(4, 4);
		
		boolean result = box1.checkEquality(box2);
		if(result == true)
			System.out.println("Box1 is Big");
		else
			System.out.println("Box2 is Big");
		
		
		

	}

}
class Box{
	private int side1;
	private int side2;
	public Box(){
		
	}
	public Box(int side1, int side2) {
		this.side1 = side1;
		this.side2 = side2;
	}
	public boolean checkEquality(Box o) {
		if(side1 > o.side1 && side2 > o.side2)
			return true;
		else
			return false;		
	}
	
	
	
	
	
	
	
	public int getSide1() {
		return side1;
	}
	public void setSide1(int side1) {
		this.side1 = side1;
	}
	public int getSide2() {
		return side2;
	}
	public void setSide2(int side2) {
		this.side2 = side2;
	}

	public String toString() {
		return "Box [side1=" + side1 + ", side2=" + side2 + "]";
	}
	
}