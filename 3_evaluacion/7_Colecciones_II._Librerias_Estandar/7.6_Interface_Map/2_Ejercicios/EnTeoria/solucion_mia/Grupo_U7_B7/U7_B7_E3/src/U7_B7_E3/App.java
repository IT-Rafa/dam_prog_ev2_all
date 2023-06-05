package U7_B7_E3;

import java.util.HashMap;
import java.util.Map;

/**
 * Clase con ejecutor del Ejercicio U7_B7_E3<p>
 */
public class App {

  public static void main(String[] args) {
    Map<String, Coordenada> mapa = new HashMap<>();

    mapa.put("     LUGO", new Coordenada("43.01 N", "7.33 O"));
    mapa.put("BARCELONA", new Coordenada("41.23 N", "2.11 E"));
    mapa.put("   MADRID", new Coordenada("40.24 N", "3.41 O"));
    mapa.put("     LIMA", new Coordenada("12.03 S", "77.03 O"));

    for (String clave : mapa.keySet()) {
      System.out.println(clave + ":\t" + mapa.get(clave));
    }
  }
}

class Coordenada {

  private String latitud;
  private String longitud;

  public Coordenada(String latitud, String longitud) {
    this.latitud = latitud;
    this.longitud = longitud;
  }

  @Override
  public String toString() {
    return (latitud + "\t\t" + longitud);
  }
}
