package Ejercicio5;

import java.util.HashSet;

public class Bank {
    private HashSet<Client> clients;

    public Bank(){
        this.clients = new HashSet<>();
    }

    public boolean addClient(Client client){
        return clients.add(client);
    }
}
