package U7_B7_E3;

import java.util.HashMap;
import java.util.Map;

/**
 * Ejercicio U7_B7_E3<p>
 * Tenemos la siguiente tabla de latitudes/longitudes de ciudades 
 * nacionales e internacionales.<p>
 * <pre>
-   CIUDAD      LATITUD     LONGITUD
    LUGO        43.01 N     7.33 O
    BARCELONA   41.23 N     2.11 E
    MADRID      40.24 N     3.41 O
    LIMA        12.03 S     77.03 0
 * </pre>
 * Las coordenadas son obligatoriamente objetos de la siguiente clase,
 * a la que añadirás los métodos necesarios<p>
 * <pre>
class Coordenadas{
    private String latitud;
    private String longitud;
}
 * </pre>
 * Los datos de la tabla anterior se almacenan obligatoriamente en un 
 * hashmap cuya clave es el nombre de la ciudad, y el valor almacenado 
 * será un objeto coordenada. Tu programa debe:
 * <ul>
 *  <li>Insertar los datos (para simplificar, directamente en el código, 
 *      no por teclado).</li>
 *  <li>Imprimir el contenido del mapa.</li>
 * </ul>
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
