package Ejercicio_U6_B2A_E1;
/**
 * Ejercicio U6_B2A_E1:<p>
 * Escribe los métodos tamano() y obtener() para que funcione el
 * siguiente main()<p>
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
   * Crea lista, inserta datos y muestra los datos en la lista
   */
  public static void main(String[] args) {
    MiListaEnlazada miLista = new MiListaEnlazada();
    miLista.insertar(8);
    miLista.insertar(88);
    miLista.insertar(888);

    for (int i = 0; i < miLista.tamano(); i++) {
      System.out.print(miLista.obtener(i) + " ");
    }
    System.out.println();
  }
}

/**
 * Clase autoreferenciada para crear una lista con estructura dinámica.
 * Cada objeto apunta al siguiente al 
 */
class Nodo {

  private Nodo sig;
  private int dato;

  public Nodo(int dato, Nodo sig) {
    this.dato = dato;
    this.sig = sig;
  }

  public void setSiguiente(Nodo sig) {
    this.sig = sig;
  }

  public Nodo getSiguiente() {
    return sig;
  }

  public int getDato() {
    return dato;
  }
}

/**
 * Lista con estructura dinámica
 */
class MiListaEnlazada {

  private Nodo primero = null;

  //en este mismo boletín veremos más adelante una versión más compacta de insertar()
  public void insertar(int dato) {

    if (primero == null) {
      primero = new Nodo(dato, null);
    } else {
      Nodo temp = new Nodo(dato, primero);
      primero = temp;
    }
  }

  public int obtener(int i) {
    Nodo objeto = primero;
    int indexOb = 0;
    while (indexOb < i) {
      objeto = objeto.getSiguiente();
      indexOb++;
    }
    return objeto.getDato();
  }

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
