package theoryLec09_OOPWithClassAndObject;

public class BankAccount {
	private String accountHolderName;
	String NIDNumber;
	int belence;
	
	static int bankAccountCounter = 0;
	
	public BankAccount() {
		bankAccountCounter++;
		belence = 1000;
	}
	public BankAccount (String accountHolderName, String NIDNumber, int belence) {
		bankAccountCounter++;
		this.accountHolderName = accountHolderName;
		this.NIDNumber = NIDNumber;
		this.belence = belence;	
	}
	public void setAccountHolderName(String accountHolderName) {  // Mutator
		if(accountHolderName == "Mother Name")
			this.accountHolderName = accountHolderName;
		else
			System.out.println("You are not eligiabale to take this account");
	}
	
	public String getAccountHolderName() {  // Accessor
		return accountHolderName;
	}
	public void withdraw(int ammount) {
		if(belence > ammount && ammount >= 100) {
			belence = belence - ammount;
			System.out.println("You have withdrawn: " + ammount + " successfully");
		}
		else
			System.out.println("Insufficient belence to withdraw");
	}
	
	public void deposit(int ammount) {
		if(ammount >= 500) {
			belence = belence + ammount;
			System.out.println("You have deposited: " + ammount + " successfully");
		}
		else
			System.out.println("Insufficient belence to deposit");
	}
	
	public void checkBelence() {
		System.out.println("Your current belence is: " + belence);
	}
}

