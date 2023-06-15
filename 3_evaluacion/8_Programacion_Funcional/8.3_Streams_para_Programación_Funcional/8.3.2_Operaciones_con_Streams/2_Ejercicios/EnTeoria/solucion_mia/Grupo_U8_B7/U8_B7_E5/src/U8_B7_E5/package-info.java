/**
 * package con clases para
 * <h3>Ejercicio U8_B7_E5:</h3>
 * De nuevo con la clase Articulo.
 * <p>
 * Queremos sumar el pvp de todos los importes cuyo código 
 * empieza por “B”.<p>
 * Para ello debes utilizar las funciones stream(), filter(),
 * mapToDouble() y sum().<p>
 * Además consultando API intenta explicar porque para este 
 * ejercicio necesito utilizar mapToDouble() en lugar de map()
 * <p>
 * <h4>Códiog Main</h4>
 * <pre>
  public static void main(String[] args) {
    Articulo[] articulos = {
      new Articulo("A1", 10.0),
      new Articulo("A2", 30.5),
      new Articulo("B1", 30.0),
      new Articulo("B2", 100.0),
      new Articulo("c1", 66.5),
    };
    List<Articulo> listaArticulos = Arrays.asList(articulos);
    double total = listaArticulos.stream();
    //acabar esto
    System.out.println(total);
  }
 * </pre>
 */
package U8_B7_E5;
