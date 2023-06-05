package U7_B5_E6;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

/**
 * Ejercicio U7_B5_E6:<p>
 * RETO Bingo infantil 452. Puedes ayudarte de arrays pero no olvides
 * incluir sets en tu solución.
 */
public class App {

  /**
   *
   */
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    while (!sc.nextLine().startsWith("0")) {
      String[] listaBolasSt = sc.nextLine().split(" ");
      List<Integer> listaBolas = new ArrayList<>();

      for (int i = 0; i < listaBolasSt.length; i++) {
        listaBolas.add(Integer.parseInt(listaBolasSt[i]));
      }

      Set<Integer> posiblesSalidas = new TreeSet<>();
      for (Integer b1 : listaBolas) {
        for (Integer b2 : listaBolas) {
          if (!b1.equals(b2) && b1 > b2) {
            posiblesSalidas.add(b1 - b2);
          }
        }
      }

      for (Integer salida : posiblesSalidas) {
        System.out.print(salida + " ");
      }
      System.out.println();
    }

    sc.close();
  }
}
/*
 * 4
 * 1 3 4 5
 * Salida : 1 2 3 4
 *
 * 3
 * 4 1 8
 * Salida : 3 4 7
 *
 * 0
 */
