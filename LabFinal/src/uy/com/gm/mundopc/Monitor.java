package uy.com.gm.mundopc;

public class Monitor {
    private final int idMonitor;
    private String marca;
    private String tamano;
    private static int contadorMonitores;

    private Monitor(){
        this.idMonitor = ++contadorMonitores;
    }
    public Monitor(String marca, String tamano) {
        this();
        this.marca = marca;
        this.tamano = tamano;
    }

    // getters & setters
    public String getMarca() {
        return this.marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getTamano() {
        return this.tamano;
    }

    public void setTamano(String tamano) {
        this.tamano = tamano;
    }

    public int getIdMonitor() {
        return this.idMonitor;
    }

    // toString

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Monitor{");
        sb.append("idMonitor=").append(idMonitor);
        sb.append(", marca='").append(marca).append('\'');
        sb.append(", tamano='").append(tamano).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
