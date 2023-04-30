package Ejercicio_U7_B4B_E1;

import java.util.ArrayList;
import java.util.List;

/**
 * Hereda de ParteAbstracta (Component) y es la parte Composite, que
 * permite contener una lista de objetos Component, y devolver los datos
 * conjuntos de lo que tenga guardado
 *
 */
class NodoAlmacen extends AbstractNodo {

  // ATTRIBUTES
  /**
   * Conjunto de objetos guardados
   */
  private List<AbstractNodo> partes = new ArrayList<>();

  // CONSTRUCTOR
  /**
   * Constructor con nombre
   *
   * @param nombre Nombre del objeto
   */
  public NodoAlmacen(String nombre) {
    super(nombre);
  }

  /**
   * Devuelve el precio del objeto.
   *
   * @return Precio del objeto en double
   */
  @Override
  public double getPrecio() {
    // Creamos variable a devolver
    double precio = 0;

    // Si tiene objetos dentro, los revisa para coger sus precios
    for (AbstractNodo parte : partes) {
      precio += parte.getPrecio();
    }
    return precio;
  }

  /**
   * Añade nuevo a la lista de objetos guardados (partes)
   *
   * @param parte Objeto ParteAbstracta a añadir
   */
  public void addParte(AbstractNodo parte) {
    this.partes.add(parte);
  }

  /**
   *
   */
  @Override
  public String getPrecioDesglosado() {
    // Usamos param tab para añadir separación entre nodos
    return getPrecioDesglosado("");
  }

  /**
   * Devuelve String con el nombre y precio de este objeto y los internos,
   * separando los nodos con tab
   *
   * @param tab tabuladores acumulados para separar nodos
   * @return String con el nombre y precio de este objeto y los internos, con tabs
   */
  private String getPrecioDesglosado(String tab) {
    String salida = tab + this.getNombre() + " " + this.getPrecio() + "\n";
    for (AbstractNodo parte : this.partes) {
      if (parte instanceof NodoAlmacen) {
        // Es NodoAlmacen (Composite)
        NodoAlmacen n = (NodoAlmacen) parte;
        // Agregamos la descripción interna
        salida += n.getPrecioDesglosado(tab + "\t");
      } else {
        // En este caso es NodoHoja
        // Si el objeto es simple, creamos el tab directamente
        // La causa es evitar que cliente tenga que incluir el tab
        salida += tab + "\t" + parte.getPrecioDesglosado();
      }
    }
    return salida;
  }
}
