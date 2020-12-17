import java.util.Arrays;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numero = sc.nextInt();
        int [] numeros= new int[numero-1];

        for (int i = 0; i <numeros.length ; i++) {
            numeros[i] = sc.nextInt();
        }

        radixsort(numeros,numero-1);

        for (int i = 0; i <numeros.length ; i++) {
            if (i+1 == numeros[i]){

            }else{
                System.out.println(i+1);
                return;
            }
        }



    }

    static int numeroGrande(int matriz[]){
        int j = matriz[0];
        for (int i = 0; i < matriz.length; i++) {
            if(matriz[i] > j){
                j=matriz[i];
            }
        }
        return j;
    }

    static void cS(int matriz[],int n, int exp){
        int output[] = new int[n]; // output array
        int i;
        int count[] = new int[10];
        Arrays.fill(count, 0);


        for (i = 0; i < n; i++){
            count[(matriz[i] / exp) % 10]++;
        }

        for (i = 1; i < 10; i++){
            count[i] += count[i - 1];
        }

        for (i = n - 1; i >= 0; i--) {
            output[count[(matriz[i] / exp) % 10] - 1] = matriz[i];
            count[(matriz[i] / exp) % 10]--;
        }

        for (i = 0; i < n; i++){
            matriz[i] = output[i];
        }

    }

    static void radixsort(int matriz[], int n){
        int m = numeroGrande(matriz);

        for (int exp = 1; m / exp > 0; exp *= 10){
            cS(matriz, n, exp);
        }
    }
}
