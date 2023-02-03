package service;

import model.Conta;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 *
 *  Deve ser possível criar uma conta
 *  Novas contas iniciam com o saldo ZERO
 *  Deve ser possível depositar
 *  Caso haja saldo deve ser possível sacar
 *  Caso haja saldo deve ser possível transferir entre contas
 *  Contas com mesmo numero e mesma agencia são iguais
 *
 */

public class ContaServiceTest {

    ContaService contaService;

    Conta conta;

    @Before
    public void setup() {
        contaService = new ContaService();
        conta = contaService.cadastrar("Carla");
    }
    @Test
    public void deveCriarUmaConta() {

        Assert.assertEquals((Integer) 1, conta.getAgencia());
        Assert.assertEquals((Integer) 1, conta.getNumero());
        Assert.assertEquals("Carla", conta.getNomeDoCliente());

    }

    @Test
    public void novaContaDeveIniciarZerada() {

        Assert.assertEquals((Double) 0.0, conta.getSaldo());

    }

    @Test
    public void novasContasDevemIniciarComSaldoZero() {
        //Dado

        //Quando

        //Então
        //Então
        Assert.assertEquals((Double) 0.0, conta.getSaldo());
    }

    @Test
    public void deveSerPossivelDepositar() {
        //Dado

        //Quando
        contaService.depositar(conta, 10.0);
        //Então
        Assert.assertEquals((Double) 10.0,conta.getSaldo());
    }

    @Test
    public void deveSerPossivelSacar(){
        //Dado
        contaService.depositar(conta, 10.0);
        //Quando
        contaService.sacar(conta, 5.0);
        //Então
        Assert.assertEquals((Double)5.0, conta.getSaldo());

    }

    @Test
    public void deveSerPossivelTransferirEntreContas() {
        // Dado
        Conta contaSamir = new Conta(conta.getNumero(), conta.getAgencia(), "Samir");
        Conta contaKassia = new Conta(conta.getNumero(), conta.getAgencia(), "Kassia");
        contaService.depositar(contaSamir, 100.0);

        // Quando
        contaService.transferir(contaSamir, contaKassia, 49.99);

        // Então
        Assert.assertEquals(contaSamir, contaSamir);
        Assert.assertSame(contaKassia, contaKassia);
        Assert.assertNotEquals(contaSamir.getSaldo(), contaKassia.getSaldo());

    }

}
