package Operaciones;

public class PruebaAritmetica2 {
    public static void main(String[] args) {
        Aritmetica aritmetical = new Aritmetica();
        System.out.println("aritmetical.a = " + aritmetical.a);
        System.out.println("aritmetical.b = " + aritmetical.b);

        Aritmetica aritmetical2 = new Aritmetica(3, 5);
        System.out.println("aritmetical2.a = " + aritmetical2.a);
        System.out.println("aritmetical2.b = " + aritmetical2.b);
    }
}
