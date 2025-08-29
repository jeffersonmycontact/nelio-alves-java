package entradaDeDados;

import java.util.Scanner;

public class Exemplo04 {
    public static void main(String[] args) {
        char sexo;
        Scanner input = new Scanner(System.in);

        System.out.println("Qual e o seu sexo: ");
        sexo = input.next().charAt(0);

        System.out.println("Sexo: " + sexo);
    }
}