package secao_008._06_Membros_estaticos.versao_03.application;

import secao_008._06_Membros_estaticos.versao_03.util.Calculator;

import java.util.Locale;
import java.util.Scanner;

public class Program {

    // Classe Calculator com membros estático

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter radius: ");
        double radius = sc.nextDouble();

        double c = Calculator.circumference(radius);

        double v = Calculator.volume(radius);

        System.out.printf("Circumference: %.2f%n", c);
        System.out.printf("Volume: %.2f%n", v);
        System.out.printf("PI value: %.2f%n", Calculator.PI);

        sc.close();
    }
}
