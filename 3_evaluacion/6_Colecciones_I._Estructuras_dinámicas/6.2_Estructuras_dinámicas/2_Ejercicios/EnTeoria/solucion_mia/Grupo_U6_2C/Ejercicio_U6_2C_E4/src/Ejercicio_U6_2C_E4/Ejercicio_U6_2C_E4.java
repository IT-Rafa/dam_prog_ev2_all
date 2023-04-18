package Ejercicio_U6_2C_E4;

/**
 * Clase que contiene el main del Ejercicio_U6_2C_E4
 */
public class Ejercicio_U6_2C_E4 {

  /**
   * Crea arbol, inserta datos, Muestra recorrido preOrden y
   * recorrido preOrden con tabs mostrando los nulos
   */
  public static void main(String args[]) {
    Arbol arbol = new Arbol();
    arbol.insertar(8);
    arbol.insertar(4);
    arbol.insertar(10);
    arbol.insertar(2);
    arbol.insertar(5);
    arbol.insertar(9);
    arbol.insertar(12);

    System.out.println("\nRecorrido preorden .....");
    arbol.recorridoPreOrden();
    System.out.println("\nRecorrido preorden con indentaciones.....");
    arbol.recorridoPreOrdenConTAB();
  }
}
