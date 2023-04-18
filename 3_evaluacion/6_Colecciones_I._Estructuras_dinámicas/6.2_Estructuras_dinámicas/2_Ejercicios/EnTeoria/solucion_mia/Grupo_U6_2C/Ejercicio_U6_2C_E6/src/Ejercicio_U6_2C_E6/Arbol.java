package Ejercicio_U6_2C_E6;

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
   * lista datos del arbol
   */
  private String[] arbolString;

  /**
   *
   */
  private int posArray = 0;

  /**
   * Constructor objeto Arbol con parámetro con lista de strings con
   * sus datos
   */
  public Arbol(String[] arbolString) {
    // Crea raiz vacia
    raiz = null;
    // Guarda el parametro como atributo
    this.arbolString = arbolString;
    // Crea el arbol según argumento arbolString
    this.crearArbol();
  }

  /**
   * Crea el arbol según los datos en arbolString
   */
  private void crearArbol() {
    // Convierte el primar dato [0] de arbolString a entero
    // y lo guarda para construir la raiz
    int dato = Integer.parseInt(arbolString[0]);

    // Según el valor, crea la raiz
    if (dato == -1) {
      // Raiz vacia
      raiz = null;
    } else {
      // Crea NodoArbol raiz con el dato sacado del string
      raiz = new NodoArbol(dato);
      // sigue creando datos con según resto datos arbolString
      ayudanteCrearArbol(raiz);
    }
  }

  /**
   * Método recurrente para recorrer lista datos arbolString y
   * crear nodos y enlazarlos.
   *
   * @param padre arbol donde se crean los enlaces
   */
  private void ayudanteCrearArbol(NodoArbol padre) {
    posArray++;
    int dato = Integer.parseInt(arbolString[posArray]);
    if (dato != -1) {
      padre.izq = new NodoArbol(dato);
      ayudanteCrearArbol(padre.izq);
    }

    posArray++;
    dato = Integer.parseInt(arbolString[posArray]);
    if (dato != -1) {
      padre.der = new NodoArbol(dato);
      ayudanteCrearArbol(padre.der);
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

  /**
   * Método para ver todos los objetos NodoArbol en orden PreOrden.
   * En este caso con tabuladores como ayuda para ver mejor el arbol.
   */
  public void recorridoPreOrdenConTAB() {
    recorridoPreOrdenConTAB(raiz, "");
  }

  /**
   * Método recursivo para ver los objetos NodoArbol en orden PreOrden
   * usando el objeto NodoArbol indicado. En este caso con tabuladores
   * como ayuda para ver mejor el arbol
   *
   * @param nodo Objeto en arbol desde el que comienza la búsqueda
   * @param tab Cantidad de tabs a añadir
   */
  private void recorridoPreOrdenConTAB(NodoArbol nodo, String tab) {
    if (nodo == null) {
      System.out.println(tab + "null");
      return;
    }
    // 1 Visite la raíz
    System.out.println(tab + nodo.dato);
    tab = tab + "\t";
    // 2 Atraviese el sub-árbol izquierdo
    recorridoPreOrdenConTAB(nodo.izq, tab);

    // 3 Atraviese el sub-árbol derecho
    recorridoPreOrdenConTAB(nodo.der, tab);
  }

  /**
   * Busca si el entero del parámetro existe en la lista.
   * @param i Entero a buscar
   * @return Si entero existe devuelve true, si no false
   */
  public Boolean existe(int i) {
    return existe(raiz, i);
  }

  /**
   * Busqueda recursiva de si el entero del parámetro existe en la lista
   * en cada nodo
   *
   * @param nodo Nodo en el que estamos
   * @param num Entero a buscar
   * @return Si entero existe devuelve true, si no false
   */
  private Boolean existe(NodoArbol nodo, int num) {
    // si nodo = null
    //      false
    // si valorBuscado = nodo.datos
    //      true
    // si nodo.datos < valorBuscado
    //      busca en subarbol izquierdo (y esto da true o false)
    //        - En teoria, en practica funciona al reves (derecho)
    // sino
    //      busca en subarbol derecho (y esto da true o false)

    if (nodo == null) {
      return false;
    } else {
      if (nodo.dato == num) {
        return true;
      } else if (nodo.dato < num) {
        return existe(nodo.der, num);
      } else { // nodo.dato > num
        return existe(nodo.izq, num);
      }
    }
  }

  /**
   * Devuelve la altura del arbol
   *
   * @return altura del arbol
   */
  public int getHeight() {
    return getHeight(raiz);
  }

  /**
   * Recorre los hijos recurrentemente y devuelve la altura del arbol
   *
   * @param nodo Nodo desde el que calcular la altura
   * @return Altura en este nodo
   */
  private int getHeight(NodoArbol nodo) {
    int size = 0;

    if (nodo == null) {
      // si el árbol es vacío
      //      altura 0
      return size;
    } else {
      // sino
      //      Mayor altura de ambos lados
      //      1 + máximo(alturasubarbolizquierdo,alturasubarbolderecho)
      return 1 + Math.max(getHeight(nodo.izq), getHeight(nodo.der));
    }
  }

  /**
   * Devuelve el valor máximo de este arbol
   *
   * @return Valor máximo
   */
  public int getMax() {
    return getMax(raiz);
  }

  /**
   * Devuelve el valor máximo de este arbol, según el nodo
   *
   * @param nodo Nodo desde el que se busca
   * @return Valor máximo
   */
  public int getMax(NodoArbol nodo) {
    // CAPTURAR MÁXIMO
    // Si nodo vacio
    //      return Integer.MIN_VALUE (el valor más pequeño posible)
    // sino
    //      elMáximoDe(nodo.datos, max(nodo.nodoIzquierdo), max(nodo.nodoDerecho))
    if (nodo == null) {
      return Integer.MIN_VALUE;
    }

    int izq = getMax(nodo.izq);
    int der = getMax(nodo.der);

    int result = Integer.max(nodo.dato, izq);
    return Integer.max(result, der);
  }

  /**
   * Devuelve el valor mínimo de este arbol
   *
   * @return Valor mínimo
   */
  public int getMin() {
    return getMin(raiz);
  }

  /**
   * Devuelve el valor mínimo de este arbol, según el nodo
   *
   * @param nodo Nodo desde el que se busca
   * @return valor mínimo
   */
  public int getMin(NodoArbol nodo) {
    if (nodo == null) {
      return Integer.MAX_VALUE;
    }

    int izq = getMin(nodo.izq);
    int der = getMin(nodo.der);

    int result = Integer.min(nodo.dato, izq);
    return Integer.min(result, der);
  }
}

/**
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
   * Enlace con los otro objeto NodoArbol
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
