package Ejercicio_U6_B2A_E3;

/**
 * Implementación de interface MiLista, usada con un array para
 * almacenar datos<p>
 * Los valores se insertan al final de la lista
 */
public class ArrayListCasero implements MiLista {

  /**
   * Array con los valores de la lista
   */
  private int[] arrayInterno;

  /**
   * {@inheritDoc}<p>
   * Los valores se insertan al final de la lista
   */
  @Override
  public void insertar(int nuevoElemento) {
    int[] nuevoArray;
    if (arrayInterno == null) {
      nuevoArray = new int[1];
      nuevoArray[0] = nuevoElemento;
    } else {
      nuevoArray = new int[arrayInterno.length + 1];
      for (int i = 0; i < arrayInterno.length; i++) {
        nuevoArray[i] = arrayInterno[i];
      }
      nuevoArray[nuevoArray.length - 1] = nuevoElemento;
    }
    arrayInterno = nuevoArray;
  }

  /**
   * {@inheritDoc}<p>
   * En este caso, el valor 0 del índice es el primer dato introducido
   */
  @Override
  public int obtener(int posicion) {
    return arrayInterno[posicion];
  }

  /**
   * {@inheritDoc}<p>
   * En este caso, el valor 0 del índice es el primer dato introducido
   */
  @Override
  public void eliminar(int posicion) {
    // Creamos array y eliminamos 1 de la longitud
    int[] newArray = new int[arrayInterno.length - 1];
    // System.arraycopy()
    // Copias del 1º param, desde posicion 2º param.
    // al array en 3º param, desde posición 4º param la cantidad de 5º param
    if (posicion == 0) {
      // Si posición es 0
      // Copiamos de la posición 1(no 0) hasta final
      System.arraycopy(arrayInterno, 1, newArray, 0, arrayInterno.length - 1);
    } else if (posicion == arrayInterno.length - 1) {
      // Copiamos de posición 0 hasta final
      System.arraycopy(arrayInterno, 0, newArray, 0, arrayInterno.length - 1);
    } else {
      // Copiamos de posición 0 hasta posición anterior al índice
      System.arraycopy(arrayInterno, 0, newArray, 0, posicion - 1);

      // Copiamos de posición posición siguiente al índice hasta final
      System.arraycopy(
        arrayInterno,
        posicion,
        newArray,
        posicion - 1,
        arrayInterno.length - posicion
      );
    }
    // Enlazamos el nuevo array al atributo
    arrayInterno = newArray;
  }

  @Override
  public int tamano() {
    return arrayInterno.length;
  }
}
