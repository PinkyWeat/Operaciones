package dominio;

public class Persona   {
    private String nombre;  // anything other than public, cannot be accessed from the outside.
    private double sueldo;
    private boolean eliminado;

    // constructor - mismo nombre que clase - no retorna nada
    public Persona(String nombre, double sueldo, boolean eliminado) {
        this.nombre = nombre;
        this.sueldo = sueldo;
        this.eliminado = eliminado;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getSueldo() {
        return this.sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    public boolean isEliminado() {  // para booleans en lugar de get es is
        return this.eliminado;
    }

    public void setEliminado(boolean eliminado) {
        this.eliminado = eliminado;
    }

    public String toString() {
        return "Persona [ nombre: " + this.nombre +
                " | sueldo: " + this.sueldo +
                " | eliminado: " + this.eliminado + " ]";
    }
}
