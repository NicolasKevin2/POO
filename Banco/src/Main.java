// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
import classes.cliente;
import classes.agencia;
import classes.conta;
import java.util.Scanner;
import classes.investimentos;

public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        // recebe todos dados da classe cliente
        cliente cliente = new cliente("João", 30, 'M', "Rua ABC, 123", "São Paulo");
        System.out.println("Nome: " + cliente.getNome());
        System.out.println("Idade: " + cliente.getIdade());
        System.out.println("Sexo: " + cliente.getSexo());
        System.out.println("Endereço: " + cliente.getEndereco());
        System.out.println("Cidade: " + cliente.getCidade());

        // recebe todos dados da classe agencia
        agencia a = new agencia(123, "Agência 1", "Rua 1, 123", "Gerente 1");
        System.out.println("codigo " + a.getCodigo());
        System.out.println("nome_ag " + a.getNome_ag());
        System.out.println("endereco " + a.getEndereco());
        System.out.println("nome_gerente " + a.getNome_gerente());

        //opções sacar depositar e imprimir dados de conta
        conta c = new conta(456, 2500);
        System.out.println("numero " +c.getNumero());
        Scanner scanner = new Scanner(System.in);
        System.out.println("saldo " +c.getSaldo());

        System.out.println("Digite o valor do depósito:");
        double valorDeposito = scn.nextDouble();
        c.depositar(valorDeposito);
        System.out.println("Saldo após depósito: " + c.getSaldo());
        System.out.println("Digite o valor do saque:");
        double valorSaque = scn.nextDouble();
        c.sacar(valorSaque);
        System.out.println("saldo após saque: " + c.getSaldo());


    }
}