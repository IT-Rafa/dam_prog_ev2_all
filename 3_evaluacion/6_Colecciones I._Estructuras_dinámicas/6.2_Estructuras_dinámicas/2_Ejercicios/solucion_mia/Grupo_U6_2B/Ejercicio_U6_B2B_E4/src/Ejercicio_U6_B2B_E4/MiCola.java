package Ejercicio_U6_B2B_E4;

public class MiCola implements Cola {

  /**
   * Salida de la cola
   */
  Nodo primero = null;
  /**
   * Entrada de la cola
   */
  Nodo ultimo = null;

  @Override
  public void encolar(int dato) {
    System.out.println("Encolando " + dato);
    ultimo = new Nodo(dato, ultimo);

  }

  @Override
  public int desencolar() {
    System.out.println("Desencolando");
    if(primero == null){
        primero = ultimo;
    }
    int result = primero.getDato();
    primero = primero.getSiguiente();
    return result;
  }

  @Override
  public boolean esVacia() {
    if (ultimo == null) {
      return true;
    } else {
      return false;
    }
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
