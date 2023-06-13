/**
 * package con clases para 
 * <h3>Ejercicio U8_B3_E2:</h3>
 * Escribe como clase anidada de App el código del comparador.
 * <p>
 * Pues definirla como static, interna miembro o interna local 
 * ( o de las tres formas). Cómo anónima lo dejamos para el 
 * siguiente ejercicio.
 * <p>
 * Como el main es static salen unas combinaciones un poco 
 * retorcidas pero las intentamos sólo a título de curiosidad 
 * ya que son bastante inhabituales.
 * <pre>
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;

class Articulo {
    String codArticulo;
    String descripcion;
    int cantidad;

    Articulo(String codArticulo, String descripcion, int cantidad) {
        this.codArticulo = codArticulo;
        this.descripcion = descripcion;
        this.cantidad = cantidad;
    }
}

class ComparadorArticulos implements Comparator<Articulo>{
    @Override
    public int compare( Articulo o1, Articulo o2) {
        return o1.codArticulo.compareTo(o2.codArticulo); 
    }
}

class App {
public static void main(String[] args) {
        LinkedList<Articulo> articulos = new LinkedList<Articulo>();
        articulos.add(new Articulo("34","cuchillo",5));
        articulos.add(new Articulo("12","tenedor",7));
        articulos.add(new Articulo("41","cuchara",4));
        articulos.add(new Articulo("11","plato",6));

        Collections.sort(articulos, new ComparadorArticulos());
        for(Articulo a:articulos)
            System.out.println(a.codArticulo+", "+a.descripcion+", "+a.cantidad);
    }
}
 * </pre>

 * <p>
 */
package U8_B3_E2;
