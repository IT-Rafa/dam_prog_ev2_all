import java.util.Random;

/**
 * Ejercicio U4_B4A_E6: <p>
 * Como caso concreto del cuadro anterior, se pide que simules un conteo 
 * con 3 dimensiones: hora, día y mes. <p>
 * Cada mes tendrá los días que naturalmente le corresponda (31, 30 o 28), 
 * para simplificar, despreciamos años bisiestos de forma que febrero 
 * siempre tiene 28 días (en el dibujo de abajo debería poner 27 en lugar 
 * de 28 para febrero).<p>
 * Llenamos aleatoriamente el conteo con números de coches entre 0 y 999.
 * Podemos hacer esto por ejemplo con el siguiente código:
 * <pre>
import java.util.Random;
public class Unidad4 {
    static int calcularDiasMes(int month) {
        int numDays = switch (month) {
            case 1,3,5,7,8,10,12->31;
            case 4,6,9,11->30;
            case 2->28;
            default->99;//mes erróneo
        };
        return numDays;
    }
    
    
    public static void main(String[] args) {
        //creamos array [mes][dia][hora]
        int[][][] conteo = new int[12][][];
        for (int mes = 0; mes < conteo.length; mes++) {
            //cada mes tiene un número de dias diferentes
            //se van creando las dimensiones dia y hora mes a mes
            conteo[mes] = new int[calcularDiasMes(mes + 1)][24];
        }
        //inicializamos el array. suponemos conteo entre 0 y 999
        Random r = new Random();
        for (int mes = 0; mes < conteo.length; mes++) {
            for (int dia = 0; dia < conteo[mes].length; dia++) {
                for (int hora = 0; hora < conteo[mes][dia].length; hora++) {
                    conteo[mes][dia][hora] = r.nextInt(1000);
                }
            }
        }
        imprimirConteos(conteo);
    }
}
 * </pre>
 * Se pide completar el código escribiendo el método imprimirConteos()
 */

public class Ejercicio_U4_B4A_E06 {

  static int calcularDiasMes(int month) {
    int numDays =
      switch (month) {
        case 1, 3, 5, 7, 8, 10, 12 -> 31;
        case 4, 6, 9, 11 -> 30;
        case 2 -> 28;
        default -> 99; //mes erróneo
      };
    return numDays;
  }

  public static void main(String[] args) {
    //creamos array [mes][dia][hora]
    int[][][] conteo = new int[12][][];
    for (int mes = 0; mes < conteo.length; mes++) {
      //cada mes tiene un número de dias diferentes
      //se van creando las dimensiones dia y hora mes a mes
      conteo[mes] = new int[calcularDiasMes(mes + 1)][24];
    }
    //inicializamos el array. suponemos conteo entre 0 y 999
    Random r = new Random();
    for (int mes = 0; mes < conteo.length; mes++) {
      for (int dia = 0; dia < conteo[mes].length; dia++) {
        for (int hora = 0; hora < conteo[mes][dia].length; hora++) {
          conteo[mes][dia][hora] = r.nextInt(1000);
        }
      }
    }
    imprimirConteos(conteo);
  }

  private static void imprimirConteos(int[][][] conteo) {
    for (int mes = 0; mes < conteo.length; mes++) {
      System.out.println("Mes" + (mes + 1));
      System.out.println("-----");
      for (int dia = 0; dia < conteo[mes].length; dia++) {
        System.out.print("\tdía" + (dia + 1) + ":\t");
        for (int hora = 0; hora < conteo[mes][dia].length; hora++) {
          System.out.print("\t" + conteo[mes][dia][hora]);
        }
        System.out.println();
      }
    }
  }
}
