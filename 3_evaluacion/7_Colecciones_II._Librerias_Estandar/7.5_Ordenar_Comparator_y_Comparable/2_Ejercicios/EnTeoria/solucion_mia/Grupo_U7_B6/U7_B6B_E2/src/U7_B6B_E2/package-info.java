/**
 * Lista clases para ejercicio: <p>
 * <h3>Ejercicio U7_B6B_E2:</h3>
 * <p>
 * Deseo ordenar una lista de teléfonos de la siguiente forma;
 * <p>
 * Primero aparecerán ordenados de mayor a menor los números internacionales
 * (con símbolo "+" delante) y después los locales, también ordenados de mayor
 * a menor.
 * <p>
 * SE PIDE: Escribe el comparador. Hay que tener en cuenta dos cosas:
 * <ul>
 * <li>El + es tiene código unicode menor que los dígitos, por lo tanto, para
 * listar primero números con + y ser de mayor o menor no basta con la
 * comparación
 * directa de Strings</li>
 * <li>¿Cómo interpretamos que string numérico es mayor que otro?.
 * Recuerda que la comparación de String, independientemente de que los
 * caracteres sean dígitos o no digitos se hace por “orden alfabético estilo
 * diccionario” , o mejor dicho, “por orden de código de caracteres”.
 * De tal forma que por ejemplo:
 * <p>
 * Pensando en enteros 111 > 12 es true, pero Pensando en Strings “111” > “12”
 * es false ya que la “palabra” “111” iría antes en un diccionario que
 * “12”.</li>
 * </ul>
 */
package U7_B6B_E2;
