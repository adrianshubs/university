package ex_1;

import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Lungimea = ");
        int lungimea = scanner.nextInt();

        System.out.print("Latimea = ");
        int latimea = scanner.nextInt();

        // Calcularea perimetrului și a ariei
        int perimetru = 2 * (lungimea + latimea);
        int aria = lungimea * latimea;

        System.out.println("Perimetru = " + perimetru);
        System.out.println("Aria = " + aria);

        scanner.close();
    }
}