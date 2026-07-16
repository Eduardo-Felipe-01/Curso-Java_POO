package secao_008._03_Criando_metodo_reaproveitamento_e_delegacao.entities;

public class Triangle {

    public double a;
    public double b;
    public double c;

    public double area() {
        double p = (a + b + c) / 2.0;
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }
}
