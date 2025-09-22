package condicionalTernaria;

public class Exemplo01 {
    public static void main(String[] args) {
        double valor = 34.5;
        double desconto = (valor < 20.0) ? valor * 0.1 : valor * 0.05;

        System.out.printf("R$ %.2f", desconto);
    }
}