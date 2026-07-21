package secao_009._05_Exercicio_de_fixacao._01_Exercicio.application;

import secao_009._05_Exercicio_de_fixacao._01_Exercicio.entities.Conta;

import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Conta c;

        System.out.print("Digte o número da conta: ");
        int numeroDaConta = sc.nextInt();
        System.out.print("Digte seu nome: ");
        sc.nextLine();
        String nome = sc.nextLine();
        System.out.print("Você tem um deposito inicial (s/n)? ");
        String resposta = sc.nextLine();

        if (resposta.equalsIgnoreCase("s")) {
            System.out.print("Digte o deposito inical: ");
            double depositado = sc.nextDouble();

             c = new Conta(numeroDaConta, nome, depositado);

        } else {

            c = new Conta(numeroDaConta, nome);
        }

        System.out.println();
        System.out.println(c);

        System.out.print("Digite o valor do deposito: ");
        double valor = sc.nextDouble();
        c.deposito(valor);
        System.out.println(c);

        System.out.println();
        System.out.print("Digite o valor de saque: ");
        valor = sc.nextDouble();
        c.saque(valor);
        System.out.println(c);

        sc.close();
    }
}
