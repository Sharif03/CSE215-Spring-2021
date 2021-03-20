package theoryLec09_OOP;

public class TestBankAccount {

	public static void main(String[] args) {
		BankAccount account00 = new BankAccount();
		
		BankAccount account01 = new BankAccount("Fahim Khan", "192123487", 2000);
		account01.setAccountHolderName("Bla Bla");
		System.out.println("Name: " + account01.getAccountHolderName() + "\nNID: " +account01.NIDNumber);
		account01.checkBelence();
		account01.deposit(500);
		account01.withdraw(100);
		account01.checkBelence();
		
		System.out.println("Total object created:" + BankAccount.bankAccountCounter);
	}
}