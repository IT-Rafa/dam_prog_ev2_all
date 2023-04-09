package Ejercicio_U6_2C_E1;

/**
 * Clase que contiene el main del Ejercicio_U6_2C_E1
 */
public class Ejercicio_U6_2C_E1 {

  /**
   * Creamos Arbol, insertamos datos y mostramos los datos en modo preOrden.<p>
   * Nota:
   *
   * @note Fuera del enunciado, añadimos operaciones para InOrden y PostOrden
   */
  public static void main(String args[]) {
    Arbol arbol = new Arbol();
    int[] lista = { 10, 20, 8, 15, 26, 22, 17, 4 };
    System.out.print("Introducimos datos\n  ");
    for (int n : lista) {
      System.out.print(n + " ");
    }
    System.out.println();

    for (int n : lista) {
      arbol.insertar(n);
    }
    System.out.print("Lista en PreOrden\n  ");
    arbol.recorridoPreOrden();
    System.out.println();

    System.out.print("Lista en InOrden - Ordenada\n  ");
    arbol.recorridoInOrden();
    System.out.println();

    System.out.print("Lista en PostOrden\n  ");
    arbol.recorridoPostOrden();
    System.out.println();
  }
}
