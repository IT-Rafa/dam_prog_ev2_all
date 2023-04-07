package Ejercicio_U6_B2B_E4;

/**
 * Clase que contiene el main del Ejercicio_U6_B2B_E3
 */
public class Ejercicio_U6_B2B_E4 {
 /**
  * Creamos cola, encolamos datos y mostramos los datos eliminados.
  */
  public static void main(String[] args) {
    MiCola mc = new MiCola();
    mc.encolar(1);
    mc.encolar(2);
    mc.encolar(3);

    while (!mc.esVacia()) {
      System.out.println(mc.desencolar());
    }
  }
}
