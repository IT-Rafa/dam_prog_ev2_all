package Ejercicio_U6_B2B_E2;

/**
 * Determina los métodos usados para crear una pila
 */
interface Pila {
  /**
   * Inserta un elemento en la cabeza de la pila
   *
   * @param dato Dato a introducir
   */
  void push(char dato);

  /**
   * Saca un elemento de la cabeza de la pila y nos lo devuelve.
   *
   * @return Dato que se elimina
   */
  char pop();

  /**
   * Indica si la pila esta vacia o no
   * @return true si está vacia; false si no
   */
  public boolean esVacia();
}
