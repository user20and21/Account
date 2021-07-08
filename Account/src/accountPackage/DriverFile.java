package accountPackage;

public class DriverFile {

	public static void main(String[] args) {
		Account acct1 = new Account();
		Account acct2 = new Account();
		acct1.setName("Mahi");
		acct1.setBalance(1000);
		acct1.withdraw(500);
		acct1.deposit(200);
		acct2.setName("Montoo");
		acct2.setBalance(2000);
		acct2.withdraw(100);
		System.out.println(acct1.getName());
		System.out.println(acct1.getBalance());
		System.out.println(acct2.getName());
		System.out.println(acct2.getBalance());
	}

}
