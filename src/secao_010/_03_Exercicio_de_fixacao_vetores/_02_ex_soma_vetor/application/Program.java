package secao_010._03_Exercicio_de_fixacao_vetores._02_ex_soma_vetor.application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos números você vai digitar? ");
        int contador = sc.nextInt();
        double[] vect = new double[contador];

        for(int i=0; i<contador; i++) {
            System.out.print("Digite um número: ");
            vect[i] = sc.nextDouble();
        }

        double sum = 0;
        System.out.print("VALORES =");
        for(int i=0; i<contador; i++) {
            System.out.printf("  %.1f", vect[i]);
            sum += vect[i];
        }

        System.out.printf("%nSOMA = %.2f%n", sum);

        double avg = sum / contador;
        System.out.printf("MEDIA = %.2f%n", avg);

        sc.close();
    }
}
