package funcoesParaString;

public class Exemplo01 {
    public static void main(String[] args) {
        String original = "abcde FGHIJ ABC abc DEFG  ";

        String s01 = original.toLowerCase();
        String s02 = original.toUpperCase();
        String s03 = original.trim(); //elimina os espaços nos cantos da String
        String s04 = original.substring(2); //gera uma nova String do caracter 2 em diante (o primeiro caracter é contado como zero)
        String s05 = original.substring(2, 9); //O 9 é o caracter I, significa que ele vai recortar do I para trás
        String s06 = original.replace('a', 'x');
        String s07 = original.replace("abc", "xy");
        int i = original.indexOf("bc"); //posição da primeira ocorrência do "bc"
        int j = original.lastIndexOf("bc");//posição da última ocorrência do "bc"

        System.out.println("Original: -" + original + "-");
        System.out.println("toLowerCase: -" + s01 + "-");
        System.out.println("toUpperCase: -" + s02 + "-");
        System.out.println("trim: -" + s03 + "-");
        System.out.println("substring(2): -" + s04 + "-");
        System.out.println("substring(2, 9): -" + s05 + "-");
        System.out.println("repalce('a', 'x'): -" + s06 + "-");
        System.out.println("repalce('abc', 'xy'): -" + s07 + "-");
        System.out.println("Index of 'bc: " + i);
        System.out.println("Last index of 'bc: " + j);
    }
}