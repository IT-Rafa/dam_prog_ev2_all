package Ejercicio_U6_B2A_E3;
public class MiListaEnlazada implements MiLista {

  private Nodo primero = null;

  @Override
  public void insertar(int nuevoElemento) {
    primero = new Nodo(nuevoElemento, primero);
  }

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

  @Override
  public void eliminar(int posicion) {
    //suponemos que la posicion es de 0 a n -1 siendo n el tamaño de la lista
    //el borrado del primero es un caso especial, consiste en hacer primero el segunod
    if (posicion == 0) {
      primero = primero.getSiguiente();
    } else {
      //para borrar un nodo que no es el primero
      //localizo el nodo justo anterior, es decir el de que está en posicion-1
      Nodo ant = primero;
      for (int i = 0; i < (posicion - 1); i++) {
        ant = ant.getSiguiente();
      }
      //tengo en ant el nodo justo anterior al que quiero borrar
      //borrar es puentear el elemnto i

      ant.setSiguiente(ant.getSiguiente().getSiguiente());
    }
  }

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
