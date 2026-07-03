package secao_005._07_Expressao_condicional_ternaria;

public class Sintaxe_condicional_ternaria {

    public static void main(String[] args) {

        double preco = 34.5;

        // Condicional if-else
        double desconto;
        if (preco < 20.0) {
            desconto = preco * 0.1;
        } else {
            desconto = preco * 0.05;
        }
        System.out.println(desconto);

        // Condicional ternária
        double desconto1 = (preco < 20.0) ? preco * 0.1 : preco* 0.05;
        System.out.println(desconto1);

    }
}
