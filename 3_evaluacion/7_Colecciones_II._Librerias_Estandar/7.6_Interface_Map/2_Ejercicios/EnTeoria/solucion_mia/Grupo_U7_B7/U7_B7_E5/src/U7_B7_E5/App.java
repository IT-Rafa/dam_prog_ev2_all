package U7_B7_E5;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Ejercicio U7_B7_E5:<p>
 * reto Liga de pádel id 109<p>
 * https://www.aceptaelreto.com/problem/statement.php?id=109&cat=18
 */
public class App {

  /**
   * <ul>
   *  <li>Repetimos por categoria</li>
   *  <li>Pedimos nombre Categoria - Si es FIN, Finaliza el programa
   *      <ul>
   *          <li>Pedimos resultados con
   *              <ul>
   *                  <li>Nombre Pareja juega en casa</li>
   *                  <li>sets ganados en partido</li>
   *                  <li>Nombre pareja visitante</li>
   *                  <li>sus sets ganados</li>
   *              </ul>
   *          <li>Si acaba categoria - Escribimos FIN </li>
   *    </ul>
   * <li> Mostramos ganador y partidos no Jugados (Diferencia Ida y vuelta)</Li>
   *      </ul>
   */
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    // Repetimos por categoria - hasta FIN
    String nombreCategoria;
    while (!(nombreCategoria = sc.nextLine()).equals("FIN")) {
      // Anotamos partidos por categoria - hasta FIN
      String datosPartido;
      Map<Integer, Partido> mapa = new HashMap<>();
      int clave = 0;
      while (!(datosPartido = sc.nextLine()).equals("FIN")) {
        // Capturamos datos del partido
        String[] datoPartido = datosPartido.split(" ");

        mapa.put(
          clave++,
          new Partido(
            datoPartido[0],
            Integer.parseInt(datoPartido[1]),
            datoPartido[2],
            Integer.parseInt(datoPartido[3])
          )
        );
        // Un Partido almacenado

      }
      // Fin Categoria
      // Contar puntos de cada equipo
      // Contar veces que cada equipo con un equipo concreto???
    }

    sc.close();
  }
}

class Partido {

  private String equipoCasa;
  private String equipoVisitante;
  private int puntosEquipoCasa;
  private int puntosEquipoVisitante;

  public Partido(
    String equipoCasa,
    int puntosEquipoCasa,
    String equipoVisitante,
    int puntosEquipoVisitante
  ) {
    this.equipoCasa = equipoCasa;
    this.puntosEquipoCasa = puntosEquipoCasa;
    this.equipoVisitante = equipoVisitante;
    this.puntosEquipoVisitante = puntosEquipoVisitante;
  }
}
