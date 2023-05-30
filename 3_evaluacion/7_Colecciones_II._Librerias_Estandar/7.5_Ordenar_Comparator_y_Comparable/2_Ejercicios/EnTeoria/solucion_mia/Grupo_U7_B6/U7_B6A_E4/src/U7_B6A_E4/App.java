package U7_B6A_E4;

import java.util.Comparator;
import java.util.TreeSet;

/**
 * Ejercicio U7_B6A_E4:<p>
 * Modifica el ejemplo anterior de forma que use el siguiente
 * comparador y explica porqué el resultado es un TreeSet que 
 * sólo consta de la persona “Elías”  
 * <pre>
class ComparadorDePersonas implements Comparator<Persona> {
        @Override
        public int compare(Persona o1, Persona o2) {
        return 0;
    }
}
 * </pre>
 * 
 */

public class App {

  /**
   * Al comparar, todo da que es igual, ya que devuelve 0 siempre, y TreeSet no
   * acepta duplicados, con lo que solo acepta el primer dato introducido
   */
  public static void main(String[] args) {
    TreeSet<Persona> tp = new TreeSet<>(new ComparadorDePersonas());
    tp.add(new Persona("Elías", 7));
    tp.add(new Persona("Román", 6));
    tp.add(new Persona("Telma", 3));
    String sImprimir =
      "TreeSet de personas con ComparadorDePersonas que devuelve siempre 0\n";
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
  public int compare(Persona o1, Persona o2) {
    return 0;
  }
}
