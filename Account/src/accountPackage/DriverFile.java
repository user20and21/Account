package accountPackage;

public class DriverFile {

	public static void main(String[] args) {
		Account acct1 = new Account();
		acct1.setName("Mahi");
		acct1.setBalance(1000);
		acct1.withdraw(500);
		acct1.deposit(200);
		System.out.println(acct1.getName());
		System.out.println(acct1.getBalance());
	}

}
