package theoryLec14_OOPWithPolymorphismAndObjToObjRln;

public class AggregationAnotherExampleInJava {

	public static void main(String[] args) {
		Address address = new Address("Uttora", 13, 15, 323);
		
		Employee emp1 = new Employee("Fahim", 111, address);
		System.out.println(emp1.address.toString());
		
	}
}

class Address{
	String area; 
	int sector;
	int rodeNo; 
	int houseNo;
	
	public Address(String area, int sector, int rodeNo, int houseNo) {
		this.area = area;
		this.sector = sector;
		this.rodeNo = rodeNo;
		this.houseNo = houseNo;
	}
	public String toString() {
		return "Address [Area=" + area + ", Sector=" + sector + ", Rode No=" + rodeNo + ", House No=" + houseNo + "]";
	} 
}

class Employee{
	String name;
	int id;
	Address address;
	public Employee(String name, int id) {
		this.name = name;
		this.id = id;
	}	
	public Employee(String name, int id, Address address) {
		this.name = name;
		this.id = id;
		this.address = address;
	}	
}