package Ejercicio_U6_2C_E1;

class Arbol {

  private NodoArbol raiz;

  public Arbol() {
    raiz = null;
  }

  // si el valor ya existe en el arbol, no inserta nada
  public void insertar(int valorInsertar) {
    if (raiz == null) {
      raiz = new NodoArbol(valorInsertar);
    } else {
      ayudanteInsertarNodo(raiz, valorInsertar);
    }
  }

  private void ayudanteInsertarNodo(NodoArbol a, int valorInsertar) {
    // inserta en el subárbol izquierdo
    if (valorInsertar < a.datos) {
      // inserta nuevo NodoArbol
      if (a.nodoIzq == null) {
        a.nodoIzq = new NodoArbol(valorInsertar);
      } else {
        ayudanteInsertarNodo(a.nodoIzq, valorInsertar);
      }
    } else if (valorInsertar > a.datos) { // inserta en el subárbol derecho
      if (a.nodoDer == null) {
        a.nodoDer = new NodoArbol(valorInsertar);
      } else {
        ayudanteInsertarNodo(a.nodoDer, valorInsertar);
      }
    }
  }

  public void recorridoPreorden() {
    ayudantePreorden(raiz);
  }

  private void ayudantePreorden(NodoArbol nodo) {
    if (nodo == null) {
      return;
    }
    System.out.print(nodo.datos + " ");
    ayudantePreorden(nodo.nodoIzq);
    ayudantePreorden(nodo.nodoDer);
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
