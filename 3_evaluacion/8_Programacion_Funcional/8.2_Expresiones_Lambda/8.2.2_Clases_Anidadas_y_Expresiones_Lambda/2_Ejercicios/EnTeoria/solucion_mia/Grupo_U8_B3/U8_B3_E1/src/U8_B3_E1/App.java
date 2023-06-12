package U8_B3_E1;

/**
 * Clase con ejecutable de Ejercicio U8_B3_E1<p>
 * Introducimos Nodo como clase privada interna de MiPila
 * (Aunque en enunciado se indica Pila, que es una interface)
 */
class App {

  /**
   * Ejecutable Ejercicio U8_B3_E1<p>
   * Crea datos de la pila y los muestra
   */
  public static void main(String[] args) {
    // Crea la pila
    MiPila mipila = new MiPila();

    // Añadimos datos
    mipila.push(1);
    mipila.push(2);
    mipila.push(3);
    mipila.push(4);
    mipila.push(5);

    // Sacamos los datos y los mostramos
    while (!mipila.esVacia()) {
      System.out.println(mipila.pop());
    }
  }
}

/**
 * Muestra los interfaces usados para crear la pila
 */
interface Pila {
  /**
   * inserta un elemento en la cabeza de la pila
   *
   * @param dato Entero a insertar en la pila
   */
  void push(int dato);

  /**
   * saca un elemento de la cabeza de la pila.
   *
   * @return Entero sacado de la cabeza de la pila
   */
  int pop();

  /**
   * Nos indica si la pila está vacía
   *
   * @return True si está vacía; False si no
   */
  public boolean esVacia();
}

/**
 * Clase para controlar la pila, que implementa Pila<p>
 */
class MiPila implements Pila {

  /**
   * Dirección del primer Nodo en la pila
   */
  private Nodo cabeza = null;

  /**
   *
   */
  public void push(int dato) {
    // Si el primer nodo está vacio, solo guardamos el entero
    if (cabeza == null) {
      cabeza = new Nodo(dato);
    } else {
      // Si no, guardamos el entero y usamos la cabeza actual
      // como siguiente nodo. Ahora este será la cabeza
      Nodo temp = new Nodo(dato, cabeza);
      cabeza = temp;
    }
  }

  /**
   *
   */
  public int pop() {
    // Guardamos entero para devolverlo
    int dato = cabeza.dato;
    // El siguiente Nodo será la cabeza ahora
    cabeza = cabeza.sig;
    return dato;
  }

  /**
   *
   */
  public boolean esVacia() {
    return cabeza == null;
  }

  /**
   * Clase interna usada para guardar los datos del nodo
   * y su enlace con el siguiente
   */
  private class Nodo {

    /**
     * Dirección al siguiente Nodo
     */
    private Nodo sig;

    /**
     * dato entero guardado en este Nodo
     */
    private int dato;

    // CONSTRUCTORS

    /**
     * Constructor solo con el entero
     * <p>
     * Usado para el primer elemento
     *
     * @param dato Entero almacenado en este nodo
     */
    public Nodo(int dato) {
      this.dato = dato;
      this.sig = null;
    }

    /**
     * Constructor con el entero y la dirección al
     * siguiente Nodo
     *
     * @param dato Entero almacenado en este nodo
     * @param sig Dirección al siguiente Nodo
     */
    public Nodo(int dato, Nodo sig) {
      this.dato = dato;
      this.sig = sig;
    }
  }
}
