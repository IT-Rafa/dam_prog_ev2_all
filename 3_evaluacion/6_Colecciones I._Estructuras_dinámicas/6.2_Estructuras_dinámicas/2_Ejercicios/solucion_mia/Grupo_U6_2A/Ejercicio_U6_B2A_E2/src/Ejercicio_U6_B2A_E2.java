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

class ArrayListCasero {

  int[] arrayInterno;

  void insertar(int nuevoElemento) {
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

  public int obtener(int i) {
    return arrayInterno[i];
  }

  public int tamano() {
    return arrayInterno.length;
  }
}
