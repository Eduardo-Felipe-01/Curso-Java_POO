package secao_005._04_Exercicio_iniciante_parte2;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio_05  {

    public static void main(String[] args) {

        // Pede o codigo do produto, quantidade e calcula o valor total a pagar

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("CÓDIGO      ESPECIFICAÇÃO       PREÇO");
        System.out.println("______________________________________");
        System.out.println("  1        Cachorro Quente     R$ 4.00");
        System.out.println("  2           X-Salada         R$ 4.50");
        System.out.println("  3           X-Bacon          R$ 5.00");
        System.out.println("  4        Torrada Simples     R$ 2.00");
        System.out.println("  5         Refrigerante       R$ 1.50");

        double total;
        int codigo = sc.nextInt();
        int quantidade = sc.nextInt();

        if (codigo == 1) {
            total = quantidade * 4.00;
            System.out.printf("Total: R$ %.2f", total);
        } else if (codigo == 2) {
            total = quantidade * 4.50;
            System.out.printf("Total: R$ %.2f", total);
        }else if (codigo == 3) {
            total = quantidade * 5.00;
            System.out.printf("Total: R$ %.2f", total);
        }else if (codigo == 4) {
            total = quantidade * 2.00;
            System.out.printf("Total: R$ %.2f", total);
        }else if (codigo == 5) {
            total = quantidade * 1.50;
            System.out.printf("Total: R$ %.2f", total);
        }else {
            System.out.println("CÓDIGO NÃO RECONHECIDO");
        }

        sc.close();
    }
}
