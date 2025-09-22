package primeirosExercicios;

import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int numero1, numero2, soma;

        System.out.println("Digite um número: ");
        numero1 = input.nextInt();

        System.out.println("Digete outro número: ");
        numero2 = input.nextInt();

        soma = numero1 + numero2;

        System.out.println("A soma é = " + soma);

        input.close();
    }
}