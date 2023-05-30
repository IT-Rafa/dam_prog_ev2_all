package ContarArgs;

import java.util.HashMap;
import java.util.Map;

/**
 * ContarArgs<p>
 */
public class App {

  /**
   * Lee los argumentos al ejecutar el programa y muestra las letras y
   * la cantidad de veces que aparecieron
   */
  public static void main(String[] args) throws Exception {
    // Creamos mapa
    Map<String, Integer> m = new HashMap<>();

    // Para cada argumento en la llamada
    for (String a : args) {
      // Buscamos el argumento en las claves del mapa y, si existe, lo guardamos
      Integer freq = m.get(a);
      // Almacenamos el argumento como clave
      // Si el argumento es nulo, ponemos 1 y si no le añadimos 1
      m.put(a, (freq == null) ? 1 : freq + 1);
    }
    System.out.println(m.size() + " distinct words:");
    System.out.println(m);
  }
}
