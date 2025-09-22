/*Peça a idade de uma pessoa e classifique assim:
Menor de 18 → "Menor de idade"
Entre 18 e 60 → "Adulto"
Maior ou igual a 60 → "Idoso"*/
package condicionalTernaria;

import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite a idade: ");
        int idade = input.nextInt();

        String classificacao = (idade < 18) ? "Menor de idade" : (idade < 60) ? "Adulto" : "Idoso";

        System.out.println("Classificação: " + classificacao);
        input.close();

    }
}