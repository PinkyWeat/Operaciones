package mundopc;

import uy.com.gm.mundopc.*;

public class MundoPC {
    public static void main(String[] args) {
        Teclado teclado = new Teclado("USB", "HP");
        Raton raton = new Raton("Bluetooth", "Apple");
        Monitor monitor = new Monitor("HP", "13");
        Computadora compu = new Computadora("Computadora HP", monitor, teclado, raton);

        Teclado tecladoGamer = new Teclado("Bluetooth", "Gamer");
        Raton ratonGamer = new Raton("Bluetooth", "Gamer");
        Monitor monitorGamer = new Monitor("Gamer", "Grande");
        Computadora compuGamer = new Computadora("Compu Gamer", monitorGamer, tecladoGamer, ratonGamer);

        Orden orden1 = new Orden();
        orden1.agregarComputadora(compu);
        orden1.agregarComputadora(compuGamer);
        orden1.mostrarOrden();
    }
}
