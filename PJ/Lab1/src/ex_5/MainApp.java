// Program care genereaza aleatoriu un numar intreg cuprins intre 0 si 20
// si verifica daca numarul apartine sirului lui Fibonacci pana la 20.

package ex_5;

import java.util.Random;
import java.util.Arrays;

public class MainApp {
    public static void main(String[] args) {
        // Initializam un array cu sirul lui Fibonacci pana la 20
        int[] fibonacciArray = {0, 1, 1, 2, 3, 5, 8, 13};

        // Generam un numar aleatoriu intre 0 si 20
        Random rand = new Random();
        int num = rand.nextInt(21);
        System.out.println("Numar generat: " + num);

        // Verificam daca numarul generat se afla in sirul lui Fibonacci
        if (Arrays.stream(fibonacciArray).anyMatch(x -> x == num)) {
            System.out.println(num + " face parte din sirul lui Fibonacci.");
        } else {
            System.out.println(num + " nu face parte din sirul lui Fibonacci.");
        }
    }
}