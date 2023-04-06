package Ejercicio_U6_B2A_E2;

/**
 * Ejercicio U6_B2A_E2: <p>
 * Escribe los métodos tamano() y obtener para que funcione el
 * siguiente main()
 * <pre>
public class App{
    public static void main(String[] args){
        ArrayListCasero alc= new ArrayListCasero();
        alc.insertar(1);
        alc.insertar(2);
        alc.insertar(3);
        for(int i=0;i<alc.tamano();i++)
            System.out.println(alc.obtener(i));
    }
}
 * </pre>
 */
public class Ejercicio_U6_B2A_E2 {

  /**
   * Crea lista(Array), inserta datos y muestra los datos en la lista
   */
  public static void main(String[] args) {
    ArrayListCasero alc = new ArrayListCasero();
    alc.insertar(1);
    alc.insertar(2);
    alc.insertar(3);
    for (int i = 0; i < alc.tamano(); i++) {
      System.out.println(alc.obtener(i));
    }
  }
}

/**
 * Lista con estructura dinámica creada con Array.<p>
 * Al añadir los datos, se introducen al final de la lista, con lo que
 * se organiza del primero métido al último.<p>
 * Al buscar por índices, el 0 será el primer dato introducido
 */
class ArrayListCasero {

  /**
   * Array donde irán los datos
   */
  int[] arrayInterno;

  void insertar(int nuevoElemento) {
    // Preparamos espacio para nuevo array
    int[] nuevoArray;

    if (arrayInterno == null) {
      // Si no existe array, creamos uno con espacio para 1 dato
      nuevoArray = new int[1];

      // y ponemos el valor indicado en ese espacio
      nuevoArray[0] = nuevoElemento;
    } else {
      // Si ya existe array con datos, Creamos nuevo array con el
      // tamaño del anterior +1 (nuevo dato)
      nuevoArray = new int[arrayInterno.length + 1];

      // Pasamos el array antiguo al nuevo
      for (int i = 0; i < arrayInterno.length; i++) {
        nuevoArray[i] = arrayInterno[i];
      }
      // y añadimos el nuevo dato
      nuevoArray[nuevoArray.length - 1] = nuevoElemento;
    }
    arrayInterno = nuevoArray;
  }

  /**
   * Devolvemos el valor del la lista según el índice
   * Nota: Aprovechamos el array
   */
  public int obtener(int i) {
    return arrayInterno[i];
  }

  /**
   * Devuelve el tamaño de la lista.
   * Nota: Aprovechamos el array
   */
  public int tamano() {
    return arrayInterno.length;
  }
}
