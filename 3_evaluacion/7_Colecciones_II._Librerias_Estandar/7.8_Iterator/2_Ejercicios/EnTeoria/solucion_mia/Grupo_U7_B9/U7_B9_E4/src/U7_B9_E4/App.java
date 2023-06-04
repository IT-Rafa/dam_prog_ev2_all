package U7_B9_E4;

/**
 * Ejercicio U7_B9_E4:<p>
 * Cambia el ArrayList por un Array y comprueba que el código de
 * la clase Cliente sigue funcionando exactamente igual.<p>
 * Evidentemente habrá que modificar la clase Agenda y su iterador.
 * Suponemos que como mucho tendremos 100 contactos.
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

  Contacto[] contactos;
  int posSiguiente;

  IteradorDeAgenda(Agenda a) {
    this.contactos = a.contactos;
    posSiguiente = 0;
  }

  @Override
  public boolean hasNext() {
    if (posSiguiente >= contactos.length) {
      return false;
    } else if (contactos[posSiguiente] == null) {
      return false;
    }
    return true; //tambien cubre caso array vacio pues
  }

  @Override
  public Contacto next() {
    return contactos[posSiguiente++];
  }
}

class Agenda {

  String propietario;
  Contacto[] contactos = new Contacto[100];

  public Agenda(String propietario) {
    this.propietario = propietario;
  }

  public String getPropietario() {
    return propietario;
  }

  public void add(String nombre, String telefono) {
    int i;
    for (i = 0; i < contactos.length; i++) {
      if (contactos[i] == null) {
        break;
      }
    }
    contactos[i] = new Contacto(nombre, telefono);
  }

  public MiIterator crearIterador() {
    return new IteradorDeAgenda(this);
  }
}

public class App {

  public static void main(String[] args) {
    Agenda agendaChuchi = new Agenda("Chuchi");
    agendaChuchi.add("eluno", "11111");
    agendaChuchi.add("dosi", "22222");
    agendaChuchi.add("tresi", "333333");
    MiIterator it = agendaChuchi.crearIterador();

    System.out.println("Agenda de " + agendaChuchi.getPropietario());
    while (it.hasNext()) {
      System.out.println(it.next());
    }
  }
}
