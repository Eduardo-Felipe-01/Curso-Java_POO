package secao_005._04_Exercicio_iniciante_parte2;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio_07 {

    public static void main(String[] args) {

        // Digitado duas cordenadas de plano, será dito em qual quadrante está o ponto

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double x = sc.nextDouble();
        double y = sc.nextDouble();

        if (x > 0 && y > 0) {
            System.out.println("Q1");
        } else if (x < 0 && y > 0) {
            System.out.println("Q2");
        }else if (x < 0 && y < 0) {
            System.out.println("Q3");
        }else if (x > 0 && y < 0) {
            System.out.println("Q4");
        }else if (x == 0 && y != 0) {
            System.out.println("Eixo X");
        }else if (x != 0 && y == 0) {
            System.out.println("Eixo Y");
        } else {
            System.out.println("Origem");
        }

        sc.close();
    }
}
