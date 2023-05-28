package Ejercicio_U7_B4_6;

import java.util.Stack;

/**
 * Clase Pila utilizando subyacentemente Stack
 */
public class Pila<T> {
    Stack<T> listaDatos = new Stack<>();

    // escribir push(), pop() y esVacia()
    /**
     * Añadimos dato genérico a la pila
     * 
     * @param c Dato genérico a añadir
     */
    public void push(T c) {
        listaDatos.push(c);
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
        return listaDatos.pop();
    }

}
