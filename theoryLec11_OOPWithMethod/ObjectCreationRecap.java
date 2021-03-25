package theoryLec11_OOPWithMethod;

public class ObjectCreationRecap {

	public static void main(String[] args) {
		Student s1 = new Student();
		
		Student s2 = new Student(10, 3.50f);

	}

}
class Student{
	int age;
	float cgpa;
	
	public Student(){}
	public Student(int newAge, float newCgpa) {
		age = newAge;
		cgpa = newCgpa;
	}	
}