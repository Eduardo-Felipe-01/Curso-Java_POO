package secao_006.Estrutura_repetitiva_para_for;

import java.util.Scanner;

public class Sintaxa_for {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Sintaxe Base
        System.out.println("Sintaxe Base");

        int N = sc.nextInt();
        int soma = 0;

        for (int i = 0; i < N; i++) {
            int x = sc.nextInt();
            soma = soma + x;
        }
        System.out.println(soma);
        System.out.println();


        // Contagem Progressiva
        System.out.println("Contagem Progressiva");

        for (int i = 0; i < 5; i++) {
            System.out.println("Valor de i: " + i);
        }
        System.out.println();


        // Contagem Regressiva
        System.out.println("Contagem Regressiva");

        for (int i = 4; i >= 0; i--) {
            System.out.println("Valor de i: " + i);
        }
        System.out.println();

        sc.close();
    }
}
