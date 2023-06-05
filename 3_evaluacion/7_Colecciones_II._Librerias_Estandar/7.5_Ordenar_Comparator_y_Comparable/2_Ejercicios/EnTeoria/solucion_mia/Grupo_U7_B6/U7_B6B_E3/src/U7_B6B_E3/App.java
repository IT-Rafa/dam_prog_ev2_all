package U7_B6B_E3;

import java.util.PriorityQueue;

/**
 * Clase con ejecutor parar Ejercicio U7_B6B_E3:
 */
public class App {

  public static void main(String[] args) throws Exception {
    PriorityQueue<Enfermo> enfermos = new PriorityQueue<>();
    enfermos.add(new Enfermo("Cristina", 2));
    enfermos.add(new Enfermo("Juan", 1));
    enfermos.add(new Enfermo("Ana", 3));
    enfermos.add(new Enfermo("Oscar", 3));
    System.out.println("");
    Enfermo e = enfermos.poll();
    while (e != null) {
      System.out.println(e);
      e = enfermos.poll();
    }
  }
  /*
   * SALIDA:
   * Enfermo{nombre=Oscar, gravedad=3}
   * Enfermo{nombre=Ana, gravedad=3}
   * Enfermo{nombre=Cristina, gravedad=2}
   * Enfermo{nombre=Juan, gravedad=1}
   */
}

class Enfermo implements Comparable<Enfermo> {

  private String nombre;
  private int gravedad;

  public Enfermo(String nombre, int gravedad) {
    this.nombre = nombre;
    this.gravedad = gravedad;
  }

  @Override
  public String toString() {
    return "Enfermo{nombre=" + nombre + ", gravedad=" + gravedad + "}";
  }

  @Override
  public int compareTo(Enfermo otro) {
    if (this.gravedad < otro.gravedad) {
      return 1;
    } else if (this.gravedad > otro.gravedad) {
      return -1;
    } else {
      return -this.nombre.compareTo(otro.nombre);
    }
  }
}
