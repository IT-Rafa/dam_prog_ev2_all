package Ejercicio_U7_B4_3;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Clase que contiene el main del Ejercicio_U7_B4_3
 */
public class Ejercicio_U7_B4_3 {

  /**
   * Crea una tabla para 3 en raya y comprueba si añadiendo una ficha
   * del jugador con 'X' o del jugador con 'Y' hace línea alguno de
   * los dos<p>
   * Repetimos ejercicio pero con ArrayList<p>
   *
   */
  public static void main(String[] args) {
    // Creamos tablero como array 2d char
    char[][] tableroArray2d = {
      { 'X', '_', 'X' },
      { 'O', '_', 'O' },
      { 'X', '_', '_' },
    };
    //suponemos que la tabla a comprobar no tiene ya raya
    System.out.println(hayRaya(tableroArray2d, 0, 1, 'X') ? "SI" : "NO");
    System.out.println(hayRaya(tableroArray2d, 0, 1, 'O') ? "SI" : "NO");
    System.out.println();

    // EJERCICIO
    // Creamos tablero como ArrayList
    // Es un ArrayList de ArrayList de Character
    ArrayList<ArrayList<Character>> tableroArrayList = new ArrayList<>();

    // Añadimos cada línea (ArrayList de Character) con la de caracteres
    // creada con Arrays.asList
    tableroArrayList.add(0, new ArrayList<>(Arrays.asList('X', '_', 'X')));
    tableroArrayList.add(1, new ArrayList<>(Arrays.asList('O', '_', 'O')));
    tableroArrayList.add(2, new ArrayList<>(Arrays.asList('X', '_', '_')));
    System.out.println(
      hayRayaArrayList(tableroArrayList, 0, 1, 'X') ? "SI" : "NO"
    );
    System.out.println(
      hayRayaArrayList(tableroArrayList, 0, 1, 'O') ? "SI" : "NO"
    );
  }

  public static boolean hayRayaArrayList(
    ArrayList<ArrayList<Character>> tableroArrayList,
    int fila,
    int columna,
    char jugador
  ) {
    // boolean a devolver; falso en principio
    boolean result = false;
    // Añadimos la ficha a comprobar
    tableroArrayList.get(fila).set(columna, jugador);

    if (
      // Miramos si hay raya en fila
      tableroArrayList
        .get(fila)
        .get(0)
        .equals(tableroArrayList.get(fila).get(1)) &&
      tableroArrayList
        .get(fila)
        .get(1)
        .equals(tableroArrayList.get(fila).get(2)) &&
      tableroArrayList.get(fila).get(2) == jugador
    ) {
      result = true;
    } else if (
      // Miramos si hay raya en columna
      tableroArrayList
        .get(0)
        .get(columna)
        .equals(tableroArrayList.get(1).get(columna)) &&
      tableroArrayList
        .get(1)
        .get(columna)
        .equals(tableroArrayList.get(2).get(columna)) &&
      tableroArrayList.get(2).get(columna) == jugador
    ) {
      result = true;
    } else if (
      // Miramos si hay raya en diagonal 1; izq arriba - der abajo
      tableroArrayList.get(0).get(0).equals(tableroArrayList.get(1).get(1)) &&
      tableroArrayList.get(1).get(1).equals(tableroArrayList.get(2).get(2)) &&
      tableroArrayList.get(2).get(2) == jugador
    ) {
      result = true;
    } else if (
      // Miramos si hay raya en diagonal 2; izq abajo - der arriba
      tableroArrayList.get(0).get(2).equals(tableroArrayList.get(1).get(1)) &&
      tableroArrayList.get(1).get(1).equals(tableroArrayList.get(2).get(0)) &&
      tableroArrayList.get(2).get(0) == jugador
    ) {
      result = true;
    }
    return result;
  }

  /**
   * Comprueba si al añadir una línea en una posición de un tablero 3 en raya
   * se completa la línea o no
   *
   * @param tabla Tablero del tres en raya con posibles fichas insertadas
   * @param fila Posición de la fila donde se insertaría la ficha del jugador
   * @param columna Posición de la columna donde se insertaría la ficha del jugador
   * @param jugador Caracter que representa al jugador que insertará la ficha
   *
   * @return Devuelve True si la ficha crea línea, si no, devuelve false
   */
  static boolean hayRaya(char[][] tabla, int fila, int columna, char jugador) {
    //suponemos que tabla[fila][columna] se corresponde a una celda libre
    boolean hay = false;

    // Añadimos la ficha a comprobar
    tabla[fila][columna] = jugador;

    if (
      // Miramos si hay raya en fila
      tabla[fila][0] == tabla[fila][1] &&
      tabla[fila][1] == tabla[fila][2] &&
      tabla[fila][2] == jugador
    ) {
      hay = true;
    } else if (
      // Miramos si raya en columna
      tabla[0][columna] == tabla[1][columna] &&
      tabla[1][columna] == tabla[2][columna] &&
      tabla[2][columna] == jugador
    ) {
      hay = true;
    } else if (
      // Miramos si hay raya en diagonal 1; izq arriba - der abajo
      tabla[0][0] == tabla[1][1] &&
      tabla[1][1] == tabla[2][2] &&
      tabla[2][2] == jugador
    ) {
      hay = true;
    } else if (
      // Miramos si hay raya en diagonal 2; izq abajo - der arriba
      tabla[0][2] == tabla[1][1] &&
      tabla[1][1] == tabla[2][0] &&
      tabla[2][0] == jugador
    ) {
      hay = true;
    } else {
      hay = false;
    }
    //volvemos a dejar como libre la celda, este método investiga pero no cambia nada
    tabla[fila][columna] = '_';

    return hay;
  }
}
