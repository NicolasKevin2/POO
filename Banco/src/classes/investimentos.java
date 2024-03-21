package classes;

public class investimentos {

    private int agencia;
    private String cliente;
    private String conta;
    private String gerente;
    private String saldo;
    private String investimento;
    public void imposto_investimento() {
        double imposto = saldo * 0.05; // 5% de imposto
        Claro, aqui estão os métodos `imposto_investimento()`, `verifica_saldo()` e `imprimir()` que você solicitou. Estes métodos podem ser adicionados a uma classe existente ou usados para criar uma nova classe.

```java
        saldo -= imposto;
    }

    public double verifica_saldo() {
        return saldo;
    }

    public void imprimir() {
        System.out.println("Agência: " + agencia);
        public void imposto_investimento() {
            double imposto = saldo * 0.05; // 5% de imposto
            saldo -= imposto;
        }

        System.out.println("Cliente: " + cliente);
        System.out.println("Conta: " + conta);
        public double verifica_saldo() {
            return saldo;
        }

        System.out.println("Gerente: " + gerente);
        public void imprimir() {
            System.out.println("Saldo: " + saldo);
            System.out.println("Saldo: " + saldo);
        }
    public int getAgencia() {
        return agencia;
    }

    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public String getConta() {
        return conta;
    }

    public void setConta(String conta) {
        this.conta = conta;
    }

    public String getGerente() {
        return gerente;
    }

    public void setGerente(String gerente) {
        this.gerente = gerente;
    }

    public String getSaldo() {
        return saldo;
    }

    public void setSaldo(String saldo) {
        this.saldo = saldo;
    }

    public String getInvestimento() {
        return investimento;
    }

    public void setInvestimento(String investimento) {
        this.investimento = investimento;
    }
}
