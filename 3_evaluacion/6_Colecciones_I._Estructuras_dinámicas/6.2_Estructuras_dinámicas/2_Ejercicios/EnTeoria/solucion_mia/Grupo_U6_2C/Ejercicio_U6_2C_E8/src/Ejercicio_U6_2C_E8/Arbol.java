package Ejercicio_U6_2C_E8;

/**
 * Organizador tipo arbol, en este caso Árbol binario que almacena
 * expresión aritmética ( binary expression tree )<p>
 *
 * Una arbol, o tree, en inglés, es una colección de datos, en este caso
 * Strings, en los que cada dato tiene enlazado varios enlaces a otros
 * objetos.<p>
 *
 * Al ser árbol binario tienen dos enlaces, con lo que pueden estar conectados
 * a 0 (ambos nulos), 1 (uno nulo y otro con ref al otro nodo) o 2
 *  (ambos con ref), pero al representar expresiones, los que tienen un
 * valor de tipo número no tienen enlaces y los operadores, tendrán dos<p>
 *
 *
 * Cada nodo representa un número o un operador:
 * <ul>
 *  <li>Número: se guardan en los nodos hoja (con ambos enlaces vacios)</li>
 *  <li>Operador: Se guardan en los nodos no Hoja (que tienen dos enlaces, de números u operadores)</li>
 * </ul>
 * En este caso está basada en clases autorreferenciadas
 */
class Arbol {

  /**
   * Nodo raiz del árbol
   */
  NodoArbol raiz;

  /**
   * imprime la expresión formato infijo
   */
  public void imprimir() {
    recorridoInOrdenConParentesis(raiz);
    System.out.println();
  }

  /**
   * Método recursivo para ver los objetos del arbol en orden InOrden
   * desde el nodo del parámetro, añadiendo paréntesis en caso de
   * ser necesaria
   *
   * @param nodo Objeto en arbol desde el que comienza la búsqueda
   */
  private void recorridoInOrdenConParentesis(NodoArbol nodo) {
    // Preparamos array con los operadores a incluir
    String[] operadores = { "-", "+", "x", "/" };

    // Nulo, finaliza
    if (nodo == null) {
      return;
    }

    // Marcamos aviso de operador abierto
    // Comprobamos si el valor es operador
    boolean isOperador = false;
    for (int i = 0; i < operadores.length; i++) {
      if (nodo.dato == operadores[i]) {
        // Si es operador añadimos inicio paréntesis y marcamos
        isOperador = true;
        System.out.print("(");
      }
    }

    // 1_InOrden. Atraviese el sub-árbol izquierdo
    recorridoInOrdenConParentesis(nodo.izq);

    // 2_InOrden. Visite la raíz
    System.out.print(nodo.dato + " ");

    // 3_InOrden. Atraviese el sub-árbol derecho
    recorridoInOrdenConParentesis(nodo.der);

    // Si el operador se abrió, lo cerramos
    if (isOperador) {
      System.out.print(")");
    }
  }
}

/**
 * Es una clase autorreferenciadas, usada para crear la estructura dinámica.<p>
 * El valor del objeto String (dato) y el enlace con los siguentes objetos (izq y der)
 * se guardan aquí.<p>
 * Autorreferenciada es una clase que contiene un atributo (izq y der, en este caso)
 * que que apunta a otros objetos de la misma clase.
 */
class NodoArbol {

  /**
   * Contiene el valor del elemento
   */
  String dato;

  /**
   * Enlace con los otro objeto NodoArbol
   */
  NodoArbol izq, der;

  /**
   * Constructor que pide valor
   *
   * @param dato valor que tiene el nodo
   */
  public NodoArbol(String dato) {
    this.dato = dato;
    this.izq = this.der = null;
  }
}
