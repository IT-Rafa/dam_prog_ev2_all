package Ejercicio_U7_B4B_E3;

/**
 * Representa a todos los nodos del árbol, que son Leaf(Operando) y Compuesto(Operacion)
 * Clase abstracta de Patrón Composite
 */
abstract class Expresion {

  abstract double evaluar() throws ExpresionException;
}
