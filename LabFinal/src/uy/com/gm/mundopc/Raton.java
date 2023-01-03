package uy.com.gm.mundopc;

public class Raton extends DispositivoEntrada {
    private final int idRaton;
    private static int contadorRatones;

    // constructor
    public Raton(String tipoEntrada, String marca) {
        super(tipoEntrada, marca);
        this.idRaton = ++contadorRatones;
    }

    @Override
    public String  toString() {
        final StringBuilder sb = new StringBuilder(super.toString());
        sb.append("Raton { " + "idRaton=").append(idRaton);
        sb.append(" }");
        return sb.toString();
    }
}
