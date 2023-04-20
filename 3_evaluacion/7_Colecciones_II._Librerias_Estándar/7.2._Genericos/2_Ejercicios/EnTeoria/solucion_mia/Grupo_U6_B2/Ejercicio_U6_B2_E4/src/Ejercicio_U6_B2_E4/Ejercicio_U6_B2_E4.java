package Ejercicio_U6_B2_E4;

/**
 * Clase que contiene el main del Ejercicio_U6_B2_E4
 */
public class Ejercicio_U6_B2_E4 {

  /**
   */
  public static void main(String[] args) throws Exception {
    MiListaEnlazada<Persona> lp = new MiListaEnlazada<>();
    lp.insertar(new Persona("yo", 23));
    lp.insertar(new Persona("tu", 24));
    lp.insertar(new Persona("el", 25));
    for (int i = 0; i < lp.tamano(); i++) System.out.print(lp.obtener(i) + "");
    //ERROR: int es tipo primitivo. Los genéricos tiene que ser Clases
    //MiListaEnlazada<int> li= new MiListaEnlazada<>();
    //Integer O.K. Observa autoboxing
    MiListaEnlazada<Integer> li = new MiListaEnlazada<>();
    li.insertar(4);
    li.insertar(5);
    li.insertar(6);

    System.out.println();
    for (int i = 0; i < li.tamano(); i++) System.out.print(li.obtener(i) + "");
  }
}
