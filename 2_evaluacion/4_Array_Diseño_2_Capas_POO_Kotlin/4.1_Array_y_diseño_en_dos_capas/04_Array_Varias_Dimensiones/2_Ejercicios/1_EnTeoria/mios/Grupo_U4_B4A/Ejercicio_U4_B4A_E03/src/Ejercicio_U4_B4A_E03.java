/**
 * Ejercicio U4_B4A_E3:<p>
 *  Si no lo hiciste ya, vuelve a escribir el ejercicio anterior de forma que
 * utilice el "for mejorado". Puedes simplificar la impresión a algo del estilo de
 * <pre>
11 12 13 14
21 22
31 32 33
 * </pre>
 * Ejercicio anterior <p>
 * <pre>
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
 * </pre> 
 */

 public class Ejercicio_U4_B4A_E03 {
    public static void main(String[] args) throws Exception {
      int[][] matriz = { { 11, 12, 13, 14 }, {21, 22 },{31,32,33} };
      for (int[] i:matriz) {
        for (int v:i) {
          System.out.print(v + " ");
        }
        System.out.println();
      }
    }
  }
