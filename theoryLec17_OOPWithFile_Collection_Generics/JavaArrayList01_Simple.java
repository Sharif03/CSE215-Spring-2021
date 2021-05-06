package theoryLec17_OOPWithFile_Collection_Generics;

import java.util.ArrayList;
import java.util.Collections;

public class JavaArrayList01_Simple {

	public static void main(String[] args) {
		ArrayList<String> student = new ArrayList<String>();
		student.add("Tashdid");   // 0
		student.add("Zian");      // 1
		student.add("Abir");      // 2

		
		System.out.println("Listed Students: "+student);
		//System.out.println("Number of Students: "+student.size());   // Number of value/object is added in the student list
		
		
		//student.set(2, "Ahnaf");
		
		//System.out.println("After Change: ");
		for(String i : student) { 
			//System.out.println(i);
		}
		
		Collections.sort(student); 
		System.out.println("Sorted list of Students(Ascending): " + student);
		
		student.remove(0);
		System.out.println("\n\nAnother use of loop: After removing student[0] ");
		for(int i=0; i<student.size(); i++){
			System.out.println(student.get(i));
		}
		
		student.clear();
		System.out.println("After Clearing array list:" + student);	
		
	}

}
