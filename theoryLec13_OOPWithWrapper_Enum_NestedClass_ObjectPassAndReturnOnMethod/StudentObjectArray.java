package theoryLec13_OOPWithWrapper_Enum_NestedClass_ObjectPassAndReturnOnMethod;

import java.util.Scanner;

public class StudentObjectArray {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		Student[] student = new Student[4];
		/*
		for (int i = 0; i < student.length; i++) {
			System.out.println("Enter a name: ");
			String name = input.next();
			
			System.out.println("Enter Id: ");
			int id = input.nextInt();
			
			System.out.println("Enter CGPA: ");
			float cgpa = input.nextFloat();
			student[i] = new Student(name, id, cgpa);
			System.out.println();
		}
		*/
		
		student[0] = new Student("Abid", 12, 3.5);
		student[1] = new Student("Abir", 10, 3.7);
		student[2] = new Student("Ahnaf", 11, 3.6);
		student[3] = new Student("Adib", 13, 3.7);
		
		
		//System.out.println("Enter a criminal name for excluding the convocation list: ");
		//String criminalName = input.next();
		//ignoreTheBadPerson(student, criminalName);
		
		/*
		System.out.println("Enter cgpa: ");
		float CGPA = input.nextFloat();
		Student[] newStudentList = studentOrganizeBasedOnCGPA(student, CGPA);
		for (int i = 0; i < newStudentList.length; i++) {
			if(newStudentList[i].getName() == null  && newStudentList[i].id == 0 && newStudentList[i].cgpa == 0.0)
				continue;
			else
				System.out.println("Name: " + newStudentList[i].getName() + " CGPA: " + newStudentList[i].cgpa);	
		}
	    */
			
	}
	
	public static void ignoreTheBadPerson(Student[] stdnt, String name) {
		for (int i = 0; i < stdnt.length; i++) {
			if(stdnt[i].getName().equalsIgnoreCase(name))
				continue;
			System.out.println(stdnt[i].toString());
		}	
	}
	
	public static Student[] studentOrganizeBasedOnCGPA(Student[] stdnt, float cgpa) {
		Student[] newStudentArray = new Student[stdnt.length];
		for (int i = 0; i < stdnt.length; i++) {
			if(stdnt[i].cgpa <= cgpa)
				newStudentArray[i] = new Student();  
			else if(stdnt[i].cgpa > cgpa)
				newStudentArray[i] = stdnt[i];
		}
		return newStudentArray;
	}
}

class Student {
	private String name;
	int id;
	double cgpa;
	public Student() {}
	
	public Student(String name, int id, double cgpa) {
		this.name = name;
		this.id = id;
		this.cgpa = cgpa;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public String toString() {
		return "Student [Name: " + name + ", Id: " + id + ", CGPA: " + cgpa + "]";
	}	
}
