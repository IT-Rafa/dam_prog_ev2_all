package Ejercicio_U6_B2B_E1;

/**
 * Clase que contiene el main del Ejercicio_U6_B2B_E1
 */
public class Ejercicio_U6_B2B_E1 {
    /**
     * Crea pila, añade datos y los muestra y elimina
     */
    public static void main(String[] args) {
        Pila mipila = new MiPila();
        mipila.push(1);
        mipila.push(2);
        mipila.push(3);
        mipila.push(4);
        mipila.push(5);

        // Elimina y muestra el dato eliminado hasta que la pila esté vacía
        while (!mipila.esVacia()) {
            System.out.println(mipila.pop());
        }
    }
}




