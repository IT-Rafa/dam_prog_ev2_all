package Ejercicio_U7_B4_10;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;

/**
 * Clase que contiene el main del Ejercicio_U7_B4_10
 */
public class Ejercicio_U7_B4_10 {

  /**
   * Pasos a seguir
   * <ul>
   * <li>Primero cree el árbol como en  (02C- Arboles .pdf - pag. 13
   * Recorrido en anchura), y eliminé la clase MiCola y la cambié por Queue </li>
   * <li>Adaptamos a objeto Queue</li>
   * <li>Tras ver solución y que el modelo y la creación del árbol eran distintos,
   * lo cambié al nuevo diseño. Arbol binario de búsqueda y añadir descripción al azar</li>
   * <li>El cambio a Queue sigue funcionando</li>
   * </ul>
   * .
   */
  public static void main(String[] args) {
    Arbol arbol = new Arbol();
    int valor;
    Random numeroAleatorio = new Random();
    System.out.println("Insertando los siguientes valores: ");
    // Creamos valores y lo añadimos al árbol
    for (int i = 1; i <= 10; i++) {
      valor = numeroAleatorio.nextInt(100);
      System.out.print(valor + " ");
      arbol.insertar(valor);
    }
    // Mostramos el árbol mostrando los subnodos
    System.out.println("\nRecorrido preorden con indentaciones.....");
    arbol.recorridoPreordenConTAB();
    // Mostramos los datos del árbol
    System.out.println("\nrecorrido en anchura");
    arbol.recorridoAnchura();
  }
}

/**
 * Clase que representa los nodos de la clase Arbol
 */
class NodoArbol {

  /**
   * Valor del nodo
   */
  int datos;
  /**
   * Enlaze izquierdo. Donde se guardan los valores menores que datos
   */
  NodoArbol nodoIzq;
  /**
   * Enlace derecho. Donde se guardan los valores mayores que datos
   */
  NodoArbol nodoDer;

  /**
   * Constructor con el dato a introducir y enlaces vacios
   *
   * @param datosNodo Valor que guardará este NodoArbol
   */
  public NodoArbol(int datosNodo) {
    datos = datosNodo;
    nodoIzq = nodoDer = null; // recien creado un nodo, no tiene hijos
  }
}

/**
 * Representamos un árbol Binario de Búsqueda.<p>
 * Usando NodoArbol enlazados, creamos añadimos los valores mayores que el nodo
 * van a la derecha y los menores a la izquierda.<p>
 * Los iguales se ignoran.
 */
class Arbol {

  /**
   * Álmacena el  NodoArbol principal, que enlaza con los demas (si existen)
   */
  private NodoArbol raiz;

  /**
   * Constructor Arbol vacío
   */
  public Arbol() {
    raiz = null;
  }

  /**
   * Inserta nuevo valor al Árbol y lo ordena según valor del nodo
   */
  public void insertar(int valorInsertar) {
    if (raiz == null) {
      // Sí raíz está vacia, lo crea y guarda directamente
      raiz = new NodoArbol(valorInsertar);
    } else {
      // Si no, busca donde guardarlo, lo crea y lo guarda
      ayudanteInsertarNodo(raiz, valorInsertar);
    }
  }

  /**
   * Según el valor del NodoArbol, comprueba si el valor introducido es menor o mayor, y continua
   * hasta encontrar el sitio donde crearlo y enlazarlo guardarlo<p>
   * Si el valor ya fue guardado, no hace nada.
   *
   * @param a NodoArbol en el que estamos
   * @param valorInsertar Valor del nodo a insertar
   */
  private void ayudanteInsertarNodo(NodoArbol a, int valorInsertar) {
    if (valorInsertar < a.datos) {
      // Si el valor es menor, comprobamos el enlace izquierdo
      if (a.nodoIzq == null) {
        // Si es nulo, Crea el nuevo nodo y lo enlaza en este enlace
        a.nodoIzq = new NodoArbol(valorInsertar);
      } else {
        // Si no, sigue buscando
        ayudanteInsertarNodo(a.nodoIzq, valorInsertar);
      }
    } else if (valorInsertar > a.datos) {
      // Si el valor es mayor, comprobamos el enlace derecho
      if (a.nodoDer == null) {
        // Si es nulo, Crea el nuevo nodo y lo enlaza en este enlace
        a.nodoDer = new NodoArbol(valorInsertar);
      } else {
        // Si no, sigue buscando
        ayudanteInsertarNodo(a.nodoDer, valorInsertar);
      }
    }
  }

  /**
   * Imprimimos el árbol desde la raíz, usando pre-orden con tabs para
   * mostrar los sub-nodos
   */
  public void recorridoPreordenConTAB() {
    ayudantePreordenConTAB(raiz, "");
  }

  /**
   * Imprimimos el árbol desde el nodo indicado, guardando los tabs
   * a usar
   *
   * @param nodo El nodo desde donde recorremos el arbol
   * @param tab String con los tabs a añadir
   */
  private void ayudantePreordenConTAB(NodoArbol nodo, String tab) {
    if (nodo == null) {
      // Si el nodo no tiene valor, no hacemos nada
      return;
    } else {
      // Si tiene valor, lo imprimimos con los tabs
      System.out.println(tab + nodo.datos);
      // Añadimos un tab para los siguientes
      tab = tab + "\t";
      // Revisamos el resto de enlaces
      ayudantePreordenConTAB(nodo.nodoIzq, tab);
      ayudantePreordenConTAB(nodo.nodoDer, tab);
    }
  }

  /**
   * Imprimimos el árbol mostrando los datos de cada nodo
   */
  void recorridoAnchura() {
    // Creamos la cola, montada con LinkedList
    // donde guardaremos los nodos
    Queue<NodoArbol> cola = new LinkedList<>();
    if (raiz == null) {
      // Si la raíz es nula, finalizamos
      return;
    }
    // Añadimos el valor de la raíz
    cola.add(raiz);

    // Recorremos los enlaces mientras tenga NodoArbol
    while (!cola.isEmpty()) {
      // Eliminamos el valor de la cola y lo guardamos
      NodoArbol n = cola.remove();

      // Imprimimos el valor del NodoArbol guardado
      System.out.print(n.datos + " ");
      if (n.nodoIzq != null) {
        // Si el enlace izquierdo está conectado
        // lo añadimos a la cola
        cola.add(n.nodoIzq);
      }
      if (n.nodoDer != null) {
        // Si el enlace derecho está conectado
        // lo añadimos a la cola
        cola.add(n.nodoDer);
      }
    }
  }
}
