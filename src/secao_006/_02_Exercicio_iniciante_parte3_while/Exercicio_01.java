package secao_006._02_Exercicio_iniciante_parte3_while;

import java.util.Scanner;

public class Exercicio_01 {

    public static void main(String[] args) {

        // Verifica senha senha está correta

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a nova senha: ");
        int nsenha = sc.nextInt();
        int senha = 0;

        while (nsenha != senha) {
            System.out.print("Digite sua senha: ");
            senha = sc.nextInt();

            if (nsenha != senha) {
                System.out.println("Senha Invalida");
            } else {
                System.out.println("Acesso Permitido");
            }
        }

        sc.close();
    }
}
