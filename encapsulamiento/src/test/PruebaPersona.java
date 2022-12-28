package test;

import dominio.Persona; // poner * no es mal practica porque las importa, no las usa hasta que se las llame
                        // por lo que no liberas espacio en memoria innecesariamente.

public class PruebaPersona {
    public static void main(String[] args) {
        Persona persona1 = new Persona("Juan", 5000.00, false);
        System.out.println("persona1.getNombre() = " + persona1.getNombre()); 
        persona1.setNombre("Juan Carlos");
        System.out.println("persona1.getNombre() = " + persona1.getNombre());
        System.out.println("persona1.getSueldo() = " + persona1.getSueldo());
        System.out.println("persona1.isEliminado() = " + persona1.isEliminado());
        
        // My Obj
        Persona persona2 = new Persona("Pamela", 600000.00, false);
        System.out.println("persona2.getNombre() = " + persona2.getNombre());
        persona2.setNombre("Maria Pamela");
        System.out.println("persona2.getNombre() = " + persona2.getNombre());
        System.out.println("persona2.getSueldo() = " + persona2.getSueldo());
        System.out.println("persona2.isEliminado() = " + persona2.isEliminado());
        persona2.setSueldo(700000.00);
        System.out.println("persona2.getSueldo() = " + persona2.getSueldo());
    }
}
