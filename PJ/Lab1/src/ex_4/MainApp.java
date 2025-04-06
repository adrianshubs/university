// Sa se scrie un program care determina CMMDC a doua numere naturale generate aleatoriu intre 1 si 30.
// Numerele sunt generate cu ajutorul unui obiect de tip Random si metodei nextInt().

package ex_4;

import java.util.Random;

public class MainApp {
    public static void main(String[] args) {

        Random random = new Random();

        // Generam doua numere aleatorii intre 1 si 30
        int num1 = random.nextInt(30) + 1;
        int num2 = random.nextInt(30) + 1;

        System.out.println("Numarul 1: " + num1);
        System.out.println("Numarul 2: " + num2);

        // Calculam CMMDC folosind algoritmul lui Euclid
        int div = cmmdc(num1, num2);

        System.out.println("CMMDC este: " + div);
    }

    // Algoritmul lui Euclid pentru determinarea CMMDC
    public static int cmmdc(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}