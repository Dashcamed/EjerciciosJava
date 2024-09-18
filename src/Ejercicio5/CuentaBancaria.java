package Ejercicio5;

public abstract class CuentaBancaria {
    private Integer idCuenta;
    private String nombreCliente;
    private Integer rutCliente;
    private String correoElectronico;
    private boolean tieneCuentaCorriente;
    private boolean tieneCuentaAhorro;

    //constructor
    public CuentaBancaria(int idCuenta, String nombreCliente, Integer rutCliente, String correoElectronico,
            boolean tieneCuentaCorriente, boolean tieneCuentaAhorro) {
        this.idCuenta = idCuenta;
        this.nombreCliente = nombreCliente;
        this.rutCliente = rutCliente;
        this.correoElectronico = correoElectronico;
        this.tieneCuentaCorriente = false;
        this.tieneCuentaAhorro = false;
    }

    public Integer getIdCuenta() {
        return idCuenta;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }
    public Integer getRutCliente() {
        return rutCliente;
    }
    public String getCorreoElectronico() {
        return correoElectronico;
    }
    public boolean getTieneCuentaCorriente() {
        return tieneCuentaCorriente;
    }
    public boolean getTieneCuentaAhorro() {
        return tieneCuentaAhorro;
    }

    @Override
    public String toString() {
        return "CuentaBancaria [idCuenta=" + idCuenta + ", nombreCliente=" + nombreCliente + ", rutCliente="
                + rutCliente + ", correoElectronico=" + correoElectronico + ", tieneCuentaCorriente="
                + tieneCuentaCorriente + ", tieneCuentaAhorro=" + tieneCuentaAhorro + "]";
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((idCuenta == null) ? 0 : idCuenta.hashCode());
        result = prime * result + ((nombreCliente == null) ? 0 : nombreCliente.hashCode());
        result = prime * result + ((rutCliente == null) ? 0 : rutCliente.hashCode());
        result = prime * result + ((correoElectronico == null) ? 0 : correoElectronico.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        CuentaBancaria other = (CuentaBancaria) obj;
        if (idCuenta == null) {
            if (other.idCuenta != null)
                return false;
        } else if (!idCuenta.equals(other.idCuenta))
            return false;
        if (nombreCliente == null) {
            if (other.nombreCliente != null)
                return false;
        } else if (!nombreCliente.equals(other.nombreCliente))
            return false;
        if (rutCliente == null) {
            if (other.rutCliente != null)
                return false;
        } else if (!rutCliente.equals(other.rutCliente))
            return false;
        if (correoElectronico == null) {
            if (other.correoElectronico != null)
                return false;
        } else if (!correoElectronico.equals(other.correoElectronico))
            return false;
        return true;
    }

}
