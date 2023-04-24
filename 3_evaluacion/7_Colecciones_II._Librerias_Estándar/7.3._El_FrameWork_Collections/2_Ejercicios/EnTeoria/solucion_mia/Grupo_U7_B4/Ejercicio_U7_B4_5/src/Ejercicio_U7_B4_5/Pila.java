package Ejercicio_U7_B4_5;

import java.util.LinkedList;

/**
 * Clase Pila utilizando subyacentemente LinKedList
 */
public class Pila<T> {
    LinkedList<T> listaDatos = new LinkedList<>();

    // escribir push(), pop() y esVacia()
    /**
     * Añadimos dato genérico a la pila
     * 
     * @param c Dato genérico a añadir
     */
    public void push(T c) {
        listaDatos.addFirst(c);
    }

    /**
     * Indica si la Pila está vacia
     * 
     * @return True si está vacia. False si no
     */
    public boolean esVacia() {
        return listaDatos.isEmpty();
    }

    /**
     * Elimina el último dato y lo devuelve
     * 
     * @return Dato genérico a borrar
     */
    public T pop() {
        return listaDatos.removeFirst();
    }

}
