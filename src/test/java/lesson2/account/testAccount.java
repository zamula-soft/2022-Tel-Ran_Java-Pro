package lesson2.account;

import lesson2.account.BankAccount;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class testAccount {

    @Test
    public void testCredit() {
        BankAccount account = new BankAccount("001", "Test account", 1000);
        assertEquals(1500, account.credit(500));
    }


    @Test
    public void testDebit() {
        BankAccount account = new BankAccount("001", "Test account", 1000);
        assertEquals(100, account.debit(900));
    }


    @Test
    public void transferDebit() {
        BankAccount b1 = new BankAccount("001", "Test account", 100);
        BankAccount b2 = new BankAccount("002", "Test account111", 50);

        assertEquals(25, b1.transfer(b2, 75));
        assertEquals(125,b2.getBalance());
        assertEquals(25, b1.getBalance());
    }
}
