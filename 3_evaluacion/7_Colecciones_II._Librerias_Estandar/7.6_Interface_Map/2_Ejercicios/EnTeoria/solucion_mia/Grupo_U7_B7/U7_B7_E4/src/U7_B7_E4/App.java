package U7_B7_E4;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Clase con el ejecutor del Ejercicio U7_B7_E4:<p>
 */
public class App {

  /**
   * Pedimos al usuario la cantidad de valores que va a añadir
   * Si la cantidad es 0. finalizamos
   * Para cada valor, pedimos el número.
   * indicamos cual es el que aparece mas veces y lo mostramos.
   */
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String cantSt;
    while (!(cantSt = sc.nextLine()).startsWith("0")) {
      int cant = Integer.parseInt(cantSt);
      String[] valoresSt = sc.nextLine().split(" ");
      Map<Integer, Integer> mapa = new HashMap<>();

      int max = 0;
      int maxKey = 0;
      for (int i = 0; i < cant; i++) {
        Integer n = Integer.parseInt(valoresSt[i]);
        // Buscamos el argumento en las claves del mapa y, si existe, lo guardamos
        Integer freq = mapa.get(n);
        // Almacenamos el argumento como clave
        // Si el argumento es nulo, ponemos 1 y si no le añadimos 1
        mapa.put(n, (freq == null) ? 1 : freq + 1);

        // Guardamos el que tiene cantidad superior
        if (mapa.get(n) > max) {
          max = mapa.get(n);
          maxKey = n;
        }
      }

      System.out.println(maxKey);
    }

    sc.close();
  }
}
/*
 * 11
 * 1 2 2 3 3 3 4 4 4 4 5
 * Salida: 4
 * 17
 * 1 8 9 6 3 2 1 5 4 7 9 6 3 2 1 4 7
 * Salida: 1
 * 0
 */
