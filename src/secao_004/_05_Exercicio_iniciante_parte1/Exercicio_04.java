package secao_004._05_Exercicio_iniciante_parte1;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio_04 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        // Calcula as horas trabalhadas de um funcionário e mostro quanto deve receber

        int nf = sc.nextInt(); // número do funcionário
        int ht = sc.nextInt(); // horas trabalhadas
        double vh = sc.nextDouble(); //valor por hora

        double salario = ht * vh;

        System.out.printf("Número = %d%nSalário = U$ %.2f", nf, salario);

        sc.close();
    }
}
