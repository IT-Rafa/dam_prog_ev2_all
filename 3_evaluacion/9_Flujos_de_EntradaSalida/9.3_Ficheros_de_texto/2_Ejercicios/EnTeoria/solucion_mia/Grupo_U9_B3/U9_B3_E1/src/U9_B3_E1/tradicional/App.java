package U9_B3_E1.tradicional;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * Clase con ejecutable de Ejercicio U9_B3_E1<p>
 * Versión tradicional.
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
   */
  public static void main(String[] args) {
    // ruta al proyecto del ejercicio
    String path =
      "9_Flujos_de_EntradaSalida/9.3_Ficheros_de_texto/2_Ejercicios/EnTeoria/solucion_mia/Grupo_U9_B3/U9_B3_E1/src/U9_B3_E1/";

    // Nombre del archivo xml a leer
    String nombreLectFile = path + "Agenda.xml";
    // Nombre del archivo txt a escribir
    String nombreEscrFile = path + "escrituraTrad.txt";

    try (
      // Definimos archivo a leer
      FileReader lectFile = new FileReader(nombreLectFile);
      // Creamos lector con buffer de este archivo
      BufferedReader flujoLec = new BufferedReader(lectFile);
      // Definimos archivo a escribir
      FileWriter escrFile = new FileWriter(nombreEscrFile);
      // Creamos escritor con buffer de este archivo
      BufferedWriter flujoEsc = new BufferedWriter(escrFile);
    ) {
      // Preparamos espacio para guardar el byte
      int data;
      // Recorremos con buffer los bytes del archivo lectura
      while ((data = flujoLec.read()) != -1) {
        // Si no son \n o \t ( y í para comprobar codificación)
        if (data != '\n' && data != '\t' && data != 'í') {
          // Escribimos el byte en archivo lectura con buffer
          flujoEsc.write(data);
        }
      }
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}
