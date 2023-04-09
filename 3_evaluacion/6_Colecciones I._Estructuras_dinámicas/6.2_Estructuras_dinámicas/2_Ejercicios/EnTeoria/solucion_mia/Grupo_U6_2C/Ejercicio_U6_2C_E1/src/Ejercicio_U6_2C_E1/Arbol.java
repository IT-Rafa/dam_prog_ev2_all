package Ejercicio_U6_2C_E1;

/**
 * Organizador tipo arbol, en este caso Árbol binario de búsqueda
 * (Binary Search Tree)<p>
 * Una arbol, o tree, en inglés, es una colección de datos en los que
 * cada dato tiene enlazado varios enlaces a otros objetos.<p>
 *
 * Al ser binario tienen dos enlaces, con lo que pueden estar conectados
 * a 0 (ambos nulos), 1 (uno nulo y otro con ref al otro nodo) o 2
 *  (ambos con ref)<p>
 *
 * En este caso está basada en clases autorreferenciadas
 */
class Arbol {

  /**
   * objeto NodoArbol que funciona como raíz del arbol
   */
  private NodoArbol raiz;

  /**
   * Constructor para preparar la raíz del arbol
   */
  public Arbol() {
    raiz = null;
  }

  /**
   * Inserta objeto, tipo int, en el arbol
   *
   * @param valorInsertar Valor a insertar en el arbol
   */
  public void insertar(int valorInsertar) {
    // Si la raiz es nulo, Crea el nodo raiz con ese dato
    if (raiz == null) {
      raiz = new NodoArbol(valorInsertar);
    } else {
      // si no, Busca donde colocar el nuevo nodo con ese dato
      ayudanteInsertarNodo(raiz, valorInsertar);
    }
  }

  /**
   * Busca una posición en el arbol para insertar el nodo, según tamaño.<p>
   * Funciona con datos de distintos tamaños
   *
   * @param a Nodo en el que estamos
   * @param valorInsertar valor a añadir
   */
  private void ayudanteInsertarNodo(NodoArbol a, int valorInsertar) {
    // BUSCA DE FORMA RECURSIVA POR CADA LADO SEGÚN MENOR (IZQ) O MAYOR(DER)
    // Si el nodo tiene menor valor que el dato a insertar
    if (valorInsertar < a.dato) {
      // Comprobamos el enlace izquierdo
      if (a.izq == null) {
        // Si está vacio, añade nuevo nodo en esta posición
        a.izq = new NodoArbol(valorInsertar);
      } else {
        // Si no, sigue buscando por el lado izq (datos con menos valor)
        ayudanteInsertarNodo(a.izq, valorInsertar);
      }
      // Si el nodo tiene mayor valor que el dato a insertar
      // vamos por el lado derecho
    } else if (valorInsertar > a.dato) {
      // Comprobamos el enlace derecho
      if (a.der == null) {
        // Si está vacio, añade nuevo nodo en esta posición
        a.der = new NodoArbol(valorInsertar);
      } else {
        // Si no, sigue buscando por el lado izq (datos con menos valor)
        ayudanteInsertarNodo(a.der, valorInsertar);
      }
    }
  }

  /**
   * Método para ver todos los objetos NodoArbol en orden PreOrden.<p>
   */
  public void recorridoPreOrden() {
    recorridoPreOrden(raiz);
  }

  /**
   * Método recursivo para ver los objetos NodoArbol en orden PreOrden
   * usando el objeto NodoArbol indicado
   *
   * @param nodo Objeto en arbol desde el que comienza la búsqueda
   */
  private void recorridoPreOrden(NodoArbol nodo) {
    if (nodo == null) {
      return;
    }
    // 1 Visite la raíz
    System.out.print(nodo.dato + " ");

    // 2 Atraviese el sub-árbol izquierdo
    recorridoPreOrden(nodo.izq);

    // 3 Atraviese el sub-árbol derecho
    recorridoPreOrden(nodo.der);
  }

  /**
   * Método para ver todos los objetos NodoArbol en orden InOrden.<p>
   * Este método muestra los objetos en un arbol ABB (Arbol Binario de Busqueda)
   * por orden de tamaño.
   */
  public void recorridoInOrden() {
    recorridoInOrden(raiz);
  }

  /**
   * Método recursivo para ver los objetos NodoArbol en orden InOrden
   * usando el objeto NodoArbol indicado
   *
   * @param nodo Objeto en arbol desde el que comienza la búsqueda
   */
  private void recorridoInOrden(NodoArbol nodo) {
    if (nodo == null) {
      return;
    }
    // 1. Atraviese el sub-árbol izquierdo
    recorridoInOrden(nodo.izq);

    // 2. Visite la raíz
    System.out.print(nodo.dato + " ");

    // 3. Atraviese el sub-árbol derecho
    recorridoInOrden(nodo.der);
  }

  /**
   * Método para ver todos los objetos NodoArbol en orden PostOrden
   */
  public void recorridoPostOrden() {
    recorridoPostOrden(raiz);
  }

  /**
   * Método recursivo para ver los objetos NodoArbol en orden PostOrden
   * usando el objeto NodoArbol indicado
   *
   * @param nodo Objeto en arbol desde el que comienza la búsqueda
   */
  private void recorridoPostOrden(NodoArbol nodo) {
    if (nodo == null) {
      return;
    }
    // 1. Atraviese el sub-árbol izquierdo
    recorridoPostOrden(nodo.izq);

    // 2. Atraviese el sub-árbol derecho
    recorridoPostOrden(nodo.der);

    // 3. Visite la raíz
    System.out.print(nodo.dato + " ");
  }
}

/**
 * /**
 * Es una clase autorreferenciadas, usada para crear la estructura dinámica.<p>
 * El valor del objeto (dato) y el enlace con los siguentes objetos (izq y der)
 * se guardan aquí.<p>
 * Autorreferenciada es una clase que contiene un atributo (izq y der, en este caso)
 * que que apunta a otros objetos de la misma clase.
 */
class NodoArbol {

  /**
   * Contiene el valor del elemento
   */
  int dato;

  /**
   * Enlaces con los siguientes objetos NodoArbol
   */
  NodoArbol izq, der;

  /**
   * Constructor que pide valor
   */
  public NodoArbol(int dato) {
    this.dato = dato;
    izq = der = null; //recien creado un nodo, no tiene hijos
  }
}
