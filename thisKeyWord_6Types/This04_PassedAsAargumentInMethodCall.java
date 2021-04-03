package thisKeyWord_6Types;

public class This04_PassedAsAargumentInMethodCall {

	public static void main(String[] args) {
		// this can be passed as an argument in the method call as an Instance of that particular class
		Teachers t1 = new Teachers("ZHO", 111);
		t1.info();
	}

}
class Teachers{
	String name;
	int id;
	
	public Teachers(String name, int id) {	
		teacherQualityComment(this, this);
		this.name = name;
		this.id = id;
	}
	public void teacherQualityComment(Teachers t, Teachers s) {
		System.out.println("Teachers is nice");
	}
	
	public void info() {
		System.out.println("Name : " + name + " " + " Id: " + id );
	}
}