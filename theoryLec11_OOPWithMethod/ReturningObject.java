package theoryLec11_OOPWithMethod;

import java.util.Scanner;

public class ReturningObject {

	public static void main(String[] args) {
		Scanner in= new Scanner(System.in);

		//TestReturningObject ob1 = new TestReturningObject(in.nextInt());
		TestReturningObject ob1 = new TestReturningObject(13);
		TestReturningObject ob2; 
		ob2 = ob1.incrByTen();
		
		System.out.println("Object1: " + ob1.a + " Object2: " + ob2.a);

	}

}

class TestReturningObject{
	
	int a;
	
	TestReturningObject(int newA){
		a = newA;
	}
	
	TestReturningObject incrByTen() {
		TestReturningObject temp = new TestReturningObject(a+10);
		return temp;
	}
}