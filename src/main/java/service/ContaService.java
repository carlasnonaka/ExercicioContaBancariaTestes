package service;

import model.Conta;

public class ContaService {

    private static int numeroConta = 1;
    private static int numeroAgencia = 1;

    public Conta cadastrar(String nome) {
        Conta novaConta = new Conta(numeroConta, numeroAgencia, nome);
        numeroConta++;
        numeroAgencia++;

        return novaConta;
    }

    public void depositar(Conta conta, Double valor) {

        conta.setSaldo(conta.getSaldo() + valor);

    }

    public void sacar(Conta conta, Double valor) {
        if(conta.getSaldo() >= valor) {
            conta.setSaldo(conta.getSaldo() - valor);
        } else {
            System.out.println("Saldo Insuficiente");
        }
    }

    public void transferir (Conta contaTransferindo, Conta contaRecebendo, Double valor) {
        if(contaTransferindo.getSaldo() >= valor) {
            contaTransferindo.setSaldo(contaTransferindo.getSaldo() - valor);
            contaRecebendo.setSaldo(contaRecebendo.getSaldo() + valor);
        }
    }
}
