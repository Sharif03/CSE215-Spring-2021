package theoryLec14_OOPWithPolymorphismAndObjToObjRln;

import java.util.Scanner;

public class AggregationExampleInJava {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Contact tashdid = new Contact("Tashdid", "09657776", "tas@gmail.com");
		Contact oishee = new Contact("Oishee", "09657676", "ois@gmail.com");
		Contact sadat = new Contact("Sadat", "09654776", "sad@gmail.com");
		Contact kanij = new Contact("Kanij", "09657679", "kanij@gmail.com");
		
		PhoneBook phonbook = new PhoneBook();
		phonbook.addContact(tashdid);
		phonbook.addContact(oishee);
		phonbook.addContact(sadat);
		phonbook.addContact(kanij);
		phonbook.showContact();
		
		System.out.println("Enter a name: ");
		String searchingName = input.next(); // Sadat
		phonbook.searchContact(searchingName);

	}

}

class Contact{
	String name;
	String number;
	String emailId;
	
	public Contact(String name, String number, String emailId) {
		this.name = name;
		this.number = number;
		this.emailId = emailId;
	}
	public String toString() {
		return "Contact [Name=" + name + ", Number=" + number + ", Email Id=" + emailId + "]";
	}	
}

class PhoneBook {
	int contactIndex = 0;
	Contact[] contact = new Contact[4];
	
	PhoneBook() {

	}
	
	public void addContact(Contact c) {
		contact[contactIndex++] = c;	
	}
	
	public void showContact() {
		for (int i=0; i<contact.length; i++) {
			System.out.println(contact[i].toString());
		}	
	}
	
	public void searchContact(String name) {
		for (int i=0; i<contact.length; i++) {
			if(contact[i].name.equalsIgnoreCase(name))
				System.out.println(contact[i].toString());
		}
	}
}



