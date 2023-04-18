package Ejercicio_U6_B2B_E3;

import java.util.Scanner;

/**
 * Clase que contiene el main del Ejercicio_U6_B2B_E3
 */
public class Ejercicio_U6_B2B_E3 {

  /**
   * Capturamos input usuario, pasamos a entero y sumamos cada uno de los 
   * dígitos
   *
   */
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    // Hacemos bucle infinito. Se bloquea al ver el número del usuario
    do {
      // Capturamos número String a int
      int numero = Integer.parseInt(sc.next());
      // si nº es negativo finalizamos
      if (numero < 0) {
        break;
      }
      // preparamos pila
      Pila pila = new MiPila();

      // Capturamos cada dígito del número y metemos en pila
      // Rebajando cada decena
      if (numero == 0) {
        // Si es 0 00 000, etc; Lo metemos directo
        pila.push(0);
      } else {
        // CAPTURAMOS LOS NÚMEROS POR SEPARADO
        // Repetimos hasta que solo quede la unidad
        while (numero > 0) {
          // Capturamos el dígito de la unidad
          pila.push(numero % 10);
          // Eliminamos el dígito de la unidad
          numero = numero / 10;
        }
      }

      // Salida
      String salida = "";
      int suma = 0;

      // Recorremos pila
      while (!pila.esVacia()) {
        // Capturamos número de la pila
        int n = pila.pop();
        // Añadimos mensaje
        salida += n + " + ";
        // Calculamos suma
        suma += n;
      }
      // Quitamos el último " + "
      salida = salida.substring(0, salida.length() - 3);
      // Mostramos mensaje con dato de la suma
      System.out.println(salida + " = " + suma);
    } while (true);

    sc.close();
  }
}
