package secao_008._07_Exercicio_de_fixacao_metodo_estatico.util;

public class CurrencyConverter {

    public static double IOF = 0.06;

    public static double dollarToReal(double amount, double dollarPrice) {
        return amount * dollarPrice * (1.0 + IOF);
    }
}
