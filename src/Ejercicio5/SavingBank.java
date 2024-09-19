package Ejercicio5;

public class SavingBank extends Account{
    private int remainingAttempts;
    private double withdrawLimit;
    private double todayWithdraws;

    public SavingBank(Client holder, int remainingAttempts, double withdrawLimit, double todayWithdraws) {
        super(holder);
        this.remainingAttempts = remainingAttempts;
        this.withdrawLimit = withdrawLimit;
        this.todayWithdraws = 0;
    }

    @Override
    public boolean withdraw(double amount){
        if(remainingAttempts <= 0 || todayWithdraws + amount > withdrawLimit){
            System.out.println("You can't do the withdraw");
            return false;
        }

        if(balance>= amount){
            balance -= amount;
            todayWithdraws += amount;
            remainingAttempts --;

            return true;
        } else{
            System.out.println("Insufficient balance");
            return false;
        }
    }

    public void resetAttemptsAndLimit(){
        remainingAttempts = 3;
        todayWithdraws = 0;
    }
}
