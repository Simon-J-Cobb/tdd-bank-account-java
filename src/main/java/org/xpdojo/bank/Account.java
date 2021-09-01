package org.xpdojo.bank;

public class Account {
    public int balance;

    public void withdrawAmount(int amount){
        balance -= amount;
    }
}
