package Operaciones;

public class PruebaAritmetica {
    public static void main(String[] args) {
        Aritmetica aritmetical = new Aritmetica();
        aritmetical.a = 3;
        aritmetical.b = 5;
        aritmetical.sumar();

        var resultado = aritmetical.sumarConRetorno();
        System.out.println("resultado 2 = " + resultado);

        resultado = aritmetical.sumarConArgumentos(10, 20);
        System.out.println("resultado 3 = " + resultado);
    }
}
