package org.xpdojo.bank;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class AccountTest {

    @Test
    public void initiateAccount_shouldHaveZeroBalance() {
        assertThat(emptyAccount().balance()).isEqualTo(0);
    }

    @Test
    public void depositAmountToAccount_shouldHaveBalanceEquaToNewAmount() {
        Account account = emptyAccount();
        account.addAmount(10);
        assertThat(account.balance()).isEqualTo(10);
        account.addAmount(10);
        assertThat(account.balance()).isEqualTo(20);
    }

    private Account emptyAccount() {
        return new Account();
    }
}
