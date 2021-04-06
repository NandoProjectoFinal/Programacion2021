
public class Ejercicio {
    public static void main(String[] args){
       int[] arr = {1,5,8,5};
        System.out.println(numeroMayor(arr));
    }
    public static int numeroMayor(int v[]) {
        int i=0;
        int n=0;
        while ( i < v.length ) {
            if ( v[i] > n ) n = v[i];
            i++;
        }
        return n;
    }
}
