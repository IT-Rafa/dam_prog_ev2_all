package Ejercicio_U6_2C_E3;
/**
 * Clase que contiene el main del Ejercicio_U6_2C_E3
 */
public class Ejercicio_U6_2C_E3 {
    public static void main(String args[]) {
        Arbol arbol = new Arbol();
        arbol.insertar(8);arbol.insertar(4);arbol.insertar(10);
        arbol.insertar(2);arbol.insertar(5);arbol.insertar(9);
        arbol.insertar(12);
    

    System.out.println("\nRecorrido preorden .....");
    arbol.recorridoPreOrden();
    System.out.println("\nRecorrido preorden con indentaciones.....");
    arbol.recorridoPreOrdenConTAB();
    }
}
