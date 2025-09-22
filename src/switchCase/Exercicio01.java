package switchCase;

import java.util.Scanner;

// Escreva um programa que receba uma letra e use switch-case para determinar se é uma vogal ou consoante.

public class Exercicio01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char letra;
        String tipo;

        System.out.println("Digite uma letra: ");
        letra = input.nextLine().charAt(0);

        switch (letra) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                tipo = "vogal";
                break;
            default:
                tipo = "consoante";
                break;
        }
        System.out.println("A letra é uma " + tipo);
        input.close();
    }
}