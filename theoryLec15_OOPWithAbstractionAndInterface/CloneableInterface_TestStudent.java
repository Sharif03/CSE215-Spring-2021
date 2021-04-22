package theoryLec15_OOPWithAbstractionAndInterface;

public class CloneableInterface_TestStudent { 
	
	public static void main(String args[]){ 
	
		// Shallow Copy
		Students a = new Students();
		Students b = a;
		b.address = "Dhaka";
		//.out.println(a.address);
		
		
		// Deep copy
		try{  
			Students s1 = new Students("Abir", 100, "Dhaka"); 
			s1.name = "Null";
			s1.roll = 200;
			s1.address = "Bandorban";
			
	  
			Students s2 = (Students)s1.clone();  
			s2.name = "Abid";
			s2.roll = 200;
			s2.address = "Bandorban";
			
			Students s3 = (Students)s1.clone(); 
			s3.name = "Noya Daman";
			s3.roll = 300;
			s3.address = "Sylhet";
			
			System.out.println(s1.name + " " + s1.roll + " " + s1.address);  
			System.out.println(s2.name + " " + s2.roll + " " + s2.address); 
			System.out.println(s3.name + " " + s3.roll + " " + s3.address); 
	  
		}catch(CloneNotSupportedException c){
			System.out.println("It's not possible to clone");
		}  
	}  
}


class Students implements Cloneable {
	String name; 
	int roll;  
	String address;
	public Students(){
		
	}  
	public Students(String name, int roll, String address){  
		this.name=name;
		this.roll=roll;  
		this.address = address;
	}
	public Object clone() throws CloneNotSupportedException { 
		return super.clone();  
	}  
}

