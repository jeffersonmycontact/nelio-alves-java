package condicionalTernaria;
//Leia dois números e mostre qual é o maior usando o operador ternário.

import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numero01, numero02;

        System.out.print("Digite um número inteiro: \n");
        numero01 = input.nextInt();
        System.out.print("Digite outro número inteiro: \n");
        numero02 = input.nextInt();

        int resultado = (numero01 > numero02) ? numero01 : numero02;

        System.out.println("O maior número é    " + resultado);
    }
}