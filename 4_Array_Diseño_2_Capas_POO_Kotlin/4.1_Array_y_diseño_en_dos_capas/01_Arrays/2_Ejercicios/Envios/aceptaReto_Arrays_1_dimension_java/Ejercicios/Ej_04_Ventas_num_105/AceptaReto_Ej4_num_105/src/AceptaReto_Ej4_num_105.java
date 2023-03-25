import java.util.Scanner;

public class AceptaReto_Ej4_num_105 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    while (true) {
      double[] valorSemana = new double[7];

      valorSemana[1] = sc.nextDouble();
      if (valorSemana[1] == -1.0) {
        sc.close();
        return;
      }
      int posMayor = 1;
      int posMenor = 1;
      double suma = valorSemana[1];

      for (int i = 2; i < valorSemana.length; i++) {
        valorSemana[i] = sc.nextDouble(); // en mi terminal con coma
        if (valorSemana[i] == -1.0) {
          sc.close();
          return;
        } else {
          suma += valorSemana[i];
          if (valorSemana[i] > valorSemana[posMayor]) {
            posMayor = i;
          }
          if (valorSemana[i] < valorSemana[posMenor]) {
            posMenor = i;
          }
        }
      }
      double media = suma / 6;
      String valorDomingo;
      if (valorSemana[valorSemana.length - 1] == media) {
        System.out.println("EMPATE");
        continue;
      } else if (valorSemana[valorSemana.length - 1] < media) {
        valorDomingo = "NO";
      } else {
        valorDomingo = "SI";
      }
      System.out.println(
        dia(posMayor) + " " + dia(posMenor) + " " + valorDomingo
      );
    }
  }

  private static String dia(int pos) {
    switch (pos) {
      case 0:
        return "LUNES";
      case 1:
        return "MARTES";
      case 2:
        return "MIERCOLES";
      case 3:
        return "JUEVES";
      case 4:
        return "VIERNES";
      case 5:
        return "SABADO";
      case 6:
        return "DOMINGO";
      default:
        return "ERROR";
    }
  }
}
