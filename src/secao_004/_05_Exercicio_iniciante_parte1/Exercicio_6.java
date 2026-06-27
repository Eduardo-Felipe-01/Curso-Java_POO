package secao_004._05_Exercicio_iniciante_parte1;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio_6 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();

        double tri = a * c / 2;
        double cir = 3.14159 * Math.pow(c, 2);
        double tra = (a + b) * c / 2;
        double qua = b * b;
        double ret = a * b;

        System.out.printf("TRIANGULO: %.3f%nCIRCULO: %.3f%nTRAPEZIO: %.3f%nQUADRADO: %.3f%nRETANGULO: %.3f", tri, cir, tra, qua, ret);

        sc.close();
    }
}
