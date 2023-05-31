package U7_B8B_E1;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Ejercicio U7_B8B_E1:<p>
 * En una tienda virtual hay una serie de productos.<p>
 * Un producto puede variar de precio en cualquier momento.
 * Se permite que un objeto Producto “sea seguido” por
 * objetos que se suscriben a él y son notificados por dicho
 *  producto cuando sufre una bajada de precio.
 * Concretamente hay dos tipos posibles de observadores :
 * Clientes y Empleados de Marketing.
 * Cuando un producto cambia de precio este avisa a sus
 * observadores enviándoles un objeto de la clase Aviso
 */
public class App {

  public static void main(String[] args) {
    Producto p1 = new Producto("p1", 100);
    Cliente c1 = new Cliente("Ana");
    EmpleadoMarketing e1 = new EmpleadoMarketing("111", "ofertas");
    p1.addObservador(c1);
    p1.addObservador(e1);
    p1.addObservador(new Cliente("Juan"));
    p1.setPrecio(90);
    System.out.println("");
    p1.removeObservador(e1);
    p1.setPrecio(80);
  }
}

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

class Producto implements Observable {

  private String idProducto;
  private int precio;
  private List<Observador> observadores;

  public int getPrecio() {
    return this.precio;
  }

  public void setPrecio(int precio) {
    int precioViejo = this.precio;
    this.precio = precio;
    if (this.precio < precioViejo) {
      avisarObservadores();
    }
  }

  Producto(String idProducto, int precio) {
    this.idProducto = idProducto;
    this.precio = precio;
    observadores = new ArrayList<Observador>();
  }

  @Override
  public void addObservador(Observador o) {
    observadores.add(o);
  }

  @Override
  public void removeObservador(Observador o) {
    observadores.remove(o);
  }

  @Override
  public void avisarObservadores() {
    for (Observador o : observadores) {
      o.update(new Aviso(idProducto, precio, new Date()));
    }
  }
}

class Cliente implements Observador {

  private String idCliente;

  public Cliente(String idCliente) {
    this.idCliente = idCliente;
  }

  @Override
  public void update(Aviso aviso) {
    System.out.println(
      "Soy el cliente " +
      idCliente +
      " y fui avisado de bajada de precio en producto" +
      aviso.idProducto +
      " a " +
      aviso.precio +
      " euros"
    );
  }
}

class EmpleadoMarketing implements Observador {

  private String idEmpleado;
  private String puesto;

  public EmpleadoMarketing(String idEmpleado, String puesto) {
    this.idEmpleado = idEmpleado;
    this.puesto = puesto;
  }

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

interface Observable {
  void addObservador(Observador o);
  void removeObservador(Observador o);
  void avisarObservadores();
}

interface Observador {
  void update(Aviso aviso);
}
