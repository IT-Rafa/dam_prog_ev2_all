package Ejercicio_U6_B2B_E1;
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
public class MiPila implements Pila {
/**
 * Elemento inicial en la lista
 */
  private Nodo primero = null;


  @Override
  public void push(int dato) {
    primero = new Nodo(dato, primero);
  }

  @Override
  public int pop() {
    int result = primero.getDato();
    primero = primero.getSiguiente();
    return result;
  }

  @Override
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

