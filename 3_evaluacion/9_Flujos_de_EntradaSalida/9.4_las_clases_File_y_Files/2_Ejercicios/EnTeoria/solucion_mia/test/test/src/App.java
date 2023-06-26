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

    File nextFolder = new File(thisFolder + "/Fin_Examen_3");
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
  }

  public static String relative(final File base, final File file) {
    final int rootLength = base.getAbsolutePath().length();
    final String absFileName = file.getAbsolutePath();
    final String relFileName = absFileName.substring(rootLength + 1);
    return "./" + relFileName;
  }
}
