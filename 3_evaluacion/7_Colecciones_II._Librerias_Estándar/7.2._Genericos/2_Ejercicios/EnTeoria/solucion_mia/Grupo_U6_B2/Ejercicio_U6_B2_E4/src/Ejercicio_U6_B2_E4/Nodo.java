package Ejercicio_U6_B2_E4;

/**
 * Clase usada por la clase MiListaEnlazada.<p>
 * Guarda el objeto genérico y puede enlazarse al siguiente Nodo
 */
public class Nodo<T> {

  // ATTRIBUTES **************************************

  /**
   * Enlace con siguiente Nodo
   */
  private Nodo<T> sig;
  /**
   * Objeto Genérico almacenado
   */
  private T dato;

  // CONSTRUCTORS **************************************
  /**
   * Constructor Nodo con parámetro del Tipo genérico a guardar.<P>
   * En caso del primer nodo guardado de MiListaEnlazada que no
   * conecta con nadie
   *
   * @param dato Objeto del tipo genérico que se almacenará en este Nodo
   */
  public Nodo(T dato) {
    this.dato = dato;
    this.sig = null;
  }

  /**
   * Constructor Nodo con parámetro del Tipo genérico a guardar y la
   * conexión con otro Nodo (En caso de MiListaEnlazada, es el anterior
   * primero).
   *
   * @param dato Objeto del tipo genérico que se almacenará en este Nodo
   * @param sig Nodo al que apunta
   */
  public Nodo(T dato, Nodo<T> sig) {
    this.dato = dato;
    this.sig = sig;
  }

  // GETTER&SETTERS **************************************

  /**
   * Modifica sig
   *
   * @param sig Dirección del nuevo Nodo al que se apuntará
   */
  public void setSiguiente(Nodo<T> sig) {
    this.sig = sig;
  }

  /**
   * Devuelve sig
   *
   * @return Devuelve la dirección del Nodo al que se apunta
   */
  public Nodo<T> getSiguiente() {
    return sig;
  }

  /**
   * Devuelve objeto genérico guardado
   *
   * @return el objeto genérico guardado
   */
  public T getDato() {
    return dato;
  }
}
