import java.util.Scanner;

public class AceptaReto_Ej3_num_152 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Capturamos primera cantidad valores
        int cantValores = sc.nextInt();

        // Si no es 0, continua
        while (cantValores != 0) {
            // lista valores
            int[] lista = new int[cantValores];
            // contador de veces que sale número
            int[] contadores  = new int[cantValores];

            // Capturamos valores del usuario
            for (int i = 0; i < cantValores; i++) {
                lista[i] = sc.nextInt();
            }

            // Sumamos cuanto sale cada número
            // variable que almacena la primera aparición del número más repetido
            int pos = 0;
            // Recorremos lista números
            for (int i = 0; i < cantValores; i++) {
                // Recorremos lista para contar en la primera posición del número visto
                for (int j = 0; j < cantValores; j++) {
                    // Si número coincide aumentamos contador
                    if(lista[i] == lista[j]){
                        contadores[j]++;
                        // Si es mayor que el mayor contador, lo guardamos
                        if(contadores[pos] < contadores[j]){
                            pos = j;
                        }
                        break; // evita guardar en todas posiciones
                    }
                }
            }
            // Mostramos el número mas repetido
            System.out.println(lista[pos]);

            // Pedimos siguiente valor
            cantValores = sc.nextInt();
        }
        sc.close();
    }
}
