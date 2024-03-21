package classes;

public class conta {
    private int numero;
    private double saldo;
    //construtor para compactar set
    public conta(int numero,double saldo) {
        this.numero = numero;
        this.saldo= saldo;
    }

    public int getNumero() {
        return numero;
    }
    public double getSaldo() {
        return saldo;
    }

    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
        } else {
            System.out.println("Valor de depósito inválido.");
        }
    }
    public void sacar(double valor) {
        if (valor > saldo) {
            System.out.println("Saldo insuficiente");
        } else {
            saldo -= valor;
            System.out.println("Saque de " + valor + " realizado com sucesso");
        }
    }
}
