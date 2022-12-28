package palabrathis;

public class PalabraThis {
    public static void main(String[] args) {
        Persona persona1 = new Persona("Juan", "Perez");
        System.out.println("persona1 = " + persona1);
        System.out.println("persona1.nombre = " + persona1.nombre);
        System.out.println("persona1.apellido = " + persona1.apellido);
    }
}

class Persona {  // a esta clase solo se le puede acceder desde dentro del paquete
    String nombre; // default o package son si no tienen public/private
    String apellido;

    // constructor
    Persona(String nombre, String apellido) {
        // super() - hay una llamada implicita al constructor de la clase Padre (object)
        this.nombre = nombre;
        this.apellido = apellido;
        System.out.println("this = " + this);
        new Imprimir().imprimir(this);
    }
}

class Imprimir{
    // aunque no se vea, tiene un constructor vacio que se hace solo en el ide
    public void imprimir(Persona persona) {
        System.out.println("persona imprimir = " + persona);
        System.out.println("this imprimir = " + this);
        // aca imprimir la direccion del objeto actual que se esta ejecutando, es decir un Imprimir
    }
}
