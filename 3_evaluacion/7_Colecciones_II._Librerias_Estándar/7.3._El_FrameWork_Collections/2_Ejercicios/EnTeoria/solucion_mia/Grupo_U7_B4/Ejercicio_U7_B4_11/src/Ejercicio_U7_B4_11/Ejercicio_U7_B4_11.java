package Ejercicio_U7_B4_11;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/**
 * Clase que contiene el main del Ejercicio_U7_B4_11
 */
public class Ejercicio_U7_B4_11 {

  /**
   * Pasos a seguir:
   * <ul>
   *    <li>Esperamos que usuario introduzca dos números, en la misma línea
   *        <ul>
   *            <li>El primero es número de balones inicial. Mínimo 1</li>
   *            <li>tras cuántos tiros  acaba un balón en el agua. Máximo 100</li>
   *        </ul>
   *        Ejemplo: 1 10 : Tienen un balon y se lanza fuera en el tiro 10. Lanzo 9 dentro.
   *    </li>
   *    <li>Si la entrada del usuario es 0 0 (o similar), el programa finaliza
   *    <li>Creamos balones </li>
   *    <li>Se tiran; cada x tiros desaparecen y el resto se guarda y se repite
   *        hasta fin balones</li>
   *    <li>Mostramos balón desaparecido</li>
   * </ul>
   *
   */
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    while (sc.hasNextLine()) {
      int cantBalones = sc.nextInt();
      int limite = sc.nextInt();
      if (cantBalones == 0 && limite == 0) {
        break;
      }

      Queue<Pelota> balonesPendientes = new LinkedList<Pelota>();

      Pelota[] listaBalones = new Pelota[cantBalones];
      for (int i = 0; i < cantBalones; i++) {
        listaBalones[i] = new Pelota(i + 1);
        balonesPendientes.add(listaBalones[i]);
      }
      Pelota balonPerdido = null;
      int tirosLanzados = 0;
      while (!balonesPendientes.isEmpty()) {
        Pelota p = balonesPendientes.remove();
        limite--;
        if (tirosLanzados == limite) {
          tirosLanzados = 0;
          balonPerdido = p;
        } else {
          balonesPendientes.add(p);
        }
      }

      System.out.println(
        "última pelota " + balonPerdido.getNombre() + " perdida"
      );
    }
    sc.close();
  }
}

/**
 * Clase balón que contiene el nº del balón, para identificarlo y
 * los tiros hechos con él
 */
class Pelota {

  /**
   * Tipo Caracter que indentifica el pelota. Será un número
   */
  private int numPelota;

  /**
   * Constructor con el número usado para reconocer la pelota
   *
   * @param numPelota Número usado para reconocer la pelota
   */
  public Pelota(int numPelota) {
    this.numPelota = numPelota;
  }

  public int getNombre() {
    return numPelota;
  }
}
