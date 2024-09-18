package Ejercicio5;

public class Cliente extends CuentaBancaria {

    public Cliente(int idCuenta, String nombreCliente, Integer rutCliente, String correoElectronico,
            boolean tieneCuentaCorriente, boolean tieneCuentaAhorro) {
        super(idCuenta, nombreCliente, rutCliente, correoElectronico, tieneCuentaCorriente, tieneCuentaAhorro);
    }
    
}
