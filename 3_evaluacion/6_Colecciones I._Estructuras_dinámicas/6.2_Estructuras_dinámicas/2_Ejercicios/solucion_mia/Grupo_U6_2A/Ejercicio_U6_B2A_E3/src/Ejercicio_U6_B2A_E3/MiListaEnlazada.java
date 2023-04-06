package Ejercicio_U6_B2A_E3;

/**
 * Implementación de interface MiLista, usada con una clase autorreferenciada
 *  para almacenar datos<p>
 * Los valores se insertan al principio de la lista
 */
class MiListaEnlazada implements MiLista {

  /**
   * Nodo con el primer valor de la lista
   */
  private Nodo primero = null;

  /**
   * {@inheritDoc}<p>
   * Los valores se insertan al principio de la lista
   */
  @Override
  public void insertar(int nuevoElemento) {
    primero = new Nodo(nuevoElemento, primero);
  }

  /**
   * {@inheritDoc}<p>
   * En este caso, el valor 0 del índice es el último dato introducido
   */
  @Override
  public int obtener(int posicion) {
    Nodo temp = primero;
    int i = 0;
    while (i < posicion) {
      temp = temp.getSiguiente();
      i++;
    }

    return temp.getDato();
  }

  /**
   * {@inheritDoc}<p>
   * En este caso, el valor 0 del índice es el último dato introducido
   */
  @Override
  public void eliminar(int posicion) {
    // Suponemos que la posicion es de 0 a n -1 siendo n el tamaño de la lista.

    if (posicion == 0) {
      // En el primer elemento de la lista, solo tenemos que guardar el
      // siguiente al que apunta
      primero = primero.getSiguiente();
    } else {
      // Recorremos los nodos, desde el primero hasta la posición previa
      // al nodo pedidio (posicion -1)
      Nodo ant = primero;
      for (int i = 0; i < (posicion - 1); i++) {
        // Capturamos el Nodo anterior
        ant = ant.getSiguiente();
      }

      // Eliminamos el Nodo dandole al previo la dirección del siguiente
      // Nodo que que nos dieron (posición +1)
      // El Nodo en posición ya no tiene a nadie que lo anote y se eliminará
      // en las tareas de eliminación
      ant.setSiguiente(ant.getSiguiente().getSiguiente());
    }
  }

  /**
   * Devuelve el tamaño de la lista.
   * Nota: Aprovechamos el array
   */
  @Override
  public int tamano() {
    int i = 0;
    Nodo temp = primero;
    while (temp != null) {
      i++;
      temp = temp.getSiguiente();
    }
    return i;
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
