/**
 * Lista clases para ejercicio:<p>
 * <h3>Ejercicio_U7_B4B_E1:</h3><p>
 * Añadir la capacidad de imprimir el presupuesto de 
 * toda la casa desglosado, que no es más que imprimir 
 * el árbol de nodos en preorden.
 * <pre>
Casa 75000.0
    finca 5000.0
        Cierre finca 4000.0
        jardín 1000.0
    estructura 30000.0
        tejado 10000.0
        alturas 10000.0
        sótano 10000.0
    interior 40000.0
        habitaciones 30000.0
            mobiliario 20000.0
            pintura 10000.0
        electricidad 1000.0
            cables 500.0
            operadores 500.0
        fontanería 9000.0
            tuberías 3000.0
            calefacción 6000.0
                caldera 4000.0
                radiadores 2000.0
 * </pre>
 * Ejemplo teoria
 * <pre>
import java.util.ArrayList;
import java.util.List;

abstract class ParteAbstracta {

  protected String nombre;

  protected ParteAbstracta(String nombre) {
    this.nombre = nombre;
  }

  public String getNombre() {
    return nombre;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  abstract double getPrecio();
}

class ParteCompuesta extends ParteAbstracta {

  private List<ParteAbstracta> partes = new ArrayList<>();

  public ParteCompuesta(String nombre) {
    super(nombre);
  }

  @Override
  public double getPrecio() {
    double precio = 0;
    for (ParteAbstracta parte : partes) {
      precio += parte.getPrecio();
    }
    return precio;
  }

  public void addParte(ParteAbstracta parte) {
    this.partes.add(parte);
  }
}

// las hojas del árbol, no hay composición
class ParteSimple extends ParteAbstracta {

  double precio;

  public ParteSimple(String nombre, double precio) {
    super(nombre);
    this.precio = precio;
  }

  @Override
  double getPrecio() {
    return precio;
  }
}

public class Ejercicio_U7_B4B_E1 {

  public static void main(String[] args) {
    // finca
    ParteSimple cierre = new ParteSimple("Cierre finca", 4000);
    ParteSimple jardin = new ParteSimple("jardín", 1000);
    ParteCompuesta finca = new ParteCompuesta("finca");
    finca.addParte(cierre);
    finca.addParte(jardin);
    // estructura
    ParteSimple tejado = new ParteSimple("tejado", 10000);
    ParteSimple alturas = new ParteSimple("alturas", 10000);
    ParteSimple sotano = new ParteSimple("sótano", 10000);
    ParteCompuesta estructura = new ParteCompuesta("estructura");
    estructura.addParte(tejado);
    estructura.addParte(alturas);
    estructura.addParte(sotano);
    // interior
    // interior-habitaciones
    ParteSimple mobiliario = new ParteSimple("mobiliario", 20000);
    ParteSimple pintura = new ParteSimple("pintura", 10000);
    ParteCompuesta habitaciones = new ParteCompuesta("habitaciones");
    habitaciones.addParte(mobiliario);
    habitaciones.addParte(pintura);
    // interior-electricidad
    ParteSimple cables = new ParteSimple("cables", 500);
    ParteSimple operadores = new ParteSimple("operadores", 500);
    ParteCompuesta electricidad = new ParteCompuesta("electricidad");
    electricidad.addParte(cables);
    electricidad.addParte(operadores);
    // interior-fontanería
    ParteSimple caldera = new ParteSimple("caldera", 4000);
    ParteSimple radiadores = new ParteSimple("radiadores", 2000);
    ParteCompuesta calefacción = new ParteCompuesta("calefacción");
    calefacción.addParte(caldera);
    calefacción.addParte(radiadores);
    ParteSimple tuberias = new ParteSimple("tuberías", 3000);
    ParteCompuesta fontaneria = new ParteCompuesta("fontanería");
    fontaneria.addParte(tuberias);
    fontaneria.addParte(calefacción);
    // todo interior
    ParteCompuesta interior = new ParteCompuesta("interior");
    interior.addParte(habitaciones);
    interior.addParte(electricidad);
    interior.addParte(fontaneria);
    // la casa completa
    ParteCompuesta casa = new ParteCompuesta("Casa");
    casa.addParte(finca);
    casa.addParte(estructura);
    casa.addParte(interior);
    // probar cálculo de costes
    System.out.println("Precio casa " + casa.getPrecio());
    System.out.println("Precio finca " + finca.getPrecio());
  }
}
 * </pre>
 */
package Ejercicio_U7_B4B_E1;
