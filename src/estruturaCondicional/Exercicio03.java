package estruturaCondicional;

import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int A, B;

        System.out.println("Digite o primeiro inteiro: ");
        A = input.nextInt();
        System.out.println("Digite o segundo inteiro: ");
        B = input.nextInt();

        if (A % B == 0 || B % A == 0) {
            System.out.println("São múltiplos!");
        } else {
            System.out.println("Não são múltiplos!");
        }

        input.close();
    }
}