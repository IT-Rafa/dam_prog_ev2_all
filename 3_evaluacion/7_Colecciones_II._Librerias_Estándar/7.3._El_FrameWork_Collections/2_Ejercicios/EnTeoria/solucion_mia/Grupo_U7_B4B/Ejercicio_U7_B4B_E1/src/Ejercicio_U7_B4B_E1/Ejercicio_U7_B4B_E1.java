package Ejercicio_U7_B4B_E1;

import java.util.ArrayList;
import java.util.List;

/**
 * Clase que contiene el main del Ejercicio_U7_B4B_E1
 */
public class Ejercicio_U7_B4B_E1 {

  /**
   * Inicio
   * <ul>
   *  <li>Añado la clase, Cambio nombres clase y añado javadoc</li>
   *  <li>Separamos las clases en archivos</li>
   *  <li>Añadir método imprimirDesglosado</li>
   * </ul>
   */
  public static void main(String[] args) {
    // finca
    NodoHoja cierre = new NodoHoja("Cierre finca", 4000);
    NodoHoja jardin = new NodoHoja("jardín", 1000);
    NodoAlmacen finca = new NodoAlmacen("finca");
    finca.addParte(cierre);
    finca.addParte(jardin);

    // estructura
    NodoHoja tejado = new NodoHoja("tejado", 10000);
    NodoHoja alturas = new NodoHoja("alturas", 10000);
    NodoHoja sotano = new NodoHoja("sótano", 10000);
    NodoAlmacen estructura = new NodoAlmacen("estructura");
    estructura.addParte(tejado);
    estructura.addParte(alturas);
    estructura.addParte(sotano);

    // interior
    // interior-habitaciones
    NodoHoja mobiliario = new NodoHoja("mobiliario", 20000);
    NodoHoja pintura = new NodoHoja("pintura", 10000);
    NodoAlmacen habitaciones = new NodoAlmacen("habitaciones");
    habitaciones.addParte(mobiliario);
    habitaciones.addParte(pintura);

    // interior-electricidad
    NodoHoja cables = new NodoHoja("cables", 500);
    NodoHoja operadores = new NodoHoja("operadores", 500);
    NodoAlmacen electricidad = new NodoAlmacen("electricidad");
    electricidad.addParte(cables);
    electricidad.addParte(operadores);

    // interior-fontanería
    NodoHoja caldera = new NodoHoja("caldera", 4000);
    NodoHoja radiadores = new NodoHoja("radiadores", 2000);
    NodoAlmacen calefacción = new NodoAlmacen("calefacción");
    calefacción.addParte(caldera);
    calefacción.addParte(radiadores);
    NodoHoja tuberias = new NodoHoja("tuberías", 3000);
    NodoAlmacen fontaneria = new NodoAlmacen("fontanería");
    fontaneria.addParte(tuberias);
    fontaneria.addParte(calefacción);

    // todo interior
    NodoAlmacen interior = new NodoAlmacen("interior");
    interior.addParte(habitaciones);
    interior.addParte(electricidad);
    interior.addParte(fontaneria);

    // la casa completa
    NodoAlmacen casa = new NodoAlmacen("Casa");
    casa.addParte(finca);
    casa.addParte(estructura);
    casa.addParte(interior);

    // probar cálculo de costes
    System.out.println("Precio casa " + casa.getPrecio());
    System.out.println("Precio finca " + finca.getPrecio());

    System.out.println(      "Precio Desglosado " + casa.getNombre()    );
  }
}

// CLASES PARA CREAR Patrón Composite

/**
 * En Patrón Composite, es la parte Component que indica como
 * deben ser todos los hijos.
 */
abstract class AbstractNodo {

  // ATRIBUTES
  /**
   * Nombre del objeto
   */
  protected String nombre;

  // CONSTRUCTOR
  /**
   * Constructor con nombre
   */
  protected AbstractNodo(String nombre) {
    this.nombre = nombre;
  }

  // GETTER & SETTER
  /**
   * Devuelve el nombre del objeto
   *
   * @return String con el nombre del objeto
   */
  public String getNombre() {
    return nombre;
  }

  // OTHER METHODS
  /**
   * Muestra el precio de los elementos guardados
   */
  abstract void getPrecioDesglosado();

  /**
   * Cambia el nombre del objeto
   *
   * @param nombre String con el nombre del objeto
   */
  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  /**
   * Devuelve el precio del objeto.
   *
   * @return Precio del objeto en double
   */
  abstract double getPrecio();
}

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
   * Añade nuevo  a la lista de objetos guardados (partes)
   *
   * @param parte Objeto ParteAbstracta a añadir
   */
  public void addParte(AbstractNodo parte) {
    this.partes.add(parte);
  }


  /**
   * Imprimimos el árbol desde la raíz, usando pre-orden con tabs para
   * mostrar los sub-nodos
   */
  @Override
  public double getPrecioDesglosado() {
        // Creamos variable a devolver
        double precio = 0;

        // Si tiene objetos dentro, los revisa para coger sus precios
        for (AbstractNodo parte : partes) {
          precio += parte.getPrecio();
        }
        return precio;
  }

  /**
   * Imprimimos el árbol desde el nodo indicado, guardando los tabs
   * a usar
   *
   * @param nodo El nodo desde donde recorremos el arbol
   * @param tab String con los tabs a añadir
   */
  private void ayudantePreordenConTAB(AbstractNodo nodo, String tab) {
    if (nodo == null) {
      // Si el nodo no tiene valor, no hacemos nada
      return ;
    } else {
      // Si tiene valor, lo imprimimos con los tabs
      System.out.println(tab + nodo.getNombre());
      // Añadimos un tab para los siguientes
      tab = tab + "\t";
      // Revisamos el resto de enlaces
      for(AbstractNodo n: nodo.)
      ayudantePreordenConTAB(nodo.nodoIzq, tab);
      ayudantePreordenConTAB(nodo.nodoDer, tab);
    }
  }
}

/**
 * Hereda de ParteAbstracta (Component) y es la parte Leaf, que no tiene
 * lista para almacenar otros Components-
 *
 */
class NodoHoja extends AbstractNodo {

  // ATRIBUTES
  /**
   * Precio del objeto
   */
  private double precio;

  // CONSTRUCTORS
  /**
   * Constructor con nombre del objeto y su precio
   */
  public NodoHoja(String nombre, double precio) {
    super(nombre);
    this.precio = precio;
  }

  // GETTER & SETTER
  /**
   * Devuelve el precio del objeto hoja
   */
  @Override
  double getPrecio() {
    return precio;
  }

@Override
void getPrecioDesglosado() {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'getPrecioDesglosado'");
}
}
