package U7_B6A_E2;

import java.util.Comparator;
import java.util.TreeSet;

/**
 * Ejercicio U7_B6A_E2:<p>
 * Modifica el ejemplo anterior para que imprima las personas por orden
 * ascendente de nombre.
 */
public class App {

  /**
   * Cambiamos el ComparadorDePersonas y usamos compareTo con los nombres
   * Devolviendo directamente el resultado
   */
  public static void main(String[] args) {
    TreeSet<Persona> tp = new TreeSet<>(new ComparadorDePersonas());
    tp.add(new Persona("Elías", 7));
    tp.add(new Persona("Román", 6));
    tp.add(new Persona("Telma", 3));
    String sImprimir = "TreeSet de personas por nombre ascendente\n";
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

class ComparadorDePersonas implements Comparator<Persona> {

  @Override
  //ordeno las personas por edad ascendente
  public int compare(Persona p1, Persona p2) {
    return p1.nombre.compareTo(p2.nombre);
  }
}
