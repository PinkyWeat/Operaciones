package test;

import domain.Persona;

public class TestMatricesObjetos {
    public static void main(String[] args) {
        Persona personas[][] = {{new Persona("Juan"), new Persona("Pedro")}, {new Persona("Sandra")}};

        Persona personitas[][] = new Persona[2][3];
        personitas[0][0] = new Persona("Juan");
        personitas[0][1] = new Persona("Karla");
        imprimir(personitas);
        System.out.println("\n");
        imprimir(personas);

    }

    public static void imprimir(Object matriz[][]) {  // imprime matrices
        for (int x = 0; x < matriz.length; x++) {
            for (int y = 0; y < matriz[x].length; y++) {
                System.out.println("matriz[" + x + "][" + y + "] = " + matriz[x][y]);
            }
        }
    }
}
