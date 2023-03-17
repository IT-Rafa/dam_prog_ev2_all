/**
 * Ejercicio U4_B11_E6:<p>
 * Acepta el reto ¿Cuántos días faltan? id 157<p>
 * 
 * Podemos almacenar en un array los días que tiene cada mes por ejemplo:
 * <pre>int[] diasMes={31,28,31,30,31,30,31,31,30,31,30,31};</pre>
 * 
 * ¿Cuantos días faltan?<p>
 * Tiempo máximo: 1,000 sMemoria máxima: 4096 KiB<p>
 * Dado un día del año, ¿sabrías decir cuantos días faltan para Nochevieja? 
 * Asumiremos que nos encontramos en un año no bisiesto.
 * 
 * <p>Entrada</p>
 * La entrada comenzará con un entero para especificar el número de casos de 
 * prueba que vendrá a continuación.<p>
 * Para cada caso de prueba se mostrará una línea en la que aparecerán dos 
 * enteros, el primero de ellos será correspondiente al día y el segundo ç
 * correspondiente al mes de una fecha válida.
 * 
 * <p>Salida</p>
 * Para cada fecha de la entrada, se mostrarán el número de días completos que 
 * faltan hasta el día de Nochevieja.
 * 
 * <p>Entrada de ejemplo</p>
 * <pre> 
3
28 12
30 12
1 1
 * </pre>
 * <p>Salida de ejemplo</p>
 * <pre>
3
1
364
</pre>
 */
import java.util.Scanner;

public class Ejercicio_U4_B11_E6 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    // cant dias en cada mes; 0 no cuenta.
    int[] diasMes = { 0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

    //  Pedimos casos prueba (intentos)
    int versiones = sc.nextInt();
    // Repetimos por cada intento
    while (versiones > 0) {
      // Pedimos dia y mes
      int dia = sc.nextInt();
      int mes = sc.nextInt();
      // Variable para calcular dias
      int dias = 0;
      // Recorremos del mes que nos dieron, hasta fin año (12 /12)
      for (int m = mes; m < diasMes.length; m++) {
        if (m == mes) {
          // en mes que nos dieron,
          //añadimos los dias del mes,
          //menos los dias que nos dieron
          dias += diasMes[m] - dia;
        } else {
          // En el resto añadimos los dias del mes
          dias += diasMes[m];
        }
      }
      // Mostramos resultado
      System.out.println(dias);
      // Bajamos intento
      --versiones;
    }
    sc.close();
  }
}
