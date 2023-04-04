package Ejercicio_U6_B2B_E3;

import java.util.Scanner;

/**
 * Ejercicio U6_B2B_E3: <p>
 * Conseguir "aceptado" en el problema de suma de dígitos pero
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
        pila.push(0);
      } else {
        while (numero > 0) {
        
          pila.push(numero % 10);
          numero = numero / 10;
        }
      }

      // Salida
      String salida ="";
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
