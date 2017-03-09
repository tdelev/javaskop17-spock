package me.delev.javaskop17

import spock.lang.Specification

/**
 * Account specification
 */
class AccountSpec extends Specification {

    def "withdraw some amount"() {
        given: "an account with balance of ten euros"
        def account = new Account(10)

        when: "withdrawing seven euros"
        account.withdraw(7)

        then: "three euros remain in the account"
        account.getBalance() == 3.0
    }

    def "can't withdraw negative amount"() {
        given:
        def account = new Account(10)

        when:
        account.withdraw(-5)

        then:
        NegativeAmountWithdrawnException e = thrown()
        e.amount == -5.0
    }

    def "withdraw some amount should decrease the balance"() {
        given: "an account with balance of ten euros"
        def account = new Account(10)

        when: "withdrawing seven euros"
        account.withdraw(7)

        then: "three euros remain in the account"
        account.getBalance() == old(account.balance) - 7
    }

}
