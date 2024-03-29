package Ejercicio_U6_2C_E6;

import java.util.Scanner;

/**
 * Clase que contiene el main del Ejercicio_U6_2C_E6
 */
public class Ejercicio_U6_2C_E6 {

  /**
   * Pide al usuario una lista con datos del arbol, crea el arbol,
   * y muestra el malor máximo y mínimo
   */
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);

    // Pide al usuario una lista con datos del arbol
    String[] arbolString = sc.nextLine().split(" ");

    // crea el arbol
    Arbol arbol = new Arbol(arbolString);

    // test Mostramos arbol
    // arbol.recorridoPreOrdenConTAB();
    // Mostramos valor máximo y mínimo
    System.out.println(
      "Máximo: " + arbol.getMax() + "\nMínimo: " + arbol.getMin()
    );

    sc.close();
  }
}
