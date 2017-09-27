public class MatricesEjemplo {
    public static void main(String[] args){
        int [][] miMatriz = {{1,2,3},{4,5,6},{7,8,9}};
        int [][] miMatrizTraspuesta = new int [3][3];
        System.out.println("La matriz original es ");
        for (int i=0; i<3; i++){
            for (int j=0; j<3; j++){
                System.out.print(miMatriz[i][j]+"\t");
            }
            System.out.println();
        }
        for (int i=0; i<3; i++ ){
           for (int j = 0; j < 3; j++){
               miMatrizTraspuesta[j][i] = miMatriz[i][j];
           }
        }
        System.out.println("La matriz traspuesta es ");
        for (int i=0; i < 3; i++){
            for (int j=0; j<3; j++){
                System.out.print(miMatrizTraspuesta[i][j]+"\t");
            }
            System.out.println();
        }
    }
}
