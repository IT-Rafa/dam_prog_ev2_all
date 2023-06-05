package U7_B9_E4;

/**
 * Clase con método ejecutor del Ejercicio U7_B9_E4:<p>
 */

public class App {

  public static void main(String[] args) {
    // Creamos objeto Agenda
    Agenda agendaChuchi = new Agenda("Chuchi");
    // Asignamos elementos a objeto Agenda
    agendaChuchi.add("eluno", "11111");
    agendaChuchi.add("dosi", "22222");
    agendaChuchi.add("tresi", "333333");

    // Creamos Iterador manual para objeto Agenda
    MiIterator it = agendaChuchi.crearIterador();

    // Mostramos objetos del iterador de Agenda
    System.out.println("Agenda de " + agendaChuchi.getPropietario());
    while (it.hasNext()) {
      System.out.println(it.next());
    }
  }
}

/**
 * Clase que representa un contacto con nombre y tfno
 */
class Contacto {

  String nombre;
  String telefono;

  public Contacto(String nombre, String telefono) {
    this.nombre = nombre;
    this.telefono = telefono;
  }

  @Override
  public String toString() {
    return "nombre=" + nombre + ", teléfono=" + telefono;
  }
}

/**
 * Interface con métodos prototipo de Iterator
 */
interface MiIterator {
  /**
   * Comprueba si existe otro elemento
   */
  boolean hasNext();
  /**
   * Captura el elemento siguiente
   */
  Contacto next();
}

/**
 * Clase para el iterador de contactos de un objeto Agenda
 */
class IteradorDeAgenda implements MiIterator {

  // ATTRIBUTES
  /**
   * Lista contactos de iterator
   */
  Contacto[] contactos;
  /**
   * Posición actual dentro de contactos
   */
  int posSiguiente;

  // CONSTRUCTOR
  /**
   * Contructor que pide la agenda
   */
  IteradorDeAgenda(Agenda a) {
    this.contactos = a.contactos;
    posSiguiente = 0;
  }

  // METHODS - MiIterator
  /**
   * {@inheritDoc}
   * en la lista de objetos Contacto
   */
  @Override
  public boolean hasNext() {
    if (posSiguiente >= contactos.length) {
      return false;
    } else if (contactos[posSiguiente] == null) {
      return false;
    }
    return true; //tambien cubre caso array vacio pues
  }

  /**
   * {@inheritDoc}
   * de lista de objetos Contacto
   */
  @Override
  public Contacto next() {
    return contactos[posSiguiente++];
  }
}

/**
 * Clase para almacenar los contactos con un propietario
 */
class Agenda {

  // ATTRIBUTES
  /**
   * Nombre del propietario de la Agenda
   */
  String propietario;

  /**
   * lista de Contactos
   */
  Contacto[] contactos = new Contacto[100];

  // CONSTRUCTOR
  /**
   * Contructor que pide el propietario
   */
  public Agenda(String propietario) {
    this.propietario = propietario;
  }

  // GETTER & SETTER
  /**
   * Devuelve el propietario
   *
   * @return String con el propietario
   */
  public String getPropietario() {
    return propietario;
  }

  /**
   * Añade Contacto a la agenda
   *
   * @param nombre String con nombre del contacto
   * @param telefono String con el número de teléfono
   */
  public void add(String nombre, String telefono) {
    int i;
    for (i = 0; i < contactos.length; i++) {
      if (contactos[i] == null) {
        contactos[i] = new Contacto(nombre, telefono);
        break;
      }
    }
  }

  /**
   * Crea el Iterador manual de este Objeto Agenda
   */
  public MiIterator crearIterador() {
    return new IteradorDeAgenda(this);
  }
}
