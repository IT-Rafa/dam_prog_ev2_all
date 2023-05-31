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
        while (!(nombreCategoria = sc.nextLine()).equals("FIN") && !nombreCategoria.equals("fin")) {

            // Anotamos partidos por categoria - hasta FIN
            String datosPartido;
            Map<String, Integer> mapaEquipos = new HashMap<>();
            int max = 0;
            String nombreMax = "";
            while (!(datosPartido = sc.nextLine()).equals("FIN") && !datosPartido.equals("fin")) {

                // Capturamos datos del partido
                datosPartido = datosPartido.trim();
                String[] datoPartido = datosPartido.split(" ");
                String equipoCasa = datoPartido[0];
                Integer puntosEqCasa = Integer.parseInt(datoPartido[1]);
                String equipoVis = datoPartido[2];
                Integer puntosEqVis = Integer.parseInt(datoPartido[3]);
                // Un Partido almacenado

                // Almacenamos puntos: Victoria: 2; Derrota: 1; No están, pasamos; empate:
                // pasamos
                if (puntosEqCasa > puntosEqVis) {
                    Integer puntosGanador = (mapaEquipos.get(equipoCasa) == null) ? 2 : mapaEquipos.get(equipoCasa) + 2;
                    mapaEquipos.put(equipoCasa, puntosGanador);

                    Integer puntosPerdedor = (mapaEquipos.get(equipoVis) == null) ? 1 : mapaEquipos.get(equipoVis) + 1;
                    mapaEquipos.put(equipoVis, puntosPerdedor);

                } else if (puntosEqCasa > puntosEqVis) {
                    Integer puntosGanador = (mapaEquipos.get(equipoVis) == null) ? 2 : mapaEquipos.get(equipoVis) + 2;
                    mapaEquipos.put(equipoVis, puntosGanador);

                    Integer puntosPerdedor = (mapaEquipos.get(equipoCasa) == null) ? 1
                            : mapaEquipos.get(equipoCasa) + 1;
                    mapaEquipos.put(equipoCasa, puntosPerdedor);
                }
                if (mapaEquipos.get(equipoCasa) > max) {
                    max = mapaEquipos.get(equipoCasa);
                    nombreMax = equipoCasa;
                }
                if (mapaEquipos.get(equipoVis) > max) {
                    max = mapaEquipos.get(equipoVis);
                    nombreMax = equipoVis;
                }

            }
            // Fin Categoria
            // Contar puntos de cada equipo
            for (String s : mapaEquipos.keySet()) {
                System.out.println(s + ", " + mapaEquipos.get(s));
            }

            if (mapaEquipos.containsValue(max)) {
                System.out.println(nombreMax);
            }

            // Contar veces que cada equipo con un equipo concreto???
        }

        sc.close();
    }
}

/*
 * Junior
 * Buenisimos 3 Malisimos 0
 * Buenillos 2 Malillos 1
 * Buenillos 3 Malisimos 0
 * Buenisimos 3 Malillos 0
 * Buenisimos 2 Buenillos 1
 * Malisimos 0 Buenisimos 3
 * Malillos 1 Buenillos 2
 * Malisimos 0 Buenillos 3
 * Malillos 0 Buenisimos 3
 * Buenillos 1 Buenisimos 2
 * FIN
 * Salida: Buenisimos 2
 * 
 * Senior
 * Abuelos 3 Abueletes 0
 * Abueletes 2 Abuelos 1
 * FIN
 * Salida: EMPATE 0
 * 
 * FIN
 */
