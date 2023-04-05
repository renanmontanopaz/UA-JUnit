import org.junit.jupiter.api.*;
import org.ua.Conta;

public class ContaTest {

    private Conta conta;
    private static double depositoInicial;
    private static double saqueValido;
    private static double saqueInvalido;
    private static double saldoZero;

    @BeforeAll
    public static void definirValoresPadrao(){
        depositoInicial = 100.00;
        saqueValido = 70.00;
        saqueInvalido = 110.0;
        saldoZero = 0;
    }

    @BeforeEach
    public void inicializarConta(){
        conta = new Conta();
        conta.ativar();
    }

    @Test
    @DisplayName("Deve depositar com conta ativa!")
    public void deveDepositarComContaAtiva(){
        conta.depositar(depositoInicial);

        Assertions.assertEquals(depositoInicial, conta.getSaldo());
    }
    @Test
    @DisplayName("Não deve depositar com conta inativa!")
    public void naoDeveDepositarComContaInativa(){
        conta.inativar();
        Assertions.assertThrows(RuntimeException.class, () -> conta.depositar(depositoInicial));
    }

    @Test
    @DisplayName("Deve sacar com conta ativa e saldo maior que o valor de saque")
    public void sacarComContaAtivaESaldoMaiorQueDeSaque(){

        conta.depositar(depositoInicial);
        conta.sacar(saqueValido);

        Assertions.assertEquals(depositoInicial-saqueValido, conta.getSaldo());
    }

    @Test
    @DisplayName("Não deve sacar com conta inativa")
    public void naoDeveSacarContaInativa(){
        conta.depositar(depositoInicial);
        conta.inativar();

        Assertions.assertThrows(RuntimeException.class, () -> conta.sacar(saqueValido));
    }

    @Test
    @DisplayName("Não deve sacar com a conta ativa e saldo menor que valor de saque")
    public void naoDeveSacarContaAtivaEsaldoMenorQuevalorDeSaque(){
        conta.depositar(depositoInicial);

        Assertions.assertThrows(RuntimeException.class, () -> conta.sacar(saqueInvalido));
    }

}
