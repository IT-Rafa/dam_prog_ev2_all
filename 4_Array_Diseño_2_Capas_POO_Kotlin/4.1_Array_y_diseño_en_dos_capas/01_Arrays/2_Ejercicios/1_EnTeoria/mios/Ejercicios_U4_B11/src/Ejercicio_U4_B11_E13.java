import java.util.Scanner;

/**
 * Ejercicio U4_B11_E13<p>
 * Repetimos la creación del array de amigos pero ahora no hay
 * límite de amigos, simplemente, cada vez que se añade un amigo nuevo,
 * creamos un nuevo array que contiene todos los amigos del array
 * viejo y el nuevo amigo. <p>
 * Para copiar el array viejo en el nuevo
 * puedes hacerlo “a mano” o utilizar <code>System.arraycopy()</code>.
 */
public class Ejercicio_U4_B11_E13 {

  public static void main(String[] args) {
    Persona[] amigos = new Persona[0];
    Scanner sc = new Scanner(System.in);
    while (true) {
      // Pide datos por teclado
      System.out.println("nuevo Amigo");

      System.out.print("   Nombre: ");
      String nombre = sc.nextLine();
      if (nombre.equalsIgnoreCase("fin")) {
        break;
      }
      System.out.print("   Edad: ");
      int edad = Integer.parseInt(sc.nextLine());

      Persona[] nuevosAmigos = new Persona[amigos.length + 1];
      System.arraycopy(amigos, 0, nuevosAmigos, 0, amigos.length);
      nuevosAmigos[nuevosAmigos.length - 1] = new Persona(nombre, edad);
      amigos = nuevosAmigos;
    }

    System.out.println("Lista amigos: " + amigos.length);

    for (Persona p : amigos) {
      System.out.println("Nombre: " + p.nombre + "; Edad: " + p.edad);
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
