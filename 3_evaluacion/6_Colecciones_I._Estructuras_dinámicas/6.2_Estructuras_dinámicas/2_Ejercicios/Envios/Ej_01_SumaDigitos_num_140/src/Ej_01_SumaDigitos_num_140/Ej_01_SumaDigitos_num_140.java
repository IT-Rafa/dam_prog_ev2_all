package Ej_01_SumaDigitos_num_140;

import java.util.Scanner;

public class Ej_01_SumaDigitos_num_140 {

  /**
   * Capturamos input usuario, pasamos a entero, si es negativo,
   * finaliza, sino, sumamos cada uno de los dígitos y mostramos
   * resultado con cada caracter y el operador suma con su
   * resultado incluyendo '='.
   * Entrada y salida
   * 123
   * 1 + 2 + 3 = 6
   * Entrada y salida y fin
   * -2
   * (fin)
   */
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    // Hacemos bucle infinito. Se bloquea al ver el número del usuario
    do {
      // Capturamos número String a int
      int numero = Integer.parseInt(sc.next());
      // si nº es negativo finalizamos
      if (numero < 0) {
        break;
      }
      // preparamos pila
      MiPila pila = new MiPila();

      // Capturamos cada dígito del número y metemos en pila
      // Rebajando cada decena
      if (numero == 0) {
        // Si es 0 00 000, etc; Lo metemos directo
        pila.push(0);
      } else {
        // CAPTURAMOS LOS NÚMEROS POR SEPARADO
        // Repetimos hasta que solo quede la unidad
        while (numero > 0) {
          // Capturamos el dígito de la unidad
          pila.push(numero % 10);
          // Eliminamos el dígito de la unidad
          numero = numero / 10;
        }
      }

      // Salida
      String salida = "";
      int suma = 0;

      // Recorremos pila
      while (!pila.esVacia()) {
        // Capturamos número de la pila
        int n = pila.pop();
        // Añadimos mensaje
        salida += n + " + ";
        // Calculamos suma
        suma += n;
      }
      // Quitamos el último " + "
      salida = salida.substring(0, salida.length() - 3);
      // Mostramos mensaje con dato de la suma
      System.out.println(salida + " = " + suma);
    } while (true);

    sc.close();
  }
}

/**
 * Organiza pila (stack)<p>
 * Una pila, o stack, en inglés, es una colección de datos en la
 * que los datos se añaden (push) o eliminan (pull) desde el principio
 * de la colección, llamada "parte superior" o, en ingles, TOS
 * (Top of Stack).<p>
 * Esta basado en el sistema LIFO (Last In First Out), última entrada
 * es la que sale primero.<p>
 * En este caso está basada en clases autorreferenciadas
 */
class MiPila {

  /**
   * Elemento inicial en la lista
   */
  private Nodo primero = null;

  public void push(int dato) {
    primero = new Nodo(dato, primero);
  }

  public int pop() {
    int result = primero.getDato();
    primero = primero.getSiguiente();
    return result;
  }

  public boolean esVacia() {
    if (primero == null) {
      return true;
    } else {
      return false;
    }
  }
}

/**
      * Es una clase autorreferenciadas, usada para crear la estructura dinámica.<p>
      * El valor del objeto (dato) y el enlace con el siguente objeto (sig) se 
       * guardan aquí.<p>
      * Autorreferenciada es una clase que contiene un atributo (sig, en este caso) 
      que que apunta a otro objeto de la misma clase.
      */
class Nodo {

  /**
   * Enlace con el siguiente objeto Nodo
   */
  private Nodo sig;
  /**
   * Valor de este objeto
   */
  private int dato;

  /**
   * Constructor que pide valor y el siguiente nodo a conectar
   */
  public Nodo(int dato, Nodo sig) {
    this.dato = dato;
    this.sig = sig;
  }

  /**
   * Permite cambiar el Nodo siguiente al que conectarse
   */
  public void setSiguiente(Nodo sig) {
    this.sig = sig;
  }

  // Devuelve el objeto Nodo al que está conectado
  public Nodo getSiguiente() {
    return sig;
  }

  /**
   * Devuelve el valor del datos del Nodo
   */
  public int getDato() {
    return dato;
  }
}
