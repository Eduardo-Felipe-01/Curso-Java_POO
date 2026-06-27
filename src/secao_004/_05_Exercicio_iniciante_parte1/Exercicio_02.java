package secao_004._05_Exercicio_iniciante_parte1;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio_02 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double raio = sc.nextDouble();
        double pi = 3.14159;

        double area = pi * Math.pow(raio, 2.0);

        System.out.printf("A = %.4f%n", area);

        sc.close();
    }
}
