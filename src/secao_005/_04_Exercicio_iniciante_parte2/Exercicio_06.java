package secao_005._04_Exercicio_iniciante_parte2;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio_06 {

    public static void main(String[] args) {

        // De acordo com o valor será mostrado o intervalo que o número está

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double valor = sc.nextDouble();

        if (valor >= 0 && valor <= 25) {
            System.out.println("Intervalo [0,25]");
        } else if (valor > 25 && valor <= 50) {
            System.out.println("Intervalo [25,50]");
        }else if (valor > 50 && valor <= 75) {
            System.out.println("Intervalo [50,75]");
        }else if (valor > 75 && valor <= 100) {
            System.out.println("Intervalo [75,100]");
        } else {
            System.out.println("Fora do Intervalo");
        }

        sc.close();
    }
}
