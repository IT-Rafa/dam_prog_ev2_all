package Ejercicio_U7_B4_5;

/**
 * Clase que contiene el main del Ejercicio_U7_B4_5
 */
public class Ejercicio_U7_B4_5 {

    /**
     * Crea pila de Character.
     * <p>
     * Añadimos datos con push
     * <p>
     * Borramos datos y los mostramos con pop
     */
    public static void main(String[] args) {
        Pila<Character> miPila = new Pila<>();
        miPila.push('a');
        miPila.push('b');
        miPila.push('c');
        while (!miPila.esVacia()) {
            System.out.println(miPila.pop() + " ");
        }
    }
}
