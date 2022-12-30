package domain;

import java.util.Date;

public class Cliente extends Persona{
    private int idCliente;
    private Date fechaRegistro;
    private boolean vip;
    private static int contadorClientes;

    // constructores
    public Cliente(Date fechaRegistro, boolean vip,
                   String nombre, char genero, int edad, String direccion) {
        super(nombre, genero, edad, direccion);
        this.idCliente = ++Cliente.contadorClientes;
        this.fechaRegistro = fechaRegistro;
        this.vip = vip;
    }

    // getters & setters

    public int getIdCliente() {
        return this.idCliente;
    }

    public Date getFechaRegistro() {
        return this.fechaRegistro;
    }

    public void setFechaRegistro(Date fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }

    public boolean isVip() {
        return this.vip;
    }

    public void setVip(boolean vip) {
        this.vip = vip;
    }

    // toString
    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("").append(super.toString());
        sb.append("\n\t\t  [ Cliente | idCliente=").append(getIdCliente());
        sb.append(" | vip=").append(vip);
        sb.append(" | fechaRegistro=").append(fechaRegistro);
        sb.append(" ]");
        return sb.toString();
    }
}
