import java.util.Arrays;
import java.util.Scanner;

public class AceptaReto_Ej2_num_161 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Pedimos cantidad valores
        int cantValores = sc.nextInt();

        // Seguimos si cantidad valores no es 0
        while (cantValores != 0) {
            // lista valores en int
            int[] listaValores = new int[cantValores];

            // Pedimos lista valores
            for (int i = 0; i < cantValores; i++) {
                listaValores[i] = sc.nextInt();
            }

            // Capturamos mediana
            // Ordenamos valores
            Arrays.sort(listaValores);
            double mediana;
            int posMediana = listaValores.length / 2;
            if (listaValores.length % 2 == 0) {
                mediana = (listaValores[posMediana-1] + listaValores[posMediana]) / 2.0;
            } else {
                mediana = listaValores[posMediana];
            }

            System.out.println((int)(mediana * 2));

            cantValores = sc.nextInt();
        }
        sc.close();
    }
}

