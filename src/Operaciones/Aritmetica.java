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
        int resultado = this.a + this.b;
        System.out.println("resultado = " + resultado);
    }

    public int sumarConRetorno() {
        return this.a + this.b;
    }

    public int sumarConArgumentos(int arg1, int arg2){
        this.a = arg1;
        this.b = arg2;
        return sumarConRetorno();
    }
}
