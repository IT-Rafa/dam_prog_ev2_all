package Ejercicio_U6_2C_E8;

/**
 * Clase que contiene el main del Ejercicio_U6_2C_E8
 */
public class Ejercicio_U6_2C_E8 {

  /**
   * Crea el árbol y
   */
  public static void main(String args[]) {
    // Expresión a incluir: ((9 - (5 + 2 ))x 3)

    // Creamos árbol vacio
    Arbol arbol = new Arbol();

    // Creamos en nodo con el valor que tendrá la raíz
    NodoArbol n = new NodoArbol("x");

    // Asignamos el nodo a la raíz del árbol
    arbol.raiz = n;

    // Creamos los nodos con los valores que tendrán los hijos de la raíz
    NodoArbol n1 = new NodoArbol("-");
    NodoArbol n2 = new NodoArbol("3");

    // Asignamos esos nodos como hijos de la matriz
    n.izq = n1;
    n.der = n2;

    // Continuamos proceso hasta fin de la expresión
    NodoArbol n11 = new NodoArbol("9");
    NodoArbol n12 = new NodoArbol("+");
    n1.izq = n11;
    n1.der = n12;
    NodoArbol n121 = new NodoArbol("5");
    NodoArbol n122 = new NodoArbol("2");
    n12.izq = n121;
    n12.der = n122;
    arbol.imprimir();
  }
}
