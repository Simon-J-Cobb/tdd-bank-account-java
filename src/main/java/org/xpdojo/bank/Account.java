package org.xpdojo.bank;

public class Account {
    private Money balance;

    Account(){
        this.balance = new Money();
    }

    Account(int balance){
        this.balance = new Money(balance);
    }

    public Money getBalance() {
        return balance;
    }

    public void withdrawAmount(Money otherMoney){
        balance = balance.spendMoney(otherMoney);
    }

    public void depositAmount(Money otherMoney) {
        balance = balance.makeMoney(otherMoney);
    }

    public void transfer(Account account2, Money otherMoney) {
        this.withdrawAmount(otherMoney);
        account2.depositAmount(otherMoney);
    }
}
