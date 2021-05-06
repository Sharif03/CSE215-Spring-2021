package theoryLec17_OOPWithFile_Collection_Generics;

public class GenericsConcept {

	public static void main(String[] args) {
		Addition<Integer, Double> a = new Addition<Integer, Double>(5, 2.3);
		//a.printValue(5, 2.3);
		
		Addition<String, String> b = new Addition<String, String>("Hello", "Java");
		//b.printValue("A", "B");
		
		Addition<Integer, Double> c = new Addition<Integer, Double>(5);
		//c.printValue();
		
		
		// Car Type
		AnyCompany<Carr> cc= new AnyCompany<Carr>(5); 
		cc.addObject(new Carr("Toyota1", 27));
		cc.addObject(new Carr("Toyota2", 28));
		cc.addObject(new Carr("Toyota3", 29));
		cc.addObject(new Carr("Toyota4", 30));
		cc.addObject(new Carr("Toyota5", 31));
		cc.showObject();
		
		// Football Type
		AnyCompany<Football> cf= new AnyCompany<Football>(); 
		cf.addObject(new Football("A", 25.5));
		cf.addObject(new Football("B", 25.5));
		cf.addObject(new Football("C", 25.5));
		cf.addObject(new Football("D", 25.5));
		cf.addObject(new Football("E", 25.5));
		cf.showObject();
	}
}

class Addition<T, U>{
	private T value1;
	private U value2;
	
	public Addition() {
		
	}
	public Addition(T a) {
		value1 = a;
	}
	public Addition(T a, U b) {
		value1 = a;
		value2 = b;
	}
	public void printValue( T a, U b){
		System.out.println("Value1: " + a + "\nValue2: " + b);
	}
	public void printValue(){
		System.out.println("Value1: " + value1);
	}
}

class AnyCompany<T>{
	T[] obj;
	int objectIndex = 0;

	public AnyCompany() {
		obj = (T[]) new Object[5];
	}
	public AnyCompany(int  numberOfObject) {
		obj = (T[]) new Object[numberOfObject];
	}
	
	public void addObject(T o) {
		obj[objectIndex++] = o;
	}
	public void showObject() {
		for (int i = 0; i < obj.length; i++) {
			System.out.println(obj[i] + " ");
		}
	}
}
class Carr{
	String model;
	double price;
	public Carr(String model, double price) {
		this.model = model;
		this.price = price;
	}
	@Override
	public String toString() {
		return "Model: " + model + ", Price=" + price;
	}	
}

class Football{
	String clubName;
	double size;
	public Football(String clubName, double size) {
		this.clubName = clubName;
		this.size = size;
	}
	@Override
	public String toString() {
		return "Club Name=" + clubName + ", Size=" + size;
	}
	
}