package Ejercicio_U6_B2A_E3;

/**
 * Clase que contiene el main del Ejercicio_U6_B2A_E3
 */
public class Ejercicio_U6_B2A_E3 {

  /**
   * Usamos la interfaze MiLista para crear dos objetos
   * lista: una creada con array y otra con clase autoreferenciada(Nodo)<p>
   * Añadimos 10 elementos (del 20 al 29) a cada lista, eliminamos alguno
   * (añadimos al enunciado ) y mostramos los elementos de cada lista.<p>
   * Cada lista muestra y elimina los datos según dependiendo de como se ordenen.<p>
   * Si los datos se añaden al principio (MiListaEnlazada), el primero 
   * es el último que se añade.<p>
   * Si los datos se añaden al final (ArrayListCasero), el primero el 
   * primero que se añade.<p>
   *
   * @param args Datos al programa. No usado
   */
  public static void main(String[] args) {
    // Creamos variable MiLista dirigiendos a lista con Nodo
    MiLista ml1 = new MiListaEnlazada();

    // Creamos variable MiLista dirigiendos a lista con Array
    MiLista ml2 = new ArrayListCasero();

    // Añadimos datos a ambas listas
    for (int i = 20; i < 30; i++) {
      ml1.insertar(i);
      ml2.insertar(i);
    }

    // Eliminamos valores a las listas; El primero, el último y el del índice 3
    ml1.eliminar(0);
    ml2.eliminar(0);
    ml1.eliminar(3);
    ml2.eliminar(3);
    ml1.eliminar(ml1.tamano() - 1);
    ml2.eliminar(ml2.tamano() - 1);

    // Mostramos datos lista con Nodo
    System.out.print("Lista 1: ");
    for (int i = 0; i < ml1.tamano(); i++) {
      System.out.print(ml1.obtener(i) + " ");
    }

    // Mostramos datos lista con Array
    System.out.print("\nLista 2: ");
    for (int i = 0; i < ml2.tamano(); i++) {
      System.out.print(ml2.obtener(i) + " ");
    }
    System.out.println();
  }
}
