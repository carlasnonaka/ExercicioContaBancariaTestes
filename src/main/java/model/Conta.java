package model;

public class Conta {

    private Integer agencia;

    private Integer numero;

    private Double saldo;

    private String nomeDoCliente;

    public Conta(Integer agencia, Integer numero, String nomeDoCliente) {
        this.agencia = agencia;
        this.numero = numero;
        this.nomeDoCliente = nomeDoCliente;
        this.saldo = 0.0;
    }

    public Integer getAgencia() {
        return agencia;
    }

    public void setAgencia(Integer agencia) {
        this.agencia = agencia;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

    public String getNomeDoCliente() {
        return nomeDoCliente;
    }

    public void setNomeDoCliente(String nomeDoCliente) {
        this.nomeDoCliente = nomeDoCliente;
    }
}
