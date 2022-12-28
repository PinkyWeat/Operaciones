package Caja;

public class PruebaCaja {
    public static void main(String[] args) {
        // creo objeto usando constructor vacio
        Caja nuevaCaja = new Caja();
        nuevaCaja.alto = 2;  // posterior a la creacion le asigno valores
        nuevaCaja.ancho = 3;
        nuevaCaja.profundo = 6;
        nuevaCaja.imprimirVol();  // utilizo metodo para imprimir el volumen

        // creo objeto usando constructor con argumentos
        Caja otraCaja = new Caja(3, 2, 6);
        otraCaja.imprimirVol();
    }
}
