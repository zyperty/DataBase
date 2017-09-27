public class BusquedaBinaria {
    public static void main(String[] argumentos){
        int []numeros = new int[10];
        for (int i= 0; i < numeros.length; i++){
            numeros[i] = i*5;
        }
        System.out.println("El arreglo original es ");
        for (int i=0; i < numeros.length; i++){
            System.out.println(numeros[i]);
        }
        BusquedaBinaria ejemplo = new BusquedaBinaria();
        int indice =  ejemplo.BusqBinaria(numeros,20,0,numeros.length-1);
        System.out.println("El incide del valor 20 es "+indice);
    }
    public int BusqBinaria(int []arreglo, int clave, int posInicial, int posFinal){
        int posMitad = (posInicial+posFinal)/2;
        if (clave == arreglo[posMitad]){
            return posMitad;
        }else if (clave == arreglo[posMitad]){
            if (posMitad-1 <= posInicial){
                return -1;
            }else{
                return BusqBinaria(arreglo,clave,posInicial,posMitad-1);
            }
        }else{
            if (posMitad+1 >= posFinal){
                return -1;
            }else{
                return BusqBinaria(arreglo,clave,posMitad+1,posFinal);
            }
        }

    }
}
