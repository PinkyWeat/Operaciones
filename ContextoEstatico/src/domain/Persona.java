package domain;

public class Persona {
    private int idPersona; // de una forma automatica ira sumando +1 por obj creado
    private String nombre;
    private static int contadorPersonas; // para contar cuantos obj tipoPersona se han creado

    public Persona(String nombre){ // aca pondremos el contadorPersonas, asi siempre que se cree un obj
           this.nombre = nombre;  // de esta class se aumentara +1
           Persona.contadorPersonas++; // para mayor claridad se hizo en dos lineas, pero seria en una
           this.idPersona = Persona.contadorPersonas; // se usa this porque porque es un attr de clase no static.
    }

    // get / set de c/attr


    public int getIdPersona() {
        return idPersona;
    }

    public void setIdPersona(int idPersona) {
        this.idPersona = idPersona;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public static int getContadorPersonas() {
        return contadorPersonas;
    }

    public static void setContadorPersonas(int aContadorPersonas) {
        contadorPersonas = aContadorPersonas; // si no fuera static se reiniciaria cada vez que crees 1 obj
    }

    @Override
    public String toString() {
        return "Persona [ " +
                "idPersona: " + idPersona +
                " | nombre: " + nombre + " ]";
    }
}
