import java.util.Scanner;

public class NumerosPrimos {
    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);
        System.out.println("Por favor ingrese un numero: ");
        int numero = sc.nextInt();
//        Se establece la variable esPrimo a verdadero
        boolean esPrimo = true;
        for (int i = 2; i < numero; i++){
            if ((numero % i) == 0){
                esPrimo = false;
            }
        }

        if (esPrimo){
            System.out.println("El numero "+numero+" es primo");
        }else {
            System.out.println("El numero " + numero + " no es primo");
        }
    }
}
