package secao_006._02_Exercicio_iniciante_parte3_while;

import java.util.Scanner;

public class Exercicio_02 {

    public void main(String[] args) {

        // Diz em qual quadrande está até ser colocado um valor que não esteja em um quadrante

        Scanner sc = new Scanner(System.in);

        int i = 0;

        while (i != 1) {

            int x = sc.nextInt();
            int y = sc.nextInt();

            if (x > 0 && y > 0) {
                System.out.println("Primeiro");
                System.out.println();
            } else if (x < 0 && y > 0) {
                System.out.println("Segundo");
                System.out.println();
            }else if (x < 0 && y < 0) {
                System.out.println("Terceiro");
                System.out.println();
            }else if (x > 0 && y < 0) {
                System.out.println("Quarto");
                System.out.println();
            }else if (x == 0 && y != 0) {
                i = 1;
            }else if (x != 0 && y == 0) {
                i = 1;
            } else {
                i = 1;
            }
        }

        sc.close();
    }
}
