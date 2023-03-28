/**
 * Ejercicio U4_B4A_E2:<p>
 * Inicializa arrayDosD con la sintaxis anterior para que contenga el
 * contenido del siguiente gráfico (e imprime para comprobar):
 * arrayDosD<p>
 * <pre>
int[][] arrayDosD= new int[2][2];
arrayDosD[0][0]=1;
arrayDosD[0][1]=2;
arrayDosD[1][0]=3;
arrayDosD[1][1]=4;
 * </pre>
 * Sintaxis anterior<p>
 * <pre>
 int[][] matriz ={{0,2,4},{1,3,5}};
 * </pre>
 */
public class Ejercicio_U4_B4A_E02 {

  public static void main(String[] args) throws Exception {
    int[][] matriz = { { 1, 2 }, { 3, 4 } };
    System.out.println("Matriz 2d = ");
    for (int i = 0; i < matriz.length; i++) {
        System.out.print("\t" + i + "º matriz=  ");
      for (int j = 0; j < matriz[i].length; j++) {
        System.out.print(matriz[i][j] + " ");
      }
      System.out.println();
    }
  }
}
