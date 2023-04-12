package Ejercicio_U6_2C_E5;

class Arbol {

  public NodoArbol raiz;
  String[] arbolString; //el arbol como una línea de
  int posArray = 0;

  public Arbol(String[] arbolString) {
    raiz = null;
    this.arbolString = arbolString;
    this.crearArbol();
  }

  public void recorridoPreorden() {
    ayudantePreorden(raiz, "");
  }

  private void ayudantePreorden(NodoArbol nodo, String tab) {
    if (nodo == null) {
      System.out.println(tab + "null");
      return;
    }
    System.out.println(tab + nodo.datos);
    tab = tab + "\t";
    ayudantePreorden(nodo.nodoIzq, tab);
    ayudantePreorden(nodo.nodoDer, tab);
  }

  private void crearArbol() {
    //la raiz está en arbolString[0]
    int dato = Integer.parseInt(arbolString[0]);
    if (dato == -1) { //árbol vacío
      raiz = null;
    } else {
      raiz = new NodoArbol(dato);
      ayudanteCrearArbol(raiz);
    }
  }

  private void ayudanteCrearArbol(NodoArbol padre) {
    //subarbol izquierdo del padre
    posArray++;
    int dato = Integer.parseInt(arbolString[posArray]);
    if (dato != -1) { //si es -1 entonces nodoIzq queda con null
      padre.nodoIzq = new NodoArbol(dato);
      ayudanteCrearArbol(padre.nodoIzq);
    }
    //subarbol derecho del padre
    posArray++;
    dato = Integer.parseInt(arbolString[posArray]);
    if (dato != -1) {
      padre.nodoDer = new NodoArbol(dato);
      ayudanteCrearArbol(padre.nodoDer);
    }
  }
}

class NodoArbol {

  NodoArbol nodoIzq;
  int datos;
  NodoArbol nodoDer;

  public NodoArbol(int datosNodo) {
    datos = datosNodo;
    nodoIzq = nodoDer = null; //recien creado un nodo, no tiene hijos
  }
}
