package secao_006._02_Exercicio_iniciante_parte3_while;

import java.util.Scanner;

public class Exercicio_03 {

    public static void main(String[] args) {

        // Soma oque for selecionado até ser digitado o código de saída

        Scanner sc = new Scanner(System.in);

        int a = 0;
        int g = 0;
        int d = 0;
        int c = 0;

        while (c != 4) {
            c = sc.nextInt();

            switch (c) {
                case 1:
                    a += 1;
                    break;
                case 2:
                    g += 1;
                    break;
                case 3:
                    d += 1;
                    break;
                case 4:
                    c = 4;
                    break;
                default:
                    c = 0;
                    break;
            }
        }
        System.out.printf("MUITO OBRIGADO%nAlcool: %d%nGasolina: %d%nDisel: %d", a, g, d);

        sc.close();
    }
}
