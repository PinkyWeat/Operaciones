package Operaciones;

public class Aritmetica {
    int a;
    int b;

    // Constructor vacio
    public Aritmetica(){
        System.out.println("Ejecutando contructor");
    }

    // Constructor con args - sobrecarga de constructores por tener + de 1
    public Aritmetica(int a, int b){
        this.a = a;
        this.b = b;
        System.out.println("Ejecutando constructor con args");
    }

    public void sumar(){
        int resultado = a + b;
        System.out.println("resultado = " + resultado);
    }

    public int sumarConRetorno() {
        return a + b;
    }

    public int sumarConArgumentos(int arg1, int arg2){
        a = arg1;
        b = arg2;
        return sumarConRetorno();
    }
}
