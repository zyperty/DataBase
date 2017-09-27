import java.util.Random;
import javax.swing.JOptionPane;

public class AdivindaNumero {
    public static void main(String[] args){
        Random r = new Random();
        int adivinar = r.nextInt(100);
        int i = 0;
        int apuesta = input("Adivina el número secreto entre 0 y 99. ¿Que número es?");
        while (adivinar != apuesta){
          i++;
          if (adivinar > apuesta){
              apuesta = input("El número a adivinar es más grande. \n Intentelo otra vez");
          } else  {
              apuesta = input("El número a adivinar es más chico. \n Intentelo otra vez");
          }
        }
        JOptionPane.showMessageDialog(null,"Felicitaciones ha dado con el número con " + i + " intentos fallidos" );
    }
    private static int input(String text){
        return Integer.parseInt(JOptionPane.showInputDialog(text));
    }
}
