package U7_B6A_E1;

import java.util.Comparator;
import java.util.TreeSet;

/**
 * Ejercicio U7_B6A_E1:<p>
 * Modifica el ejemplo anterior con TreeSet para que imprima las
 * personas por orden descendente de edad.
 */
public class App {

  /**
   * Usamos el ComparadorDePersonas hecho y intercambiamos el signo del retorno de 1
   */
  public static void main(String[] args) {
    TreeSet<Persona> tp = new TreeSet<>(new ComparadorDePersonas());
    tp.add(new Persona("Elías", 7));
    tp.add(new Persona("Román", 6));
    tp.add(new Persona("Telma", 3));
    String sImprimir = "TreeSet de personas por edad descendente \n";
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
    if (p1.edad < p2.edad) {
      return 1;
    } else if (p1.edad > p2.edad) {
      return -1;
    } else {
      return 0;
    }
  }
}
