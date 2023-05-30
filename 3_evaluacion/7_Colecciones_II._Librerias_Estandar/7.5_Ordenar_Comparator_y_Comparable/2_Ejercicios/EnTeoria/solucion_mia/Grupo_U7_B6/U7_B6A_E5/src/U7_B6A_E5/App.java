package U7_B6A_E5;

import java.util.HashSet;

/**
 * Ejercicio U7_B6A_E5:<p>
 * ¿Puedo sustituir en los ejercicios anteriores TreeSet por HashSet?
 */
public class App {

  /**
   * No completamente, ya que HashSet no tiene constructor con parámetro
   * de una clase que implemente Comparator.<p>
   * En este caso, cambiamos a HashSet y le quitamos en Comparator y funciona,
   * pero no usa orden
   */
  public static void main(String[] args) {
    HashSet<Persona> tp = new HashSet<>();
    tp.add(new Persona("Elías", 7));
    tp.add(new Persona("Román", 6));
    tp.add(new Persona("Telma", 3));
    String sImprimir = "HashSet de personas sin comparador\n";
    for (Persona p : tp) sImprimir =
      sImprimir + p.nombre + ", " + p.edad + "\n";
    System.out.println(sImprimir);
  }
}

class Persona {

  String nombre;
  int edad;

  public Persona(String nombre, int edad) {
    this.nombre = nombre;
    this.edad = edad;
  }
}
