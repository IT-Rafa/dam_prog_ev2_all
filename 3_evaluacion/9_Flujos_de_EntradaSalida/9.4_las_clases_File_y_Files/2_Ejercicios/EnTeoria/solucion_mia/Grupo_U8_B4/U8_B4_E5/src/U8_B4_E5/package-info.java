/**
 * package con clases para:
 * <h3>Ejercicio U8_B4_E1:</h3>
 * Observa el siguiente ejemplo
 * <p>
 * Podemos trabajar con el contenido de un fichero zip 
 * con ZipFile.
 * <p>
 * Con programación funcional es muy fácil manipularlo.
 * <pre>
import java.io.IOException;
import java.util.zip.ZipFile;
public class App {
    public static void main(String[] args) throws IOException {
        try (ZipFile zipFile = new ZipFile("mizip.zip")) {
        zipFile.stream()
        .forEach(zpe -> System.out.println(zpe.getName() + " tamaño: " + zpe.getSize()));
        }
    }
}
 * </pre>
 * Cada elemento del Stream es un ZipEntry (consulta API).
 * <p>
 * Intenta ordenar el listado de forma que sea por tamaño de mayor 
 * a menor aplicando el método sorted() al stream
 */
package U8_B4_E5;
