package org.xpdojo.bank;

public class Account {
    private int amount  = 0;
    public int balance() {
        return amount;
    }

    public void addAmount(int i) {
        amount += i;
    }
}
