/**
 * Contiene clases para:<p>
 * <h3>Altura de un árbol general</h3>
 * https://www.aceptaelreto.com/problem/statement.php?id=310 <p>
 * En un árbol general el número de hijos de cada nodo es variable, 
 * desde cero en el caso de una hoja hasta cierto número máximo que 
 * se llama el grado del árbol. <p>
 * 
 * La altura de una hoja es 1; si el árbol tiene hijos entonces su 
 * altura es 1 más el máximo de las alturas de sus hijos.<p>
 * 
 * De los siguientes árboles generales, el de la izquierda tiene 
 * altura 3 y el de la derecha tiene altura 5.<p>
 * <pre>
.  3 2 0 0 0 1 0    2 4 0 0 2 0 1 0 0 0
.       *                 *
.      /|\               / \
.     / | \             *   *
.    *  *  *          // \\
.   / \    |         **   **    
.  *   *   *             / \
.                       *   *
.                           |
.                           *
 * </pre>
 * 
 * <h3>Entrada</h3>
 * La entrada comienza indicando el número de casos de prueba que 
 * vendrán a continuación. <p>
 * Cada caso consiste en la descripción de un árbol general en una 
 * línea: 
 * <ul>
 *  <li>primero aparece el número de hijos que tiene la raíz y </li>
 *  <li>a continuación aparecen las descripciones, como árboles 
 *      generales, de cada uno de sus hijos, de izquierda a derecha</li>
 * </ul>
 * <h3>Salida</h3>
 * Para cada árbol, se escribirá una línea con su altura.
 * Por ejemplo:
 * <pre>
Entrada 	Resultado
2
3 2 0 0 0 1 0         3
2 4 0 0 2 0 1 0 0 0   5
 * </pre>
 */
package Ej_04_AlturaArbolGeneral_num_310;
