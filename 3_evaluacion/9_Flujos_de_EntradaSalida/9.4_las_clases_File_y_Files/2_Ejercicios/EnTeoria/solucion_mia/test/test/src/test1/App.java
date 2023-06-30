package test1;

import java.io.File;

public class App {

  public static void main(String[] args) throws Exception {
    File thisFolder = new File("").getAbsoluteFile();
    System.out.println("Carpeta actual: " + thisFolder);

    if (thisFolder.isAbsolute()) {
      System.out.println("es Absolute");
    }
    if (thisFolder.isDirectory()) {
      System.out.println("es Directorio");
    }
    if (thisFolder.isFile()) {
      System.out.println("es Archivo");
    }

    File nextFolder = new File(
      thisFolder.getAbsolutePath() +
      "/9_Flujos_de_EntradaSalida/9.3_Ficheros_de_texto"
    );
    System.out.println("Carpeta actual interna: " + nextFolder);

    if (nextFolder.isAbsolute()) {
      System.out.println("es Absolute");
    }
    if (nextFolder.isDirectory()) {
      System.out.println("es Directorio");
    }
    if (nextFolder.isFile()) {
      System.out.println("es Archivo");
    }

    System.out.println("Sólo nombre archivo interno: " + nextFolder.getName());
    System.out.println(
      "Ruta relativa archivo interno: " + relative(thisFolder, nextFolder)
    );
    listarDir(nextFolder);
  }

  public static void listarDir(File ruta) {
    for (File f : ruta.listFiles()) {
      if (f.isDirectory()) {
        System.out.print(relative(ruta, f) + "/");
        listarDir(f);
      }
    }
    System.out.println();
    for (File f : ruta.listFiles()) {
      if (!f.isDirectory()) {
        System.out.println("\t" + relative(ruta, f));
      }
    }
  }

  public static String relative(final File base, final File file) {
    final int rootLength = base.getAbsolutePath().length();
    final String absFileName = file.getAbsolutePath();
    final String relFileName = absFileName.substring(rootLength + 1);
    return relFileName;
  }
}
