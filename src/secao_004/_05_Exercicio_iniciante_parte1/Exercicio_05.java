package secao_004._05_Exercicio_iniciante_parte1;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio_05 {

    public static void main(String[] args){

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int cp1 = sc.nextInt();
        int np1 = sc.nextInt();
        double vp1 = sc.nextDouble();

        int cp2 = sc.nextInt();
        int np2 = sc.nextInt();
        double vp2 = sc.nextDouble();

        double vp = np1 * vp1 + np2 * vp2;

        System.out.printf("VALOR A PAGAR: R$ %.2f", vp);

        sc.close();
    }
}
