package secao_004._03_Entrada_de_dados;

import java.util.Locale;
import java.util.Scanner;

public class Tipos_de_variavel {

    public static void main(String[] args) {

        // Usar comentarios para testar o código!

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        // Variável tipo String
        String x;
        x = sc.next();
        System.out.println("Você digitou: " + x);
        System.out.println();


        // Variável tipo int
        int x1;
        x1 = sc.nextInt();
        System.out.println("Você digitou: " + x1);
        System.out.println();


        // Variável tipo double
        double x3;
        x3 = sc.nextDouble();
        System.out.printf("Digitado: %.2f%n", x3);
        System.out.println();

        // Variável tipo char
        char x4;
        x4 = sc.next().charAt(0);

        System.out.println("Digitado: " + x4);



        // Varios dados na mesma linha
        String x5;
        int y5;
        double z5;

        x5 = sc.next();
        y5 = sc.nextInt();
        z5 = sc.nextDouble();

        System.out.println("Dados digitados: ");
        System.out.println(x5);
        System.out.println(y5);
        System.out.println(z5);


        // Ler até a quebrar de linha
        String s1, s2, s3;

        s1 = sc.nextLine();
        s2 = sc.nextLine();
        s3 = sc.nextLine();

        System.out.println("DADOS DIGITADOS:");
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);


        // Quebra de linha pendente
        int t0;
        String t1, t2, t3;

        t0 = sc.nextInt();
        sc.nextLine(); // Para resolver a quebra de linha pendente
        t1 = sc.nextLine();
        t2 = sc.nextLine();
        t3 = sc.nextLine();

        System.out.println("DADOS DIGITADOS:");
        System.out.println(t0);
        System.out.println(t1);
        System.out.println(t2);
        System.out.println(t3);

        sc.close();
    }
}