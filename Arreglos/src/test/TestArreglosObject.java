package test;

import domain.Persona;

public class TestArreglosObject {
    public static void main(String[] args) {
        Persona personas[] = new Persona[2];

        personas[0] = new Persona("Juan");
        personas[1] = new Persona("Karla");

        // printear
        for (int x = 0; x < personas.length; x++) {
            System.out.println("personas [" + x + "] = " + personas[x]);
        }

    }
}
