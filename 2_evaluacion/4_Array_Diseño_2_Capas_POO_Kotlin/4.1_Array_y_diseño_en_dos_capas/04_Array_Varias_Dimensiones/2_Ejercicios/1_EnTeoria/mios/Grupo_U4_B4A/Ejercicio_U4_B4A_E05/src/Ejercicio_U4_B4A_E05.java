import java.util.Random;

/**
 * Ejercicio U4_B4A_E5:<p> 
 * Con una matriz cuadrada, introduciendo el tamaño por argumento, 
 * inicializar aleatoriamente la matriz con enteros de 0 a 99 y 
 * luego modificarla invirtiendo los valores de la diagonal principal 
 * entre ellos, y los de la diagonal secundaria entre ellos como 
 * ilustra el ejemplo<p>
 * Ejemplo:<p>
 * <pre>
L:\Programacion>java unidad4 4
38  98  88  20
81  43  46  79
46  87  83  87
2   81  92  11

11  98  88  2
81  83  87  79
46  46  43  87
20  81  92  38
 * <pre>

 */
public class Ejercicio_U4_B4A_E05 {

  public static void main(String[] args) throws Exception {
    // Cogemos tamaño del argumento
    if (args.length == 0) {
      System.out.println("Falta argumento");
      System.exit(0);
    }
    int cant = Integer.parseInt(args[0]);

    // Creamos matriz
    int[][] matriz = new int[cant][cant];

    // LLenamos matriz con valores al azar
    for (int i = 0; i < matriz.length; i++) {
      for (int j = 0; j < matriz[i].length; j++) {
        matriz[i][j] = new Random().nextInt(100);
      }
    }

    // Mostramos matriz azar
    for (int i = 0; i < matriz.length; i++) {
      for (int j = 0; j < matriz[i].length; j++) {
        System.out.print(matriz[i][j] + "\t");
      }
      System.out.println();
    }
    System.out.println();

    // intercambiamos la diagonal principal y la secundaria
    // Para cada fila i hasta que i < tam/2:
    //    En diagonal principal matriz[i][i]<=>matriz[tam-1-i][tam-1-i];
    //    En diagonal secundaria matriz[i][tam-1-i]<=>matriz[tam-1-i][i];
    for (int i = 0; i < matriz.length /2; i++) {
      // Intercambiamos Principal
      int temp = matriz[i][i];
      matriz[i][i] = matriz[matriz.length - 1 - i][matriz.length - 1 - i];
      matriz[matriz.length - 1 - i][matriz.length - 1 - i] = temp;

      // Intercambiamos Secundaria
      temp = matriz[i][matriz.length - 1 - i];
      matriz[i][matriz.length - 1 - i] = matriz[matriz.length - 1 - i][i];
      matriz[matriz.length - 1 - i][i] = temp;
    }

    // Mostramos matriz diagonales cambiadas
    for (int i = 0; i < matriz.length; i++) {
      for (int j = 0; j < matriz[i].length; j++) {
        System.out.print(matriz[i][j] + "\t");
      }
      System.out.println();
    }
  }
}
