package Caja;

public class Caja {
    int alto;
    int ancho;
    int profundo;

    public Caja(){
        System.out.println("Ejecutando constructor vacio");
    }

    public Caja(int ancho, int alto, int profundo){
        this.alto = alto;
        this.ancho = ancho;
        this.profundo = profundo;
    }

    public int calcVol(){
        return this.alto * this.ancho * this.profundo;
    }

    public void imprimirVol(){
        System.out.println(this.calcVol());
    }
}
