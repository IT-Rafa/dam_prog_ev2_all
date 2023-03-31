import java.util.Random;

/**
 * Ejercicio U4_B4A_E4:<p> 
 * Con una matriz cuadrada, introduciendo el tamaño por argumento, 
 * inicializar aleatoriamente la matriz con números de 0 a 99 y luego 
 * modificarla intercambiando la diagonal principal con la secundaria.
 *  Ejemplo:
 * <pre>
L:\Programacion>java unidad4 4
63  41  80  81
48  74  6   84
54  2   42  7
42  69  80  49

81  41  80  63
48  6   74  84
54  42  2   7
49  69  80  42
 * <pre>

 */
public class Ejercicio_U4_B4A_E04 {

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

    // intercambiamos las diagonales principal y secundaria
    for (int i = 0; i < matriz.length; i++) {
      // Matriz[i][i] intercambiar con matriz[i][tam-1-i];
      int temp = matriz[i][i];
      matriz[i][i] = matriz[i][matriz.length - 1 - i];
      matriz[i][matriz.length - 1 - i] = temp;
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
