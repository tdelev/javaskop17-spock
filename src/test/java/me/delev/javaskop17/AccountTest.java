package me.delev.javaskop17;

import org.junit.Before;
import org.junit.Test;

import java.math.BigDecimal;

import static org.junit.Assert.assertEquals;

/**
 * JUnit Account test
 */
public class AccountTest {

    Account account;

    @Before
    public void setup() {
        account = new Account(BigDecimal.valueOf(10));
    }

    @Test
    public void withdrawSomeAmount() {
        account.withdraw(BigDecimal.valueOf(7));
        assertEquals(BigDecimal.valueOf(3), account.getBalance());
    }

}