import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String adn = sc.nextLine();


        //A C G T
        int matrizF[] = {numero(adn,'A'),numero(adn,'C'),numero(adn,'G'),numero(adn,'T')};

        int mayor = 0;

        for (int i = 0; i <matrizF.length ; i++) {
            if (mayor < matrizF[i]){
                mayor = matrizF[i];
            }

        }
        System.out.println(mayor);


    }

    public static int numero(String adn,char x){

        int aux = 0 ,aux2 = 0;

        //Sacamos el numero de caracteres
        for (int i = 0; i < adn.length() ; i++) {
            if (adn.charAt(i) == x){
                aux ++;
            }else{
                if (aux != 0){
                    aux2 = aux;
                }
                aux = 0;
            }
        }

        if (aux2 > aux){
            return aux2;
        }else{
            return aux;
        }
    }
}
