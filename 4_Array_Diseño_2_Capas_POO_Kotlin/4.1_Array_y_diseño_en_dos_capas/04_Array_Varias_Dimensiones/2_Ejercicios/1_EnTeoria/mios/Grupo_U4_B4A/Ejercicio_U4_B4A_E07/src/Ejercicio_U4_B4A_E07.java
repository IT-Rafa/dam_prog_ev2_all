import java.util.Scanner;
/**
 * Ejercicio U4_B4A_E7: BANNER<p>
 * Ejercicio incluido en los envios: https://www.edu.xunta.gal/fpadistancia/mod/quiz/view.php?id=513721
 * y en Acepta el reto
 * Se indica como argumento por línea de comandos un String. 
 * La salida imprime un banner para dicho string con el caracter # 
 * (u otro que te guste)<p>
 * Hay una variedad de soluciones. Siempre que tenemos que manejar char[] 
 * podemos usar Strings pero procura solucionar el problema usando un 
 * char[][][] para practicar la multidimensión. Una ventaja de usar sólo 
 * char (sin Strings) es que las soluciones suelen ser más eficientes ya 
 * que son de más bajo nivel. <p>
 *  Es una discusión similar a los problemas de bucles e impresión de 
 * figuras con asteriscos, es un reto hacerlos a la antigua, cuando no
 * existía el recurso de String.<p>
 * Para almacenar el dibujo de un carácter puedes usar una matriz de 
 * char[][] por ejemplo, almacenamos el dibujo de la letra C como un array 
 * de arrays de char
 */

