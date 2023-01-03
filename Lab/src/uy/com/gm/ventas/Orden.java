package uy.com.gm.ventas;

public class Orden {
    private int idOrden;
    private Producto productos[];
    private static int contadorOrdenes;
    private int contadorProductos; // para el arreglo de productos
    private static final int MAX_PRODUCTOS = 10;

    // Constructores

    public Orden() {
        this.idOrden = ++Orden.contadorOrdenes;
        this.productos = new Producto[Orden.MAX_PRODUCTOS]; // le da el tope
    }

    public void agregarProducto(Producto producto){
        if(this.contadorProductos < MAX_PRODUCTOS){
            // se asigna el valor, y luego en la proxima instancia se incrementara
            productos[this.contadorProductos++] = producto;
        }
        else {
            System.out.println("Se ha superado el maximo de productos: " + Orden.MAX_PRODUCTOS);
        }
    }

    public double calcularTotal(){
         double total = 0;
         for (int i = 0; i < this.contadorProductos; i++) {
             total += this.productos[i].getPrecio();
         }
         return total;
    }

    // muestra toda la orden
    public void mostrarOrden(){
        System.out.println("idOrden = " + idOrden);
        System.out.println("Total: $" + this.calcularTotal());
        System.out.println("Productos de la orden: ");
        for (int i = 0; i < this.contadorProductos; i++) {
            System.out.println("\n + " + productos[i]);
        }
    }
}
