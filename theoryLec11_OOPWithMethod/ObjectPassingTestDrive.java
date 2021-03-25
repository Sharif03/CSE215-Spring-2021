package theoryLec11_OOPWithMethod;

import java.util.Scanner;
public class ObjectPassingTestDrive {

	public static void main(String[] args) {
		Scanner in= new Scanner(System.in);
		
		//ObjectPassing obj1= new ObjectPassing(in.nextInt(), in.nextInt());
		ObjectPassing obj1= new ObjectPassing(100, 200);
		ObjectPassing obj2= new ObjectPassing(100, 200);
		ObjectPassing obj3= new ObjectPassing(10, 50);
		
		System.out.println("obj1 = obj1 " + obj1.equals(obj2));
		System.out.println("obj2 = obj3 " + obj2.equals(obj3));
	
	}

}

class ObjectPassing {
	int a;
	int b;
	
	ObjectPassing(int newA, int newB) {
		a = newA;
		b = newB;
	}
	
	public boolean equals(ObjectPassing ob) {
		if (ob.a==a && ob.b==b) return true;
		else return false;
	}
}