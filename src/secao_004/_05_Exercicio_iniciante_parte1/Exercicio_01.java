package secao_004._05_Exercicio_iniciante_parte1;

import java.util.Scanner;

public class Exercicio_01 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int valor1 = sc.nextInt();
        int valor2 = sc.nextInt();

        int soma = valor1 + valor2;

        System.out.println("SOMA = " + soma);

        sc.close();
    }
}
