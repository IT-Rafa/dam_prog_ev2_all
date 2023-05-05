package Ejercicio_U6_B2_E3;

public class Persona {

  String nombre;
  int edad;

  Persona(String nombre, int edad) {
    this.nombre = nombre;
    this.edad = edad;
  }

  @Override
  public String toString() {
    return this.nombre + ", " + this.edad;
  }
}
