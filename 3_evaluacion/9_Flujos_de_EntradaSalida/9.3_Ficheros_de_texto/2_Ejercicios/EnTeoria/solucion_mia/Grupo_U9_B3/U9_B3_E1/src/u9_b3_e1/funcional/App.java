package u9_b3_e1.funcional;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.stream.Collectors;

/**
 * Clase con ejecutable de Ejercicio U9_B3_E1<p>
 * Versión funcional.
 * App con dos parámetros:
 * <ul>
 *  <li>Archivo Lectura tipo xml: Con \n y \t</li>
 *  <li>Archivo Escritura tipo txt. Eliminando \n y \t</li>
 * </ul>
 * Por simpleza, ponemos el archivo lectura en la carpeta del ejercicio
 * y el archivo de escritura en misma carpeta con nombres distintos
 * para tradicional y funcional
 */
public class App {

  /**
   * Ejecutable Ejercicio U9_B3_E1<p>
   * @throws IOException
   */
  public static void main(String[] args) throws IOException {
    String nombreEscrFile;
    String nombreLectFile;
    // ruta al proyecto del ejercicio
    String path =
      "9_Flujos_de_EntradaSalida/9.3_Ficheros_de_texto/2_Ejercicios/EnTeoria/solucion_mia/Grupo_U9_B3/U9_B3_E1/src/U9_B3_E1/";

    if (args.length > 1) {
      nombreLectFile = path + args[0];
      nombreEscrFile = path + args[1];
    } else {
      System.out.println("Argumentos no válidos; Usamos datos defecto.");
      System.out.println("Agenda.xml -> escrituraFunc.txt");

      // Nombre del archivo xml a leer
      nombreLectFile = path + "Agenda.xml";
      // Nombre del archivo txt a escribir
      nombreEscrFile = path + "escrituraFunc.txt";
    }

    try (
      // Definimos archivo a leer
      FileReader lectFile = new FileReader(nombreLectFile);
      // Creamos lector con buffer de este archivo
      BufferedReader flujoLec = new BufferedReader(lectFile);
      // Definimos archivo a escribir (Crea fichero, si no existe; lo recrea si existe)
      FileWriter escrFile = new FileWriter(nombreEscrFile);
      // Creamos escritor con buffer de este archivo
      BufferedWriter flujoEsc = new BufferedWriter(escrFile);
    ) {
      String xml = flujoLec
        .lines() // Convertimos en Stream de String con cada línea
        .map(s -> s.replaceAll("\t", "")) // Eliminamos los tabs
        .map(s -> s.replaceAll("\n", "")) // Eliminamos los saltos línea (sin \r)
        // .map(s -> s.replaceAll("í", "")) // Eliminamos
        .collect(Collectors.joining()); // juntamos todas la líneas

      // Escribimos todo en archivo
      flujoEsc.write(xml);
    } catch (FileNotFoundException ex) {
      System.out.println("Error al encontrar el fichero:\n" + nombreLectFile);
    } catch (IOException ex) {
      System.out.println("error de E/S al leer o grabar");
    } catch (Exception ex) {
      System.out.println("error");
    }
  }
}
