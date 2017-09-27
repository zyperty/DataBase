import java.util.Scanner;

public class OrdenBurbuja {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int []arreglo = new int[10];
        int indice = 0;
        while (indice < 10){
            arreglo[indice]= s.nextInt();
            indice++;
        }
        System.out.println("El arreglo original es ");
        for (int i = 0; i < indice; i++){
            System.out.println(arreglo[i]);
        }
        for (int i = 0; i < indice-1; i++){
            for (int j = 0; j < indice; j++){
                if (arreglo[i] > arreglo[j]){
                    int temporal = arreglo[i];
                    arreglo[i] = arreglo[j];
                    arreglo[j] = temporal;
                }
            }
        }
        System.out.println("El arreglo ordenado es ");
        for (int i = 0; i < indice; i++){
            System.out.println(arreglo[i]);
        }
    }
}
