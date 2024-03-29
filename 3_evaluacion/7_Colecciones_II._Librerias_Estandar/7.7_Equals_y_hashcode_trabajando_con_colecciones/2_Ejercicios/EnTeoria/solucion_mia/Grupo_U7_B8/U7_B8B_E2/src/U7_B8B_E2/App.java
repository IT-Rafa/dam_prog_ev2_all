package U7_B8B_E2;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Clase con método ejecutor para Ejercicio U7_B8B_E2:<p>
 */
public class App {

  /**
   * Incluimos la función del enunciado.<p>
   * Comprobamos que no se elimina<p>
   * El Observador a eliminar es de tipo EmpleadoMarketing.
   * Probablemente por no tener hashCode y usar el de defecto, que va por memoria,
   * y los considera distintos.<p>
   *
   * Le sobreescribimos a EmpleadoMarketing, hashCode() y boolean equals(Object obj),
   * usando el propio IDE de visual studio, con Source Action, usando los atributos
   * codigo(int) y puesto(String).<p>
   * Ahora se borra ok; También hacemos lo mismo con cliente y lo eliminamos en main.<p>
   * También se borra
   */
  public static void main(String[] args) throws Exception {
    Producto p1 = new Producto("p1", 100);
    Cliente c1 = new Cliente("Ana");
    EmpleadoMarketing e1 = new EmpleadoMarketing("111", "ofertas");
    p1.addObservador(c1);
    p1.addObservador(e1);
    p1.addObservador(new Cliente("Juan"));
    p1.setPrecio(90);
    System.out.println("");
    EmpleadoMarketing quieroBorrar = new EmpleadoMarketing("111", "ofertas");
    p1.removeObservador(quieroBorrar);
    Cliente quieroBorrar2 = new Cliente("Juan");
    p1.removeObservador(quieroBorrar2);

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
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((idCliente == null) ? 0 : idCliente.hashCode());
    return result;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj) return true;
    if (obj == null) return false;
    if (getClass() != obj.getClass()) return false;
    Cliente other = (Cliente) obj;
    if (idCliente == null) {
      if (other.idCliente != null) return false;
    } else if (!idCliente.equals(other.idCliente)) return false;
    return true;
  }

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

class EmpleadoMarketing implements Observador {

  private String idEmpleado;
  private String puesto;

  public EmpleadoMarketing(String idEmpleado, String puesto) {
    this.idEmpleado = idEmpleado;
    this.puesto = puesto;
  }

  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result =
      prime * result + ((idEmpleado == null) ? 0 : idEmpleado.hashCode());
    result = prime * result + ((puesto == null) ? 0 : puesto.hashCode());
    return result;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj) return true;
    if (obj == null) return false;
    if (getClass() != obj.getClass()) return false;
    EmpleadoMarketing other = (EmpleadoMarketing) obj;
    if (idEmpleado == null) {
      if (other.idEmpleado != null) return false;
    } else if (!idEmpleado.equals(other.idEmpleado)) return false;
    if (puesto == null) {
      if (other.puesto != null) return false;
    } else if (!puesto.equals(other.puesto)) return false;
    return true;
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
