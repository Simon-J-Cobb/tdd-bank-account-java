package org.xpdojo.bank;

import java.util.Objects;

/**
 * Immutable class to represent Money as a concept.
 * This class should have no accessor methods.
 */
public class Money {

    private final int amount;

    Money(){
        this.amount=0;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Money money = (Money) o;
        return amount == money.amount;
    }

    @Override
    public int hashCode() {
        return Objects.hash(amount);
    }

    Money(int amount){
        this.amount = amount;
    }

    Money makeMoney(Money otherMoney){
        return new Money(this.amount + otherMoney.amount);
    }

    Money spendMoney(Money otherMoney){
        return new Money(this.amount - otherMoney.amount);
    }


}
