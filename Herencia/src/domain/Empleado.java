package domain;

public class Empleado extends Persona{
    private int idEmpleado;
    private double sueldo;
    private static int contadorEmpleado;

    public Empleado(){
        // super(); no esta puesto pero compilador lo pone
        // llama al constructor vacio de la clase padre
        this.idEmpleado = ++Empleado.contadorEmpleado;
    }
    public Empleado(String nombre, double sueldo) {
        this(); // con esto vas al constructor vacio y luego continua
        this.nombre = nombre;
        this.sueldo = sueldo;
    }

    public int getIdEmpleado() {
        return idEmpleado;
    }

    public double getSueldo() {
        return this.sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("").append(super.toString());
        sb.append("\n\t\t  [ Empleado | idEmpleado=").append(idEmpleado);
        sb.append(" | sueldo=").append(sueldo);
        sb.append(" ]");
        return sb.toString();
    }
}
