package test;

import domain.Cliente;
import domain.Empleado;

import java.util.Date;

public class TestHerencia {
    public static void main(String[] args) {
        Empleado empleado1 = new Empleado("Juan", 20000.00);
        System.out.println("empleado1 = " + empleado1);
        
        Empleado empleado2 = new Empleado("Martha", 70000.00);
        System.out.println("empleado2 = " + empleado2);

        Cliente cliente1 = new Cliente(new Date(), true, "Karla", 'F', 28, "La Rambla");
        System.out.println("cliente1 = " + cliente1);

    }
}
