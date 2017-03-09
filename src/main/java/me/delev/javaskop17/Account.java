package me.delev.javaskop17;

import java.math.BigDecimal;

/**
 * Account POJO
 */
public class Account {
    private BigDecimal balance = new BigDecimal(0);

    public Account(BigDecimal initial) {
        balance = initial;
    }

    public BigDecimal getBalance() {
        return balance;
    }

    public void withdraw(BigDecimal amount) {
        if (amount.compareTo(BigDecimal.ZERO) < 0) {
            throw new NegativeAmountWithdrawnException(amount);
        }
        balance = balance.subtract(amount);
    }
}
