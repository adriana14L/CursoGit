package contarlapices;

import java.util.Scanner;

public class ContarLapices {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int n, k, cont = 0, lap;
        int lapices[];

        System.out.println("Introduzca el número NN ");
        n = leer.nextInt();
        System.out.println("Introduzca el digito KK ");
        k = leer.nextInt();
        lapices = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Introduce los números de los lapices");
            lap = leer.nextInt();
            lapices[i] = lap;
        }
        for (int i = 0; i < n; i++) {
            if (lapices[i] == k) {
                cont++;

            }

        }
        System.out.println(cont);

    }
    

}
