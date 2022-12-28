package pasoporreferencia;

import clases.Persona;
public class PasoPorReferencia {
    public static void main(String[] args) {
        Persona persona1 = new Persona();
        persona1.nombre = "Mary"; // esta no es la mejor practica para modificiar data, pero es para ir aprendiendo.
        System.out.println("persona1.nombre = " + persona1.nombre);
        cambiarValor(persona1);
        System.out.println("persona1.nombre = " + persona1.nombre);
    }

    public static void cambiarValor (Persona persona) { // paso por valor, pero por referencia
        persona.nombre = "Karla";                      // cuando se termina este metodo persona se destruye.  
    }
}
