package me.delev.javaskop17.datadriven

import me.delev.javaskop17.Account
import spock.lang.Specification
import spock.lang.Unroll

@Unroll
class AccountSpecDataDriven2 extends Specification {

    def "withdrawing #withdrawn from account with balance #balance"() {
        given:
        def account = new Account(balance)

        when:
        account.withdraw(withdrawn)

        then:
        account.balance == old(account.balance) - withdrawn

        where:
        balance | withdrawn
        5.0     | 2.0
        4.0     | 1.0
        4.0     | 4.0
    }
}
