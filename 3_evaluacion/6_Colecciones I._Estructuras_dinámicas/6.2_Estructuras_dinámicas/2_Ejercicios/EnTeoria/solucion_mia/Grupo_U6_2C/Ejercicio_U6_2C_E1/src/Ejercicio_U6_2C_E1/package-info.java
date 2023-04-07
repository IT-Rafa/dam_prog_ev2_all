/**
 * Contiene clases para: <p>
 * Ejercicio U6_2C_E1: <p>
 * Escribe un método que recorra el árbol en preorden pero que no
 * use “ayudante”. <p>
 * Partimos del siguiente código que hay que modificar.
 * <pre>
class NodoArbol {
    NodoArbol nodoIzq;
    int datos;
    NodoArbol nodoDer;

    public NodoArbol(int datosNodo) {
        datos = datosNodo;
        nodoIzq = nodoDer = null; //recien creado un nodo, no tiene hijos
    }
}
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
            ayudanteInsertarNodo(raiz,valorInsertar);
        }
    }
    private void ayudanteInsertarNodo(NodoArbol a, int valorInsertar){
        // inserta en el subárbol izquierdo
        if (valorInsertar < a.datos) {
            // inserta nuevo NodoArbol
            if (a.nodoIzq == null) {
                a.nodoIzq = new NodoArbol(valorInsertar);
            } else {
                ayudanteInsertarNodo(a.nodoIzq,valorInsertar);
            }
        }else if (valorInsertar > a.datos) { // inserta en el subárbol derecho
            if (a.nodoDer == null) {
                a.nodoDer = new NodoArbol(valorInsertar);
            } else {
                ayudanteInsertarNodo(a.nodoDer,valorInsertar);
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
        System.out.print(nodo.datos+ " ");
        ayudantePreorden(nodo.nodoIzq);
        ayudantePreorden(nodo.nodoDer);
    }
}

public class App {
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
 * </pre>
 */
package Ejercicio_U6_2C_E1;
