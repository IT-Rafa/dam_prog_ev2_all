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
      String[] desc = input.split(" ");
      // Usamos descripción para crear árbol
      Arbol arbol = new Arbol(desc);
      arbol.imprimirArbol();
      System.out.println(arbol.getHeight());
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
  private String[] desc;

  public Arbol(String[] desc) {
    this.raiz = null;
    this.desc = desc;
    crearArbol();
  }

  private void crearArbol() {
    ayudanteCrearArbol(raiz, 0);
  }

  /**
   * Método recurrente para recorrer lista dato1s arbolString y
   * crear nodos y enlazarlos.
   *
   * @param padre arbol donde se crean los enlaces
   */
  private void ayudanteCrearArbol(NodoArbol nodo, int pos) {
    nodo = new NodoArbol();
    int cantHijos = Integer.parseInt(desc[pos]);
    nodo.hijos = new NodoArbol[cantHijos];
    for (int i = 0; i < cantHijos; i++) {
      nodo.hijos[i] = new NodoArbol();
      if (desc.length < i + 1) {
        ayudanteCrearArbol(nodo.hijos[i], pos + 1);
      }
    }
  }

  public void imprimirArbol() {
    imprimirArbol(raiz, "");
  }

  private void imprimirArbol(NodoArbol raiz, String tab) {
    System.out.println(tab + "*");
    if (raiz.hijos != null) {
      for (NodoArbol nodo : raiz.hijos) {
        imprimirArbol(nodo, tab + "\t");
      }
    }
  }

  public int getHeight() {
    return 0;
  }
}

class NodoArbol {

  public NodoArbol[] hijos;

  public NodoArbol(String hijos) {
    this.hijos = new NodoArbol[Integer.parseInt(hijos)];
  }
}
