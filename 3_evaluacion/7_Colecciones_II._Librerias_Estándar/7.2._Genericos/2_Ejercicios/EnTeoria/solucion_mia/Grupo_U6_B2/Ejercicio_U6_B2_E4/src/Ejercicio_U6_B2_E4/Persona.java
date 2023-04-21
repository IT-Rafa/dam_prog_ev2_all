package Ejercicio_U6_B2_E4;

/**
 * Representa como crear un objeto Persona
 */
public class Persona {

  /**
   * Nombre de la persona
   */
  String nombre;
  /**
   * Edad de la persona
   */
  int edad;

  /**
   * Constructor de persona con nombre y edad
   */
  Persona(String nombre, int edad) {
    this.nombre = nombre;
    this.edad = edad;
  }

  /**
   * Convierte en String el objeto persona
   */
  @Override
  public String toString() {
    return "(" + nombre + ", " + edad + ")";
  }
}
