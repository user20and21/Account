package accountPackage;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class AccountTest {
	Account acct1 = new Account ("Salma", 765.0);
	Account acct2 = new Account ("Momo", 120);
	Account acct3 = null;
	Account acct4 = acct1;
	Account[] allAccounts1 = {acct1, acct2, acct3};
	Account[] allAccounts2 = {acct1, acct2, acct3};
	
	@Test
	public void correctBalance() {

	assertTrue(acct1.getBalance() == 765.0);
	}
	
	@Test
	public void lowBalance() {
		assertFalse(acct2.getBalance() > 200);
	}
	
	@Test
	public void equalBalanace() {
		assertFalse (acct1.getBalance() == acct2.getBalance());
	}
	
	@Test
	public void noAccount() {
		assertNull(acct3);
	}
	
	@Test
	public void acctExists() {
		assertNotNull(acct2);
	}
	
	@Test
	public void sameAccounts() {
		assertEquals(acct1, acct4);
	}
	
	@Test
	public void sameAcctList() {
		assertArrayEquals(allAccounts1, allAccounts2);
	}
	
	@Test
	public void diffAcctList() {
		assertFalse(acct1.getName() == acct4.getName());
	}

}
