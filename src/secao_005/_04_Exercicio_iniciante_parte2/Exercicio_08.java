package secao_005._04_Exercicio_iniciante_parte2;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio_08 {

    public static void main(String[] args) {

        // Calcula um imposto de renda hipotético

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("        RENDA                               IMPOSTO DE RENDA");
        System.out.println("_____________________________________________________________");
        System.out.println("de R$ 0.00 a R$ 2000.00                          Isento");
        System.out.println("acima de R$ 2000.00 até R$ 3000.00                 8%");
        System.out.println("acima de R$ 3000.00 até R$ 4500.00                 18%");
        System.out.println("acima de R$ 4500.00                                28%");

        double renda = sc.nextDouble();
        double ir;

        if (renda > 0 && renda <= 2000) {
            System.out.println("Isento");
        } else if (renda > 2000 && renda < 3000) {
            ir = (renda - 2000) * 0.08;
            System.out.printf("R$ %.2f", ir);
        }else if (renda > 3000 && renda < 4500) {
            ir = 1000 * 0.08 + (renda - 3000) * 0.18;
            System.out.printf("R$ %.2f", ir);
        }else if (renda > 4500) {
            ir = 1000 * 0.08 + 1500 * 0.18 + (renda - 4500) * 0.28;
            System.out.printf("R$ %.2f", ir);
        }

        sc.close();
    }
}
