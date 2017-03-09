package me.delev.javaskop17;

import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;

/**
 * JUnit Account test
 */
public class AccountTest {

    @Test
    public void withdrawSomeAmount() {
        // given
        Account account = new Account(BigDecimal.valueOf(10));
        // when
        account.withdraw(BigDecimal.valueOf(7));
        // then
        Assert.assertEquals(BigDecimal.valueOf(3), account.getBalance());
    }

}