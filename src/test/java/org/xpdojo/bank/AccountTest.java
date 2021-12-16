package org.xpdojo.bank;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class AccountTest {

    @Test
    public void depositAnAmountToIncreaseTheBalance()
    {
        Account account = new Account();
        account.depositAmount(10);
        assertThat(account.balance).isEqualTo(10);
    }

    @Test
    public void withdrawAnAmountToDecreaseBalance(){
        Account account = new Account();
        account.withdrawAmount(10);
        assertThat(account.balance).isEqualTo(-10);
    }

    @Test
    public void transferAnAmountToAnotherAccount(){
        Account account1 = new Account();
        Account account2 = new Account();
        account1.transfer(account2, 10);
        assertThat(account1.balance).isEqualTo(-10);
        assertThat(account2.balance).isEqualTo(10);
    }
}
