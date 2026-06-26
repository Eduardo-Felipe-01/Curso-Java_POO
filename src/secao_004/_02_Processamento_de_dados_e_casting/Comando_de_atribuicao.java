package secao_004._02_Processamento_de_dados_e_casting;

public class Comando_de_atribuicao {

    public static void main(String[] args) {

        // Exemplo 1
        int x1, y1;

        x1 = 5;
        y1 = 2 * x1; // Atribução é quando o valor de uma varivel vem atravez de uma formula ou equação

        System.out.println(x1);
        System.out.println(y1);
        System.out.println();


        // Exemplo 2
        int x2;
        double y2;

        x2 = 5;
        y2 = 2 * x2; // Atribuição

        System.out.println(x2);
        System.out.println(y2);
        System.out.println();


        // Exemplo 3
        // Boas prática quando se usa douuble, por o "." para dizer que o número é flutuante
        double b, B, h, area;

        b = 6.0;
        B = 8.0;
        h = 5.0;

        area = (b + B) / 2.0 * h; // Atribuição

        System.out.println(area);
        System.out.println();
        /* Boas prática quando se usa float, por o "f" para dizer que o número é flutuante
        float b, B, h, area;
        b = 6f;
        B = 8f;
        h = 5f;
        area= (b + B) / 2f * h;
        System.out.println(area);
         */


        // Exemplo 4
        int a1, b1;
        double resultado1;

        a1 = 5;
        b1 =  2;

        resultado1 = a1 / b1;

        System.out.println(resultado1);

        // Para resolver o problema acima usar o Casting
        int a2, b2;
        double resultado2;

        a2 = 5;
        b2 =  2;

        resultado2 = (double) a2 / b2;

        System.out.println(resultado2);
        System.out.println();


        // Exemplo 5
        double a3;
        int b3;

        a3 = 5.0;
        b3 = (int) a3;
        // b3 = (int) a3; Caso ponha assim não irá funcionar

        System.out.println(b3);
        System.out.println();
    }
}
