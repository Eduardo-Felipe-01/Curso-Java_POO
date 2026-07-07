package secao_007._01_Outros_topicos_basico;

import java.util.Scanner;

public class funcoes_sintaxe_usando {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Usando funções
        System.out.println("Enter three numbers:");

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if (a > b && a > c) {
            System.out.println("Higher = " + a);
        } else if (b > c) {
            System.out.println("Higher = " + b);
        } else {
            System.out.println("Higher = " + c);
        }

        sc.close();
    }
}
