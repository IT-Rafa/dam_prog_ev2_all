package Ejercicio_U6_B2A_E1;

/**
 * Ejercicio U6_B2A_E1:<p>
 * Escribe los métodos tamano() y obtener() para que funcione el
 * siguiente main()<p>
 * 
 * nota: podemos usar la ñ y llamar al método tamaño(). Sin problema 
 * con JDK pero puede fallar con algún plugin de ide<p>
 * <pre>

class App {
    public static void main(String[] args) {
        MiListaEnlazada miLista= new MiListaEnlazada();
        miLista.insertar(8);
        miLista.insertar(88);
        miLista.insertar(888);
        for(int i=0;i < miLista.tamano();i++){
            System.out.print(miLista.obtener(i)+" ");
        }
    }
}
 * </pre>
 */

class Ejercicio_U6_B2A_E1 {

  /**
   * Crea lista(Nodo), inserta datos y muestra los datos en la lista.
   * El último en entrar en la lista es el primero en salir, de modo
   * que si mostramos la lista por orden de primero al último, saldrán
   * primero el último que metimos y el último será el primero
   */
  public static void main(String[] args) {
    MiListaEnlazada miLista = new MiListaEnlazada();
    miLista.insertar(8);
    miLista.insertar(88);
    miLista.insertar(888);

    for (int i = 0; i < miLista.tamano(); i++) {
      System.out.println(miLista.obtener(i) + " ");
    }
    System.out.println();
  }
}

/**
 * Lista con estructura dinámica creada con Nodos.<p>
 * Al añadir los datos, se introducen al principio de la lista, con lo que
 * se organiza del último métido al principio.<p>
 * Al buscar por índices, el 0 será el último dato introducido

 */
class MiListaEnlazada {

  private Nodo primero = null;

  //en este mismo boletín veremos más adelante una versión más compacta de insertar()
  public void insertar(int dato) {
    // Creamos nodo
    Nodo nodo = new Nodo(dato, null);

    // si no hay Nodos anteriores, siguiente queda en null
    if (primero != null) {
      // Si hay nodos, el primero apunta al Nodo que creamos
      nodo.setSiguiente(primero);
    }
    // Ponemos el creado como nuevo
    primero = nodo;
  }

  /**
   * Devolvemos el valor del la lista según el índice
   */
  public int obtener(int i) {
    // En caso de usar Nodo, recorremos los nodos hasta el índice 
    // indicado
    // Esto cierra el programa si usamos índice superior al tamaño
    if (i >= tamano()) {
      System.out.println(
        "Error de indice a devolver: " +
        i +
        ", si último índice es " +
        (tamano() - 1)
      );
      System.exit(i);
    }
    // Marcamos el primero de la lista
    Nodo objeto = primero;
    // Marcamos índice a 0
    int indexOb = 0;
    // Recorremos lista hasta el índice que nos dieron
    while (indexOb < i) {
      // vamos pasando de objeto.
      objeto = objeto.getSiguiente();
      // y subimos índice leido
      indexOb++;
    }
    // Al llegar al índice que nos dieron, devolvemos objeto
    return objeto.getDato();
  }

  /**
   * Devuelve el tamaño de la lista.
   * Nota: En este caso, recorre la lista.
   * También se puede crear un atributo size y aumentarlo al insertar
   * y bajarlo al eliminar
   */
  public int tamano() {
    int size = 0;
    Nodo actual = primero;

    while (actual != null) {
      actual = actual.getSiguiente();
      size++;
    }
    return size;
  }
}

/**
 * Es una clase autorreferenciadas, usada para crear la estructura dinámica.<p>
 * El valor del objeto (dato) y el enlace con el siguente objeto (sig) se guardan aquí.<p>
 * Autorreferenciada es una clase que contiene un atributo que que apunta a
 * otro objeto de la misma clase.
 */
class Nodo {

  /**
   * Enlace con el siguiente objeto Nodo
   */
  private Nodo sig;
  /**
   * Valor de este objeto
   */
  private int dato;

  /**
   * Constructor que pide valor y el siguiente nodo a conectar
   */
  public Nodo(int dato, Nodo sig) {
    this.dato = dato;
    this.sig = sig;
  }

  /**
   * Permite cambiar el Nodo siguiente al que conectarse
   */
  public void setSiguiente(Nodo sig) {
    this.sig = sig;
  }

  // Devuelve el objeto Nodo al que está conectado
  public Nodo getSiguiente() {
    return sig;
  }

  /**
   * Devuelve el valor del datos del Nodo
   */
  public int getDato() {
    return dato;
  }
}
