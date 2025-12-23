
public class Account {
	
	//Fields
	private int accountNumber;
	private String name;
	private double balance = 0;
	
	//Constructor
	Account(int accountNumber, String name){
		this.accountNumber = accountNumber;
		this.name = name;
	}
	
	//Getters
	public int getAccountNumber() {
		return accountNumber;
	}
	public String getName() {
		return name;
	}
	public double getBalance() {
		return balance;
	}
	
	//Methods
	public void deposit(double amount) {
		if(amount <= 0) {
			System.out.println("Amount can't be zero or negative...");
		}else {
			balance += amount ;
		}
	}
	public boolean withdraw(double amount) {
		if(amount <= 0) {
			System.out.println("Withdrawl amount can't be zero or negative...");
			return false;
		}else if(amount > balance) {
			System.out.println("Insufficient Balance. Check Balance first....");
			return false;
		}else {
			balance -= amount;
			return true;
		}		
	}
}
