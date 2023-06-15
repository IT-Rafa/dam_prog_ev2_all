/**
 * package con clases para
 * <h3>Ejercicio U8_B7_E2:</h3>
 * El siguiente ejemplo genera un Stream y filtra sus elementos
 * quedándose con lo que comienzan por “c”. 
 * <p>
 * Se pide añadir al conjunto de operaciones el método count() 
 * que devuelve en un long el número de elementos del stream.
 * <h4>Ejemplo</h4>
 * <pre>

import java.util.Arrays;
import java.util.List;

public class App {

    public static void main(String[] args) {
      List<String> myList = Arrays.asList("a1", "a2", "b1", "c2", "c1");
      myList.stream().filter(s -> s.startsWith("c"));
    }
 * </pre>
 */
package U8_B7_E2;
