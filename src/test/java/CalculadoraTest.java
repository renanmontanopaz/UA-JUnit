import org.junit.jupiter.api.*;
import org.ua.Calculadora;

public class CalculadoraTest {
    private Calculadora calculadora;

    private static double n1;
    private static double n2;
    private static int n3;
    private static String n4;
    private static double resultado;
    @BeforeAll
    public static void definirValoresPadrao(){
        n1 = 10.0;
        n2 = 10.0;
        n3 = 10;
        n4 = "10";
        resultado = 20.0;
    }

    @BeforeEach
    public void inicializarCalculadora(){
        calculadora = new Calculadora();
        calculadora.ligar();

    }
    @Test
    @DisplayName("A soma deve dar o resultado correto!")
    public void somaDeveDarResultadoCorreto(){
        calculadora.Somar(n1=10,n2=10);
        Assertions.assertEquals(resultado, calculadora.getResultado());
    }

    @Test
    @DisplayName("Não deve calcular com calculadora desligada")
    public void naoDeveCalcularComCalculadoraDesligada(){
        calculadora.desligar();
        Assertions.assertThrows(RuntimeException.class, () -> calculadora.Somar(n1,n2));
        Assertions.assertThrows(RuntimeException.class, () -> calculadora.Dividir(n1,n2));
        Assertions.assertThrows(RuntimeException.class, () -> calculadora.Subtrair(n1,n2));
        Assertions.assertThrows(RuntimeException.class, () -> calculadora.Multiplicar(n1,n2));
    }

    @Test
    @DisplayName("Não deve somar númerosnegativos")
    public void naoDeveSomarNumerosNegativos(){
        n3 = -10;
        //Assertions.assertEquals(n3, calculadora.getResultado());
        Assertions.assertThrows(RuntimeException.class, () -> calculadora.Somar(n3,n2));
    }
    @Test
    @DisplayName("Não deve subtrair dois numeros sendo zero")
    public void naoDeveSubtrairDoisNumerosZero(){
        n1 = 0;
        n2 = 0;
        Assertions.assertThrows(RuntimeException.class, () -> calculadora.Subtrair(n1,n2));
    }
    @Test
    @DisplayName("Não deve multiplicar por um")
    public void naoDeveMultiplicarPorUm(){
        n1 = 1;
        n2 = 1;
        Assertions.assertThrows(RuntimeException.class, () -> calculadora.Multiplicar(n1,n2));
    }
    @Test
    @DisplayName("Não pode dividir por zero")
    public void naoDeveDividirPorZero(){
        n1 = 10;
        n2 = 0;
        Assertions.assertThrows(RuntimeException.class, () -> calculadora.Dividir(n1,n2));
    }
}
