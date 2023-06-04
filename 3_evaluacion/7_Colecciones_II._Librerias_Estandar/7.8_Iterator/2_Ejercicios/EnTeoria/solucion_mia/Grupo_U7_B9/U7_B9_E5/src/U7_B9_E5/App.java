package U7_B9_E5;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Ejercicio U7_B9_E5:<p>
 * Ahora, de vuelta con la versión con ArrayList, nos empeñamos en
 * poder recorrer la agenda con un for mejorado.<p>
 * Para esto tenemos que “comunicarnos” con los programadores del
 * JDK y tenemos que usar Iterator e Iterable de JDK. <p>
 * Como estos interfaces son genéricos los usaremos con Objetos
 * Contacto de la forma Iterable<Contacto> e Iterator<Contacto><p>
 * Consigue pues que funcione el siguiente Cliente haciendo los
 * cambios oportunos en el código del ejemplo con ArrayList
 *
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

interface MiIterator {
  boolean hasNext();
  Contacto next();
}

class IteradorDeAgenda implements MiIterator {

  ArrayList<Contacto> contactos;
  int posSiguiente;

  IteradorDeAgenda(Agenda a) {
    this.contactos = a.contactos;
    posSiguiente = 0;
  }

  @Override
  public boolean hasNext() {
    return posSiguiente < contactos.size(); //tambien cubre caso array vacio pues
  }

  @Override
  public Contacto next() {
    return contactos.get(posSiguiente++);
  }
}

class Agenda implements Iterable<Contacto> {

  String propietario;
  ArrayList<Contacto> contactos = new ArrayList<>();

  public Agenda(String propietario) {
    this.propietario = propietario;
  }

  public String getPropietario() {
    return propietario;
  }

  public void add(String nombre, String telefono) {
    contactos.add(new Contacto(nombre, telefono));
  }

  public MiIterator crearIterador() {
    return new IteradorDeAgenda(this);
  }

  @Override
  public Iterator<Contacto> iterator() {
    return contactos.iterator();
  }
}

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
  }
}
