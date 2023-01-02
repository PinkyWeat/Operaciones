package test;

public class TestMatrices {
    public static void main(String[] args) {
        int edades[][] = new int[3][2]; //obj de tipo entero
        System.out.println("edades = " + edades);

        edades[0][0] = 5;
        System.out.println("edades[0][0] = " + edades[0][0]);
        edades[0][1] = 7;
        edades[1][0] = 9;
        edades[2][0] = 5;
        System.out.println("edades[1][0] = " + edades[1][0]);
        System.out.println("\n");

        // printea toda la matriz
        for (int ren = 0; ren < edades.length; ren++){
            for (int col = 0; col < edades[ren].length; col++) {
                System.out.println("edades " + ren + " - " + col + " : " + edades[ren][col]);
            }
        }
        // crear objeto simplificado + printearlo :D
        String frutas[][] = {{"Naranja", "Limon"}, {"Mora", "Frambuesa"}};
        for (int x = 0; x < frutas.length; x++){
            for (int y = 0; y < frutas[x].length; y++){
                System.out.println("frutas [" + x + "][" + y + "] = " +  frutas[x][y]);
            }
        }
    }
}
