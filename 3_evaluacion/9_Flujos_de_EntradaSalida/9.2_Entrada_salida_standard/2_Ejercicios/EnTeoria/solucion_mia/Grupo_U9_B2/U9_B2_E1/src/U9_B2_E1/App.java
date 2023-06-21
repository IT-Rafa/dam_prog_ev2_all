package U9_B2_E1;

import java.util.Scanner;

/**
 * Clase con ejecutable de Ejercicio U9_B2_E1<p>
 */
public class App {

  /**
   * Ejecutable Ejercicio U9_B2_E1<p>
   */
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println(sc.nextLine());

    // Si cerramos Scanner e intentamos leer, falla al ejecutarse por:
    // java.lang.IllegalStateException: Scanner closed
    // sc.close();
    // System.out.println(sc.nextLine());

    // Si lo cerramos Scanner y lo abrimos de nuevo.
    // falla al leer
    // java.util.NoSuchElementException: No line found
    sc.close();
    sc = new Scanner(System.in);
    System.out.println(sc.nextLine());
    sc.close();
  }
}
