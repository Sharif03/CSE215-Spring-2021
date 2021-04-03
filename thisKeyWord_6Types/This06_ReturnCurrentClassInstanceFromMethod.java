package thisKeyWord_6Types;

public class This06_ReturnCurrentClassInstanceFromMethod {

	public static void main(String[] args) {
		// this can be used to return the current class instance from the method
		Car c = new Car();
		c.moving();
	}

}

class Car {
	public Car moving() {
		System.out.println("I'm from moving method");
		return this;
	}
	public void carQuality() {
		System.out.println("Car is in good conditions");
	}
}