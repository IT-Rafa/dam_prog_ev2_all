/**
 * Lista clases para ejercicio:
 * <p>
 * <h3>Ejercicio_U6_B6C_1:</h3>
 * <p>
 * <h4>Combinaciones sin recursividad</h4>
 * Normalmente, cuando el método recursivo en su interior tiene sólo un caso
 * recursivo, suele haber también una solución “fácil” con bucles, piensa 
 * por ejemplo en el ejemplo de factorial. <p>
 * En cambio, cuando existen varias llamadas recursivas, como por ejemplo
 * en los típicos métodos de los árboles, la versión no recursiva es más
 * difícil.
 * <p>
 * En este caso, podemos entonces aspirar a una solución con bucle.<p>
 * Se pide que escribas el método combinar(), qué es un método auxiliar que 
 * ayuda a nuestro método combinaciones() a resolver el problema. <p>
 * El método combinaciones() podría ser cómo sigue y queda como ejercicio 
 * escribir el método combinar()
 * 
 * <pre>
 * import java.util.ArrayList;
 * import java.util.Arrays;
 * import java.util.List;
 * 
 * public class App {
 *     // falta método combinar, que es en este caso un método NO RECURSIVO
 *     static List<String> combinaciones(int longitud, List<String> numeros) {
 *         // en principio result almacena la combinación de longitud 1
 *         // es decir, es la copia de la la lista numeros
 *         // List<String> result= numeros; MAL, así modificaré el original
 *         List<String> result = new ArrayList<>(numeros);
 * 
 *         for (int i = 0; i < longitud - 1; i++) {// longitud-1 porque ya inicializamos con 1 combinacion
 *             result = combinar(result, numeros);
 *         }
 *         return result;
 *     }
 * 
 *     public static void main(String[] args) {
 *         List<String> numeros = Arrays.asList("0", "1", "2");
 * 
 *         // suponemos longitud >0
 *         for (String combinacion : combinaciones(3, numeros))
 *             System.out.println(combinacion);
 *     }
 * }
 * </pre>
 * 
 * <h4>Salida</h4>
 * <pre>
000
001
002
010
011
012
020
021
022
100
101
102
110
111
112
120
121
122
200
201
202
210
211
212
220
221
222
 * </pre>
 */
package U6_B6C_1;
