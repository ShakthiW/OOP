import org.junit.Test;
import junit.framework.Assert;
import junit.framework.TestCase;
import org.example.BankAccount;

public class BankAccountTest extends TestCase {

    @Test
    public void testDeposit() {
        BankAccount account = new BankAccount (50); // (1)
        account.deposit(50); // (2)
        BankAccount accExpected = new BankAccount (100);
        Assert.assertTrue(accExpected.equals(account)); // (3)
    }
}
