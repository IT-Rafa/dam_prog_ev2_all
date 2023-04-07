package Ejercicio_U6_B2B_E4;
/**
 * Organizador tipo cola (Queue)<p>
 * Una cola, o Queue, en inglés, es una colección de datos en la
 * que los datos se añaden (Encolan o add) al final de la lista y
 * se eliminan (Desencolan o remove) en el principio de la lista.<p>
 * Esta basado en el sistema FIFO (First In First Out), El primero en
 * entrar es el que sale primero.<p>
 * En este caso está basada en clases autorreferenciadas
 */
public class MiCola implements Cola {

  /**
   * Principio de la cola
   */
  private Nodo primero = null;
  /**
   * Final de la cola
   */
  private Nodo ultimo = null;
  /**
   * Cantidad elementos en la cola
   */
  private int size = 0;

  @Override
  public void encolar(int dato) {
    // Creamos Nodo
    Nodo nuevo = new Nodo(dato, null);
    if (esVacia()) {
      // Si vacia, es el primero
      primero = nuevo;
    } else {
      // Si no; ponemos la ruta siguiente del último al nuevo
      ultimo.setSiguiente(nuevo);
    }
    // En ambos casos cambiamos el último por el nuevo
    ultimo = nuevo;
    // Subimos cantidad de nodos
    size++;
  }

  @Override
  public int desencolar() {
    // Capturamos dato
    int result = primero.getDato();
    // Pasamos la dirección del siguiente Nodo como primero
    primero = primero.getSiguiente();

    // Bajamos cantidad de nodos
    size--;

    // y Devolvemos dato
    return result;
  }

  @Override
  public boolean esVacia() {
    return primero == null;
  }

  @Override
  public int getSize() {
    return size;
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
