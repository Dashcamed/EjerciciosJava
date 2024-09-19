package Ejercicio5;

public class BankSystem {
public static void main(String[] args) {
    Bank bank = new Bank();

    Client client1 = new Client("Camilo", "Medina", "22334455", "camilo@email.com");

    System.out.println(bank.addClient(client1));

    SavingBank savingBank = new SavingBank(client1, 3, 1000, 0);

    savingBank.deposit(1500);
    System.out.println("Balance: " + savingBank.checkBalance());

    savingBank.withdraw(900);
    System.out.println("Balance: " + savingBank.checkBalance());

    
}
}
