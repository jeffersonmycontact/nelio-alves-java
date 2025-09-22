package condicionalTernaria;

//Peça ao usuário para digitar um número e use o operador ternário para verificar se ele é par ou ímpar.

import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numero;

        System.out.println("Digite um número inteiro: ");
        numero = input.nextInt();

        String resultado = (numero % 2 == 0) ? "par" : "ímpar";
        System.out.println("O número é " + resultado);

        input.close();
    }
}