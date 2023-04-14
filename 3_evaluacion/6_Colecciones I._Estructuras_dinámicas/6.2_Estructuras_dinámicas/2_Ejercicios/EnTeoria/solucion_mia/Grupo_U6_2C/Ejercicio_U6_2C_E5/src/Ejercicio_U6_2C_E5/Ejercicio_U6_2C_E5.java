package Ejercicio_U6_2C_E5;

import java.util.Scanner;

/**
 * Clase que contiene el main del Ejercicio_U6_2C_E5
 */
public class Ejercicio_U6_2C_E5 {

  /**
   * Pide al usuario una lista con datos del arbol, crea el arbol,
   * y muestra su altura
   */
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);

    // Pide al usuario una lista con datos del arbol
    String[] arbolString = sc.nextLine().split(" ");

    // crea el arbol
    Arbol arbol = new Arbol(arbolString);

    // Mostramos arbol
    // arbol.recorridoPreOrdenConTAB();
    // Mostramos altura
    System.out.println("altura: " + arbol.getHeight());

    sc.close();
  }
}
