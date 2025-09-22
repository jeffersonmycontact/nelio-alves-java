package primeirosExercicios;

import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double raio;

        System.out.print("Qual o valor do raio: ");
        raio = input.nextDouble();

        double area = 3.14159 * Math.pow(raio, 2);

        System.out.printf("A = %.4f m²%n", area);

        input.close();
    }
}