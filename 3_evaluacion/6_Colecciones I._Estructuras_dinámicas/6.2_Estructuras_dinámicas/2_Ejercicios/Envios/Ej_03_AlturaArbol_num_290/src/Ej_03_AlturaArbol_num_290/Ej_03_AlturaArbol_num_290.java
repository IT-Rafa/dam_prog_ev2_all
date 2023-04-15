package Ej_03_AlturaArbol_num_290;

import java.util.Scanner;

/**
 * Clase con main para ejercicio Ej_03_AlturaArbol_num_290
 */
public class Ej_03_AlturaArbol_num_290 {

  /**
   * Según instrucciones:
   * <ul>
   *    <li>Pedimos usuario cantidad Árboles a pedir</li>
   *    <li>Por cantidad pedida:
   *        <ul>
   *            <li>Pedimos descripción de un árbol binario
   *                <ul>
   *                    <li>El árbol vacío se representa con un punto (.)</li>
   *                    <li>Un árbol no vacío se representa con un * (que denota la raíz),
   *                                seguido primero de la descripción del hijo izquierdo y después de la descripción del hijo derecho.</li>
   *                    <li>Los árboles nunca contendrán más de 5.000 nodos.</li>
   *                </ul>
   *            </li>
   *            <li>Para cada árbol, se escribirá una línea con su altura. </li>
   *        </ul>
   *    </li>
   *    
   * </ul>
   *
   * Ejemplo Entrada:
   * <pre>
2
***..*..*..
**..**..**..*..
   * </pre>
   * Salida del ejemplo:
   * <pre>
3
4
   * </pre>
   */
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    int cant;

    // Pedimos cantidad Árboles a introducir
    while (true) {
      try {
        while (!sc.hasNext()) sc.next();
        cant = Integer.parseInt(sc.nextLine());
        if (cant > 0) {
          break;
        } else {
          System.out.println("Cantidad menor que 1; Repite entrada");
        }
      } catch (NumberFormatException e) {
        System.out.println("Entrada no válida; Repite entrada");
      }
    }

    // Repetimos por cantidad
    for (int i = 0; i < cant; i++) {
      // Pedimos descripción del árbol
      String input = sc.nextLine();
      // Dividimos string en array
      char[] desc = input.toCharArray();
      // Usamos descripción para crear árbol
      Arbol arbol = new Arbol(desc);
      System.out.println(arbol.getHeight());
    }

    sc.close();
  }
}

/**
 * <h4>Ya hecho en Ejercicio_U6_2C_E7. Eliminamos métodos no usados</h4>

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
  private char[] datosNodos;

  /**
   *
   */
  private int posArray = 0;

  /**
   * Constructor objeto Arbol con parámetro con lista de strings con
   * sus datos
   */
  public Arbol(char[] descArbol) {
    // Crea raiz vacia
    raiz = null;
    // Guarda el parametro como atributo
    this.datosNodos = descArbol;
    // Crea el arbol según argumento descArbol
    this.crearArbol();
  }

  /**
   * Crea el arbol según los datos en datosNodos
   */
  private void crearArbol() {
    // Convierte el primar dato [0] de arbolString a entero
    // y lo guarda para construir la raiz
    boolean dato;
    if (datosNodos[0] == '*') {
      dato = true;
      raiz = new NodoArbol(dato);
      // sigue creando datos con según resto datos arbolString
      ayudanteCrearArbol(raiz);
    } else if (datosNodos[0] == '.') {
      dato = false;
      raiz = null;
    } else {
      System.out.println("Error al crear árbol; array extraño");
      System.exit(posArray);
    }
  }

  /**
   * Método recurrente para recorrer lista datos arbolString y
   * crear nodos y enlazarlos.
   *
   * @param padre arbol donde se crean los enlaces
   */
  private void ayudanteCrearArbol(NodoArbol padre) {
    boolean dato;

    posArray++;
    if (datosNodos[posArray] == '*') {
      dato = true;
      padre.izq = new NodoArbol(dato);
      ayudanteCrearArbol(padre.izq);
    } else if (datosNodos[posArray] == '.') {
      dato = false;
    } else {
      System.out.println("Error al crear árbol; array extraño");
      System.exit(posArray);
    }

    posArray++;
    if (datosNodos[posArray] == '*') {
      dato = true;
      padre.der = new NodoArbol(dato);
      ayudanteCrearArbol(padre.der);
    } else if (datosNodos[posArray] == '.') {
      dato = false;
    } else {
      System.out.println("Error al crear árbol; array extraño");
      System.exit(posArray);
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
}

/**
 * Es una clase autorreferenciadas, usada para crear la estructura dinámica.<p>
 * El valor del objeto boolean (dato) y el enlace con los siguentes objetos (izq y der)
 * se guardan aquí.<p>
 * Autorreferenciada es una clase que contiene un atributo (izq y der, en este caso)
 * que que apunta a otros objetos de la misma clase.
 */
class NodoArbol {

  /**
   * Contiene el valor del elemento
   */
  boolean dato;

  /**
   * Enlace con los otro objeto NodoArbol
   */
  NodoArbol izq, der;

  /**
   * Constructor que pide valor
   *
   * @param dato valor que tiene el nodo
   */
  public NodoArbol(boolean dato) {
    this.dato = dato;
    izq = der = null; //recien creado un nodo, no tiene hijos
  }
}
