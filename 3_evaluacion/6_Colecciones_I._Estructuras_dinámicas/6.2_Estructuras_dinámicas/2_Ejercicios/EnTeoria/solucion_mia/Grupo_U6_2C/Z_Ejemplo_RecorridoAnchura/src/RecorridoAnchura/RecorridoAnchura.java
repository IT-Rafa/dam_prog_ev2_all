package RecorridoAnchura;

import java.util.Scanner;

public class RecorridoAnchura {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    //10 66 7 -1 -1 -1 4 9 -1 -1 5 -1 88 -1 -1
    String[] arbolString = sc.nextLine().split(" ");
    Arbol arbol = new Arbol(arbolString);
    System.out.println("recorrido preorden con TABS");
    arbol.recorridoPreorden();
    System.out.println("\nrecorrido en anchura");
    arbol.recorridoAnchura();
    System.out.println();
    sc.close();
  }
}

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

  void recorridoAnchura() {
    MiCola cola = new MiCola();
    if (raiz == null) {
      return;
    }
    cola.encolar(raiz);
    while (!cola.esVacia()) {
      NodoArbol n = cola.desencolar();
      System.out.print(n.datos + " ");
      if (n.nodoIzq != null) {
        cola.encolar(n.nodoIzq);
      }
      if (n.nodoDer != null) {
        cola.encolar(n.nodoDer);
      }
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

class MiCola {

  private Nodo primero = null;
  private Nodo ultimo = null;

  public boolean esVacia() {
    //vacia si primero==ultimo==null
    return ultimo == null;
  }

  public void encolar(NodoArbol dato) {
    if (esVacia()) {
      ultimo = new Nodo(dato, null);
      primero = ultimo;
    } else {
      Nodo temp = new Nodo(dato, ultimo);
      ultimo = temp;
    }
  }

  public NodoArbol desencolar() {
    NodoArbol dato = primero.getDato();
    //recorrer la cola para hacer el segundo el primero
    if (primero == ultimo) {
      //si sólo hay un elemento al borrar la cola queda vacía
      ultimo = null;
      primero = null;
    } else {
      Nodo temp = ultimo;
      while (temp.getSiguiente() != primero) {
        temp = temp.getSiguiente();
      }
      primero = temp;
    }
    return dato;
  }
}

class Nodo {

  private Nodo sig;
  private NodoArbol dato;

  public Nodo(NodoArbol dato, Nodo sig) {
    this.dato = dato;
    this.sig = sig;
  }

  public void setSiguiente(Nodo sig) {
    this.sig = sig;
  }

  public Nodo getSiguiente() {
    return sig;
  }

  public NodoArbol getDato() {
    return dato;
  }
}
