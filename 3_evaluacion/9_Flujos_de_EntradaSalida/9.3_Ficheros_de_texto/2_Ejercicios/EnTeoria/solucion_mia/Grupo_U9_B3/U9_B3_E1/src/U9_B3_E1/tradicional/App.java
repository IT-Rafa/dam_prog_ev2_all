package U9_B3_E1.tradicional;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Clase con ejecutable de Ejercicio U9_B3_E1<p>
 */
public class App {

  /**
   * Ejecutable Ejercicio U9_B3_E1<p>
   */
  public static void main(String[] args) {
    // ruta al proyecto del ejercicio
    String path =
      "9_Flujos_de_EntradaSalida/9.3_Ficheros_de_texto/2_Ejercicios/EnTeoria/solucion_mia/Grupo_U9_B3/U9_B3_E1/src/U9_B3_E1/";
    try (
      FileWriter ficheroEscritura = new FileWriter(
        path + "pruebaPrintWriter.txt"
      );
      PrintWriter pw = new PrintWriter(ficheroEscritura);
    ) {
      for (int i = 0; i < 10; i++) {
        pw.println("Linea " + i);
      }
      pw.close();
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}
