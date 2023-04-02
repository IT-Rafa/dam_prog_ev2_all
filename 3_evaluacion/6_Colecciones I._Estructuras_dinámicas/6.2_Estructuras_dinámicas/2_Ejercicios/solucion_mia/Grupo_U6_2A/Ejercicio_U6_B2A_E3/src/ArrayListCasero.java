public class ArrayListCasero implements MiLista {

  private int[] arrayInterno;

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

  @Override
  public int obtener(int posicion) {
    return arrayInterno[posicion];
  }

  @Override
  public void eliminar(int posicion) {
    System.out.println("Pendiente crear eliminar: posicion con valor" + obtener(posicion));
  }

  @Override
  public int tamano() {
    return arrayInterno.length;
  }
}
