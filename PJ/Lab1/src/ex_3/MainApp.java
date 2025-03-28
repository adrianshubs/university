package ex_3;

import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduceti un numar natural: ");
        int n = scanner.nextInt();

        // Verificarea cazurilor speciale pentru 0 și 1
        if (n == 0) {
            System.out.println("Numarul 0 are o infinitate de divizori");
        } else if (n == 1) {
            System.out.println("Numarul 1 are un divizor, nu este nici prim, nici compus");
        } else {
            // Afișarea divizorilor numărului
            System.out.println("Divizorii lui " + n + " sunt: ");
            int counter = 0;

            for (int i = 1; i <= n; i++) {
                if (n % i == 0) {
                    System.out.println(i);
                    counter++;
                }
            }

            // Verificarea dacă numărul este prim sau compus
            if (counter == 2) {
                System.out.println("Numarul " + n + " este numar prim");
            } else {
                System.out.println("Numarul " + n + " este numar compus");
            }
        }

        scanner.close();
    }
}