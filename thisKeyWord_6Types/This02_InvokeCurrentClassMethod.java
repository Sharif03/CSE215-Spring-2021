package thisKeyWord_6Types;

public class This02_InvokeCurrentClassMethod {

	public static void main(String[] args) {
		// this can be used to invoke current class method (implicitly)
		Students s1 = new Students("Harry", 123);
		s1.info();

	}

}

class Students{
	String name;
	int id;
	public Students(String name, int id) {
		this.name = name;
		this.id = id;	
	}
	public void info() {
		// studentQualityComment();
		this.studentQualityComment();
		System.out.println("Name : " + name + " " + " Id: " + id );
		
	}
	
	public void studentQualityComment() {
		System.out.println("Student is good");
	}
	
	
}