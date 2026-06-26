package secao_004._01_Saida_de_dados;

import java.util.Locale;

public class Tipos_de_variavel {

    public static void main(String[] args){

        // Variável tipo int
        int y = 32;

        System.out.println(y);


        // Variável tipo double
        double x = 10.35684;
        System.out.println(x);
        // Formatar casas decimais
        System.out.printf("%.2f%n", x); // %n Quebra a linha
        System.out.printf("%.4f%n", x);
        Locale.setDefault(Locale.US);
        System.out.printf("%.4f%n", x);


        // Concatenar vários elementos em um mesmo comando de escrita
        // Usando print e println
        System.out.println("RESULTADO = " + x + " METROS");
        // Usando printf
        System.out.printf("RESULTADO = %.2f mestros%n", x);
        // Usando printf com variáveis diferentes
        String nome = "Maria";
        int idade = 31;
        double renda = 4000.0;
        System.out.printf("%s tem %d anos e ganha R$ %.2f reais%n", nome, idade, renda);

    }
}
