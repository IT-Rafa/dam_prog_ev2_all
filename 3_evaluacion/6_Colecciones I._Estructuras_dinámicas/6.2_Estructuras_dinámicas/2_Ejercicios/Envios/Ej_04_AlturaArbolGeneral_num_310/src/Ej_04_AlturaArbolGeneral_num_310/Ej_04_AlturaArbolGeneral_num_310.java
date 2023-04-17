package Ej_04_AlturaArbolGeneral_num_310;

import java.util.Scanner;

/**
 * Clase con main para ejercicio Ej_04_AlturaArbolGeneral_num_310
 */
public class Ej_04_AlturaArbolGeneral_num_310 {

  /**
   * Según instrucciones:
   * <ul>
   *    <li>Pedimos usuario cantidad Árboles a pedir</li>
   *    <li>Por cantidad pedida:
   *        <ul>
   *            <li>Pedimos descripción de un árbol binario
   *                <ul>
   *                    <li>Primero ponemos los enlaces de la raíz</li>
   *                    <li>Añadimos los enlaces de cada nodo</li>
   *                </ul>
   *            </li>
   *            <li>Para cada árbol, se escribirá una línea con su altura. </li>
   *        </ul>
   *    </li>
   * </ul>
   *
   *
   *  
   * <h3>Ejemplo descripción:</h3>
   * Datos metidos: 3 2 0 0 0 1 0<p>
   * 
   * La raíz tiene 3 nodos enlazados (3) 2 0 0 0 1 0 <p>
   * <pre>
.       *     
.      /|\            
   * </pre>
   * 
   * Pasamos por cada nodo, de izquierda a derecha, hasta el final <p>
   * Empezamos con el 1º nodo de raíz, que tiene 2 enlaces (3 2) 0 0 0 1 0
   * <pre>
.       *     
.      /|\         
.     / | \      
.    * 
.   / \       
   * </pre>
   * 
   * De estos enlaces, el primero tiene 0 enlaces (3 2 0) 0 0 1 0 <p>
   * y el segundo también tiene 0 enlaces (3 2 0 0) 0 1 0
   * <pre>
.       *     
.      /|\         
.     / | \      
.    *  
.   / \      
.  *   *        
   * </pre>
   * Ahora que hicimos los 2 enlaces que tenía, seguimos con el siguiente
   * del anterior, que es el segundo de los enlaces de la raíz.<p>
   * En este caso tampoco tiene enlaces
   * (3 2 0 0 0) 1 0
   * <pre>
.       *     
.      /|\         
.     / | \      
.    *  *
.   / \      
.  *   *        
   * </pre>
   * Vamos al último de los enlaces de la raíz, que en este caso tiene un enlace<p>
   *  * (3 2 0 0 0 1) 0
   * <pre>
.       *     
.      /|\         
.     / | \      
.    *  *  *
.   / \    |
.  *   *        
   * </pre>
   * y le añadimos las raices a este enlace, que en este caso es una<p>
   * (3 2 0 0 0 1 0)
   * <pre>
.       *     
.      /|\         
.     / | \      
.    *  *  *
.   / \    |
.  *   *   *    
   * </pre>
   * Ya está construido
   * 
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

      Arbol arbol = new Arbol(input);
      // arbol.imprimirArbol();
      System.out.println(arbol.getAltura());
    }

    sc.close();
  }
}

/**
 * Organizador tipo arbol, en este caso Árbol Árbol n-ario
 * (Binary Search Tree)<p>
 * Una arbol, o tree, en inglés, es una colección de datos en los que
 * cada dato tiene enlazado varios enlaces a otros objetos.<p>
 *
 * En este caso cada nodo puede tener varios enlaces
 *
 * En este caso está basada en clases autorreferenciadas
 */

class Arbol {

  private NodoArbol raiz;
  private int[] datosArbol;

  /**
   * Devuelve la altura del arbol
   *
   * @return altura del arbol
   */
  public int getAltura() {
    if (raiz.hijos.length == 0) {
      return 0;
    } else {
      return getAltura(raiz) + 1;
    }
  }

  private int getAltura(NodoArbol nodo) {
    int[] alturaHijos = new int[nodo.hijos.length];
    for (int i = 0; i < nodo.hijos.length; i++) {
      alturaHijos[i] += getAltura(nodo.hijos[i]) + 1;
    }
    int max = 0;
    for (int n : alturaHijos) {
      if (n > max) {
        max = n;
      }
    }
    return max;
  }

  public Arbol(String desc) {
    this.raiz = null;

    String[] datosSt = desc.split(" ");
    datosArbol = new int[datosSt.length];
    for (int i = 0; i < datosSt.length; i++) {
      this.datosArbol[i] = Integer.parseInt(datosSt[i]);
    }
    crearArbol();
  }

  private void crearArbol() {
    // 3 2 0 0 0 1 0
    // CREAMOS NODO RAIZ
    // Capturamos cantidad hijos
    int cantHijos = datosArbol[0];

    // Creamos nodo con array para hijos y asignamos a raíz
    this.raiz = new NodoArbol(cantHijos);
    // Creamos hijos
    crearHijos(this.raiz, 0);
  }

  private int crearHijos(NodoArbol nodo, int pos) {
    int cantHijosPadre = datosArbol[pos];
    for (int i = 0; i < cantHijosPadre; i++) {
      pos++;
      int cantHijosNodo = datosArbol[pos];

      nodo.hijos[i] = new NodoArbol(cantHijosNodo);

      pos = crearHijos(nodo.hijos[i], pos);
    }
    return pos;
  }

  public void imprimirArbol() {
    imprimirArbol(raiz, "");
  }

  private void imprimirArbol(NodoArbol raiz, String tab) {
    System.out.println(tab + "*");
    if (raiz == null) {
      System.out.println("raiz es nula");
      System.exit(0);
    }
    if (raiz.hijos != null) {
      for (NodoArbol nodo : raiz.hijos) {
        imprimirArbol(nodo, tab + "\t");
      }
    }
  }
}

class NodoArbol {

  public NodoArbol[] hijos;

  public NodoArbol(int hijos) {
    this.hijos = new NodoArbol[hijos];
  }
}
