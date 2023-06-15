/**
 * package con clases para
 * <h3>Ejercicio U8_B7_E6:</h3>
 * El siguiente código calcula la media de las longitudes 
 * de una lista de cadenas de la forma tradicional.
 * <h4>Salida</h4>
 * <pre>
public class App {

  public static void main(String[] args) {
    String[] cadenas = { "a", "ab", "abc" };
    double total = 0;
    double media = 0;
    for (int i = 0; i < cadenas.length; i++) {
      total += cadenas[i].length();
    }
    media = total / cadenas.length;
    System.out.println(media);
  }
}
 * </pre>
 * Se pide que lo escribas basándote en Streams.<p>
 * Si consultas la clase Arrays() observarás que hay un 
 * stream() para obtener un stream de un array.<p>
 * Usaremos una función average() que como devuelve un 
 * OptionalDouble utilizamos la función getAsDouble()
 * para obtener su double (en gráfico solo pone get)
 */
package U8_B7_E6;
