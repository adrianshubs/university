/*
 Se cere sa se scrie un program Java care sa calculeze si sa afiseze perimetrul si aria unui
 dreptunghi. Valorile pentru lungime si latime se citesc de la tastatura.
*/

package ex_1;

import java.util.Scanner; // Importam clasa Scanner pentru citirea de la tastatura

public class MainApp {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in); // Cream un obiect Scanner pentru a citi de la tastatura

        // Solicitam utilizatorului sa introduca lungimea si latimea dreptunghiului
        System.out.print("Lungimea = ");
        int lungimea = scanner.nextInt();

        System.out.print("Latimea = ");
        int latimea = scanner.nextInt();

        // Calculam perimetrul si aria dreptunghiului
        int perimetru = 2 * (lungimea + latimea);
        int aria = lungimea * latimea;

        // Afisam rezultatele
        System.out.println("Perimetru = " + perimetru);
        System.out.println("Aria = " + aria);

        scanner.close(); // Inchidem scannerul pentru a evita scurgerile de resurse
    }
}
