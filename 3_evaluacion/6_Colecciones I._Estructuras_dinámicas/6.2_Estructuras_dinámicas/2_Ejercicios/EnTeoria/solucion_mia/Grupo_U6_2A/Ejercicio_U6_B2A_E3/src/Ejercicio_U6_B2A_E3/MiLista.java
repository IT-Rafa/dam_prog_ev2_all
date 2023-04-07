package Ejercicio_U6_B2A_E3;

/**
 * Interface para gestinar listas
 */
public interface MiLista {
  /**
   * Introduce un nuevo valor, de tipo int, a la lista
   * @param nuevoElemento Valor a añadir
   */
  void insertar(int nuevoElemento);

  /**
   * Según el índice, busca en la lista el que coincida y
   * devuelve su valor
   * @param posicion Indice del que se captura el valor
   * @return Valor del elemento
   */
  public int obtener(int posicion);

  /**
   * Según el índice, busca en la lista el que coincida lo
   * elimina de la lista
   * @param posicion Valor del índice a eliminar
   */
  public void eliminar(int posicion);

  /**
   * Devuelve el tamaño de la lista
   * @return Tamaño de la lista
   */
  public int tamano();
}
