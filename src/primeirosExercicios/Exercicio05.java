package primeirosExercicios;

import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {
        int produtoCodigo1, produtoQuantidade1, produtoCodigo2, produtoQuantidade2;
        double produtoValorUnidade1, produtoValorUnidade2, valorTotal;

        Scanner input = new Scanner(System.in);
        System.out.println("Código: ");
        produtoCodigo1 = input.nextInt();
        System.out.println("Quantidade:");
        produtoQuantidade1 = input.nextInt();
        System.out.println("Valor: R$");
        produtoValorUnidade1 = input.nextDouble();

        System.out.println("Código: ");
        produtoCodigo2 = input.nextInt();
        System.out.println("Quantidade:");
        produtoQuantidade2 = input.nextInt();
        System.out.println("Valor: R$");
        produtoValorUnidade2 = input.nextDouble();

        valorTotal = produtoQuantidade1 * produtoValorUnidade1 + produtoQuantidade2 * produtoValorUnidade2;

        System.out.printf("VALOR A PAGAR: R$%.2f%n", valorTotal);

        input.close();
    }
}