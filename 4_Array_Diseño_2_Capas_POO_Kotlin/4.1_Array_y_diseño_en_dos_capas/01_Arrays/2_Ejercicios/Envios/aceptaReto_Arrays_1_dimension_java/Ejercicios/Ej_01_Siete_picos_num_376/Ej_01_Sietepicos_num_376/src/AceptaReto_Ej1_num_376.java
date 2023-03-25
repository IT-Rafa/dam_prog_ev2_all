import java.util.Scanner;

public class AceptaReto_Ej1_num_376 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Capturamos cant picos primera vez
        int numPicos = sc.nextInt();

        while (numPicos > 0) {
            // variable tamaños picos
            int[] tamPicos = new int[numPicos];

            // Capturamos tamaños picos
            for (int i = 0; i < numPicos; i++) {
                tamPicos[i] = sc.nextInt();
            }

            // contador picos
            int cont = 0;

            // comprobamos 1º pico
            if (tamPicos[0] > tamPicos[1] &&
                    tamPicos[0] > tamPicos[tamPicos.length - 1]) {
                cont++;
            }
            // comprobamos picos del medio
            for (int i = 1; i < numPicos - 1; i++) {
                if (tamPicos[i] > tamPicos[i - 1] &&
                        tamPicos[i] > tamPicos[i + 1]) {
                    cont++;
                }
            }
            // comprobamos último pico
            if (tamPicos[tamPicos.length - 1] > tamPicos[tamPicos.length - 2] &&
                    tamPicos[tamPicos.length - 1] > tamPicos[0]) {
                cont++;
            }
            // mostramos cant picos
            System.out.println(cont);

            // Pedimos siguiente cant picos
            numPicos = sc.nextInt();
        }

        sc.close();
    }
}

