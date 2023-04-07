package Ejercicio_U6_B2B_E4;

/**
 * Determina los métodos usados para crear una cola
 */
interface Cola {
  /**
   * Inserta un elemento al final de la cola
   *
   * @param dato Dato a introducir
   */
  void encolar(int dato);
  
  /**
   * Elimina un elemento del principio de la cola y nos
   * devuelve su valor
   *
   * @return Dato que se elimina
   */
  int desencolar();

  /**
   * Indica si la pila esta vacia o no
   * @return true si está vacia; false si no
   */
  public boolean esVacia();

  /**
   * Nos devuelve la cantidad de elementos en la cola
   * @return true si está vacia; false si no
   */
  public int getSize();
}
