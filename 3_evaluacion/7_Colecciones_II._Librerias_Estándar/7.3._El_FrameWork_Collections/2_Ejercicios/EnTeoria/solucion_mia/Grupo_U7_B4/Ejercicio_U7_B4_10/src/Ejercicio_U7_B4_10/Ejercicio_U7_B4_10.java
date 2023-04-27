package Ejercicio_U7_B4_10;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/**
 * Clase que contiene el main del Ejercicio_U7_B4_10
 */
public class Ejercicio_U7_B4_10 {

    /**
     * Pasos a seguir
     * <ul>
     * <li>Recreamos el ejemplo de Recorrido en anchura:
     * 6_Colecciones_I_EstructurasDinámicas - 6.2_Estructuras
     * dinamicas - 2_Ejercicios - EnTeoria - solucion_mia -
     * Grupo U6_2C - Z_Ejemplo_RecorridoAnchura</li>
     *
     * <li>Adaptamos a objeto Queue</li>
     * </ul>
     * .
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 10 66 7 -1 -1 -1 4 9 -1 -1 5 -1 88 -1 -1
        String[] arbolString = sc.nextLine().split(" ");
        Arbol arbol = new Arbol(arbolString);
        System.out.println("recorrido preorden con TABS");
        arbol.recorridoPreordenConTAB();
        System.out.println("\nrecorrido en anchura");
        arbol.recorridoAnchura();

        sc.close();

    }
}

class NodoArbol {

    int datos;
    NodoArbol nodoIzq;
    NodoArbol nodoDer;

    public NodoArbol(int datosNodo) {
        datos = datosNodo;
        nodoIzq = nodoDer = null; // recien creado un nodo, no tiene hijos
    }
}

class Arbol {

    private NodoArbol raiz;

    public Arbol() {
        raiz = null;
    }

    public Arbol(String[] arbolString) {
        for (int i = 1; i < arbolString.length; i++) {
            int valor = Integer.parseInt(arbolString[i]);
            this.insertar(valor);
        }
    }

    // si el valor ya existe en el arbol, no inserta nada
    private void insertar(int valorInsertar) {
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

    public void recorridoPreordenConTAB() {
        ayudantePreordenConTAB(raiz, "");
    }

    private void ayudantePreordenConTAB(NodoArbol nodo, String tab) {
        if (nodo == null) {
            System.out.println(tab + "null");
            return;
        }
        System.out.println(tab + nodo.datos);
        tab = tab + "\t";
        ayudantePreordenConTAB(nodo.nodoIzq, tab);
        ayudantePreordenConTAB(nodo.nodoDer, tab);
    }

    void recorridoAnchura() {
        Queue<NodoArbol> cola = new LinkedList<>();
        if (raiz == null) {
            return;
        }
        cola.add(raiz);
        while (!cola.isEmpty()) {
            NodoArbol n = cola.remove();
            System.out.print(n.datos + " ");
            if (n.nodoIzq != null) {
                cola.add(n.nodoIzq);
            }
            if (n.nodoDer != null) {
                cola.add(n.nodoDer);
            }
        }
    }
}
