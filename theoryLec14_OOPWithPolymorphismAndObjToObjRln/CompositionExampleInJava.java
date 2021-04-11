package theoryLec14_OOPWithPolymorphismAndObjToObjRln;

public class CompositionExampleInJava {

	public static void main(String[] args) {
		Heart heart = new Heart(17, 200);
		Humen h1 = new Humen("Abir", 10, heart);
		System.out.println(h1.toString());
		
	}

}
class Heart {
	float pulse;
	int ammountOfBloodCirculation;
	public Heart(float pulse, int ammountOfBloodCirculation) {
		this.pulse = pulse;
		this.ammountOfBloodCirculation = ammountOfBloodCirculation;
	}
	@Override
	public String toString() {
		return "Pulse=" + pulse + ", Blood Circulation: " + ammountOfBloodCirculation;
	}	
	
}
class Humen{
	String name;
	int age;
	Heart heart;
	public Humen(String name, int age, Heart heart) {
		this.name = name;
		this.age = age;
		this.heart = heart;
	}
	@Override
	public String toString() {
		return "Humen [Name: " + name + ", Age: " + age + ", Heart info: " + heart.toString() + "]";
	}
	
}