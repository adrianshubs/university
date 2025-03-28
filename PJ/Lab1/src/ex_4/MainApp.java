package ex_4;

import java.util.Random;

public class MainApp {
    public static void main(String[] args) {

        Random random = new Random();

        // Generăm două numere aleatorii între 1 și 30
        int num1 = random.nextInt(29) + 1;
        int num2 = random.nextInt(29) + 1;

        System.out.println("Numarul 1: " + num1);
        System.out.println("Numarul 2: " + num2);

        // Calculăm CMMDC folosind algoritmul lui Euclid
        int div = cmmdc(num1, num2);

        System.out.println("CMMDC este: " + div);
    }

    // Algoritmul lui Euclid
    public static int cmmdc(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}