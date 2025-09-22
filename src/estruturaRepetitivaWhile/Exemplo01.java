package estruturaRepetitivaWhile;

import java.util.Scanner;

public class Exemplo01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite um número inteiro: ");
        int numero01 = input.nextInt();
        int soma = 0;

        while (numero01 != 0) {
            soma += numero01;
            numero01 = input.nextInt();
        }
        System.out.println(soma);
        input.close();
    }
}