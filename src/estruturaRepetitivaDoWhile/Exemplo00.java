package estruturaRepetitivaDoWhile;

import java.util.Scanner;

public class Exemplo00 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double fahrenheit, celsius;
        char repetir = 's';

        while (repetir != 'n') {
            System.out.print("Temperatura em graus Celsius: ");
            celsius = input.nextDouble();
            fahrenheit = (9.0 * celsius / 5) + 32;
            System.out.printf("Equivalente em fahrenheit: %.1f%n", fahrenheit);
            System.out.print("Deseja repetir (s/n)? ");
            repetir = input.next().charAt(0);
        }

        input.close();
    }
}