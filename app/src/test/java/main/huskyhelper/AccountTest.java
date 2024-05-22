package main.huskyhelper;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class AccountTest {

    @Test
    public void testAccountConstructor() {
        assertNotNull(new Account("test_email7@email.com", "passwordTest7!"));
    }

    @Test
    public void testGetEmail() {
        Account test = new Account("test_email7@email.com", "passwordTest7!");
        assertEquals("test_email7@email.com", test.getEmail());
    }

    @Test
    public void testGetPassword() {
        Account test = new Account("test_email7@email.com", "passwordTest7!");
        assertEquals("passwordTest7!", test.getPassword());
    }

    @Test
    public void testSetEmail() {
        Account test = new Account("test_email7@email.com", "passwordTest7!");
        test.setEmail("email8@email.com");
        assertEquals("email8@email.com", test.getEmail());
    }

    @Test
    public void testSetPassword() {
        Account test = new Account("test_email7@email.com", "passwordTest7!");
        test.setPassword("password8!");
        assertEquals("password8!", test.getPassword());
    }

    @Test
    public void testIsValidEmail() {
        assertTrue(Account.isValidEmail("test_email7@email.com"));
    }

    @Test
    public void testIsValidEmailBadEmail() {
        assertFalse(Account.isValidEmail("2474589"));
    }

    @Test
    public void testIsValidPassword() {
        assertTrue(Account.isValidPassword("passwordTest7!"));
    }

    @Test
    public void testIsValidPasswordBadPassword() {
        assertFalse(Account.isValidPassword("password"));
    }

}

