package U7_B9_E5;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Clase con ejecutable apara Ejercicio U7_B9_E5:<p>
 *
 */
public class App {

  public static void main(String[] args) {
    Agenda agendaChuchi = new Agenda("Chuchi");
    agendaChuchi.add("eluno", "11111");
    agendaChuchi.add("dosi", "22222");
    agendaChuchi.add("tresi", "333333");

    System.out.println("Agenda de " + agendaChuchi.getPropietario());
    for (Contacto c : agendaChuchi) {
      System.out.println(c);
    }
    System.out.println(
      "Agenda de " + agendaChuchi.getPropietario() + " con iterator"
    );
    Iterator<Contacto> it_agendaChuch = agendaChuchi.iterator();
    while (it_agendaChuch.hasNext()) {
      System.out.println(it_agendaChuch.next());
    }
  }
}

/**
 *
 */
class Contacto {

  String nombre;
  String telefono;

  public Contacto(String nombre, String telefono) {
    this.nombre = nombre;
    this.telefono = telefono;
  }

  /**
   *
   */
  @Override
  public String toString() {
    return "nombre=" + nombre + ", teléfono=" + telefono;
  }
}

/**
 *
 */
class Agenda implements Iterable<Contacto> {

  /**
   *
   */
  String propietario;
  /**
   *
   */
  ArrayList<Contacto> contactos = new ArrayList<>();

  /**
   *
   */
  public Agenda(String propietario) {
    this.propietario = propietario;
  }

  /**
   *
   */
  public String getPropietario() {
    return propietario;
  }

  /**
   *
   */
  public void add(String nombre, String telefono) {
    contactos.add(new Contacto(nombre, telefono));
  }

  /**
   *
   */
  @Override
  public Iterator<Contacto> iterator() {
    return contactos.iterator();
  }
}
