package entradaDeDados;

import java.util.Scanner;

public class Exemplo06 {
    public static void main(String[] args) {
        String x;
        int y;
        double z;

        Scanner sc= new Scanner(System.in);
        x = sc.next();
        y = sc.nextInt();
        z = sc.nextDouble();

        System.out.println("Dados digitados: "); //Digitar na mesma linha com espaço entre os dados
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
    }
}