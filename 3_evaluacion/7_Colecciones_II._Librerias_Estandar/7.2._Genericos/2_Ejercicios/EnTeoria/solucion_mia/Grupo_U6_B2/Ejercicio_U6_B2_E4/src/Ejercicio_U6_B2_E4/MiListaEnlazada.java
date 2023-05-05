package Ejercicio_U6_B2_E4;

/**
 * Clase para crear una lista enlazada para Tipos genéricos.
 * Usa objetos Nodo<T> para conectar los datos entre ellos.
 * El primer dato es el último que se mete y enlaza con el anterior primero
 * El último dato es el primero y no conecta con ninguno
 *
 */
public class MiListaEnlazada<T> {

  /**
   * Primer nodo dentro de la clase
   */
  private Nodo<T> primero = null;

  /**
   * Método para insertar un tipo genérico en la clase
   */
  public void insertar(T dato) {
    if (primero == null) {
      // Si el primero es nulo, se agrega ahi
      primero = new Nodo<>(dato);
    } else {
      // si no, se crea el nodo para que apunte al primero
      Nodo<T> temp = new Nodo<>(dato, primero);
      // Remplazamos el primero por el nuevo
      primero = temp;
    }
  }

  /**
   * Devuelve la cantidad de objetos genéricos guardados en esta lista
   */
  public int tamano() {
    // Ponemos índice a 0
    int i = 0;
    // Usamos variable del nodo Genérico para que apunte al primero de
    // la lista
    Nodo<T> temp = primero;

    // Recorremos la lista hasta que haya un nulo
    while (temp != null) {
      // Aumenta indice
      i++;
      // Pasamos al siguiente enlazado
      temp = temp.getSiguiente();
    }
    // al llegar a nulo, devolvemos índicie
    return i;
  }

  /**
   * Método para recuperar el tipo Genérico guardado en un
   * Nodo<T>, según el índice<p>
   * (0 = último guardado)
   */
  public T obtener(int indice) {
    // Capturamos el primer nodo de la lista
    Nodo<T> temp = primero;
    // Ponemos índice de la lista a 0
    int i = 0;
    // Recorremos la lista hasta que índice de la lista supere
    // al índice del parámetro
    while (i < indice) {
      // Pasamos al siguiente objeto genérico enlazado
      temp = temp.getSiguiente();
      // subimos el índice de la lista
      i++;
    }
    // Devolvemos el objeto genérico guardado en el Nodo localizado
    return temp.getDato();
  }
}
