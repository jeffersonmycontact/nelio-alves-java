package estruturaCondicional;

import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num1;
        System.out.println("Digite um número inteiro: ");
        num1 = input.nextInt();

        if (num1 % 2 != 0) {
            System.out.println("O número é ímpar!");
        } else {
            System.out.println("O número é par!");
        }

        input.close();
    }
}