public class Ejercicio_U4_B4A_E07 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    // Altura letras
    final int MAXHEIGHT = 5;

    // Pedimos dato al usuario
    String input = sc.nextLine().toLowerCase();

    // Convertimos string a  char[][][]
    char[][][] graph = StringToConsoleGraph(input);

    // Mostramos char[][][]

    // Para mostrar cada letra
    // Repetimos altura de todas letras
    for (int line = 0; line < MAXHEIGHT; line++) {
      // Recorremos cada letra
      for (int aChar = 0; aChar < graph.length; aChar++) {
        // Mostramos cada línea
        System.out.print(graph[aChar][line]);
        // Con un espacio tras cada letra

      }
      // Salto línea tras cada línea
      System.out.println();
    }
    sc.close();
  }

  /**
   * Convertimos String a char[][][], que será una conversión con
   * la letra # convirtiendo caracteres en un gráfico de letras grandes
   * en consola.
   *
   * @param st String a convertir
   * @return char[][][] convertido
   */
  private static char[][][] StringToConsoleGraph(String st) {
    // Caracteres que se piden: A, C, D, E, I, L, M, O, S, T

    // array a devolver, según tamaño string
    char[][][] result = new char[st.length()][][];

    // Recorremos string
    for (int i = 0; i < st.length(); i++) {
      // array interno con gráfico letras
      char[][] aChar;
      // Convertimos String, según carácter
      if (st.charAt(i) == ' ') {
        aChar =
          new char[][] {
            { ' ', ' ', ' ', ' ', ' ', ' ' },
            { ' ', ' ', ' ', ' ', ' ', ' ' },
            { ' ', ' ', ' ', ' ', ' ', ' ' },
            { ' ', ' ', ' ', ' ', ' ', ' ' },
            { ' ', ' ', ' ', ' ', ' ', ' ' },
          };
      } else if (st.charAt(i) == 'a') {
        aChar =
          new char[][] {
            { ' ', '#', '#', '#', '#', ' ' },
            { ' ', '#', ' ', ' ', '#', ' ' },
            { ' ', '#', '#', '#', '#', ' ' },
            { ' ', '#', ' ', ' ', '#', ' ' },
            { ' ', '#', ' ', ' ', '#', ' ' },
          };
      } else if (st.charAt(i) == 'b') {
        aChar =
          new char[][] {
            { ' ', '#', '#', '#', '#' },
            { ' ', '#', ' ', ' ', '#' },
            { ' ', '#', '#', '#', ' ' },
            { ' ', '#', ' ', ' ', '#' },
            { ' ', '#', '#', '#', '#' },
          };
      } else if (st.charAt(i) == 'c') {
        aChar =
          new char[][] {
            { ' ', ' ', '#', '#', '#', '#' },
            { ' ', ' ', '#', ' ', ' ', ' ' },
            { ' ', ' ', '#', ' ', ' ', ' ' },
            { ' ', ' ', '#', ' ', ' ', ' ' },
            { ' ', ' ', '#', '#', '#', '#' },
          };
      } else if (st.charAt(i) == 'd') {
        aChar =
          new char[][] {
            { ' ', '#', '#', ' ', ' ', ' ' },
            { ' ', '#', ' ', '#', ' ', ' ' },
            { ' ', '#', ' ', ' ', '#', ' ' },
            { ' ', '#', ' ', '#', ' ', ' ' },
            { ' ', '#', '#', ' ', ' ', ' ' },
          };
      } else if (st.charAt(i) == 'e') {
        aChar =
          new char[][] {
            { ' ', '#', '#', '#', '#' },
            { ' ', '#', ' ', ' ', ' ' },
            { ' ', '#', '#', '#', ' ' },
            { ' ', '#', ' ', ' ', ' ' },
            { ' ', '#', '#', '#', '#' },
          };
      } else if (st.charAt(i) == 'i') {
        aChar =
          new char[][] {
            { ' ', ' ', ' ', ' ', '#', ' ', ' ' },
            { ' ', ' ', ' ', ' ', '#', ' ', ' ' },
            { ' ', ' ', ' ', ' ', '#', ' ', ' ' },
            { ' ', ' ', ' ', ' ', '#', ' ', ' ' },
            { ' ', ' ', ' ', ' ', '#', ' ', ' ' },
          };
      } else if (st.charAt(i) == 'l') {
        aChar =
          new char[][] {
            { ' ', ' ', '#', ' ', ' ', ' ', ' ' },
            { ' ', ' ', '#', ' ', ' ', ' ', ' ' },
            { ' ', ' ', '#', ' ', ' ', ' ', ' ' },
            { ' ', ' ', '#', ' ', ' ', ' ', ' ' },
            { ' ', ' ', '#', '#', '#', '#', ' ' },
          };
      } else if (st.charAt(i) == 'm') {
        aChar =
          new char[][] {
            { ' ', '#', ' ', ' ', ' ', '#' },
            { ' ', '#', '#', ' ', '#', '#' },
            { ' ', '#', ' ', '#', ' ', '#' },
            { ' ', '#', ' ', ' ', ' ', '#' },
            { ' ', '#', ' ', ' ', ' ', '#' },
          };
      } else if (st.charAt(i) == 'o') {
        aChar =
          new char[][] {
            { ' ', '#', '#', '#', '#', '#' },
            { ' ', '#', ' ', ' ', ' ', '#' },
            { ' ', '#', ' ', ' ', ' ', '#' },
            { ' ', '#', ' ', ' ', ' ', '#' },
            { ' ', '#', '#', '#', ' ', '#' },
          };
      } else if (st.charAt(i) == 's') {
        aChar =
          new char[][] {
            { ' ', '#', '#', '#', '#' },
            { ' ', '#', ' ', ' ', ' ' },
            { ' ', '#', '#', '#', '#' },
            { ' ', ' ', ' ', ' ', '#' },
            { ' ', '#', '#', '#', '#' },
          };
      } else if (st.charAt(i) == 't') {
        aChar =
          new char[][] {
            { ' ', '#', '#', '#', '#', '#' },
            { ' ', ' ', ' ', '#', ' ', ' ' },
            { ' ', ' ', ' ', '#', ' ', ' ' },
            { ' ', ' ', ' ', '#', ' ', ' ' },
            { ' ', ' ', ' ', '#', ' ', ' ' },
          };
      } else { // cualquier letra que no tenga equivalente
        aChar =
          new char[][] {
            { ' ', '#', '#', '#', '#' },
            { ' ', '#', '#', '#', '#' },
            { ' ', '#', '#', '#', '#' },
            { ' ', '#', '#', '#', '#' },
            { ' ', '#', '#', '#', '#' },
          };
      }
      // Añadimos caracter al array para devolver
      result[i] = aChar;
    }
    // Devolvemos array
    return result;
  }
}
