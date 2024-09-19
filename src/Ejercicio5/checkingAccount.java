package Ejercicio5;

public class checkingAccount extends Account {
    private double creditLine;

    public checkingAccount(Client holder, double creditLine) {
        super(holder);
        this.creditLine = creditLine;
    }

    @Override
    public boolean withdraw(double amount){
        if(balance + creditLine >= amount){
            balance-= amount;
            return true;
        } else {
            System.out.println("you cannot do the withdraw, creditline was surpassed");
            return false;
        }
    }
}
