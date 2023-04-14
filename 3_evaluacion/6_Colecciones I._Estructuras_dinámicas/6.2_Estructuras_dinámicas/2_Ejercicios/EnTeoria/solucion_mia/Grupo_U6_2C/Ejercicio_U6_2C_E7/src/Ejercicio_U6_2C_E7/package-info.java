/**
 * Contiene clases para:
 * <h3>Ejercicio U6_2C_E7:</h3>
 * <p>Acepta el reto “Altura de un árbol binario” id 290</p>
 * No es necesario crear un árbol de nodos, se puede procesar directamente
 * la entrada.<p>
 * Pero no está mal crear un árbol de nodos en memoria y luego usarlo para
 * hacer el cálculo, es quizá así incluso más didáctico. <p>
 * Puedes resolverlo como gustes. Lo más fácil quizá sea adaptar el código
 * anterior, por ejemplo usando un char[] y en lugar de comparar con -1
 * con ‘.’ etc.
 *
 * <h4>Enunciado Reto</h4><p>
 * La altura de un árbol binario se define recursivamente de la siguiente 
 * manera:
 * <ul>
 *  <li>    si el árbol es vacío su altura es 0;</li> y
 *  <li>si el árbol no es vacío su altura es 1 más que el máximo de las 
 * alturas de sus hijos.</li>
 * </ul>
 * Dado un árbol binario, ¿sabrías calcular su altura?<p>
 * De los siguientes árboles, el de la izquierda tiene altura 3 y el de 
 * la derecha tiene altura 4.
 * <pre>
     *         *
    / \       / \
   *   *     *   * 
  / \            / \
 *   *          *   *
                   / \
                  *   *
 * </pre>
 * <h5>Entrada</h5>
 * La entrada comienza indicando el número de casos de prueba que vendrán 
 * a continuación. <p>
 * Cada caso consiste en una cadena de caracteres con la descripción de un 
 * árbol binario: el árbol vacío se representa con un punto (.); 
 * un árbol no vacío se representa con un * (que denota la raíz), seguido 
 * primero de la descripción del hijo izquierdo y después de la descripción 
 * del hijo derecho. Los árboles nunca contendrán más de 5.000 nodos. 
 * <h5>Salida</h5>
 * Para cada árbol, se escribirá una línea con su altura. 
 * <h5>Entrada de ejemplo</h5>
 * <pre>
2
***..*..*..
**..**..**..*..
 * </pre>
 * <h5>Salida de ejemplo</h5>
 * <pre>
3
4
 * </pre> 
 */
package Ejercicio_U6_2C_E7;
