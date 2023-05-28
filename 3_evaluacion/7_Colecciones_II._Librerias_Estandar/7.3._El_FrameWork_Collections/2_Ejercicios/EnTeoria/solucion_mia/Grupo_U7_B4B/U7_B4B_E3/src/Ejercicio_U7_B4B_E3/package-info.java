/**
 * Lista clases para ejercicio:<p>
 * <h3>Ejercicio_U7_B4B_E3:</h3><p>
 * <h3>Evaluar expresiones con Composite</h3>
 * Queremos almacenar una expresión aritmética en un arbol 
 * binario y tener un método evaluar() que nos devuelva su valor.<p>
 * Utilizaremos para escribir el árbol el patrón Composite. 
 * La clase Abstracta será Expresion y tiene un método abstracto 
 * evaluar(). Una Expresion puede ser una operacion o un operando. 
 * Los operandos son los nodos hoja de composite y una operacion es 
 * el nodo recursivo. <p>
 * La clase operación tendrá el siguiente aspecto:
 * <pre>
class Operacion extends Expresion {
    private Expresion left;
    private Expresion right;
    private char operator;
etc.

 * </pre>
 * los operadores validos son +,-,*, /<p>
 * Por ejemplo:<p>
 * <h4>Entrada 1</h4>
 * <pre>
Expresion expresion = new Operacion(
    new Operacion(
        new Operando(3),
        new Operando(4),
        '*'),
    new Operacion(
        new Operando(2),
        new Operando(5),
        '+'),
    '-');
    double resultado;

    try {
        resultado = expresion.evaluar();
        System.out.println(resultado);
    } catch (ExpresionException e) {
        System.out.println(e.getMessage());
    }
 * </pre>
 * <h4>Salida 1</h4>
 * <pre>
5.0
 * </pre>
 * <h4>Entrada 2</h4>
 * <pre>
Expresion expresion = new Operacion(
        new Operacion(
            new Operando(3),
            new Operando(4),
            '%'),
    new Operacion(
        new Operando(2),
        new Operando(5),
        '+'),
    '-');
double resultado;

    try {
        resultado = expresion.evaluar();
        System.out.println(resultado);
    } catch (ExpresionException e) {
        System.out.println(e.getMessage());
    }
 * </pre>
 * <h4>Salida 2</h4>
 * <pre>
Operador desconocido: %
 * </pre>
 */
package Ejercicio_U7_B4B_E3;
