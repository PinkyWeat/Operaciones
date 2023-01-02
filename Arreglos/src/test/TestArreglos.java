public class TestArreglos {
    public static void main(String[] args) {
        int edades[] = new int[3];
        System.out.println("edades = " + edades);

        // acceder a los elementos.
        edades[0] = 5;
        System.out.println("edades[0] = " + edades[0]);
        System.out.println("\n");
        edades[1] = 4;
        edades[2] = 11;

        for (int x = 0; x < edades.length; x++) {
            System.out.println("edades[" + x + "] = " + edades[x]);
        }

        // sintaxis resumida
        String frutas[] = {"Naranja", "Banana", "Uva"};  // es tipo obj este
        for (int i = 0; i < frutas.length; i++) {
            System.out.println("frutas [" + i + "] = " + frutas[i]);
        }
    }
}
