package entradaDeDados;

import java.util.Scanner;

public class Exemplo07 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String s1, s2, s3;
        s1 = input.nextLine();
        s2 = input.nextLine();
        s3 = input.nextLine();

        System.out.println("Dados digitados: ");
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);

        input.close();
        ;
    }
}