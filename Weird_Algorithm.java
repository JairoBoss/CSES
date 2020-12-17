import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero = sc.nextInt();
        System.out.println(Par(numero));
    }
    public static int Par (int numero){
        if (numero == 2){
            System.out.println(numero);
            return numero/2;
        }else{
            if (numero % 2 == 0 ){
                System.out.println(numero);
                return Par(numero/2);
            }else{
                System.out.println(numero);
                int x = (numero*3)+1;
                return Par(x);
            }
        }
    }
}
