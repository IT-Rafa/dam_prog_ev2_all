package Ejercicio_U6_B2_E4;

/**
 * Clase que contiene el main del Ejercicio_U6_B2_E4
 */
public class Ejercicio_U6_B2_E4 {

  /**
   * <ul>
   *   <li>Creamos archivos, cada clase en su archivo, tal cual enunciado</p>
   *   <li>En IDE funciona ok, pero salen avisos. En consola java probamos con
   *   javac y javac -xlint, y aparece como se esperaba, aviso y luego warnings</li>
   *   <li>Añadimos java doc a documentos, y modificamos alguna salida</li>
   *   <li>Cambiamos en clase Nodo<T>, todos los objetos de tipo Nodo a Nodo<T>
   *   <li>Repetimos javac, con y sin -Xlint, y no da errores</li>
   * </ul>
   * .
   */
  public static void main(String[] args) {
    // Creamos MiListaEnlazada con tipo Persona
    MiListaEnlazada<Persona> lp = new MiListaEnlazada<>();
    // Añadimos objetos Persona al MiListaEnlazada de Persona
    lp.insertar(new Persona("yo", 23));
    lp.insertar(new Persona("tu", 24));
    lp.insertar(new Persona("el", 25));

    // Mostramos objetos Persona guardados en
    // MiListaEnlazada de Persona
    for (int i = 0; i < lp.tamano(); i++) {
      System.out.print(lp.obtener(i) + " ");
    }

    // Intento de crear MiListaEnlazada para int.
    // ERROR: int es tipo primitivo. Los genéricos tiene que ser Clases
    // MiListaEnlazada<int> li= new MiListaEnlazada<>();

    // Repetimos intento de crear MiListaEnlazada pero usamos Integer.
    //Integer O.K. Observa autoboxing
    MiListaEnlazada<Integer> li = new MiListaEnlazada<>();
    li.insertar(4);
    li.insertar(5);
    li.insertar(6);

    // Mostramos objetos Integer guardados en
    // MiListaEnlazada de Integer
    System.out.println();
    for (int i = 0; i < li.tamano(); i++) {
      System.out.print(li.obtener(i) + " ");
    }
    System.out.println();
  }
}
