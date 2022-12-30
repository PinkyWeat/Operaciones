package test;

import operaciones.Operaciones;

public class TestOperaciones {
    public static void main(String[] args) {
        var resultados = Operaciones.sumar(5, 3);
        System.out.println("resultados = " + resultados);
        var resultado2 = Operaciones.sumar(2.2, 3);
        System.out.println("resultados = " + resultado2);
        var resultador3 = Operaciones.sumar(2L, 3);
        System.out.println("resultador3 = " + resultador3);
    }
}
