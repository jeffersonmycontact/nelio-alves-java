package entradaDeDados;

import java.util.Scanner;

public class Exemplo05 {
    public static void main(String[] args) {
        String nome;
        int idade;
        double salario;
        Scanner input = new Scanner(System.in);

        System.out.println("Qual o seu nome: ");
        nome = input.next();
        System.out.println("Qual a sua idade: ");
        idade = input.nextInt();
        System.out.println("Qual o seu salário: R$");
        salario = input.nextDouble();

        System.out.println("O meu nome é " + nome + ", eu tenho " + idade + " anos e recebo R$" + salario);
    }
}
