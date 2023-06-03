package U7_B7_E5;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Ejercicio U7_B7_E5:
 * <p>
 * reto Liga de pádel id 109
 * <p>
 * https://www.aceptaelreto.com/problem/statement.php?id=109&cat=18
 */
public class App {

  /**
   * <ul>
   * <li>Repetimos por categoria</li>
   * <li>Pedimos nombre Categoria - Si es FIN, Finaliza el programa
   * <ul>
   * <li>Pedimos resultados con
   * <ul>
   * <li>Nombre Pareja juega en casa</li>
   * <li>sets ganados en partido</li>
   * <li>Nombre pareja visitante</li>
   * <li>sus sets ganados</li>
   * </ul>
   * <li>Si acaba categoria - Escribimos FIN</li>
   * </ul>
   * <li>Mostramos ganador y partidos no Jugados (Diferencia Ida y vuelta)</Li>
   * </ul>
   */
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    // Repetimos por categoria - hasta FIN
    String nombreCategoria;
    while (
      !(nombreCategoria = sc.nextLine()).equals("FIN") &&
      !nombreCategoria.equals("fin")
    ) {
      // Anotamos partidos por categoria - hasta FIN
      String datosPartido;
      Map<String, Integer> puntosEquipos = new HashMap<>();
      Map<String, Integer> partidosEquipos = new HashMap<>();

      int max = 0;
      String nombreMax = "";
      while (
        !(datosPartido = sc.nextLine()).equals("FIN") &&
        !datosPartido.equals("fin")
      ) {
        // Capturamos datos del partido
        datosPartido = datosPartido.trim();
        String[] datoPartido = datosPartido.split(" ");
        String equipoCasa = datoPartido[0];
        Integer puntosEqCasa = Integer.parseInt(datoPartido[1]);
        String equipoVis = datoPartido[2];
        Integer puntosEqVis = Integer.parseInt(datoPartido[3]);
        // Un Partido almacenado

        // Almacenamos partidos jugados - SIN HACER
        partidosEquipos.put(
          equipoCasa,
          (partidosEquipos.get(equipoCasa) == null)
            ? 1
            : partidosEquipos.get(equipoCasa) + 1
        );

        partidosEquipos.put(
          equipoVis,
          (partidosEquipos.get(equipoVis) == null)
            ? 1
            : partidosEquipos.get(equipoVis) + 1
        );

        // Almacenamos puntos: Victoria: 2; Derrota: 1;
        // No están, pasamos; empate, pasamos
        if (puntosEqCasa > puntosEqVis) {
          Integer puntosGanador = (puntosEquipos.get(equipoCasa) == null)
            ? 2
            : puntosEquipos.get(equipoCasa) + 2;
          puntosEquipos.put(equipoCasa, puntosGanador);

          Integer puntosPerdedor = (puntosEquipos.get(equipoVis) == null)
            ? 1
            : puntosEquipos.get(equipoVis) + 1;
          puntosEquipos.put(equipoVis, puntosPerdedor);
        } else if (puntosEqCasa < puntosEqVis) {
          Integer puntosGanador = (puntosEquipos.get(equipoVis) == null)
            ? 2
            : puntosEquipos.get(equipoVis) + 2;
          puntosEquipos.put(equipoVis, puntosGanador);

          Integer puntosPerdedor = (puntosEquipos.get(equipoCasa) == null)
            ? 1
            : puntosEquipos.get(equipoCasa) + 1;
          puntosEquipos.put(equipoCasa, puntosPerdedor);
        }

        if (puntosEquipos.get(equipoCasa) > max) {
          max = puntosEquipos.get(equipoCasa);
          nombreMax = equipoCasa;
        } else if (puntosEquipos.get(equipoCasa) == max) {
          nombreMax = "EMPATE";
        }
        // Almacena el mas alto
        if (puntosEquipos.get(equipoVis) > max) {
          max = puntosEquipos.get(equipoVis);
          nombreMax = equipoVis;
        } else if (puntosEquipos.get(equipoVis) == max) {
          nombreMax = "EMPATE";
        }
      }

      // Fin Categoria
      // Mostrar puntos de cada equipo
      System.out.print(nombreMax);

      // Contar veces que algún equipo no jugo partido
      int partidosQueDebenJugarse =
        (partidosEquipos.size() - 1) * 2 * partidosEquipos.size();

      int cantPartidosJugados = 0;
      for (String key : partidosEquipos.keySet()) {
        cantPartidosJugados += partidosEquipos.get(key);
      }
      System.out.println(
        " " + (partidosQueDebenJugarse - cantPartidosJugados) / 2
      );
      // Todos tendrian que jugar ida y vuelta con el resto de los equipos

    }

    sc.close();
  }
}
/*
 * Entrada: 
Junior
Buenisimos 3 Malisimos 0
Buenillos 2 Malillos 1
Buenillos 3 Malisimos 0
Buenisimos 3 Malillos 0
Buenisimos 2 Buenillos 1
Malisimos 0 Buenisimos 3
Malillos 1 Buenillos 2
Malisimos 0 Buenillos 3
Malillos 0 Buenisimos 3
Buenillos 1 Buenisimos 2
FIN

 * Salida: 
Buenisimos 2

 * Entrada: 
Senior
Abuelos 3 Abueletes 0
Abueletes 2 Abuelos 1
FIN

 * Salida: 
EMPATE 0

 * Entrada: 

FIN
 * Salida: 

 */
