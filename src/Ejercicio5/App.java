package Ejercicio5;

import java.util.List;
import java.util.ArrayList;

public class App {
public static void main(String[] args) throws Exception {
    List<CuentaBancaria> Clientes  = new ArrayList<>();

    CuentaBancaria a1 = new Cliente(1, "Juan Medina", 240229870, "camilomedina.es@gmail.com", true, true);

    Clientes.add(a1);

    System.out.println(Clientes);
}
}
