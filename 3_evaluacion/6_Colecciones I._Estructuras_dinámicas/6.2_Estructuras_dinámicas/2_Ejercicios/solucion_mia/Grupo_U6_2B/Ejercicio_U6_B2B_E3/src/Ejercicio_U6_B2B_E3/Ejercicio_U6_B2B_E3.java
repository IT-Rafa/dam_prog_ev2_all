package Ejercicio_U6_B2B_E3;

import java.util.Scanner;

/**
 * Ejercicio U6_B2B_E3: <p>
 * Conseguir aceptado en el problema de suma de dígitos pero
 * utilizando OBLIGATORIAMENTE aritmética decimal para extraer 
 * los dígitos y una pila.
 * Podemos acceder a las cifras de un número e ir introduciendo 
 * cifra a cifra en una pila de enteros básicamente con la siguiente idea.
 * <pre>
if (numero == 0) {
    pila.push(0);
} else {
    while (numero > 0) {
        pila.push(numero % 10);
        numero = numero / 10;
    }
}
 * </pre>
 * Ahora simplemente quedaría ir vaciando la pila con pop pero ya 
 * vamos obteniendo los dígitos en el orden deseado para imprimir
 * @see <a href="https://www.aceptaelreto.com/problem/statement.php?id=140">Acepta el reto: Suma de dígitos</a>
 */
public class Ejercicio_U6_B2B_E3 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Pila pila = new MiPila();
    String numero = "";
    while (!(numero = sc.next()).startsWith("-")) {
      int suma = 0;
      String resultado = "";
      int n =  Integer.parseInt(numero) ;
      if (n == 0) {
        pila.push(0);
      } else {
        while (n > 0) {
          pila.push(n % 10);
          n = n / 10;
        }
      }

      System.out.println(resultado);
      sc.close();
    }
  }
}
