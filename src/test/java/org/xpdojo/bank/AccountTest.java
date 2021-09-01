package org.xpdojo.bank;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class AccountTest {

    @Test
    public void depositAnAmountToIncreaseTheBalance() {
        assertThat("").isBlank();
    }

    @Test
    public void withdrawAnAmountToDecreaseBalance(){
        Account account = new Account();
        account.withdrawAmount(10);
        assertThat(account.balance).isEqualTo(-10);
    }
}
