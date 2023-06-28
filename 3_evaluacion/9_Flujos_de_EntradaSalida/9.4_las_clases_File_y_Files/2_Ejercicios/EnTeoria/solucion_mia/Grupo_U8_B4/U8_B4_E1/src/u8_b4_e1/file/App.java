package u8_b4_e1.file;

import java.io.File;

/**
 * Clase con ejecutable de Ejercicio U8_B4_E1<p>
 * Con File de io
 */
public class App {

  /**
   * Ejecutable Ejercicio U8_B4_E1<p>
   */
  public static void main(String[] args) {
    // Creamos la variable File con ruta carpeta actual
    File f = new File("");

    if (args.length > 0) {
      // Si hay argumentos, los usamos;
      f = new File(args[0]);
    } else {
      // Si no almacenamos ruta absoluta
      f = new File(f.getAbsoluteFile().toString());
    }

    if (f.exists()) {
      if (f.isDirectory()) {
        // Mostramos ruta absoluta de este directorio
        System.out.println(
          "\nRuta Absoluta de la carpeta: \n" + f.getAbsolutePath() + "\n"
        );

        // Capturamos datos dentro directorio.
        String[] contenidoMiruta = f.list();

        // Mostramos datos internos en consola
        for (String item : contenidoMiruta) {
          // Guardamos archivo
          File fint = new File(item);

          // Ponemos nombre con ruta relativa
          System.out.print("./" + item);

          // Si es dir añadimos / al final
          if (fint.isDirectory()) {
            System.out.print("/");
          }

          System.out.println();
        }
      } else {
        System.out.println("Archivo " + f.getName() + " no es un directorio");
      }
    } else {
      System.out.println("Archivo " + f.getName() + " no existe");
    }
  }
}
