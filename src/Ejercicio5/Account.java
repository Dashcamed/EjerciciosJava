package Ejercicio5;

public abstract class Account implements bankAccount {
    protected Client holder;
    protected double balance;

    public Account(Client holder){
        this.holder = holder;
        this.balance = 0;
    }

    @Override
    public void deposit(double amount){
        balance += amount;
    }

    @Override
    public double checkBalance(){
        return balance;
    }

    @Override
    public abstract boolean withdraw(double amount);
}
