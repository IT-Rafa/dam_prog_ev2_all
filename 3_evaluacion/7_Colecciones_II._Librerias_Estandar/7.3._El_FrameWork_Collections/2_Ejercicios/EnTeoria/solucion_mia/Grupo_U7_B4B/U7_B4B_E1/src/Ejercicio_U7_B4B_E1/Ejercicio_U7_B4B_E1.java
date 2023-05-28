package Ejercicio_U7_B4B_E1;

/**
 * Clase que contiene el main del Ejercicio_U7_B4B_E1
 */
public class Ejercicio_U7_B4B_E1 {

  /**
   * Inicio
   * <ul>
   * <li>Añado la clase, Cambio nombres clase y añado javadoc</li>
   * <li>Separamos las clases en archivos</li>
   * <li>Añadir método imprimirDesglosado</li>
   * </ul>
   */
  public static void main(String[] args) {
    // finca
    NodoHoja cierre = new NodoHoja("Cierre finca", 4000);
    NodoHoja jardin = new NodoHoja("jardín", 1000);
    NodoAlmacen finca = new NodoAlmacen("finca");
    finca.addParte(cierre);
    finca.addParte(jardin);

    // estructura
    NodoHoja tejado = new NodoHoja("tejado", 10000);
    NodoHoja alturas = new NodoHoja("alturas", 10000);
    NodoHoja sotano = new NodoHoja("sótano", 10000);
    NodoAlmacen estructura = new NodoAlmacen("estructura");
    estructura.addParte(tejado);
    estructura.addParte(alturas);
    estructura.addParte(sotano);

    // interior
    // interior-habitaciones
    NodoHoja mobiliario = new NodoHoja("mobiliario", 20000);
    NodoHoja pintura = new NodoHoja("pintura", 10000);
    NodoAlmacen habitaciones = new NodoAlmacen("habitaciones");
    habitaciones.addParte(mobiliario);
    habitaciones.addParte(pintura);

    // interior-electricidad
    NodoHoja cables = new NodoHoja("cables", 500);
    NodoHoja operadores = new NodoHoja("operadores", 500);
    NodoAlmacen electricidad = new NodoAlmacen("electricidad");
    electricidad.addParte(cables);
    electricidad.addParte(operadores);

    // interior-fontanería
    NodoHoja caldera = new NodoHoja("caldera", 4000);
    NodoHoja radiadores = new NodoHoja("radiadores", 2000);
    NodoAlmacen calefacción = new NodoAlmacen("calefacción");
    calefacción.addParte(caldera);
    calefacción.addParte(radiadores);
    NodoHoja tuberias = new NodoHoja("tuberías", 3000);
    NodoAlmacen fontaneria = new NodoAlmacen("fontanería");
    fontaneria.addParte(tuberias);
    fontaneria.addParte(calefacción);

    // todo interior
    NodoAlmacen interior = new NodoAlmacen("interior");
    interior.addParte(habitaciones);
    interior.addParte(electricidad);
    interior.addParte(fontaneria);

    // la casa completa
    NodoAlmacen casa = new NodoAlmacen("Casa");
    casa.addParte(finca);
    casa.addParte(estructura);
    casa.addParte(interior);

    // probar cálculo de costes
    System.out.println("Precio casa " + casa.getPrecio());
    System.out.println("Precio finca " + finca.getPrecio());

    // probar precio desglosado
    // en NodoHoja
    System.out.println(
      "Precio Desglosado: \n" + tuberias.getPrecioDesglosado()
    );
    // en NodoAlmacen parcial
    System.out.println(
      "Precio Desglosado: \n" + electricidad.getPrecioDesglosado()
    );

    // en NodoAlmacen completo
    System.out.print("Precio Desglosado: \n" + casa.getPrecioDesglosado());
  }
}
