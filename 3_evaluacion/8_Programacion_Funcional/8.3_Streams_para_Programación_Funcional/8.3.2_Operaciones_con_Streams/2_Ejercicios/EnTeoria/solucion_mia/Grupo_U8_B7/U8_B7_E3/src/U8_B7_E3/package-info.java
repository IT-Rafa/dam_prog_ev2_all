/**
 * package con clases para
 * <h3>Ejercicio U8_B7_E3:</h3>
 * Añadir código para que la lista filtrados contenga todos 
 * los artículos con precio mayor que 30.0
 * <h4>Código original</h4>
 * <pre>
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class App {

    public static void main(String[] args) {
      Articulo[] articulos = {
        new Articulo("A1", 10.0),
        new Articulo("A2", 30.5),
        new Articulo("B1", 30.0),
        new Articulo("B2", 100.0),
        new Articulo("c1", 66.5),
      };
  
      List<Articulo> listaArticulos = Arrays.asList(articulos);
      List<Articulo> filtrados;
  
      // Hacer tubería aquí para obtener filtrados
      System.out.println(filtrados);
    }
  }
  
  class Articulo {
  
    String codigo;
    double pvp;
  
    public Articulo(String codigo, double pvp) {
      this.codigo = codigo;
      this.pvp = pvp;
    }
  
    public String getCodigo() {
      return codigo;
    }
  
    public Double getPvp() {
      return pvp;
    }
  
    @Override
    public String toString() {
      return "Articulo{" + "codigo=" + codigo + ", pvp=" + pvp + '}';
    }
  }
  
 * </pre>
 */
package U8_B7_E3;
