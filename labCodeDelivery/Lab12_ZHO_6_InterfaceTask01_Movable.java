package labManual12;

public class Lab12_ZHO_6_InterfaceTask01_Movable {

	public static void main(String[] args) {
		MovablePoint movablePoint = new MovablePoint(10, 5, 2, 3);
		movablePoint.moveUp();
		movablePoint.moveDown();
		movablePoint.moveLeft();
		movablePoint.moveRight();
		System.out.println(movablePoint.toString());
		System.out.println();
		
		MovableCircle movableCircle = new MovableCircle(5, 10, 3, 2, 2);
		movableCircle.moveUp();
		movableCircle.moveDown();
		movableCircle.moveLeft();
		movableCircle.moveRight();
		System.out.println(movableCircle.toString());
	}
}

interface Movable {
	public void moveUp();
	public void moveDown();
	public void moveLeft();
	public void moveRight();
}

class MovablePoint implements Movable {
	int x;
	int y;
	int xSpeed;
	int ySpeed;
	
	public MovablePoint(int x, int y, int xSpeed, int ySpeed) {
		this.x = x;
		this.y = y;
		this.xSpeed = xSpeed;
		this.ySpeed = ySpeed;
	}
	public void moveUp() {
		System.out.println("Y = " + (y + ySpeed));
	}
		
	public void moveDown() {
		System.out.println("Y = " + (y - ySpeed));
	}
	public void moveLeft() {
		System.out.println("X = " + (x - xSpeed));
	}
	public void moveRight() {
		System.out.println("X = " + (x + xSpeed));
	}
	@Override
	public String toString() {
		return "MovablePoint [X=" + x +", Y=" + y + ", Speed of Z=" + xSpeed + ", Speed of Y=" + ySpeed + "]";
	}	
}

class MovableCircle implements Movable {
	private int radious;
	private MovablePoint center;

	public MovableCircle(int x, int y, int xSpeed, int ySpeed, int radious) {
		this.radious = radious;
		center = new MovablePoint(x, y, xSpeed, ySpeed);
	}
	public void moveUp() {
		System.out.println("Center: " + (center.y + center.ySpeed));
	}
	public void moveDown() {
		System.out.println("Center: " + (center.y - center.ySpeed));
	}
	public void moveLeft() {
		System.out.println("Center: " + (center.x - center.xSpeed));
	}
	public void moveRight() {
		System.out.println("Center: " + (center.x + center.xSpeed));
	}
	@Override
	public String toString() {
		return "MovableCircle [Radious=" + radious + ", Center of MovablePoint=" + center + "]";
	}
}