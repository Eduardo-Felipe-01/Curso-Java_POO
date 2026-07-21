package secao_009._05_Exercicio_de_fixacao._01_Exercicio.entities;

public class Conta {

    private int numeroDaConta;
    private String nome;
    private double depositado;

    public Conta(int numeroDaConta, String nome, double depositado) {
        this.numeroDaConta = numeroDaConta;
        this.nome = nome;
        this.depositado = depositado;
    }

    public Conta(int numeroDaConta, String nome) {
        this.numeroDaConta = numeroDaConta;
        this.nome = nome;
    }

    public int getNumConta() {
        return numeroDaConta;
    }

    public void setNumConta(int numeroDaConta) {
        this.numeroDaConta = numeroDaConta;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getDepositado() {
        return depositado;
    }

    public void deposito(double valor) {
        this.depositado += valor;
    }

    public void saque(double valor) {
        this.depositado -= valor + 5.00;
    }

    public String toString() {
        return "Conta " + numeroDaConta + ", Nome: " + nome + ", Valor depositado: $ " + String.format("%.2f", depositado);
    }
}
