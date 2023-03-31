/**
 * Ejercicio U3_B12_E1:<p>
 * El siguiente código crea una baraja utilizando el String palo.
 * <pre>
class Carta {

  private String palo;
  private int numero;

  public Carta(String palo, int numero) {
    this.palo = palo;
    this.numero = numero;
  }

  public String toString() {
    return "(" + palo + ", " + numero + ')';
  }
}

class Baraja {

  //baraja española de 40 cartas. No hay 8 y 9.
  final int NUM_CARTAS = 40;
  Carta[] cartas = new Carta[NUM_CARTAS];

  public Baraja() {
    //crea una baraja ordenada por palos y números
    String[] palos = { "Bastos", "Copas", "Oros", "Espadas" };
    int ultimaCarta = 0;
    for (int i = 0; i < 4; i++) {
      for (int j = 0; j < 12; j++) {
        if (j == 7 || j == 8) {
          continue;
        }
        cartas[ultimaCarta] = new Carta(palos[i], j + 1);
        ultimaCarta++;
      }
    }
  }
}

public class Ejercicio_U3_B12_E1 {

  public static void main(String[] args) {
    Baraja baraja = new Baraja();
    for (Carta c : baraja.cartas) {
      System.out.println(c);
    }
  }
}

 * </pre>
 * Reforma el código para que haga lo mismo pero utilizando una enumeración Palo.
 */
public class Ejercicio_U3_B12_E1 {

  public static void main(String[] args) {
    Baraja baraja = new Baraja();
    for (Carta c : baraja.cartas) {
      System.out.println(c);
    }
  }
}

enum Palo {
  BASTOS,
  COPAS,
  OROS,
  ESPADAS,
}

class Carta {

  private Palo palo;
  private int numero;

  public Carta(Palo palo, int numero) {
    this.palo = palo;
    this.numero = numero;
  }

  public String toString() {
    return "(" + palo + ", " + numero + ')';
  }
}

class Baraja {

  //baraja española de 40 cartas. No hay 8 y 9.
  final int NUM_CARTAS = 40;
  Carta[] cartas = new Carta[NUM_CARTAS];

  public Baraja() {
    //crea una baraja ordenada por palos y números

    int ultimaCarta = 0;
    for (Palo p:Palo.values()) {
      for (int j = 0; j < 12; j++) {
        if (j == 7 || j == 8) {
          continue;
        }
        cartas[ultimaCarta] = new Carta(p, j + 1);
        ultimaCarta++;
      }
    }
  }
}
