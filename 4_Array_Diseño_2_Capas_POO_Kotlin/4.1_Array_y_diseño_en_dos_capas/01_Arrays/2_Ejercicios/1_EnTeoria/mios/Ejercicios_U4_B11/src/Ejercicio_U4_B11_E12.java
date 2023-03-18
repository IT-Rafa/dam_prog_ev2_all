import java.util.Scanner;

/**
 * Ejercicio U4_B11_E12<p>
 * Modifica el ejercicio anterior de forma que funcione para un
 * número indeterminado de amigos.<p>
 * Al teclear un nombre de amigo “fin” se asume que ya no se quieren
 * introducir más amigos.<p>
 * Como no sabes a priori el número de amigos que serán introducidos,
 * utiliza un array de tamaño 100 elementos.<p>
 * Tras introducir los amigos, el programa imprime el array.
 *
 */

public class Ejercicio_U4_B11_E12 {

  public static void main(String[] args) {
    int cantAmigos = 100;
    Persona[] amigos = new Persona[cantAmigos];
    Scanner sc = new Scanner(System.in);
    // Utiliza un bucle para recoger los dato
    for (int i = 0; i < cantAmigos; i++) {
      // Pide datos por teclado
      System.out.println("Cliente " + i);

      System.out.print("   Nombre: ");
      String nombre = sc.nextLine();
      if (nombre.equalsIgnoreCase("fin")) {
        break;
      }
      System.out.print("   Edad: ");
      int edad = Integer.parseInt(sc.nextLine());

      amigos[i] = new Persona(nombre, edad);
    }
    // muestra los datos del array por pantalla
    for (Persona p : amigos) {
      if (p == null) {
        break;
      } else {
        System.out.println("Nombre: " + p.nombre + "; Edad: " + p.edad);
      }
    }
    sc.close();
  }
}

class Persona {

  String nombre;
  int edad;

  public Persona(String nombre, int edad) {
    this.nombre = nombre;
    this.edad = edad;
  }
}
