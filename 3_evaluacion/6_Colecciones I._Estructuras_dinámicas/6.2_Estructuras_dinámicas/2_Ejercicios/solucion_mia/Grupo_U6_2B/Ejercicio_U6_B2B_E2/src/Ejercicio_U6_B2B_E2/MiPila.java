package Ejercicio_U6_B2B_E2;
public class MiPila implements Pila {

  private Nodo primero = null;

  @Override
  public void push(char dato) {
    primero = new Nodo(dato, primero);
  }

  @Override
  public char pop() {
    char result = primero.getDato();
    primero = primero.getSiguiente();
    return result;
  }

  @Override
  public boolean esVacia() {
    if (primero == null) {
      return true;
    } else {
      return false;
    }
  }
}

class Nodo {

  private Nodo sig;
  private char dato;

  public Nodo(char dato, Nodo sig) {
    this.dato = dato;
    this.sig = sig;
  }

  public void setSiguiente(Nodo sig) {
    this.sig = sig;
  }

  public Nodo getSiguiente() {
    return sig;
  }

  public char getDato() {
    return dato;
  }
}
