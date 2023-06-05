package U7_B8B_E1;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Clase con método ejecutor de Ejercicio U7_B8B_E1:<p>
 */
public class App {

  public static void main(String[] args) {
    // Creamos objeto Producto (Observable)
    Producto p1 = new Producto("p1", 100);

    // Creamos objeto Cliente (Observador)
    Cliente c1 = new Cliente("Ana");

    // Creamos objeto EmpleadoMarketing (Observador)
    EmpleadoMarketing e1 = new EmpleadoMarketing("111", "ofertas");
    // Añadimos Observadores al Observable
    p1.addObservador(c1);
    p1.addObservador(e1);
    p1.addObservador(new Cliente("Juan"));

    // Cambiamos precio producto
    p1.setPrecio(90);
    System.out.println("");

    // Eliminamos Observador del objeto Observable
    p1.removeObservador(e1);

    // Cambiamos precio producto
    p1.setPrecio(80);
  }
}

/**
 * Clase Aviso que almacena el id, precio y fecha cambio precio de un producto
 */
class Aviso {

  String idProducto;
  int precio;
  Date fecha;

  Aviso(String idProducto, int precio, Date fecha) {
    this.idProducto = idProducto;
    this.precio = precio;
    this.fecha = fecha;
  }
}

/**
 * Clase Producto con id y precio.
 * Como implementa Observable, incluye lista de objetos Observador
 */
class Producto implements Observable {

  // ATTRIBUTES
  /**
   * Código del producto
   */
  private String idProducto;
  /**
   * Precio actual del producto
   */
  private int precio;
  /**
   * Lista objetos Observador
   */
  private List<Observador> observadores;

  // GETTER & SETTER
  public int getPrecio() {
    return this.precio;
  }

  public void setPrecio(int precio) {
    // Guardamos precio antes cambiarlo
    int precioViejo = this.precio;
    // Cambiamos el precio por el nuevo
    this.precio = precio;
    // Si precio nuevo es mas bajo
    if (this.precio < precioViejo) {
      // Avisamos al los Observadores
      avisarObservadores();
    }
  }

  // CONSTRUCTOR
  Producto(String idProducto, int precio) {
    this.idProducto = idProducto;
    this.precio = precio;
    observadores = new ArrayList<Observador>();
  }

  // METHODS - Observador
  /**
   * Añade Observador a la lista
   *
   * @param o Observador a añadir
   */
  @Override
  public void addObservador(Observador o) {
    observadores.add(o);
  }

  /**
   * Elimina Observador de la lista
   *
   * @param o Observador a eliminar
   */
  @Override
  public void removeObservador(Observador o) {
    observadores.remove(o);
  }

  /**
   * Envía aviso a los observador
   */
  @Override
  public void avisarObservadores() {
    // a cada Observador de la lista
    for (Observador o : observadores) {
      // Cada observador nos informa que le llego el aviso
      o.update(new Aviso(idProducto, precio, new Date()));
    }
  }
}

/**
 * Clase Cliente con identificador<p>
 * implementa Observador
 */
class Cliente implements Observador {

  // ATTRIBUTES
  /**
   * Identificador del Cliente
   */
  private String idCliente;

  // CONSTRUCTOR
  /**
   * Constructor con identificador del Cliente
   */
  public Cliente(String idCliente) {
    this.idCliente = idCliente;
  }

  // METHODS - Observador
  /**
   *
   */
  @Override
  public void update(Aviso aviso) {
    System.out.println(
      "Soy el cliente " +
      idCliente +
      " y fui avisado de bajada de precio en producto " +
      aviso.idProducto +
      " a " +
      aviso.precio +
      " euros"
    );
  }
}

/**
 * Clase EmpleadoMarketing con id Empleado y puesto<p>
 * implementa Observador
 */
class EmpleadoMarketing implements Observador {

  // ATTRIBUTES
  /**
   * Id del Empleado
   */
  private String idEmpleado;

  /**
   * Puesto del empleado
   */
  private String puesto;

  // CONSTRUCTOR
  /**
   * Constructor con id y puesto
   */
  public EmpleadoMarketing(String idEmpleado, String puesto) {
    this.idEmpleado = idEmpleado;
    this.puesto = puesto;
  }

  // METHODS - Observador
  /**
   * Muesta mensaje de la recepción del aviso
   */
  @Override
  public void update(Aviso aviso) {
    System.out.println(
      "Soy el empleado " +
      idEmpleado +
      " de " +
      puesto +
      " y fui avisado de bajada de precio en producto " +
      aviso.idProducto +
      " a " +
      aviso.precio +
      " euros el " +
      aviso.fecha
    );
  }
}

/**
 * Interface Observable<p>
 * Contiene prototipos de los métodos usados para incluir o eliminar
 * a los objetos Observador y enviarles mensaje
 */
interface Observable {
  void addObservador(Observador o);
  void removeObservador(Observador o);
  void avisarObservadores();
}

/**
 * Interface Observador<p>
 * Contiene prototipos de los métodos usados para hacer algo con
 * el Aviso recibido
 */
interface Observador {
  void update(Aviso aviso);
}
