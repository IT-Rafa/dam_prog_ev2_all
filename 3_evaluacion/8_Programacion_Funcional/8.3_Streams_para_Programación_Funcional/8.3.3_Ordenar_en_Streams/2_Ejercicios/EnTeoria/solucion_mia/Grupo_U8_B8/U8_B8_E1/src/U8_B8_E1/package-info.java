/**
 * package con clases para
 * <h3>Ejercicio U8_B8_E1:</h3>
 * En este ejemplo, si observas el main renunciamos a utilizar los 
 * recursos de la programación funcional y pretendemos ordenar una 
 * lista de producto por tres campos: cantidad, precio y descripción. 
 * Ni siquiera usamos expresiones lambda para escribir el comparador 
 * con lo que tenemos un código “muy vertical”
 * <pre>
import java.util.*;
class Producto {
    private String descripcion;
    private int cantidad;
    private double precio;

    public Producto(String descripcion, int cantidad, double precio) {
        this.descripcion = descripcion;
        this.cantidad = cantidad;
        this.precio = precio;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public int getCantidad() {
        return cantidad;
    }

    public double getPrecio() {
        return precio;
    }
}

class App{
    public static void main(String[] args) {
        // Creamos una lista de productos desordenada
        List<Producto> lista = new ArrayList<>();
        lista.add(new Producto("Producto A", 10, 50.0));
        lista.add(new Producto("Producto B", 5, 100.0));
        lista.add(new Producto("Producto C", 20, 10.0));
        lista.add(new Producto("Producto A", 5, 20.0));
        lista.add(new Producto("Producto B", 5, 10.0));
        lista.add(new Producto("Producto D", 5, 10.0));

        // Creamos un comparador para ordenar primero por cantidad, 
        // luego por precio y finalmente pordescripción
        Comparator<Producto> comparador = new Comparator<Producto>() {
            @Override
            public int compare(Producto p1, Producto p2) {
                int resultado = Integer.compare(p1.getCantidad(), p2.getCantidad());
                if (resultado != 0) {
                    return resultado;
                }
                resultado = Double.compare(p1.getPrecio(), p2.getPrecio());
                if (resultado != 0) {
                   return resultado;
                }
                return p1.getDescripcion().compareTo(p2.getDescripcion());
            }
        };
        // Ordenamos la lista utilizando el comparador
        Collections.sort(lista, comparador);
        // Imprimimos la lista ordenada
        for (Producto p : lista) {
            System.out.println(p.getCantidad() + " - " + p.getPrecio() + " - " + p.getDescripcion());
        }
    }
}
 * </pre>
 * Se pide un main escrito con estilo funcional “más horizontal”.
 * <p>
 * Cuando consigas tu solución que tendrá un aspecto similar a los 
 * últimos ejemplos de thencomparing(), compara y reflexiona sobre 
 * los estilos.
 * <p>
 * Busca una solución legible. Tampoco hay que obsesionarse con 
 * escribir todo en una línea pues la abundancia de paréntesis y 
 * llamadas a métodos puede ser nocivo para la  legibilidad ¿O no?
 */
package U8_B8_E1;
