package uy.com.gm.test;

import uy.com.gm.ventas.*;

public class VentasTest {
    public static void main(String[] args) {
        Producto producto = new Producto("Camisa", 50.00);
        Producto producto1 = new Producto("Pantalon", 120.30);
        Orden orden = new Orden(); // inicializar el arreglo + idProductos; pero no tiene nada

        orden.agregarProducto(producto);
        orden.agregarProducto(producto1);
        orden.agregarProducto(producto);
        orden.mostrarOrden();
    }
}
