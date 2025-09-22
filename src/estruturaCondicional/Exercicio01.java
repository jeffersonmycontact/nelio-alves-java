package estruturaCondicional;

import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num1;
        System.out.println("Digite um número inteiro: ");
        num1 = input.nextInt();

        if (num1 >= 0) {
            System.out.println("Positivo!");
        } else {
            System.out.println("Negativo!");
        }

        input.close();
    }
}