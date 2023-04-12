package Ejercicio_U6_2C_E5;

import java.util.Scanner;

public class Ejercicio_U6_2C_E5 {

  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    String[] arbolString = sc.nextLine().split(" ");
    Arbol arbol = new Arbol(arbolString);
    System.out.println("recorrido preorden con TABS");
    arbol.recorridoPreorden();
    sc.close();
  }
}
