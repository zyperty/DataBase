public class BusquedaLineal {
    public static void main(String[] args) {
//        Se declara un arreglo de 10 alementos
        int[] numeros = new int[10];
//        Se recorre el arreglo insertando valores
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = i * 5;
        }
//        Se muestra el arreglo original
        System.out.println("El arreglo original es ");
        for (int i = 0; i < numeros.length; i++) {
            System.out.println(numeros[i]);
        }
//       Se crea el objeto ejemplo
        BusquedaLineal ejemplo = new BusquedaLineal();
//       Se llama al metodo BusqLineal pasando como parametros el arreglo y el numero a buscar
        int indice = ejemplo.BusqLineal(numeros, 40);
//        Se imprime en pantalla el resultado
        System.out.println("El indice del valor 40 es " + indice);
    }
//      Se declara el metodo BusqLineal que recive como parametros el arreglo y el dato a buscar
        public int BusqLineal(int []arreglo, int clave){
            for (int i=0; i< arreglo.length; i++){
//                Si coincide el valor del elememto del arreglo con el dato buscado devuelve el resultado
                if (arreglo[i] == clave){
                    return i;
                }
            }
//            En el caso de que no encuentre el valor devuelve -1.
         return -1;
        }

}
