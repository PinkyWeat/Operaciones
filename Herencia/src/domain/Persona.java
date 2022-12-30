package domain;

public class Persona {
    protected String nombre;  // protected tiene el plus que se puede acceder desde otros paquetes too
    protected char genero;
    protected int edad;
    protected String direccion;

    // constructores
    public Persona (){  // constructor vacio

    }

    public  Persona (String nombre){ // constructor con solo nombre
        this.nombre = nombre;
    }

    public Persona(String nombre, char genero, int edad, String direccion) { // constructor completo
        this.nombre = nombre;
        this.genero = genero;
        this.edad = edad;
        this.direccion = direccion;
    }

    // getters & setters


    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public char getGenero() {
        return this.genero;
    }

    public void setGenero(char genero) {
        this.genero = genero;
    }

    public int getEdad() {
        return this.edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getDireccion() {
        return this.direccion; // el this siempre es opcional, pero es una buena practica
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Persona [ nombre=").append(nombre);
        sb.append(" | genero=").append(genero);
        sb.append(" | edad=").append(edad);
        sb.append(" | direccion=").append(direccion);
        sb.append(" ]");
        sb.append("\n\t\t\tIn memory:").append(super.toString());
        return sb.toString();
    }
}
