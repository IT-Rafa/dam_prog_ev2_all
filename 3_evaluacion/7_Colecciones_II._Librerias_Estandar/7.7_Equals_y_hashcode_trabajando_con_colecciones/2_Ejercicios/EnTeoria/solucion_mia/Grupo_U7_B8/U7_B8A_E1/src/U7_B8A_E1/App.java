package U7_B8A_E1;

import java.util.HashMap;
import java.util.Map;

/**
 * Ejercicio U7_B8A_E1:<p>
 * Hicimos el siguiente ejercicio en el boletín de mapas<p>
 * Tenemos la siguiente tabla de latitudes/longitudes de ciudades nacionales
 * e internacionales.
 *
 */
public class App {

  public static void main(String[] args) {
    Map<Coordenada, String> mapa = new HashMap<>();

    mapa.put(new Coordenada("43.01 N", "7.33 O"), "LUGO");
    mapa.put(new Coordenada("41.23 N", "2.11 E"), "BARCELONA");
    mapa.put(new Coordenada("40.24 N", "3.41 O"), "MADRID");
    mapa.put(new Coordenada("12.03 S", "77.03 O"), "LIMA");

    for (Coordenada clave : mapa.keySet()) {
      System.out.println(mapa.get(clave) + ":\t" + clave);
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
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((latitud == null) ? 0 : latitud.hashCode());
    result = prime * result + ((longitud == null) ? 0 : longitud.hashCode());
    return result;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj) return true;
    if (obj == null) return false;
    if (getClass() != obj.getClass()) return false;
    Coordenada other = (Coordenada) obj;
    if (latitud == null) {
      if (other.latitud != null) return false;
    } else if (!latitud.equals(other.latitud)) return false;
    if (longitud == null) {
      if (other.longitud != null) return false;
    } else if (!longitud.equals(other.longitud)) return false;
    return true;
  }

  @Override
  public String toString() {
    return (latitud + "\t\t" + longitud);
  }
}
