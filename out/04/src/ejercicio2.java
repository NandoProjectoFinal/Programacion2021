public class ejercicio2 {

    public static void main ( String[ ] args ) {
        int miNumero = 7;
        int[] miArreglo = {28, 19, 5, 173, 88};
        int respuesta = miFuncion(miNumero, miArreglo);
        System.out.println(miArreglo[1] + miNumero + miArreglo[3] + respuesta);
    }

    public static int miFuncion( int miNumero, int[] miArreglo ) {
        for (int i = 0; i < 4; i++) {
            if (miNumero > 3) {
                miArreglo[i] = miArreglo[i] - miNumero;
                miNumero--;
            }
        }
        return(miArreglo[4] + miNumero);
    }
}