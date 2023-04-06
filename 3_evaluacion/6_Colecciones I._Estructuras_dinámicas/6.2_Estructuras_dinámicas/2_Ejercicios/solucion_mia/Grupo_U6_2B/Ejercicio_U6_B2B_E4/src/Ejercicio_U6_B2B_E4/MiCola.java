package Ejercicio_U6_B2B_E4;

public class MiCola implements Cola {

  /**
   * Salida de la cola
   */
  private Nodo primero = null;
  /**
   * Entrada de la cola
   */
  private Nodo ultimo = null;
  /**
   * Cantidad nodos incluidos
   */
  private int size = 0;

  @Override
  public void encolar(int dato) {
    // Creamos Nodo
    Nodo nuevo = new Nodo(dato, null);
    if (esVacia()) {
      // Si vacia, es el primero
      primero = nuevo;
    } else {
      // Si no; ponemos la ruta siguiente del último al nuevo
      ultimo.setSiguiente(nuevo);
    }
    // En ambos casos cambiamos el último por el nuevo
    ultimo = nuevo;
    // Subimos cantidad de nodos
    size++;
  }

  @Override
  public int desencolar() {
    // Capturamos dato
    int result = primero.getDato();
    // Pasamos la dirección del siguiente Nodo como primero
    primero = primero.getSiguiente();

    // Bajamos cantidad de nodos
    size--;

    // y Devolvemos dato
    return result;
  }

  @Override
  public boolean esVacia() {
    return primero == null;
  }

  @Override
  public int getSize() {
    return size;
  }
}

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
