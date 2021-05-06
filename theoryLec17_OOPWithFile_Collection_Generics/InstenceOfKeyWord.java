package theoryLec17_OOPWithFile_Collection_Generics;

public class InstenceOfKeyWord {

	public static void main(String[] args) {
		Students s1 = new Students("Rakib", 10);
		if(s1 instanceof Students)
			System.out.println(" Its an object of Student class");
		else 
			System.out.println("Unknown");

	}

}

class Students{
	String name;
	int id;
	public Students(String name, int id) {
		this.name = name;
		this.id = id;
	}
	
}