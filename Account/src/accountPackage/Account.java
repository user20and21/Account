package accountPackage;

public class Account {
	
	private double balance;
	private String name;
	
	public Account (String name, double balance) {
		this.balance = balance;
		this.name = name;
	}
	
	public Account() {
		this.name = "";
		this.balance = 0.0;
	}

	public void setName (String name) {
		this.name = name;
	}
	
	public void setBalance (double balance) {
		this.balance = balance;
	}
	
	public String getName() {
		return name;
	}
	
	public double getBalance() {
		return balance;
	}
	
	public void withdraw(double amount) {
		balance = balance - amount;
	}
	
	public void deposit (double amount) {
		balance = balance + amount;
	}

}
