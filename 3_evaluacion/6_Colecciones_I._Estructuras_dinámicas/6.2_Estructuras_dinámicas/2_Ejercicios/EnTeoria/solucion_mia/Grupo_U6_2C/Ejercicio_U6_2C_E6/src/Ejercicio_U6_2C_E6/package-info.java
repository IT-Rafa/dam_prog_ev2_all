/**
 * Contiene clases para: <p>
 * Ejercicio U6_2C_E6: <p>
 * Máximo y mínimo de un AB <p>
 * Dado un árbol imprimir su valor máximo y mínimo.<p>
 * Ejemplo:
 * <pre>
run:
4 2 3 8 -1 -1 -1 -1 -1
Máximo:8
Minimo:2
 * </pre>
 * Podrías obtener una lista de un recorrido (preorden u otro 
 * cualquiera) y buscar el máximo y mínimo en dicha lista.
 * Pero utiliza mejor un código del tipo
 * <pre>
max:
Si nodo vacio
    return Integer.MIN_VALUE (el valor más pequeño posible)
sino
    return elMáximoDe(nodo.datos, max(nodo.nodoIzquierdo), max(nodo.nodoDerecho))
 * </pre> 
 */
package Ejercicio_U6_2C_E6;
