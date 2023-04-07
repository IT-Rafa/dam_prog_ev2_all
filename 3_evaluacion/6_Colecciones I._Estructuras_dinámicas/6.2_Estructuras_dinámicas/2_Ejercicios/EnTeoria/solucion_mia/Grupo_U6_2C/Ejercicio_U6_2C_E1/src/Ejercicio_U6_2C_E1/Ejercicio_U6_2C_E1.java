package Ejercicio_U6_2C_E1;

/**
 * Clase que contiene el main del Ejercicio_U6_2C_E1
 */
public class Ejercicio_U6_2C_E1 {

  /**
   * Creamos Arbol, insertamos datos y mostramos los datos eliminados.
   */
  public static void main(String args[]) {
    Arbol arbol = new Arbol();
    arbol.insertar(10);
    arbol.insertar(20);
    arbol.insertar(8);
    arbol.insertar(15);
    arbol.insertar(26);
    arbol.insertar(22);
    arbol.insertar(17);
    arbol.insertar(4);
    arbol.recorridoPreorden();
  }
}
